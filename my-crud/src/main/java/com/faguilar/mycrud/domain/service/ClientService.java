package com.faguilar.mycrud.domain.service;

import com.faguilar.mycrud.domain.repositories.ClientRepository;
import com.faguilar.mycrud.model.mappers.MapperToClientResponse;
import com.faguilar.mycrud.model.resposes.ClientResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final MapperToClientResponse clientResponseMapper;

    public ClientService(ClientRepository clientRepository, MapperToClientResponse clientResponseMapper) {
        this.clientRepository = clientRepository;
        this.clientResponseMapper = clientResponseMapper;
    }

    public List<ClientResponse> getAllClients(){
        var response = this.clientRepository.findAll();
        return clientResponseMapper.mapToListClientResponse(response);
    }
}
