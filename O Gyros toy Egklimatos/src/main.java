import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
      ArrayList <String> kartesKlefti = new ArrayList<String>();
      ArrayList <String> kartesAstunomou = new ArrayList<String>();
      
      
      
        //Αρχικοποίηση της λίστας της κάρτες
      
		kartesKlefti.add("Κάρτα ασυλίας");
		kartesKlefti.add("Βγες από την φυλακή! Χρησιμοποίησε αυτή την κάρτα όταν σε πιάσει ο αστυνόμος");
		kartesKlefti.add("Πήγαινε στη φαβέλα");
		kartesKlefti.add("Χάνεις την σειρά σου");
		kartesKlefti.add("Χάνεις το 25% των χρημάτων που κουβαλάς!");
		kartesKlefti.add("Αυξάνεις κατά 20% των χρημάτων που κουβαλάς!");
		kartesKlefti.add("Πήγαινε στο Δημαρχείο");
		kartesKlefti.add("Ξαναρίξε το ζάρι");
		kartesKlefti.add("Προχώρα 3 τετράγωνα μπροστά");
		kartesKlefti.add("Προχώρα 2 τετράγωνα μπροστά");
		kartesKlefti.add("Ποχώρα  1 τετράγωνο μπροστά");
		kartesKlefti.add("Πήγαινε 3 τετράγωνα πίσω");
		kartesKlefti.add("Πήγαινε 2 τετράγωνα πίσω");
		kartesKlefti.add("Πήγαινε 1 τετράγωνο πίσω");
		kartesKlefti.add("Προχώρα 3 τετράγωνα μπροστά");
		kartesKlefti.add("Προχώρα 2 τετράγωνα μπροστά");
		kartesKlefti.add("Ποχώρα  1 τετράγωνο μπροστά");
		kartesKlefti.add("Πήγαινε 3 τετράγωνα πίσω");
		kartesKlefti.add("Πήγαινε 2 τετράγωνα πίσω");
		kartesKlefti.add("Πήγαινε 1 τετράγωνο πίσω");
		
		kartesAstunomou.add("Προχώρα 3 τετράγωνα μπροστά");
		kartesAstunomou.add("Προχώρα 2 τετράγωνα μπροστά");
		kartesAstunomou.add("Ποχώρα  1 τετράγωνο μπροστά");
		kartesAstunomou.add("Πήγαινε 3 τετράγωνα πίσω");
		kartesAstunomou.add("Πήγαινε 2 τετράγωνα πίσω");
		kartesAstunomou.add("Πήγαινε 1 τετράγωνο πίσω");
		kartesAstunomou.add("Προχώρα 3 τετράγωνα μπροστά");
		kartesAstunomou.add("Προχώρα 2 τετράγωνα μπροστά");
		kartesAstunomou.add("Ποχώρα  1 τετράγωνο μπροστά");
		kartesAstunomou.add("Πήγαινε 3 τετράγωνα πίσω");
		kartesAstunomou.add("Πήγαινε 2 τετράγωνα πίσω");
		kartesAstunomou.add("Πήγαινε 1 τετράγωνο πίσω");
		kartesAstunomou.add("Χάνεις την σειρά σου");
		kartesAstunomou.add("Χάνεις την σειρά σου");
		kartesAstunomou.add("Ξαναρίξε το ζάρι");
		kartesAstunomou.add("Ξαναρίξε το ζάρι");
		kartesAstunomou.add("Πήγαινε σε μία απο τις δύο ελεύθερες σταθμεύσεις");
		kartesAstunomou.add("Πήγαινε σε μία απο τις δύο ελεύθερες σταθμεύσεις");
		kartesAstunomou.add("Πήγαινε στο στρατόπεδο");
		kartesAstunomou.add("Ασυλία σε περίπτωση που σε πιάσει ο κλέφτης");
      
      
	    
		Afetiria favela_0 = new Afetiria ("Favela");
		Ktirio kiosk1_1 = new Ktirio ("Kiosk1",50000,0,1);
		Ktirio house1_2 = new Ktirio ("house1",100000,0,1);
		Ktirio house2_3 = new Ktirio ("house2",100000,0,1);
        Ktirio bank1_4 = new Ktirio ("bank1",1000000,3,2);
		Ktirio house3_5 = new Ktirio ("house3",100000,0,1);
		Ktirio superMarket1_6 = new Ktirio ("superMarket1",200000,0,1);
		Afetiria eleutheriStathmeusi1_7 = new Afetiria ("eleutheriStathmeusi1");
		Ktirio Casino1_8 = new Ktirio ("Casino",800000,2,1);
		Ktirio hotel1_9 = new Ktirio ("hotel1",300000,0,1);
		Ktirio house4_10 = new Ktirio ("house4",100000,0,1);
		Ktirio house5_11 = new Ktirio ("house5",100000,0,1);
        Karta karta1_12 = new Karta ("Karta1",kartesKlefti,kartesAstunomou);
		Ktirio kiosk2_13 = new Ktirio ("Kiosk2",50000,0,1);
        Ktirio bank2_14 = new Ktirio ("bank2",1000000,3,2);
		Ktirio house6_15 = new Ktirio ("house6",100000,0,1);
		Afetiria Astunomia_16 = new Afetiria ("Astunomiko_Tmima");
		Ktirio Dimarxeio_17 = new Ktirio ("Dimarxeio",500000,0,1);
		Ktirio house7_18 = new Ktirio ("house7",100000,0,1);
		Karta karta2_19 = new Karta ("Karta2",kartesKlefti,kartesAstunomou);
		Ktirio house8_20 = new Ktirio ("house8",100000,0,1);
		Ktirio villa1_21 = new Ktirio ("villa1",400000,0,1);
		Ktirio villa2_22 = new Ktirio ("villa2",400000,0,1);
		Afetiria eleutheriStathmeusi2_23 = new Afetiria ("eleutheriStathmeusi2");
		Ktirio mall1_24 = new Ktirio ("mall1",600000,0,1);
		Ktirio hotel2_25 = new Ktirio ("hotel2",300000,0,1);
		Ktirio house9_26 = new Ktirio ("house9",100000,0,1);
		Karta karta3_27 = new Karta ("Karta3",kartesKlefti,kartesAstunomou);
		Stratopedo stratopedo_28 = new Stratopedo ("stratopedo");
		Ktirio house10_29 = new Ktirio ("house10",100000,0,1);
		Ktirio kiosk3_30 = new Ktirio ("kiosk3",50000,0,1);
		Ktirio house11_31 = new Ktirio ("house11",100000,0,1);
		
        
		tablo t = new tablo("basic tablo");//Δημιουργία του βασικού ταμπλού που θα περιέχει ολα τα κτίρια.

		t.addKoutaki(favela_0);
		t.addKoutaki(kiosk1_1);
        t.addKoutaki(house1_2);
        t.addKoutaki(house2_3);
        t.addKoutaki(bank1_4);
	    t.addKoutaki(house3_5);
	    t.addKoutaki(superMarket1_6);
	    t.addKoutaki(eleutheriStathmeusi1_7);
	    t.addKoutaki(Casino1_8);
	    t.addKoutaki(hotel1_9);
	    t.addKoutaki(house4_10);
	    t.addKoutaki(house5_11);
	    t.addKoutaki(karta1_12);
	    t.addKoutaki(kiosk2_13);
	    t.addKoutaki(bank2_14);
	    t.addKoutaki(house6_15);
	    t.addKoutaki(Astunomia_16);
	    t.addKoutaki(Dimarxeio_17);
	    t.addKoutaki(house7_18);
	    t.addKoutaki(karta2_19);
	    t.addKoutaki(house8_20);
	    t.addKoutaki(villa1_21);
	    t.addKoutaki(villa2_22);
	    t.addKoutaki(eleutheriStathmeusi2_23);
	    t.addKoutaki(mall1_24);
	    t.addKoutaki(hotel2_25);
	    t.addKoutaki(house9_26);
	    t.addKoutaki(karta3_27);
	    t.addKoutaki(stratopedo_28);
	    t.addKoutaki(house10_29);
	    t.addKoutaki(kiosk3_30);
	    t.addKoutaki(house11_31);  
	    
	    

	     new Screen1(t);
	    
	    
	}

}
