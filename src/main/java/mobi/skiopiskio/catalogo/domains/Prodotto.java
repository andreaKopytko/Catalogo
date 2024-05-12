package mobi.skiopiskio.catalogo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prodotto {

    private String code;
    private String name;
    private String type;
    private int productionYear;
    private int quantity;
}
