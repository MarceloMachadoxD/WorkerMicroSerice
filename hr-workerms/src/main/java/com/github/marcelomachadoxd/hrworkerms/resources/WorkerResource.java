package com.github.marcelomachadoxd.hrworkerms.resources;

import com.github.marcelomachadoxd.hrworkerms.dto.WorkerDTO;
import com.github.marcelomachadoxd.hrworkerms.servies.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerService workerService;

    @Value("${test.config}")
    private String testConfigValue;

    @GetMapping(value = "/configs")
    public ResponseEntity<Void> getConfig() {
        System.out.println(testConfigValue.toString());

        return  ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAll() {
        List<WorkerDTO> workers = workerService.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerDTO> findById(@PathVariable Long id) {
        WorkerDTO worker = workerService.findById(id);
        return ResponseEntity.ok(worker);
    }




}
