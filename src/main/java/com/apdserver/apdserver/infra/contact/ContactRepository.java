package com.apdserver.apdserver.infra.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

    @Query(value = "SELECT * FROM contact WHERE is_deleted=false", nativeQuery = true)
    List<ContactEntity> findAll();

    @Query(value = "SELECT * FROM contact WHERE is_deleted=false AND id = :id", nativeQuery = true)
    Optional<ContactEntity> findById(Integer id);

}
