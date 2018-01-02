package com.springfamework.spring5mvcrest.api.v1.mapper;

import com.springfamework.spring5mvcrest.api.v1.model.CategoryDTO;
import com.springfamework.spring5mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
