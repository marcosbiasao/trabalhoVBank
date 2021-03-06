package br.com.rp.services;

import br.com.rp.domain.SolicitacaoProposta;
import br.com.rp.repository.SolicitacaoPropostaRepository;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class SolicitacaoPropostaService {

    @EJB
    private SolicitacaoPropostaRepository repository;

    public List<SolicitacaoProposta> getAllSolicitacoesPropostas() {
        return repository.getAll();
    }
}
