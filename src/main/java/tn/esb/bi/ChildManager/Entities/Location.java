package tn.esb.bi.ChildManager.Entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,length = 100)
    private String name;
    private String Adress;
    private String Remarks;
    @OneToMany(mappedBy="child")
    private Set<childLocation> children = new HashSet<>();

}
