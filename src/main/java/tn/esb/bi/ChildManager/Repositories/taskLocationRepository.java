package tn.esb.bi.ChildManager.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.bi.ChildManager.Domains.taskLocation;
import tn.esb.bi.ChildManager.Domains.taskLocationId;

public interface taskLocationRepository extends JpaRepository<taskLocation, taskLocationId> {
}
