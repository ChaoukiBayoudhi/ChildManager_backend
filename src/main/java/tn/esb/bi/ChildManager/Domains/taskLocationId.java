package tn.esb.bi.ChildManager.Domains;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Embeddable
public class taskLocationId implements Serializable {
    @Column(name="id_task")
    private Long taskId;
    private Long locationId;
}
