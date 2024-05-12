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
}