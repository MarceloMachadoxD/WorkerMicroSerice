package com.github.marcelomachadoxd.hrworkerms.servies;

import com.github.marcelomachadoxd.hrworkerms.dto.WorkerDTO;
import com.github.marcelomachadoxd.hrworkerms.entities.Worker;
import com.github.marcelomachadoxd.hrworkerms.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;


    public List<WorkerDTO> findAll() {
        List<Worker> workers = workerRepository.findAll();

        List<WorkerDTO> workerDTOS = new ArrayList<>();
        for (Worker worker : workers) {
            workerDTOS.add(new WorkerDTO(worker));
        }
        return workerDTOS;

    }


    public WorkerDTO findById(Long id) {
        return new WorkerDTO(workerRepository.findById(id).get());
    }


}

