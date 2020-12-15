/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endahapp;

import endahapp.controller.KaryawanJpaController;
import endahapp.models.Karyawan;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author NANDA NAJWAN NOOR
 */
public class EndahApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("EndahAppPU");
        Karyawan karyawan = new Karyawan();
        KaryawanJpaController karyawanctrl = new KaryawanJpaController(emf);
        /**
        melakukan inputan untuk database
        */
        
        karyawan.setNip("18630277");
        karyawan.setNama("Rizky");
        karyawan.setAlamat("Banjarbaru");
        karyawan.setNoHP("085793780806");
        karyawan.setStatus("Karyawan Tetap");
        
        try {
            karyawanctrl.create(karyawan);
        } catch (Exception ex) {
            Logger.getLogger(EndahApp.class.getName()).log(Level.SERVE, null, ex);
        }
        
    }
    
}
