package com.faguilar.mycrud.model.mappers;

import com.faguilar.mycrud.domain.entities.EntidadUsuario;
import com.faguilar.mycrud.model.resposes.ClientResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperToClientResponse {

    public List<ClientResponse> mapToListClientResponse(List<EntidadUsuario> entidadUsuarios){

        List<ClientResponse> clientResponseList = new ArrayList<>();

        entidadUsuarios.forEach( item -> {
            var responseItem = ClientResponse.builder()
                    .fullName(item.getNombre())
                    .email(item.getEmail())
                    .phone(item.getTelefono())
                    .build();
            clientResponseList.add(responseItem);
        });

        return clientResponseList;
    }

}