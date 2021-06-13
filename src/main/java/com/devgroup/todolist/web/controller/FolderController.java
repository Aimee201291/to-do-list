package com.devgroup.todolist.web.controller;

import com.devgroup.todolist.domain.Folder;
import com.devgroup.todolist.domain.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/folders")
public class FolderController {

    @Autowired
    private FolderService folderService;

    @GetMapping("/all")
    public ResponseEntity<List<Folder>> getAll() {
        return new ResponseEntity<>(folderService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Folder> save(@RequestBody Folder folder) {
        return new ResponseEntity<>(folderService.save(folder), HttpStatus.CREATED);
    }

}
