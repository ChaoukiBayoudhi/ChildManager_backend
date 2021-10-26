package tn.esb.bi.ChildManager.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esb.bi.ChildManager.Services.taskService;

@RestController
public class taskController {
    @Autowired
    private taskService taskServ;
}
