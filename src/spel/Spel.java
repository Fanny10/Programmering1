package spel;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Spel {
	private static int liv = 10;

	public static void main(String[] args) {
		start();

	}

	public static void start() {

		String anv�ndarnamn = JOptionPane.showInputDialog(null, "Innan vi startar \n V�nligen skriv in ditt spel namn",
				"V�lkommen", 1);

		while (true) {
			String jaEllerNej = JOptionPane.showInputDialog(null, "V�lkommen " + anv�ndarnamn
					+ " i det h�r spelet kommer du olika val m�jligheter \n Du startar med 10 liv och under spelets g�ng kommer du f�rlora n�got liv och kanske f� n�got extra \n Din uppgift �r att komma s� l�ngt som m�jligt, f�r varje level f�r du + ett liv \n �r du redo f�r att b�rja spelet? \n skriv ja ifall du �r redo");

			if (jaEllerNej.equalsIgnoreCase("ja")) {
				level1();
				break;
			} else {
				JOptionPane.showMessageDialog(null, "b�rja om");

			}

		}

	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");

		Object[] options = new Object[] { "Tar en annan v�g", "L�sas som du inte ser och g�r f�rbi",
				"Fr�gar om personen beh�ver hj�lp" };
		int val = JOptionPane.showOptionDialog(null,
				"Du �r p�v�g hem och du ser n�gon som ligger p� marken " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		if (val == 0) {

			enAnnan();

		} else if (val == 1) {
			g�F�rbi();

		} else {
			help();

		}

	}

	public static void enAnnan() {
		Object[] options1 = { "Genom skogen", "Genom ett hus omr�de", "G�r tillbaka till v�gen bakom" };

		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan v�g " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

		if (enAnnan == 0) {

			skog();

		} else if (enAnnan == 1) {
			hus();

		} else {
			Object[] options7 = { "", "", "" };

			int hus = JOptionPane.showOptionDialog(null, "Okej, du valde att g� tillbaks \n Du" + " \n Vad g�r du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		}
	}

	public static void g�F�rbi() {
		Object[] options2 = { "Forts�tter g�", "S�ger till n�gon p� v�gen", "Hj�lper personen" };
		int person = JOptionPane.showOptionDialog(null,
				"Okej, du valde att inte se personen \n Men personen b�rjar prata med dig " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);

		if (person == 0) {
			Object[] options5 = { "", "", "" };

			int ut = JOptionPane.showOptionDialog(null,
					"Okej, du valde att forts�tta g� \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		} else if (person == 1) {
			Object[] options7 = { "", "", "" };

			int v�gen = JOptionPane.showOptionDialog(null,
					"Okej, du valde att s�ga till \n Men det �r ett stort  framf�r dig" + " \n Vad g�r du ?", null,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		}
	}

	public static void help() {

		Object[] options3 = { "Tar personen till sjukhuset", "Ringer en ambulansen", "Ringer polisen" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att hj�lpa personen \n Personen �r sv�rt skadad, men har ocks� ett vapen "
						+ " \n Vad g�r du?",
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
		while (true) {

			Object[] options5 = { "G�r igenom skogen i alla fall", "Genom ett hus omr�de",
					"G�r tillbaka till v�gen bakom" };
			int skog = JOptionPane.showOptionDialog(null,
					"Okej, du valde att g� igenom skogen \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);

			if (skog == 0) {
				liv = liv - 1;

				JOptionPane.showMessageDialog(null,
						"Okej, du valde att g� i skogen i alla fall \n Det var en bj�rn, och du har nu -1 liv"
								+ " \n du har liv kvar " + liv);

			} else if (skog == 1) {
				hus();
				break;
			} else {
				enAnnan();

			}

		}

	}

	public static void hus() {
		Object[] options6 = { "struntar i det och forts�tter g�", "h�lsar p� dem", "tar en annan v�g" };

		int hus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att g� igenom husppmr�det \n Men det �r massa folk framf�r dig" + " \n Vad g�r du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options6, options6[2]);
		if (hus == 0) {
			
		}else if (hus ==1) {
			
		}else {
			
		}
	}

	public static void ambulans() {

		Object[] options1 = { "L�ter den vara", "Tar med den", "Ringer polisen" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa ambulansen \n ambulansen tackar dig och �ker iv�g med personen \n men vapnet ligger fortfarande kvar p� marken "
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {

		} else if (ambulans == 1) {

		} else {
			polisen1();
		}
	}

	public static void polisen1() {
		Object[] options1 = { "Fr�gar vad det �r", "S�ger hejd� och b�rjar g�",
				"kollar bakom dig ifall det �r n�gon annan d�r" };

		int polisen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa polisen \n Polisen �r v�ldigt tacksam och ska gensat ta hand om det \n men en av polisen kollar konstigt p� dig "
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

	}

	public static void personen() {
		Object[] options1 = { "sl�pper personen och g�r iv�g", "Blir r�dd och fr�gar vad personen menar",
				"struntar i vad personen sa och g�r mot sjukhuset" };

		int personen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ta med personen \n personen s�ger till dig att du �r i fara " + " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (personen == 0) {
			liv = liv - 1;
			JOptionPane.showMessageDialog(null, "Okej, du valde att sl�ppa personen \n Det skulle du inte gjort, f�r personen hade med sig vapnet och r�kar d� skada dig"
					+ " \n Du f�r -1 liv" + " s� du har nu " + liv + "kvar");

		}
	}
	public static void husfolk() {
		
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
