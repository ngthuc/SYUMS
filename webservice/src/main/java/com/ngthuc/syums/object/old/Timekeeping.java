package com.ngthuc.syums.object.old;

import com.ngthuc.syums.entity.Person;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "time_keeping")
public class Timekeeping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "checkIn")
    private Date checkIn;

    @Column(name = "checkOut")
    private Date checkOut;

    @ManyToOne
    @JoinColumn(name = "activityId")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "peopleId")
    private Person person;

    public Timekeeping() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
