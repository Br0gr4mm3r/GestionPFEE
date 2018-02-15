package Tests;

import Edu.esprit.Entities.fichepfe;
import java.util.List;
import service.CrudPfe;

/**
 *
 * 
 */
public class TESTcrudfichepfe {

    public static void main(String[] args) {

fichepfe f = new fichepfe();
f.setNom("test");
f.setPrenom("testp");
f.setSujet("test");
f.setFonctionnalites("sds");
f.setTechnologies("test");
f.setEtat(1);
f.setEtablissement("sqqdqs");
f.setIduser(4);
        List<fichepfe> listePFe = CrudPfe.listePFe();
        System.out.print(f);


    }


}

