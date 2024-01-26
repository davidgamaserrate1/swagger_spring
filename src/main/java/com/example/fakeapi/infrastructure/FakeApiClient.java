package com.example.fakeapi.infrastructure;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.fakeapi.apiv1.dto.ProductsDTO;

@FeignClient(value="fake-api", url="${fake-api.url:#{null}}")
public interface FakeApiClient {

    @GetMapping("/products")
    List<ProductsDTO> buscaListaProdutos();


}