package br.com.netgom.Contabilidade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.netgom.Contabilidade.Models.ContabilidadeModel;

public interface ContabilidadeRepository extends JpaRepository<ContabilidadeModel, Long>{
	

}
