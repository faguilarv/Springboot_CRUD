package com.faguilar.mycrud.model.resposes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponse {
    private String fullName;
    private String email;
    private String phone;
}
