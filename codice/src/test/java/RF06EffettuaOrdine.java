import static org.junit.Assert.*; 
import org.junit.Test;

import DataBase.DbProdotti;
import Elaborazione.GestoreCarrelli;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RF06EffettuaOrdine 
{
    DbProdotti dbProdotti = new DbProdotti();
    GestoreCarrelli gestoreCarrelli = new GestoreCarrelli(dbProdotti);

    /*
    
    @Test
    public void RF06_ControllaNumeroCarta1()
    {
        //errore troppi numeri
        assertFalse(gestoreCarrelli.RF06_ControllaNumeroCarta1("672813924677863895"));
        
    }

    @Test
    public void RF06_ControllaNumeroCarta2()
    {
        //errore pochi numeri
        assertFalse(gestoreCarrelli.RF06_ControllaNumeroCarta2("67281392467795"));
    }

    @Test
    public void RF06_ControllaNumeroCarta3()
    {
        //ok
        assertTrue(gestoreCarrelli.RF06_ControllaNumeroCarta3("6728139246779538"));
    }
    

   @Test
    public void RF06_CalcolaPrezzoTotale() {
        
    	DbProdotti dbProdottiMock = new DbProdotti();
        GestoreCarrelli gestoreCarrelli = new GestoreCarrelli(dbProdottiMock);

        System.out.println("inizio il test");
        ArrayList<HashMap<String, Object>> carrello = new ArrayList<>();
        HashMap<String, Object> prodotto1 = new HashMap<>();
        prodotto1.put("prodotto123",  10.0); 
        prodotto1.put("quantità",  2);
        carrello.add(prodotto1);

        List<String> prodotti = new ArrayList<>();
        prodotti.add("prodotto123");

      
        float risultato = gestoreCarrelli.RF06_CalcolaPrezzoTotale(carrello, prodotti);
      System.out.println("il risultato : "+risultato);
        
        assertTrue(risultato== 20.0); // Sostituisci con il risultato atteso
    }
    
    */
}
