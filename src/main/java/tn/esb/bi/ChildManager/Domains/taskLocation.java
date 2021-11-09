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
public class taskLocation {
    @EmbeddedId
    private taskLocationId id;
    private LocalDate date;
    private LocalTime time;
    @ManyToOne
    @MapsId("taskId")
    private Task task;
    @ManyToOne
    @MapsId("locationId")
    private Location location;


}
