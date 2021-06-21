package fr.piman.project.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
@Document(collection = "applications")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application {
    @Id
    String name;
    @Valid
    String repository;
    @Valid
    String hash;
    @Valid
    String branch = "master";
    @Valid
    String private_key;
    @Valid
    String public_key;
    @Valid
    String group_id;
    @Valid
    int project_id;

    int builds_to_keep= 10;
    @Valid
    String url;
    @Valid
    String build_url;
    @Valid
    Timestamp last_run;
    @Valid
    Timestamp created_at;
    @Valid
    Timestamp updated_at;
    @Valid
    Timestamp deleted_at;
    @Valid
    Timestamp last_mirrored;
    @Valid
    Boolean allow_other_branch;
    @Valid
    Boolean include_dev;
    @Valid
    int status;
    @Valid
    Boolean is_mirroring;

    public Application(String name, String repository, String hash, String branch, String private_key, String public_key, String group_id, int project_id, int builds_to_keep, String url, String build_url, Timestamp last_run, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at, Timestamp last_mirrored, Boolean allow_other_branch, Boolean include_dev, int status, Boolean is_mirroring) {
        this.name = name;
        this.repository = repository;
        this.hash = hash;
        this.branch = branch;
        this.private_key = private_key;
        this.public_key = public_key;
        this.group_id = group_id;
        this.project_id = project_id;
        this.builds_to_keep = builds_to_keep;
        this.url = url;
        this.build_url = build_url;
        this.last_run = last_run;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.last_mirrored = last_mirrored;
        this.allow_other_branch = allow_other_branch;
        this.include_dev = include_dev;
        this.status = status;
        this.is_mirroring = is_mirroring;
    }

    public Application(Application a) {
        this.name = a.name;
        this.repository = a.repository;
        this.hash = a.hash;
        this.branch = a.branch;
        this.private_key = a.private_key;
        this.public_key = a.public_key;
        this.group_id = a.group_id;
        this.project_id = a.project_id;
        this.builds_to_keep = a.builds_to_keep;
        this.url = a.url;
        this.build_url = a.build_url;
        this.last_run = a.last_run;
        this.created_at = a.created_at;
        this.updated_at = a.updated_at;
        this.deleted_at = a.deleted_at;
        this.last_mirrored = a.last_mirrored;
        this.allow_other_branch = a.allow_other_branch;
        this.include_dev = a.include_dev;
        this.status = a.status;
        this.is_mirroring = a.is_mirroring;
    }


    public Application(String name) {
        this.name = name;
    }


    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(String private_key) {
        this.private_key = private_key;
    }

    public String getPublic_key() {
        return public_key;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getBuilds_to_keep() {
        return builds_to_keep;
    }

    public void setBuilds_to_keep(int builds_to_keep) {
        this.builds_to_keep = builds_to_keep;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBuild_url() {
        return build_url;
    }

    public void setBuild_url(String build_url) {
        this.build_url = build_url;
    }

    public Timestamp getLast_run() {
        return last_run;
    }

    public void setLast_run(Timestamp last_run) {
        this.last_run = last_run;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Timestamp getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Timestamp getLast_mirrored() {
        return last_mirrored;
    }

    public void setLast_mirrored(Timestamp last_mirrored) {
        this.last_mirrored = last_mirrored;
    }

    public Boolean getAllow_other_branch() {
        return allow_other_branch;
    }

    public void setAllow_other_branch(Boolean allow_other_branch) {
        this.allow_other_branch = allow_other_branch;
    }

    public Boolean getInclude_dev() {
        return include_dev;
    }

    public void setInclude_dev(Boolean include_dev) {
        this.include_dev = include_dev;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Boolean getIs_mirroring() {
        return is_mirroring;
    }

    public void setIs_mirroring(Boolean is_mirroring) {
        this.is_mirroring = is_mirroring;
    }
}
