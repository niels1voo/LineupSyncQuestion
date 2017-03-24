package com.tenmilesquare.recruiting.question.sync.service;

import com.tenmilesquare.recruiting.question.sync.domain.Person;
import com.tenmilesquare.recruiting.question.sync.repository.LineupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ry on 3/23/17.
 */
@Service
public class LineupServiceImpl implements LineupService {

    @Autowired
    private LineupRepo lineupRepo;

    public void syncPerson(Long lineupId, List<Person> people) {
        // Implement this method
    }
}
