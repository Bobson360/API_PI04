package com.robson.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.robson.cursomc.domain.Banho;
import com.robson.cursomc.dto.BanhoDTO;
import com.robson.cursomc.repositories.BanhoRepository;
import com.robson.cursomc.services.exeptions.DataIntegrityException;
import com.robson.cursomc.services.exeptions.ObjectNotFoundException;

@Service
public class BanhoService {
	
	@Autowired
	private BanhoRepository repo;
	 
	public Banho find(Integer id) {
		Optional<Banho> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Banho.class.getName()));
	}
	
	public Banho insert(Banho obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Banho update(Banho obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			
		repo.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir uma categoria que possui produtos");
		}
	}
	
	public List<Banho> findAll(){
		return repo.findAll();
	}
	
	public Page<Banho> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Banho fromDTO(BanhoDTO objDTO) {
		return new Banho(
				objDTO.getId(), 
				objDTO.getUser(), 
				objDTO.getEnergia(), 
				objDTO.getAgua(), 
				objDTO.getTempAmbiente(), 
				objDTO.getTempInAgua(), 
				objDTO.getTempOutAgua(), 
				objDTO.getInicio(), 
				objDTO.getFim());
		
//		return new Banho(objDTO.getId(), objDTO.getNome(), objDTO.getEmail(), null, null);
	}
}
