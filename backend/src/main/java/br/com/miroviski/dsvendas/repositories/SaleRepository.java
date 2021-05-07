package br.com.miroviski.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.miroviski.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
