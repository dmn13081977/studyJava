package my.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {

    private int id;
    @NotEmpty(message = "Название книги не может быть пустым")
    @Size(min = 2, max = 100, message = "Название должно быть от 2-х, до 100 символов длинной")
    private String title;
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 100, message = "ФИО должно быть от 2-х, до 100 символов длинной")
    private String author;
    @Min(value = 1500, message = "Год должен быть больше 1500")
    private int year;

    public Book() {
    }

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
