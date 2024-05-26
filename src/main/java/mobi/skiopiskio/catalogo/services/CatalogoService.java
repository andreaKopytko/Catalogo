package mobi.skiopiskio.catalogo.services;

import java.util.ArrayList;
import java.util.Optional;

import mobi.skiopiskio.catalogo.domains.Prodotto;

public class CatalogoService {

    private ArrayList<Prodotto> prodotti = new ArrayList<>();

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> newProdottiList) {
        prodotti = newProdottiList;
    }

    public void addProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public Optional<Prodotto> getProdottoByCode(String code) {

        for(Prodotto p : prodotti) {

            if(p.getCode().equals(code)) {
                return Optional.of(p);
            }
        }

        return Optional.empty();
    }

    /* 
    Prodotto prod1 = new Prodotto("1", "Gnomo da giardino", "Arma Psicologica", 1300, 100);
    Prodotto prod2 = new Prodotto("2", "Erba finta", "Strumento musicale", 2025, 24);
    Prodotto prod3 = new Prodotto("3", "Birmarzio", "Fertilizzante", 2018, 90);

    prodotti.addProdotto(prod1);
    prodotti.addProdotto(prod2);
    prodotti.addProdotto(prod3);

    */
}
