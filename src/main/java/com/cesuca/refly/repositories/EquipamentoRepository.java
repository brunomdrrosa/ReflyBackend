package com.cesuca.refly.repositories;

import com.cesuca.refly.entities.Equipamento;
import com.cesuca.refly.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}
