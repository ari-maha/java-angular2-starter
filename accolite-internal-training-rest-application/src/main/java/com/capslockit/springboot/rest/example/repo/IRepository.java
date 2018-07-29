package com.capslockit.springboot.rest.example.repo;

import java.util.List;
import java.util.Map;

public interface IRepository<T> {

    T getById(Long id);

    List<T> getList(Integer numberOfRecords);

    List<T> getAll();

    Map<String, Long> getRecordsCount();
}
