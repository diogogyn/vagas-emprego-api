package br.dos.api.job.domain.user.service;

import br.dos.api.job.domain.user.User;
import br.dos.api.job.domain.user.address.Address;
import br.dos.api.job.domain.user.record.UserDetailRecord;
import br.dos.api.job.domain.user.record.UserListRecord;
import br.dos.api.job.domain.user.record.UserRegisterRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIpml implements CrudService {
    @Override
    public User create(UserRegisterRecord record) {
        return null;
    }

    @Override
    public void update(UserRegisterRecord record) {

    }

    @Override
    public List<UserListRecord> listAll() {
        List<UserListRecord> resultados = new ArrayList<>();
        resultados.add(new UserListRecord(0L,"Diogo", "000.000.000-00","Madri germana"));
        resultados.add(new UserListRecord(1L,"Joao", "000.111.000-00","Madri gemendo"));
        resultados.add(new UserListRecord(2L,"Belina", "000.000.222-00","Madri gritando"));
        return null;
    }

    @Override
    public UserDetailRecord listOne(Long id) {
        Address address = new Address();
        address.setAddress("Rua dos loucos");
        address.setNeighborhood("Madri germana");
        User user = new User(id, "Diogo", "000.000.000-00", address);
        return new UserDetailRecord(user);
    }

    @Override
    public void delete(Long id) {

    }
}
