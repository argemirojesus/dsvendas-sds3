package br.com.miroviski.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.miroviski.dsvendas.dto.SaleDTO;
import br.com.miroviski.dsvendas.dto.SaleSuccesDTO;
import br.com.miroviski.dsvendas.dto.SaleSumDTO;
import br.com.miroviski.dsvendas.entities.Sale;
import br.com.miroviski.dsvendas.repositories.SaleRepository;
import br.com.miroviski.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	};
	
	@Transactional(readOnly = true)
	public 	List<SaleSuccesDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	};

}
