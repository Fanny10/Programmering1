package spel;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Spel {
	private static int liv = 10;
	private static int vapen = 0;
	private static int nyckel = 0;
	private static int nyckelnTillDubbelD�rrar = 0;
	private static int ficklampa = 0;
	private static String anv�ndarnamn;
	private static int skruvdragare = 0;

	public static void main(String[] args) {
		start();

	}

	public static void duF�rlora() {
		JOptionPane.showMessageDialog(null, "Game Over");
		jaEllerNej();
	}

	public static void start() {

		anv�ndarnamn = JOptionPane.showInputDialog(null, "Innan vi startar \n V�nligen skriv in ditt spel namn",
				"V�lkommen", 1);
		jaEllerNej();
	}

	public static void jaEllerNej() {

		while (true) {
			String jaEllerNej = JOptionPane.showInputDialog(null, "V�lkommen " + anv�ndarnamn
					+ " i det h�r spelet kommer du olika val m�jligheter \n Du startar med 10 liv och under spelets g�ng kommer du f�rlora n�got liv och kanske f� n�got extra \n Din uppgift �r att komma s� l�ngt som m�jligt, f�r varje level f�r du + ett liv \n �r du redo f�r att b�rja spelet? \n skriv ja ifall du �r redo");

			if (jaEllerNej.equalsIgnoreCase("ja")) {
				level1();
				break;
			} else if(jaEllerNej.equalsIgnoreCase("nej")) {
				JOptionPane.showMessageDialog(null, "fel svar");
				
			}else {
				JOptionPane.showMessageDialog(null, "b�rja om");

			}

		}

	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");
		b�rjan();
	}

	public static void b�rjan() {

		Object[] options = new Object[] { "Tar en annan v�g", "L�sas som du inte ser och g�r f�rbi",
				"Fr�gar om personen beh�ver hj�lp" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/dagv�g.jpg");
		int val = JOptionPane.showOptionDialog(null,
				"Du �r p�v�g hem och du ser n�gon som ligger p� marken " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);

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
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/g�ngv�g.jpg");
		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan v�g " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options1, options1[2]);

		if (enAnnan == 0) {

			skog();

		} else if (enAnnan == 1) {
			hus();

		} else {
			storaHuset();
		}
	}

	public static void tillbaksEfterSkogen() {
		Object[] options1 = { "P� den v�gen m�nniskan var", "Genom ett hus omr�de", "V�gen bakom" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/v�g.jpg");
		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan v�g " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options1, options1[2]);

		if (enAnnan == 0) {
			b�rjan();

		} else if (enAnnan == 1) {
			hus();

		} else {
			storaHuset();

		}
	}

	public static void g�F�rbi() {
		Object[] options2 = { "Forts�tter g�", "S�ger till n�gon p� v�gen", "Hj�lper personen" };
		int person = JOptionPane.showOptionDialog(null,
				"Okej, du valde att inte se personen \n Men personen b�rjar prata med dig " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);

		if (person == 0) {
			ljudP�V�gen();
		} else if (person == 1) {
			storaHuset();

		} else {
			help();

		}
	}

	public static void storaHuset() {
		Object[] options7 = { "knackar p�", "forts�tter g�", "g�r tillbaks och hj�lper personen" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/hus.jpg");
		int v�gen = JOptionPane.showOptionDialog(null,
				"Okej, du valde att g� \n Men v�gen �r tom men du ser ett stort hus framf�r dig" + " \n Vad g�r du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options7, options7[2]);
		if (v�gen == 0) {
			knackar();

		} else if (v�gen == 1) {
			ljudP�V�gen();
		} else {
			help();
		}
	}

	public static void knackar() {
		Object[] options3 = { "S�ger hall�, n�gon hemma?", " Smygger in och tar ficklampan",
				"G�r v�gen hem i m�rkret" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att knacka p� \n D�rren �ppnas lite p� gl�nt och du f�r syn p� en fiklampa l�ngst in i korridoren "
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {
			s�gerHall�();

		} else if (help == 1) {
			fickLampa();

		} else {

		}

	}

	public static void s�gerHall�() {

	}

	public static void fickLampa() {

		Object[] options3 = { "N�rmaste d�rren", "Springer och tar ficklampan och g�mmer dig", "" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/koridor.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att smygga in \n men du kommer inte l�ngt innan du h�r konstiga ljud"
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {
			n�rmasteD�rr();

		} else if (help == 1) {
			ficklampa = 1;
			efterFicklampan();

		} else {

		}

	}

	public static void efterFicklampan() {
		Object[] options3 = { "", "", "lyssnar ifall du kan g� ut" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att springa in och ta ficklampan \n du sprang in i rummet brevid och hoppas att du inte h�rdes"
						+ " \n du kom till ett konstigt rum med massa f�rger, Vad g�r du nu?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 2) {
			motD�rrenEfterFiklampan();
		}
	}

	public static void motD�rrenEfterFiklampan() {
		Object[] options3 = { "�ppnar den n�rmaste d�rren", "", "" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/d�rrar.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att lyssna och du h�rde inget \n S� du gick ut men du kommer inte l�ngt innan du h�r konstiga ljud igen"
						+ " \n s� du springer in i rummet brevid. Det finns tre d�rrar? ",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);

		if (help == 0) {
			if (nyckel == 1) {
				vilkenTurAttDuHittaNyckelnIAndraRummet();

				if (ficklampa == 1) {
					vilkenTurAttDuHarEnFicklampa();
				}
			} else {
				d�rren�rL�st();
			}

		}
	}

	public static void n�rmasteD�rr() {
		Object[] options3 = { "tar skruvdargern och g�r igenom den �ppna d�rren", "g�r igenom den �ppna d�rren",
				"�pnnar den st�ngda d�rren" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/n�rmasted�rren.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ta n�rmaste d�rren \n p� golvet ligger det en skruvdragare och den d�rr st�r �ppen"
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {
			skruvdragare = 1;

		} else if (help == 1) {

		} else {
			l�stD�rr();

		}

	}

	public static void letarIHuset() {
		Object[] options3 = { "Provar nyckeln i d�rren", "Struntar i vad som finns d�r och letar efter en v�g ut",
				"Lyssnar ifall du kan h�ra n�got p� andra sidan d�rren" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/andraSidan.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att leta i rummet \n Du hittar en nyckel vad ska du g�ra", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {
			if (nyckelnTillDubbelD�rrar == 1) {
				uppL�stDubbelD�rr();
			} else {
				l�stDubbelD�rr();
			}

		} else if (help == 1) {

		} else {

		}

	}

	public static void l�stDubbelD�rr() {
		Object[] options3 = { "Letar i ett annat rum", "Forts�tter och leta i rummet",
				"Struntar i det och lyssnar ifall det �r n�gon vid d�rren" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/n�rmasted�rren.jpg");
		int help = JOptionPane.showOptionDialog(null, "Okej, Det var tuv�rr fel nyckel" + " \n Vad g�r du nu?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {
			rumEfterL�stD�rr();

		} else if (help == 1) {

		} else {

		}

	}

	public static void rumEfterL�stD�rr() {
		Object[] options3 = { "�ppnar den n�rmaste d�rren", "�ppnar den d�rren l�ngsbort", "�ppnar den i mitten" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/d�rrar.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, Du valde ett annat rum" + "Du kommer fram till tre stycken d�rrar \n Vad g�r du nu?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {
			if (nyckel == 1) {
				vilkenTurAttDuHittaNyckelnIAndraRummet();
				if (ficklampa == 1) {
					vilkenTurAttDuHarEnFicklampa();
				}
			} else {
				d�rren�rL�st();
			}

		} else if (help == 1) {

		} else {

		}
	}

	public static void d�rren�rL�st() {
		Object[] options3 = { ".", "Tar en annan d�rr", "." };

		int help = JOptionPane.showOptionDialog(null, "Okej, D�rren �r l�st " + "  \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {

		} else if (help == 1) {
			rumEfterL�stD�rr();

		}

	}

	public static void vilkenTurAttDuHittaNyckelnIAndraRummet() {
		Object[] options3 = { "G�r in i m�rkret", "tar en annan d�rr", "g�r tillbaks till rummet med dubbeld�rrarna" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/svart.jpg");
		int help = JOptionPane.showOptionDialog(null, "Okej, Du valde n�rmaste d�rren"
				+ "Men den var l�st, men nyckeln du hittar f�rut passar \n Du g�r in och det �nda du ser �r m�rker  \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {

		}

	}

	public static void vilkenTurAttDuHarEnFicklampa() {
		Object[] options3 = { "tar din ficklampa och g�r in", "tar en annan d�rr",
				"g�r tillbaks till rummet med dubbeld�rrarna" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/svart.jpg");
		int help = JOptionPane.showOptionDialog(null, "Okej, Du valde n�rmaste d�rren"
				+ "Men den var l�st, men nyckeln du hittar f�rut passar \n Du g�r in och det �nda du ser �r m�rker \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {

		}
	}

	public static void uppL�stDubbelD�rr() {
		Object[] options3 = { "�ppnar d�rren f�rsiktigt", ".", "." };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/n�rmasted�rren.jpg");
		int help = JOptionPane.showOptionDialog(null, "Okej, Det var r�tt nyckel" + " \n Vad g�r du nu?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {

		} else if (help == 1) {

		} else {

		}

	}

	public static void l�stD�rr() {
		Object[] options3 = { "tar skruvdargern och g�r igenom den �ppna d�rren", "g�r igenom den �ppna d�rren",
				"Letar i rummet" };

		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/n�rmasted�rren.jpg");
		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att �ppna d�rren \n men d�rren �r l�st du m�ste hitta en nykel" + " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options3, options3[2]);
		if (help == 0) {

		} else if (help == 1) {

		} else {
			nyckel = 1;
			letarIHuset();

		}

	}

	public static void ljud() {
		Object[] options3 = { "Springer in till den n�rmaste d�rren", "Tar ficklampan och g�mmer dig bakom gardinern",
				"" };

		int help = JOptionPane.showOptionDialog(null,
				"Okej, du valde att smygga in \n men du kommer inte l�ngt innan du har konstiga ljud ifr�n �verv�ningen"
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[2]);
		if (help == 0) {

		} else if (help == 1) {

		} else {

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

		Object[] options5 = { "G�r igenom skogen i alla fall", "Genom ett hus omr�de",
				"G�r tillbaka till v�gen bakom" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/dagskog.jpg");
		int skog = JOptionPane.showOptionDialog(null,
				"Okej, du valde att g� igenom skogen \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options5, options5[2]);

		if (skog == 0) {
			liv = liv - 1;
			ImageIcon icont = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/bj�rn.jpg");
			JOptionPane.showMessageDialog(null,
					"Okej, du valde att g� i skogen i alla fall \n Det var en bj�rn, och du har nu -1 liv"
							+ " \n du har liv kvar " + liv,
					null, skog, icont);
			if (liv == 0) {
				duF�rlora();
			} else {
				skog();
			}

		} else if (skog == 1) {
			hus();

		} else {
			tillbaksEfterSkogen();

		}

	}

	public static void ljudP�V�gen() {
		Object[] options5 = { "G�r igenom skogen", "forts�tter g�", " g�r tillbaks till m�nniskan som beh�ver hj�lp" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att forts�tta g� \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {
			storaSkogen();
		} else if (ut == 1) {
			forts�tterG�();
		} else {

		}
	}

	public static void forts�tterG�() {

	}

	public static void storaSkogen() {

	}

	public static void hus() {
		Object[] options6 = { "struntar i det och forts�tter g�", "h�lsar p� dem", "tar en annan v�g" };

		int hus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att g� igenom husppmr�det \n Men det �r massa folk framf�r dig" + " \n Vad g�r du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options6, options6[2]);
		if (hus == 0) {
			storaHuset();
		} else if (hus == 1) {
			husfolk();

		} else {
			enAnnan();

		}
	}

	public static void ambulans() {

		Object[] options1 = { "L�ter den vara", "Tar med den", "Ringer polisen" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ringa ambulansen \n ambulansen tackar dig och �ker iv�g med personen \n men vapnet ligger fortfarande kvar p� marken "
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {
			l�mnarVapnet();
		} else if (ambulans == 1) {
			vapen = 1;
			TarVapnet();
		} else {
			polisen1();
		}
	}

	public static void TarVapnet() {
		Object[] options1 = { "Skyndar sig raka v�gen hem", "Tar en genv�g igenom skogen", "Ringer en taxi" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att ta med vapnet \n Det b�rjar bli riktigt m�rkt ute " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);

		if (ambulans == 0) {
			AndraV�genTillHuset();

		} else if (ambulans == 1) {
			m�rkaSkogen();

		} else {
			taxi();
		}
	}

	public static void taxi() {
		Object[] options1 = { "knackar p�", "forts�tter g�", "" };

		int taxi = JOptionPane.showOptionDialog(null,
				"Taxin kommer och sl�pper av dig vid ett annat stort hus"
						+ " \n och v�gen tillbaks �r l�ng och m�rk \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (taxi == 0) {
			knackar();
		} else if (taxi == 1) {

		} else {

		}
	}

	public static void l�mnarVapnet() {
		Object[] options1 = { "Skyndar sig raka v�gen hem", "Tar en genv�g igenom skogen", "Ringer en taxi" };

		int ambulans = JOptionPane.showOptionDialog(null,
				"Okej, du valde att l�mna vapnet \n Det b�rjar bli riktigt m�rkt ute " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (ambulans == 0) {
			AndraV�genTillHuset();

		} else if (ambulans == 1) {
			m�rkaSkogen();

		} else {
			taxi();
		}

	}

	public static void m�rkaSkogen() {

		Object[] options5 = { "G�r igenom skogen i alla fall", "", "G� till Storahuset" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/skog.jpg");
		int skog = JOptionPane.showOptionDialog(null,
				"Okej, du valde att g� igenom skogen \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options5, options5[2]);

		if (skog == 0) {
			skogsBj�rn();

		} else if (skog == 1) {
			f�rbiHusetP�Natten();

		} else {
			storaHuset();
		}
	}

	public static void skogsBj�rn() {
		liv = liv - 1;
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/bj�rn.jpg");
		JOptionPane.showInternalMessageDialog(null,
				"Okej, du valde att g� i skogen i alla fall \n Det var en bj�rn, och du har nu -1 liv "
						+ " \n du har liv kvar " + liv,
				null, liv, icon);
		if (liv == 0) {
			start();
		} else {

			m�rkaSkogen();
		}
	}

	public static void AndraV�genTillHuset() {

		Object[] options2 = { "f�rs�ker g� i m�rkret", "Knackar p�", "g�r igenom hus omr�det l�ngre bort" };
		ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Ny mapp (2)/l�skigt hus.jpg");
		int v�gHus = JOptionPane.showOptionDialog(null,
				"Okej, du valde att forts�tta g� \n Du kommer fram till ett stort hus, din mobil har d�tt och det �r en v�ldigt m�rkt ute "
						+ " \n Du skulle beh�va en fiklampa f�r att hitta hem \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);
		if (v�gHus == 0) {

		} else if (v�gHus == 1) {
			knackar();
		} else {
			hus();

		}
	}

	public static void f�rbiHusetP�Natten() {
		Object[] options5 = { "G�r igenom skogen", "forts�tter g�", " g�r till huset" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att forts�tta g� \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {
			storaSkogen();
		} else if (ut == 1) {
			forts�tterG�();
		} else {

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
			sl�ppaPersonen();

		} else if (personen == 1) {
			r�dd();
		} else {
			g�rTillSjukhuset();
		}
	}

	public static void g�rTillSjukhuset() {
		Object[] options5 = { "", "", "" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att forts�tta g� till sjukhuset \n " + " \n Vad g�r du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {

		} else if (ut == 1) {

		} else {

		}
	}

	public static void husfolk() {
		Object[] options1 = { "" };

		int r�dd = JOptionPane.showOptionDialog(null, "." + " \n Vad g�r du?", null, JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (r�dd == 0) {

		} else if (r�dd == 1) {

		} else {

		}

	}

	public static void r�dd() {
		Object[] options1 = { "Struntar i det och g�r hem", "G�r till huset", "Tar hans vapen och g�r till huset" };

		int r�dd = JOptionPane.showOptionDialog(null,
				"Personen ber�ttar att det finns ett stort hus l�ngre fram p� v�gen \n som �r hems�kt, det h�r vapnet �r det �nda som kan r�dda min familj /n min familj �r d�r inne. Sn�lla r�dda dem, sa personen och tog sitt sista andetag"
						+ " \n Vad g�r du?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		if (r�dd == 0) {

		} else if (r�dd == 1) {

		} else {
			vapen = 1;

		}
	}

	public static void g�rHemEfterPersonen�rD�d() {
		Object[] options5 = { "", "forts�tter g�", " g�r till huset" };

		int ut = JOptionPane.showOptionDialog(null,
				"Okej, du valde att forts�tta g� \n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[2]);
		if (ut == 0) {

		} else if (ut == 1) {

		} else {

		}
	}

	public static void sl�ppaPersonen() {
		liv = liv - 1;
		JOptionPane.showMessageDialog(null,
				"Okej, du valde att sl�ppa personen \n Det skulle du inte gjort, f�r personen hade med sig vapnet och r�kar d� skada dig"
						+ " \n Du f�r -1 liv" + " s� du har nu " + liv + "kvar");
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
