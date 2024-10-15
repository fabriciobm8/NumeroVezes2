package numerovezesdois.controller;

import java.util.List;
import numerovezesdois.model.Numero;
import numerovezesdois.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NumeroController {
  @Autowired
  private NumeroService numeroService;

  @PostMapping("/number")
  public ResponseEntity<Numero> saveNumero(@RequestBody Numero numero) {
    Numero savedNumero = numeroService.saveNumero(numero);
    return ResponseEntity.ok(savedNumero);
  }

  @GetMapping("/numbers")
  public List<Numero> getAllNumeros() {
    return numeroService.getNumeros();
  }

  @GetMapping("number/{id}")
  public ResponseEntity<Numero> getNumeroById (@PathVariable long id) {
    Numero numero = numeroService.getNumberById(id);
    return ResponseEntity.ok(numero);
  }

  @PutMapping("number/{id}")
  public ResponseEntity<Numero> updateNumber (@PathVariable long id, @RequestBody Numero numero) {
    Numero updateNumber = numeroService.updateNumber(id, numero);
      return ResponseEntity.ok(updateNumber);
  }

  @DeleteMapping("number/{id}")
  public ResponseEntity<Numero> deleteNUmber (@PathVariable long id){
    numeroService.deleteNumero(id);
    return ResponseEntity.noContent().build();
  }

}
