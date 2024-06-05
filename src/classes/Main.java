package classes;

import java.util.List;

import com.database.FutbolcuDAO;

public class Main {
    public static void main(String[] args) {
        FutbolcuDAO futbolcuDAO = new FutbolcuDAO();
        List<Futbolcu> futbolcular = futbolcuDAO.getAllFutbolcular();

        for (Futbolcu futbolcu : futbolcular) {
            futbolcu.yazdir();
        }
        
        /*
        TransferFacade transferFacade = new TransferFacade(1000000, 2023);
        transferFacade.printTransferDetails();
        */
    }
}
