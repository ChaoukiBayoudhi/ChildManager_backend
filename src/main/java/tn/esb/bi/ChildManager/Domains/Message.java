package tn.esb.bi.ChildManager.Domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
    @Id    @GeneratedValue
    private Long id;
}
