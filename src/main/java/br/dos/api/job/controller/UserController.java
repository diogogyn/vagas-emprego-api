package br.dos.api.job.controller;


import br.dos.api.job.domain.user.User;
import br.dos.api.job.domain.user.address.Address;
import br.dos.api.job.domain.user.record.UserDetailRecord;
import br.dos.api.job.domain.user.record.UserListRecord;
import br.dos.api.job.domain.user.record.UserRegisterRecord;
import br.dos.api.job.domain.user.service.CrudService;
import br.dos.api.job.domain.user.service.UserServiceIpml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private CrudService userService;
    @PostMapping
    public ResponseEntity create(@RequestBody UserRegisterRecord record, UriComponentsBuilder uriBuilder){
        //TODO - implementar regra para salvar os dados
        User save = this.userService.create(record);
        URI uri = uriBuilder.path("/user").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(new UserDetailRecord(save));
    }

    @GetMapping
    public ResponseEntity<List<UserListRecord>> listAll(){
        List<UserListRecord> userListRecords = this.userService.listAll();
        return ResponseEntity.ok(userListRecords);
    }
    @GetMapping("/{id}")
    public ResponseEntity listOne(@PathVariable Long id){
        UserDetailRecord userDetailRecord = this.userService.listOne(id);
        return ResponseEntity.ok(userDetailRecord);
    }
    @PutMapping
    public void update(){

    }

    @DeleteMapping
    public void delete(){

    }

}
