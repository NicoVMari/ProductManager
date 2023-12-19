package UserInterface;

import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface UiRicercaInterfaccia extends Remote
{
	void avvioRicercaProdotto() throws RemoteException;
	void avvioProdottiInEsaurimento() throws RemoteException;
	void avvioRicercaUtente(String genereUtente) throws RemoteException;
	void avvioProdottiPiuVenduti() throws RemoteException;
}

