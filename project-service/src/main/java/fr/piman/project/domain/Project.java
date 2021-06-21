package fr.piman.project.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import java.util.List;

@Document(collection = "projects")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project{
    @Id
    String Title;
    @Valid
    String Description;
    @Valid
    List<Application> applications;
    @Valid
    List<Account> Admins;
    @Valid
    List<Account> Members;

    public Project(String title, String description, List<Application> applications, List<Account> admins, List<Account> members) {
        Title = title;
        Description = description;
        this.applications = applications;
        Admins = admins;
        Members = members;
    }

    public Project() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public List<Account> getAdmins() {
        return Admins;
    }

    public void setAdmins(List<Account> admins) {
        Admins = admins;
    }

    public List<Account> getMembers() {
        return Members;
    }

    public void setMembers(List<Account> members) {
        Members = members;
    }
}
