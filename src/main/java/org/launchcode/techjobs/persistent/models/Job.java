package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne()
    @NotNull(message = "Employer is required")
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    // Constructors.
    public Job(Employer employer) {
        this.employer = employer;
    }

    public Job() {
    }

    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addTag(Skill skill) {
        this.skills.add(skill);
    }
}
