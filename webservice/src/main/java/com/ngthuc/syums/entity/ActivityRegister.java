package com.ngthuc.syums.entity;

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
    private People people;

    @ManyToOne
    @JoinColumn(name = "activityId")
    private Activity activity;

    public ActivityRegister(Activity activity, People people) {
        this.activity = activity;
        this.people = people;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
