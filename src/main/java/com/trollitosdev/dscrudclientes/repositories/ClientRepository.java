package com.trollitosdev.dscrudclientes.repositories;

import com.trollitosdev.dscrudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}