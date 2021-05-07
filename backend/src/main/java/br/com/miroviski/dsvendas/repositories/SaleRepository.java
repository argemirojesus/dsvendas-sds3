package br.com.miroviski.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.miroviski.dsvendas.dto.SaleSuccesDTO;
import br.com.miroviski.dsvendas.dto.SaleSumDTO;
import br.com.miroviski.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new br.com.miroviski.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.miroviski.dsvendas.dto.SaleSuccesDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccesDTO> successGroupedBySeller();
}
