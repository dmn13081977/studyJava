package my.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "foreignpassport")
public class ForeignPassport {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "passport_number")
    private int passportNumber;
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    public ForeignPassport() {
    }

    public ForeignPassport(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public ForeignPassport(int passportNumber, Person person) {
        this.passportNumber = passportNumber;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
