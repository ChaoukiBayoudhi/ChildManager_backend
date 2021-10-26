package tn.esb.bi.ChildManager.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tn.esb.bi.ChildManager.Domains.Child;
import tn.esb.bi.ChildManager.Domains.Task;
import tn.esb.bi.ChildManager.Repositories.childRepository;

@Service
public class childService {
    @Autowired
    private childRepository childRepos;

    public ResponseEntity<List<Child>> getAllChildren()
    {
        List<Child> res=childRepos.findAll();
        if(res.isEmpty())
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(res,HttpStatus.OK);    }
}
