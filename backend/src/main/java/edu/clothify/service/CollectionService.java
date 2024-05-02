package edu.clothify.service;


import edu.clothify.dto.CollectionDto;

import java.util.List;

public interface CollectionService {
    List<CollectionDto> getAllCollection();

    CollectionDto getCollectionById(Long id);

    boolean deleteCollectionById(Long id);

    CollectionDto getCategoryByName(String name);

    boolean saveCollection(CollectionDto collectionDto);


}