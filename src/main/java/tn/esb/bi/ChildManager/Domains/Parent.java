package tn.esb.bi.ChildManager.Domains;

import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parent {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
