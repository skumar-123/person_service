package com.person.entity;

public class Contact {
    private Long cid;
    private String email;
    private String contactName;
    private Long personId;

    public Contact(Long cid, String email, String contactName, Long personId) {
        this.cid = cid;
        this.email = email;
        this.contactName = contactName;
        this.personId = personId;
    }

    public Contact() {
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
