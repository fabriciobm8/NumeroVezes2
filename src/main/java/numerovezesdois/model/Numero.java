package numerovezesdois.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "number")
@Data
public class Numero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "numero", nullable = false)
  private int numero;

  @Column(name = "numerox", nullable = false)
  private int numerox;

}
