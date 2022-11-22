package io.agileintelligence.ppmtool.domain;

import javax.persistence.*;

@Entity
public class Backlog {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer PTSequence=0;
    private String projectIdentifier;

    //OneToOne With Project
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="project_Id", nullable = false)
    //
    private Project project;

    // oneToMany projectTasks


    public Backlog(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPTSequence() {
        return PTSequence;
    }

    public void setPTSequence(Integer PTSequence) {
        this.PTSequence = PTSequence;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public void setProject(Project project) {
    }
}
