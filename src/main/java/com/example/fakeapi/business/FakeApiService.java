package com.example.fakeapi.business;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fakeapi.apiv1.dto.ProductsDTO;
import com.example.fakeapi.infrastructure.FakeApiClient;
import com.example.fakeapi.apiv1.dto.ProductsDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiClient client;

    public List<ProductsDTO> buscaProdutos(){
        return client.buscaListaProdutos();
    }
}
