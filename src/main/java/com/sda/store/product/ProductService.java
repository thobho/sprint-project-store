package com.sda.store.product;

import com.sda.store.commons.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDto> findByNameFragment(String nameFragment){
        List<ProductEntity> allByNameIsLike = productRepository.findAllByNameContaining(nameFragment);
        return allByNameIsLike.stream().map(entity->modelMapper.map(entity, ProductDto.class)).collect(Collectors.toList());
    }

    public void save(ProductDto productDto){
        ProductEntity entityToSave = modelMapper.map(productDto, ProductEntity.class);
        productRepository.save(entityToSave);
    }

    public List<ProductDto> getAllProducts(){
        Iterable<ProductEntity> allUsers = productRepository.findAll();
        return StreamSupport.stream(allUsers.spliterator(), false)
                .map(userEntity -> modelMapper.map(userEntity, ProductDto.class))
                .collect(Collectors.toList());
    }


}
