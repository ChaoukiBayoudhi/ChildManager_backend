package tn.esb.bi.ChildManager.Repositories;
import tn.esb.bi.ChildManager.Domains.Child;

import org.springframework.data.jpa.repository.JpaRepository;

public interface childRepository extends JpaRepository<Child,Long> {
    
}
