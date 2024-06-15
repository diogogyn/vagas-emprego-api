package br.dos.api.job.domain.user.service;

import br.dos.api.job.domain.user.User;
import br.dos.api.job.domain.user.record.UserDetailRecord;
import br.dos.api.job.domain.user.record.UserListRecord;
import br.dos.api.job.domain.user.record.UserRegisterRecord;

import java.util.List;

public interface CrudService {

    User create(UserRegisterRecord record);
    void update(UserRegisterRecord record);
    List<UserListRecord> listAll();
    UserDetailRecord listOne(Long id);
    void delete(Long id);
}
