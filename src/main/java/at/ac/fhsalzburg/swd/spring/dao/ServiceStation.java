package at.ac.fhsalzburg.swd.spring.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceStation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String location;
    protected ServiceStation() {}

    public ServiceStation(Long id, String location) {
        this.id = id;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}