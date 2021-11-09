package tn.esb.bi.ChildManager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tn.esb.bi.ChildManager.Domains.Task;
import tn.esb.bi.ChildManager.Repositories.taskRepository;

import java.util.List;

@Service
public class taskService {
    @Autowired
    private taskRepository taskRepos;
    public ResponseEntity<?> getAll()
    {
        List<Task> res=taskRepos.findAll();
        if(res.isEmpty())
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
//    public Task add(Task t)
//    {
//
//        taskRepos.save(t);
//    }
}
