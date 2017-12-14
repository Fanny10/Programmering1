package spel;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Spel {
	private static int liv = 10;
	private static int vapen = 0;
	private static int nyckel = 0;

	public static void main(String[] args) {
		start();

	}

	public static void start() {

		String användarnamn = JOptionPane.showInputDialog(null, "Innan vi startar \n Vänligen skriv in ditt spel namn",
				"Välkommen", 1);

		while (true) {
			String jaEllerNej = JOptionPane.showInputDialog(null, "Välkommen " + användarnamn
					+ " i det här spelet kommer du olika val möjligheter \n Du startar med 10 liv och under spelets gång kommer du förlora något liv och kanske få något extra \n Din uppgift är att komma så långt som möjligt, för varje level får du + ett liv \n är du redo för att börja spelet? \n skriv ja ifall du är redo");

			if (jaEllerNej.equalsIgnoreCase("ja")) {
				level1();
				break;
			} else {
				JOptionPane.showMessageDialog(null, "börja om");

			}

		}

	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");
		början();
	}

	public static void början() {

		Object[] options = new Object[] { "Tar en annan väg", "Låsas som du inte ser och går förbi",
				"Frågar om personen behöver hjälp" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/dagväg.jpg");
		int val = JOptionPane.showOptionDialog(null,
				"Du är påväg hem och du ser någon som ligger på marken " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);

		if (val == 0) {

			enAnnan();

		} else if (val == 1) {
			gåFörbi();

		} else {
			help();

		}

	}

	public static void enAnnan() {
		Object[] options1 = { "Genom skogen", "Genom ett hus område", "Går tillbaka till vägen bakom" };

		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan väg " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

		if (enAnnan == 0) {

			skog();

		} else if (enAnnan == 1) {
			hus();

		} else {
			vägenTillbaks();

		}
	}

	public static void tillbaksEfterSkogen() {
		Object[] options1 = { "På den vägen människan var", "Genom ett hus område", "Vägen bakom" };

		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan väg " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

		if (enAnnan == 0) {
			början();

		} else if (enAnnan == 1) {
			hus();

		} else {
			vägenTillbaks();

		}
	}

	public static void vägenTillbaks() {
		Object[] options7 = { "Väntar på bussen", "ringer en taxi", "Går in i någonstans" };

		int tillbaks = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå på vägen bakom \n Du kommer till stan där du var förut och men stan var väldigt öde \n det finns en buss som går om en timme"
						+ " \n Vad ska du göra?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);
		if (tillbaks == 0) {
			bussen();
		} else if (tillbaks == 1) {
			taxi();
		} else {
			affär();
		}
	}

	public static void bussen() {
		Object[] options7 = { "Väntar på bussen", "ringer en taxi", "Går in i någon affär" };

		int buss = JOptionPane.showOptionDialog(null,
				"Okej, du valde att vänta på bussen \n men det kommer två personer gåendes mot parkeringen"
						+ " \n Vad ska du göra?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		if (buss == 0) {

		} else if (buss == 1) {

		} else {

		}
	}

	public static void taxi() {
		Object[] options7 = { "", "", "" };

		int taxi = JOptionPane.showOptionDialog(null, "Okej, du valde att ringa en taxi \n " + " \n Vad ska du göra?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		if (taxi == 0) {

		} else if (taxi == 1) {

		} else {

		}
	}

	public static void affär() {
		Object[] options7 = { "Väntar på bussen", "ICA", "" };

		int affär = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå in i någonstans \n Men det är bara två som är öppna"
						+ " \n Vilken ska du ska gå in i eller ska du vänta?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		if (affär == 0) {
			bussen();
		} else if (affär == 1) {
			ica();
		} else {

		}
	}

	public static void ica() {

	}

	public static void gåFörbi() {
		Object[] options2 = { "Fortsätter gå", "Säger till någon på vägen", "Hjälper personen" };
		int person = JOptionPane.showOptionDialog(null,
				"Okej, du valde att inte se personen \n Men personen börjar prata med dig " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);

		if (person == 0) {
			ljudPåVägen();
		} else if (person == 1) {
			storaHuset();

		} else {
			help();

		}
	}

	public static void storaHuset() {
		Object[] options7 = { "knackar på", "fortsätter gå", "går tillbaks och hjälper personen" };

		int vägen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att säga till \n Men vägen är tom men du ser ett stort hus framför dig"
						+ " \n Vad gör du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);
		if (vägen == 0) {
			knackar();

		} else if (vägen == 1) {
			ljudPåVägen();
		} else {
			help();
		}
	}

	public static void knackar() {
		Object[] options3 = { "Säger hallå, någon hemma?", " Smygger in och tar ficklampan", "" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att knacka på \n Dörren öppnas lite på glänt och du får syn på en fiklampa längst in i korridoren "
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {
			sägerHallå();

		} else if (help == 1) {
			fickLampa();

		} else {

		}

	}
	public static void sägerHallå() {
		
	}
	public static void fickLampa(){
		Object[] options3 = { "Säger hallå, någon hemma?", " Smygger in och tar fiklampan", "" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att smygga in \n men du kom inte långt"
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {
			

		} else if (help == 1) {
			

		} else {

		}
		
	}

	public static void help() {

		Object[] options3 = { "Tar personen till sjukhuset", "Ringer en ambulansen", "Ringer polisen" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att hjälpa personen \n Personen är svårt skadad, men har också ett vapen "
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {
			personen();

		} else if (help == 1) {

			ambulans();

		} else {
			polisen1();
		}

	}

	// level2();
	public static void skog() {

		Object[] options5 = { "Går igenom skogen i alla fall", "Genom ett hus område",
				"Går tillbaka till vägen bakom" };
		int skog = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå igenom skogen \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);

		if (skog == 0) {
			liv = liv - 1;
			ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/björn.jpg");
			JOptionPane.showMessageDialog(null,
					"Okej, du valde att gå i skogen i alla fall \n Det var en björn, och du har nu -1 liv"
							+ " \n du har liv kvar " + liv, null, skog, icon);
			skog();

		} else if (skog == 1) {
			hus();

		} else {
			tillbaksEfterSkogen();

		}

	}

	public static void ljudPåVägen() {
		Object[] options5 = { "Går igenom skogen", "fortsätter gå", " går tillbaks till människan som behöver hjälp" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att fortsätta gå \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {
			storaSkogen();
		} else if (ut == 1) {
			fortsätterGå();
		} else {

		}
	}

	public static void fortsätterGå() {

	}

	public static void storaSkogen() {

	}

	public static void hus() {
		Object[] options6 = { "struntar i det och fortsätter gå", "hälsar på dem", "tar en annan väg" };

		int hus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå igenom husppmrådet \n Men det är massa folk framför dig" + " \n Vad gör du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options6, options6[2]);
		if (hus == 0) {

		} else if (hus == 1) {
			husfolk();

		} else {
			enAnnan();

		}
	}

	public static void ambulans() {

		Object[] options1 = { "Låter den vara", "Tar med den", "Ringer polisen" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa ambulansen \n ambulansen tackar dig och åker iväg med personen \n men vapnet ligger fortfarande kvar på marken "
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {
			lämnarVapnet();
		} else if (ambulans == 1) {
			TarVapnet();
		} else {
			polisen1();
		}
	}

	public static void TarVapnet() {
		Object[] options1 = { "Skyndar sig raka vägen hem", "Tar en genväg igenom skogen", "Ringer en taxi" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ta med vapnet \n Det börjar bli riktigt mörkt ute " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

		if (ambulans == 0) {
			AndraVägenTillHuset();

		} else if (ambulans == 1) {
			mörkaSkogen();

		} else {
			taxi();
		}
	}

	public static void lämnarVapnet() {
		Object[] options1 = { "Skyndar sig raka vägen hem", "Tar en genväg igenom skogen", "Ringer en taxi" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att lämna vapnet \n Det börjar bli riktigt mörkt ute " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {
			AndraVägenTillHuset();

		} else if (ambulans == 1) {
			mörkaSkogen();

		} else {
			taxi();
		}

	}

	public static void mörkaSkogen() {

		Object[] options5 = { "Går igenom skogen i alla fall", "", "Gå till Storahuset" };
		int skog = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå igenom skogen \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);

		if (skog == 0) {
			skogsBjörn();

		} else if (skog == 1) {
			förbiHusetPåNatten();

		} else {
			storaHuset();
		}
	}

	public static void skogsBjörn() {
		liv = liv - 1;
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/björn.jpg");
		JOptionPane.showInternalMessageDialog(null,
				"Okej, du valde att gå i skogen i alla fall \n Det var en björn, och du har nu -1 liv "
						+ " \n du har liv kvar " + liv, null, liv, icon);
		mörkaSkogen();
	}

	public static void AndraVägenTillHuset() {

		Object[] options2 = { "försöker gå i mörkret", "Knackar på", "går igenom hus området längre bort" };
		int vägHus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att fortsätta gå \n Du kommer fram till ett stort hus, din mobil har dött och det är en väldigt mörkt ute "
						+ " \n Du skulle behöva en fiklampa för att hitta hem \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);
		if (vägHus == 0) {

		} else if (vägHus == 1) {
			knackar();
		} else {
			hus();

		}
	}

	public static void förbiHusetPåNatten() {
		Object[] options5 = { "Går igenom skogen", "fortsätter gå", " går tillbaks till huset" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att fortsätta gå \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {
			storaSkogen();
		} else if (ut == 1) {
			fortsätterGå();
		} else {

		}
	}

	public static void polisen1() {
		Object[] options1 = { "Frågar vad det är", "Säger hejdå och börjar gå",
				"kollar bakom dig ifall det är någon annan där" };

		int polisen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa polisen \n Polisen är väldigt tacksam och ska gensat ta hand om det \n men en av polisen kollar konstigt på dig "
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

	}

	public static void personen() {
		Object[] options1 = { "släpper personen och går iväg", "Blir rädd och frågar vad personen menar",
				"struntar i vad personen sa och går mot sjukhuset" };

		int personen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ta med personen \n personen säger till dig att du är i fara " + " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (personen == 0) {
			släppaPersonen();

		} else if (personen == 1) {
			rädd();
		} else {
			gårTillSjukhuset();
		}
	}

	public static void gårTillSjukhuset() {
		Object[] options5 = { "", "", "" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att fortsätta gå till sjukhuset \n " + " \n Vad gör du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {

		} else if (ut == 1) {

		} else {

		}
	}

	public static void husfolk() {

	}

	public static void rädd() {

	}

	public static void släppaPersonen() {
		liv = liv - 1;
		JOptionPane.showMessageDialog(null,
				"Okej, du valde att släppa personen \n Det skulle du inte gjort, för personen hade med sig vapnet och råkar då skada dig"
						+ " \n Du får -1 liv" + " så du har nu " + liv + "kvar");
		personen();
	}

	public static void hemma() {
		level2();
	}

	public static void level2() {
		liv = liv + 1;
		JOptionPane.showMessageDialog(null, "Level 2");
		JOptionPane.showMessageDialog(null, "Liv =" + liv);

		level3();
	}

	public static void level3() {
		liv = liv + 1;
		JOptionPane.showMessageDialog(null, "Level 3");

		level4();
	}

	public static void level4() {
		liv = liv + 1;

		JOptionPane.showMessageDialog(null, "Level 4");

	}
}
