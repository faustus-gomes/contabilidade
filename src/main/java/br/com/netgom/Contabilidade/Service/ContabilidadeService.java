package br.com.netgom.Contabilidade.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.netgom.Contabilidade.Repository.ContabilidadeRepository;
import br.com.netgom.Contabilidade.Models.ContabilidadeModel;

@Service
@Transactional
public class ContabilidadeService {
	//CRUD COMPLETO
	@Autowired
	private ContabilidadeRepository rep;
	
	public List<ContabilidadeModel> listAll(){
		return rep.findAll();
		
	}
	
	public void save(ContabilidadeModel contab)  {
		rep.save(contab);
		
	}
	
	public ContabilidadeModel get(Long id) {
		return rep.findById(id).get();
	}
	
	public void delete(Long id) {
		rep.deleteById(id);
	}
}
