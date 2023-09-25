package com.faguilar.mycrud.controllers;

import com.faguilar.mycrud.domain.service.ClientService;
import com.faguilar.mycrud.model.resposes.ClientResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/client/")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("fetch-all-clients")
    public List<ClientResponse> fetchAllClients(){
        return this.clientService.getAllClients();
    }
}
