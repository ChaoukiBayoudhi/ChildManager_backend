package tn.esb.bi.ChildManager.Domains;

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

    public childLocation(LocalDate date, LocalTime time, Child child, Location location) {
        this.date = date;
        this.time = time;
        this.child = child;
        this.location = location;
    }
}
