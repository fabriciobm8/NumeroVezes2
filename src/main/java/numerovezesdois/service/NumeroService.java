package numerovezesdois.service;

import java.util.List;
import numerovezesdois.model.Numero;
import numerovezesdois.repository.NumeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumeroService {

  @Autowired
  private NumeroRepository numeroRepository;

  //Metodo para salvar o numero no banco de dados
  public Numero saveNumero (Numero numero) {
    numero.setNumerox(numero.getNumero()*2);
    return numeroRepository.save(numero);
  }

  //Metodo para listar os numeros salvos
  public List<Numero> getNumeros () {
    return numeroRepository.findAll();
  }

  //Metodo para listar os numeros por Id
  public Numero getNumberById (long id) {
    return numeroRepository.findById(id).orElseThrow(() -> new
        RuntimeException("Numero não encontrado"));
  }

  //Metodo para atualizar um numero por Id
  public Numero updateNumber (long id, Numero numero) {
    Numero existingNumero = numeroRepository.findById(id).orElseThrow(() -> new
        RuntimeException("Numero não encontrado"));
    numero.setId(id);
    numero.setNumerox(numero.getNumero() * 2);
    numeroRepository.save(numero);
    return existingNumero;
  }

  //Metodo para deletar um numero pelo Id
  public Numero deleteNumero (long id) {
    Numero existingNumero = numeroRepository.findById(id).orElseThrow(() -> new
        RuntimeException("Número Não Encontrado"));
    numeroRepository.deleteById(id);
    return existingNumero;
  }

}
