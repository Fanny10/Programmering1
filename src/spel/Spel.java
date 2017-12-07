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

		Object[] options = new Object[] { "Tar en annan väg", "Låsas som du inte ser och går förbi",
				"Frågar om personen behöver hjälp" };
		int val = JOptionPane.showOptionDialog(null,
				"Du är påväg hem och du ser någon som ligger på marken " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

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
			Object[] options7 = { "", "", "" };

			int hus = JOptionPane.showOptionDialog(null, "Okej, du valde att gå tillbaks \n Du" + " \n Vad gör du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

		}
	}

	public static void gåFörbi() {
		Object[] options2 = { "Fortsätter gå", "Säger till någon på vägen", "Hjälper personen" };
		int person = JOptionPane.showOptionDialog(null,
				"Okej, du valde att inte se personen \n Men personen börjar prata med dig " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);

		if (person == 0) {
			Object[] options5 = { "", "", "" };

			int ut = JOptionPane.showOptionDialog(null,
					"Okej, du valde att fortsätta gå \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		} else if (person == 1) {
			Object[] options7 = { "", "", "" };

			int vägen = JOptionPane.showOptionDialog(null,
					"Okej, du valde att säga till \n Men det är ett stort  framför dig" + " \n Vad gör du ?", null,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options7, options7[2]);

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
		while (true) {

			Object[] options5 = { "Går igenom skogen i alla fall", "Genom ett hus område",
					"Går tillbaka till vägen bakom" };
			int skog = JOptionPane.showOptionDialog(null,
					"Okej, du valde att gå igenom skogen \n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);

			if (skog == 0) {
				liv = liv - 1;

				JOptionPane.showMessageDialog(null,
						"Okej, du valde att gå i skogen i alla fall \n Det var en björn, och du har nu -1 liv"
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
		Object[] options6 = { "struntar i det och fortsätter gå", "hälsar på dem", "tar en annan väg" };

		int hus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att gå igenom husppmrådet \n Men det är massa folk framför dig" + " \n Vad gör du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options6, options6[2]);
		if (hus == 0) {
			
		}else if (hus ==1) {
			
		}else {
			
		}
	}

	public static void ambulans() {

		Object[] options1 = { "Låter den vara", "Tar med den", "Ringer polisen" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa ambulansen \n ambulansen tackar dig och åker iväg med personen \n men vapnet ligger fortfarande kvar på marken "
						+ " \n Vad gör du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {

		} else if (ambulans == 1) {

		} else {
			polisen1();
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
			liv = liv - 1;
			JOptionPane.showMessageDialog(null, "Okej, du valde att släppa personen \n Det skulle du inte gjort, för personen hade med sig vapnet och råkar då skada dig"
					+ " \n Du får -1 liv" + " så du har nu " + liv + "kvar");

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
