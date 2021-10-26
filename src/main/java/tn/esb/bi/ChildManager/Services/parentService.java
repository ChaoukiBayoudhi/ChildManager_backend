package tn.esb.bi.ChildManager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esb.bi.ChildManager.Repositories.parentRepository;

@Service
public class parentService {
    @Autowired
    private parentRepository parentRepos;
}
