package tn.esb.bi.ChildManager.Entities;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class childLocation {
    @EmbeddedId
    private childLocationId id;
    private LocalDate date;
    private LocalTime time;
    @ManyToOne
    @MapsId("childId")
    private Child child;
    @ManyToOne
    @MapsId("locationId")
    private Location location;
}
