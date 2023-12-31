package my.controllers;

import jakarta.validation.Valid;
import my.dao.PersonDao;
import my.models.Person;
import my.services.PeopleService;
import my.services.PersonItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;
    private final PersonItemService personItemService;

    private final PersonDao personDao;

    @Autowired
    public PeopleController(PeopleService peopleService, PersonItemService personItemService, PersonDao personDao) {
        this.peopleService = peopleService;
        this.personItemService = personItemService;
        this.personDao = personDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", peopleService.findAll());

        personDao.testNPlus1();

        //тестирование методов
        personItemService.findByItemName("Iphone");
        personItemService.findByOwner(peopleService.findAll().get(0));
        peopleService.test();

        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", peopleService.findOne(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person")  Person person) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "people/new";
        peopleService.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", peopleService.findOne(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult,@PathVariable("id") int id) {
        if (bindingResult.hasErrors()) return "people/edit";
        peopleService.update(id, person);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        peopleService.delete(id);
        return "redirect:/people";
    }
}