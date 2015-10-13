package com.hayturno.entities;


import java.util.Date;

public class UserBuilder {

    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private String city;
    private String state;


    public UserBuilder() {
    }

    public User build() {
        User user = new User();
        user.setId(1);
        user.setName("Fulanito Cosme");
        user.setEmail("fulanitocosme@mail.com");
        user.setBirthDate(new Date());
        user.setCity("Gotham");
        user.setState("Gotham");
        return user;
    }

    public UserBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public UserBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder withState(String state) {
        this.state = state;
        return this;
    }

}

/*
* public class AgencyFormBuilder {

    private Long id = 1L;
    private String name = "Passport";
    private String description = "Valid Passport";


    public AgencyFormBuilder() {
    }

    public AgencyForm build() {
        AgencyForm agencyForm = new AgencyForm();
        agencyForm.setId(id);
        agencyForm.setName(name);
        agencyForm.setDescription(description);
        return agencyForm;
    }

    public AgencyFormBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public AgencyFormBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AgencyFormBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

}


* */
