package my.springrest.controllers;

import jakarta.validation.Valid;
import my.springrest.dto.PersonDTO;
import my.springrest.models.Person;
import my.springrest.services.PeopleService;
import my.springrest.util.PersonErrorResponse;
import my.springrest.util.PersonNotCreatedException;
import my.springrest.util.PersonNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController // @Controller + @ResponseBody над каждым методом
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;
    private  final ModelMapper modelMapper;

    @Autowired
    public PeopleController(PeopleService peopleService, ModelMapper modelMapper) {
        this.peopleService = peopleService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public List<PersonDTO> getPeople() {

        return peopleService
                .findAll()
                .stream()
                .map(this::convertToPersonDTO)
                .collect(Collectors.toList()); // Jackson конвертирует эти объекты в JSON
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable("id") int id) {
        return convertToPersonDTO(peopleService.findOne(id)); // Jackson конвертирует в JSON статус ответа 200
    }

    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody @Valid PersonDTO personDTO,
                                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError x : errors) {
                errorMessage
                        .append(x.getField())
                        .append(" - ")
                        .append(x.getDefaultMessage())
                        .append("; ");
            }
            throw new PersonNotCreatedException(errorMessage.toString());
        }

        peopleService.save(convertToPerson(personDTO));
        //отправляем HTTP ответ с пустым телом и статусом 200
        return ResponseEntity.ok(HttpStatus.OK);
    }

    private PersonDTO convertToPersonDTO(Person person) {
        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);
        return personDTO;
    }

    //используем ModelMapper с помощью Spring
    private Person convertToPerson(PersonDTO personDTO) {
        Person person = modelMapper.map(personDTO, Person.class);
        addDataToPerson(person);
        return person;
    }


    //используем ModelMapper вручную
//    private Person convertToPerson(PersonDTO personDTO) {
//        ModelMapper modelMapper = new ModelMapper();
//        Person person = modelMapper.map(personDTO, Person.class);
//        addDataToPerson(person);
//        return person;
//    }

      //не применимо если много полей
//    private Person convertToPerson(PersonDTO personDTO) {
//        Person person = new Person();
//        person.setName(personDTO.getName());
//        person.setAge(personDTO.getAge());
//        person.setEmail(personDTO.getEmail());
//        addDataToPerson(person);
//        return person;
//    }

    private void addDataToPerson(Person person) {
        person.setCreatedAt(LocalDateTime.now());
        person.setUpdatedAt(LocalDateTime.now());
        person.setCreatedWho("ADMIN");
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handleException(PersonNotFoundException e) {
        PersonErrorResponse response = new PersonErrorResponse("Person not found",
                System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);//NOT_FOUND - статус ответа 404
    }


    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handleException(PersonNotCreatedException e) {
        PersonErrorResponse response = new PersonErrorResponse(e.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
