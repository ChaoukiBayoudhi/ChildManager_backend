package tn.esb.bi.ChildManager.Domains;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Embeddable
public class childLocationId implements Serializable {
    @Column(name="id_child")
    private Long childId;
    private Long locationId;
}
