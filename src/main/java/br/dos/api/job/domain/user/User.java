package br.dos.api.job.domain.user;

import br.dos.api.job.domain.user.address.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
        private Long id;
        private String name;
        private String cpf;
        private Address address;
}
