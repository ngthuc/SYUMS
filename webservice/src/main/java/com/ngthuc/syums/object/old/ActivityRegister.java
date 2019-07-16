package com.ngthuc.syums.object.old;

import com.ngthuc.syums.entity.Person;

import javax.persistence.*;

@Entity
@Table(name = "actvity_regiter")
public class ActivityRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "peopleId")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "activityId")
    private Activity activity;

    public ActivityRegister(Activity activity, Person person) {
        this.activity = activity;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
