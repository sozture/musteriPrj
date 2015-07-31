
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dao.MusteriDao;
import tr.gov.ptt.musteriprj.dto.Musteri;


public class MusteriDaoTest {
    
    public static void testMusteriListesiGetir()
    {
        try {
            List <Musteri> liste = MusteriDao.musteriListesiGetir();
            
            for(Musteri musteri: liste){
            System.out.println(musteri.getNo()+" "+musteri.getAd()+" "+musteri.getSoyad());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MusteriDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MusteriDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        
        
        testMusteriListesiGetir();
    }
    
}
