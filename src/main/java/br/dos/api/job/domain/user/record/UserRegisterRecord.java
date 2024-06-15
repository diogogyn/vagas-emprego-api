package br.dos.api.job.domain.user.record;


import java.util.List;

public record UserRegisterRecord(String name,
                                 String cpf,
                                 AddressRecord address,
                                 List<String> phones) {
}
