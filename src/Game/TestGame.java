package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javafx.scene.layout.Background;

public class TestGame extends JFrame implements WindowListener {
	private JPanel panel = new JPanel();

	private ImageIcon poopIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/poop.jpeg");
	private ImageIcon poopIcon1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/red-error-158.png");
	private ImageIcon poopIcon2 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/red-invisible-16.png");
	private ImageIcon poopIcon3 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/black-shoping-bag-90.png"); // inventory
	private ImageIcon poopIcon4 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/norea.png");// norea
	private ImageIcon poopIcon5 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/Scott.png");// scott
	private ImageIcon poopIcon6 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/kontor1.png");// kontor
	private ImageIcon poopIcon7 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/trappa.JPG");// trappan upp
	private ImageIcon poopIcon8 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/kontor.JPG");// kontor
	private ImageIcon poopIcon9 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/1.JPG");// bilden i b�rjan
	private ImageIcon poopIcon10 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sten.JPG");// sten mur
	private ImageIcon help = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/black-touchscreen-smartphone-24.png");// mobil
	private ImageIcon klocka = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/klocka.png"); // klock bild
	private ImageIcon vardagsrum11 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum1.1.png");
	private ImageIcon vardagsrum12 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum1.2.png");
	private ImageIcon svart = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum1.svart.png");
	private ImageIcon vardagsrum = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum1.png");
	private ImageIcon vardagsrum1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum2.png");
	private ImageIcon vardagsrum2 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum3.png");
	private ImageIcon vardagsrum3 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/vardagsrum4.png");

	private ImageIcon badrum1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/badrum1.png");
	private ImageIcon badrum2 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/badrum2.png");
	private ImageIcon badrum3 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/badrum3.png");

	//sovrum 1
	private ImageIcon sovrum1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum1.1.png");
	private ImageIcon sovrum12 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum1.2.png");
	private ImageIcon sovrum13 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum1.3.png");
	private ImageIcon sovrum14 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum1.4.png");

	private ImageIcon hallen = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/hall1.png");
	private ImageIcon hallen1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/hall2.png");
	
	//sovrum2
	private ImageIcon sovrum21 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum2.1.png");
	private ImageIcon sovrum22 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum2.2.png");
	private ImageIcon sovrum23 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum2.3.png");
	private ImageIcon sovrum24 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/sovrum2.4.png");
	

	// inventory
	private ImageIcon inventorybild = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/inventory.png"); // bakgrundbild
	private ImageIcon key = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/black-key-50.png");

	private int key1 = 0;// nyckeln till garderoben

	// Knappar
	private JLabel imageLabel = new JLabel(poopIcon);
	private JButton dorr = new JButton("open");// sovrum 1
	private JButton dorr1 = new JButton("open"); //ut ifr�n sovrum 1
	private JButton hall = new JButton("Go");
	private JButton hall2 = new JButton("Go");
	private JButton dorr2 = new JButton("Open"); //badrum
	private JButton dorr3 = new JButton("Open"); // ut ifr�n bad rum
	private JButton okButton = new JButton(poopIcon2);
	private JButton dorr4 = new JButton("Open"); // till sovrum 2
	private JButton dorr5 = new JButton("Open"); // ut ifr�n sovrum 2
	private JButton nyckel = new JButton("skaffa nyckel");
	// private JButton nyckel1 = new JButton(key);
	private JButton helpButton = new JButton(help);
	private JButton right = new JButton("Right");
	private JButton left = new JButton("Left");
	private JButton closeButton = new JButton("Close");
	private JButton nextButton = new JButton("Next");
	private JButton backButton = new JButton("B");
	private JButton go = new JButton("Go");
	private JButton scott = new JButton(poopIcon5);
	private JButton norea = new JButton(poopIcon4);
	private JButton In = new JButton(poopIcon3);
	private JButton In1 = new JButton(poopIcon3);
	private JButton In2 = new JButton(poopIcon3);
	private JButton In3 = new JButton(poopIcon3);
	private JButton In4 = new JButton(poopIcon3);
	private JButton In5 = new JButton(poopIcon3);
	private JButton In6 = new JButton(poopIcon3);
	private JButton In7 = new JButton(poopIcon3);
	private JButton In8 = new JButton(poopIcon3);
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private JButton next1Button = new JButton("Next");
	private JButton next2Button = new JButton("Next");
	private JButton next3Button = new JButton("Next");
	private Timer timer1 = null;
	JLabel thumb1 = new JLabel();
	JLabel thumb2 = new JLabel();
	JLabel thumb3 = new JLabel();
	JLabel thumb4 = new JLabel();
	JLabel thumb5 = new JLabel();
	private boolean stopTimer2 = true;

	private JLabel textInfo = new JLabel(".....");
	private JLabel text = new JLabel(".....");

	private int vLevel = 0;
	private int hLevel = 0;
	private int sLevel = 0;
	private int s2Level = 0;
	private int bLevel = 0;
	private int level = 0;
	private String room = "vRum";

	public TestGame() {
		// Closes the program when x button is presseed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Hämtar en panel som man kan lägga andra grafiska object på
		Container contentPane = this.getContentPane();

		// Lägger till sjig sjålv som en lysner till sitt egna fönster
		this.addWindowListener(this);

		this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
		this.setUndecorated(true);
		// this.setOpacity(0.95f);
		this.setLocationRelativeTo(null);

		// Kör funktionen addButtons
		addComp(contentPane);

		panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "goUp");
		panel.getActionMap().put("goUp", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Up is pressed...
				upKeyPressed();

			}

		});
	}

	/**
	 * alt-shift-r gör så att alla referenser av ordet ändras
	 * 
	 * @param contentPane
	 */

	public void addComp(Container contentPane) {

		// panel
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.gray);

		panel.add(next1Button);
		next1Button.addActionListener(e -> Next1());
		Dimension size = next1Button.getPreferredSize();
		next1Button.setBounds(1600, 1000, size.width, size.height);
		{

			// close
			panel.add(closeButton);
			closeButton.addActionListener(e -> buttonActionClose());
			closeButton.setMnemonic(KeyEvent.VK_C);
			Dimension size1 = closeButton.getPreferredSize();
			closeButton.setBounds(tk.getScreenSize().width - 200, 20, size1.width, size1.height);

		}
		// end of close

		{
			panel.add(text);
			text.setFont(text.getFont().deriveFont(44.0f));
			Dimension size9 = text.getPreferredSize();
			// Postion X,Y Storlek X,Y
			text.setOpaque(true);
			text.setBounds(500, 100, 900, 900);
			text.setBackground(new Color(222, 220, 255));
			text.setText(
					"<html><body><b style='color:#ffff'>Welcome to ..... </b><br> The story takes place in the present time, in Brasov, Romania. <br> You have an important speech, for general election </b>");

			// text.setHorizontalTextPosition(textPosition);

			// poopIcon = new
			Border matteBorder = BorderFactory.createMatteBorder(30, 30, 30, 30, poopIcon10);
			text.setBorder(matteBorder);
		}

		{

			panel.add(thumb1);

			thumb1.setIcon(poopIcon9);
			Dimension sizeThumb1 = thumb1.getPreferredSize();
			thumb1.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		}
	}

	public void Next1() {
		panel.removeAll();
		panel.add(closeButton);
		panel.add(text);
		text.setFont(text.getFont().deriveFont(44.0f));
		Dimension size9 = text.getPreferredSize();
		// Postion X,Y Storlek X,Y
		text.setOpaque(true);
		text.setBounds(500, 100, 900, 900);
		text.setBackground(new Color(222, 220, 255));
		text.setText(
				"<html><body><b style='color:#ffff'>Welcome to ..... </b><br> The last thing you remember was that you were on your way home, late at night. \n After writing your speech \n and after that Everything gets black </b>");

		panel.add(next2Button);
		next2Button.addActionListener(e -> Next2());
		Dimension size = next2Button.getPreferredSize();
		next2Button.setBounds(1600, 1000, size.width, size.height);
		panel.add(thumb1);
		panel.repaint();
	}

	public void Next2() {

		panel.removeAll();

		panel.add(closeButton); // l�gger till en knapp som st�nger hela f�nstret.
		System.out.println("next");
		panel.add(textInfo);
		textInfo.setFont(textInfo.getFont().deriveFont(44.0f));
		Dimension size = textInfo.getPreferredSize();
		System.out.println(size.getWidth());
		textInfo.setBounds(tk.getScreenSize().width / 2 - (int) size.getWidth() * 3, 100, 400, 50);
		textInfo.setText("<html><body><b style='color:#fffff'> Select a Character </b>");

		panel.add(norea);
		norea.addActionListener(e -> buttonActionNorea());
		norea.setToolTipText(
				"<html><body><b style='color:#FF1493;text-decoration:underline;'>Norea</b> <br> Gender: Girl <br> Age:20 years <br> Height:163cm <br> Weight:56kg </b></body></html>");

		Dimension size1 = norea.getPreferredSize();
		norea.setBackground(null);
		norea.setBounds(tk.getScreenSize().width - 400 - size1.width, 200, size1.width, size1.height);

		panel.add(scott);
		scott.addActionListener(e -> buttonActionScott());
		Dimension size2 = norea.getPreferredSize();
		scott.setToolTipText(
				"<html><body><b style='color:blue;text-decoration:underline;'>Scott</b><br> Gender:Boy <br> Age:20 years <br> Height:181cm <br> Weight:78kg </b></body></html>");
		scott.setBackground(null);
		scott.setBounds(400, 200, size2.width, size2.height);
		JLabel thumb = new JLabel();

		thumb.setIcon(poopIcon9); // bakgrundsbild
		Dimension sizeThumb = thumb.getPreferredSize();
		thumb.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
		panel.add(thumb);
		panel.repaint();
	}

	// .........................................................
	/*
	 * // end of panel
	 * 
	 * { panel.add(imageLabel); Image image = poopIcon.getImage(); // transform it
	 * Image newimg = image.getScaledInstance(400, 400,
	 * java.awt.Image.SCALE_SMOOTH); // scale it the smooth way poopIcon = new
	 * ImageIcon(newimg); // transform it back imageLabel.setIcon(poopIcon);
	 * imageLabel.setBounds(200, 200, 400, 400); } panel.add(imageLabel); Image
	 * image = poopIcon1.getImage(); // transform it Image newimg =
	 * image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH); // scale it
	 * the smooth way poopIcon1 = new ImageIcon(newimg); // transform it back
	 * imageLabel.setIcon(poopIcon1); imageLabel.setBounds(220, 202, 420, 390);
	 * 
	 * {
	 * 
	 * JButton clearButton = new JButton("Clear"); panel.add(clearButton);
	 * clearButton.addActionListener(e -> buttonActionClear()); Dimension
	 * sizeOKButton = clearButton.getPreferredSize();
	 * clearButton.setBounds(tk.getScreenSize().width - 400 - sizeOKButton.width,
	 * tk.getScreenSize().height - 200, sizeOKButton.width, sizeOKButton.height);
	 * 
	 * }
	 * 
	 * { panel.add(textInfo); textInfo.setBounds(1000, 200, 400, 800);
	 * textInfo.setText(
	 * "<html><body><b style='color:#FFFFFF'>Hej,<br> Välkommen till vårat spel! <br> Du hör en bil och ser ett ljus! <br> Vad gör du?</b>"
	 * );
	 * 
	 * Border matteBorder = BorderFactory.createMatteBorder(1, 3, 5, 7,
	 * Color.lightGray); textInfo.setBorder(matteBorder); }
	 * 
	 * {// ok button panel.add(okButton); okButton.addActionListener(e ->
	 * buttonAction());
	 * 
	 * 
	 * 
	 * 
	 * 
	 * sizeOKButton = okButton.getPreferredSize(); okButton.setBackground(null);
	 * okButton.setBounds(tk.getScreenSize().width - 400, tk.getScreenSize().height
	 * - 200, sizeOKButton.width, sizeOKButton.height); } panel.add(In);
	 * In.addActionListener(t -> buttonAction()); Dimension sizeIn =
	 * In.getPreferredSize(); In.setBackground(null);
	 * In.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170,
	 * sizeIn.width, sizeIn.height);
	 * 
	 * 
	 * 
	 * { // next contentPane.add(nextButton, BorderLayout.EAST);
	 * nextButton.addActionListener(x -> buttonActionNext());
	 * nextButton.setToolTipText(
	 * "<html><body><b style='color:red;text-decoration:underline;'>Ne</b><b>xt</b></body></html>"
	 * ); } // end of next
	 * 
	 * {// back contentPane.add(backButton, BorderLayout.WEST);
	 * backButton.addActionListener(e -> buttonActionBack());
	 * backButton.setBackground(Color.GREEN); Border matteBorder =
	 * BorderFactory.createMatteBorder(1, 3, 5, 7, Color.lightGray);
	 * backButton.setBorder(matteBorder); } contentPane.add(go, BorderLayout.NORTH);
	 * go.addActionListener(e -> buttonActionBack()); go.setBackground(Color.blue);
	 */
	// end of back

	private void buttonActionClear() {
		textInfo.setText("<html><body>");

	}

	public void upKeyPressed() {
		System.out.println("Go up!");
	}

	private void buttonActionNorea() {
		panel.removeAll();
		System.out.println("Norea");

		panel.add(closeButton);
		panel.add(next3Button);
		next3Button.addActionListener(o -> uppVakning());
		Dimension size = next3Button.getPreferredSize();
		next3Button.setBounds(1600, 1000, size.width, size.height);
		panel.add(text);
		text.setFont(text.getFont().deriveFont(44.0f));
		Dimension size9 = text.getPreferredSize();
		// Postion X,Y Storlek X,Y
		text.setOpaque(true);
		text.setBounds(500, 100, 900, 900);
		text.setBackground(new Color(222, 220, 255));
		text.setText(
				"<html><body><b style='color:#ffff'>You walk up and wonder, where am I ? </b><br>You wonder what the time is... You see a clock,  it was 7 am. You have your life's most important speech 7pm at the plaza. You must out and came in time to the general election.</b>");

		panel.add(thumb2);

		thumb2.setIcon(klocka);
		Dimension sizeThumb2 = thumb2.getPreferredSize();
		thumb2.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
		panel.repaint();

	}
	/*
	 * private void timer() {
	 * 
	 * new JFrame().setVisible(true); ActionListener actionListener = new
	 * ActionListener() { public void actionPerformed(ActionEvent actionEvent) {
	 * 
	 * 
	 * } }; Timer timer = new Timer(500, actionListener); timer.start(); }
	 * 
	 */

	private void uppVakning() {

		// SetIcon...
		// sleep...

		// Set Next Icon
		// sleep..
		panel.removeAll();
		thumb5.setIcon(svart);

		thumb5.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
		panel.add(thumb5);
		panel.repaint();

		Timer t = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				panel.removeAll();
				thumb5.setIcon(vardagsrum12);

				thumb5.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
				panel.add(thumb5);
				panel.repaint();

			}
		});
		t.start();
		Timer ti = new Timer(1400, new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				thumb5.setIcon(vardagsrum11);

				thumb5.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
				panel.add(thumb5);
				panel.repaint();
				t.stop();

			}
		});
		ti.start();
		Timer tim = new Timer(1600, new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				panel.removeAll();
				thumb5.setIcon(vardagsrum12);
				panel.add(thumb5);
				panel.repaint();
				ti.stop();
			}
		});
		tim.start();

		Timer time = new Timer(1900, new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				thumb5.setIcon(vardagsrum11);

				thumb5.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);
				panel.add(thumb5);
				panel.repaint();
				tim.stop();
			}
		});

		time.start();

		timer1 = new Timer(2000, new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				stopTimer();
				time.stop();
			}
		});
		timer1.start();

	}

	private void stopTimer() {
		vRum0start();
	}

	private void vRum0start() {
		room = "vRum";
		panel.removeAll();
		panel.add(closeButton);

		panel.add(right);
		right.addActionListener(n -> goRight());
		Dimension sizeRight = right.getPreferredSize();
		right.setBackground(null);
		right.setBounds(1690, 210, sizeRight.width, sizeRight.height);

		panel.add(left);
		left.addActionListener(n -> goLeft());
		Dimension sizeLeft = left.getPreferredSize();
		left.setBackground(null);
		left.setBounds(290, 210, sizeLeft.width, sizeLeft.height);

		panel.add(In);
		In.addActionListener(t -> buttonActionIn());
		Dimension sizeIn = In.getPreferredSize();
		In.setBackground(null);
		In.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn.width, sizeIn.height);

		panel.add(nyckel);
		nyckel.addActionListener(q -> next4Button());
		Dimension size3 = nyckel.getPreferredSize();
		nyckel.setBounds(700, 100, size3.width, size3.height);

		panel.add(thumb4);

		thumb4.setIcon(vardagsrum);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
		if (stopTimer2) {
			timer1.stop();
			stopTimer2 = false;
		}

	}

	private void vRum0() {
		room = "vRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(In);
		panel.add(left);
		panel.add(right);
		panel.add(nyckel);

		panel.add(thumb4);
		thumb4.setIcon(vardagsrum);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void goRight() {
		System.out.println("goRight1: " + vLevel);
		// Vardagsrum

		if (room.equals("vRum")) {
			if (vLevel == 0)
				vLevel = 1;
			else if (vLevel == 1)
				vLevel = 2;
			else if (vLevel == 2)
				vLevel = 3;
			else if (vLevel == 3)
				vLevel = 0;

		}
		// Sovrum 1
		else if (room.equals("sRum")) {
			if (sLevel == 0)
				sLevel = 1;
			else if (sLevel == 1)
				sLevel = 2;
			else if (sLevel == 2)
				sLevel = 3;
			else if (sLevel == 3)
				sLevel = 0;
		}
		// hallen
		else if (room.equals("hRum")) {
			if (hLevel == 0)
				hLevel = 1;
			else if (hLevel == 1)
				hLevel = 0;

		}
		else if (room.equals("bRum")) {
			if (bLevel == 1)
				bLevel = 0;
			else if (bLevel == 0)
				bLevel = 2;
			else if (bLevel == 2)
				bLevel = 1;
		}else if (room.equals("s2Rum")) {
			if (s2Level == 1)
				s2Level = 0;
			else if (s2Level == 0)
				s2Level = 3;
			else if (s2Level == 3)
				s2Level = 2;
			else if (s2Level == 2)
				s2Level = 1;
		}
		levelLoader();
	}

	private void goLeft() {
		// Vardagsrum
		if (room.equals("vRum")) {
			if (vLevel == 0)
				vLevel = 3;
			else if (vLevel == 1)
				vLevel = 0;
			else if (vLevel == 2)
				vLevel = 1;
			else if (vLevel == 3)
				vLevel = 2;

		}
		// Sovrum 1
		else if (room.equals("sRum")) {
			if (sLevel == 0)
				sLevel = 2;
			else if (sLevel == 1)
				sLevel = 0;
			else if (sLevel == 2)
				sLevel = 3;
			else if (sLevel == 3)
				sLevel = 1;

		} else if (room.equals("hRum")) {
			if (hLevel == 1)
				hLevel = 0;
			else if (hLevel == 0)
				hLevel = 1;
		}else if (room.equals("bRum")) {
			if (bLevel == 0)
				bLevel = 1;
			else if (bLevel == 1)
				bLevel = 2;
			else if (bLevel == 2)
				bLevel = 0;
		}else if (room.equals("s2Rum")) {
			if (s2Level == 0)
				s2Level = 1;
			else if (s2Level == 1)
				s2Level = 2;
			else if (s2Level == 2)
				s2Level = 3;
			else if (s2Level == 3)
				s2Level = 0;
		}
		
		levelLoader();
	}

	private void levelLoader() {
		// Vardagsrum
		if (room.equals("vRum")) {
			if (vLevel == 0) {
				vRum0();
			} else if (vLevel == 1) {
				vRum1();
			} else if (vLevel == 2) {
				vRum2();
			} else if (vLevel == 3) {
				vRum3();
			}
		} else if (room.equals("sRum")) {
			if (sLevel == 0) {
				s1Rum1();
			} else if (sLevel == 1) {
				s1Rum2();
			} else if (sLevel == 2) {
				s1Rum3();
			} else if (sLevel == 3) {
				s1Rum4();

			}
			// Hall
		} else if (room.equals("hRum")) {
			if (hLevel == 0) {
				hRum1();
			} else if (hLevel == 1) {
				hRum2();
			}
			} else if (room.equals("bRum")) {
				if (bLevel == 0) {
					bRum0();
				} else if (bLevel == 1) {
					bRum1();
				} else if (bLevel == 2) {
					bRum2();
				}
			}
				else if (room.equals("s2Rum")) {
					if (s2Level == 0) {
						s2Rum();
					} else if (s2Level == 1) {
						s2Rum1();
					} else if (s2Level == 2) {
						s2Rum2();
					}else if (s2Level == 3) {
						s2Rum3();
					}

			

		}

	}

	private void bRum0() {
		room = "bRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		
		panel.add(thumb4);

		thumb4.setIcon(badrum1);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void bRum1() {
		room = "bRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		
		panel.add(thumb4);

		thumb4.setIcon(badrum2);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void bRum2() {
		room = "bRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		
		panel.add(thumb4);

		thumb4.setIcon(badrum3);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	// Sovrum 1
	private void s1Rum1() {
		room = "sRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(In);

		panel.add(thumb4);

		thumb4.setIcon(sovrum1);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void s1Rum2() {
		room = "sRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(In);

		panel.add(thumb4);

		thumb4.setIcon(sovrum13);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	}

	private void s1Rum3() {
		room = "sRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(In);

		panel.add(thumb4);

		thumb4.setIcon(sovrum12);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	}

	private void s1Rum4() {
		room = "sRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(In);
		panel.add(dorr1);
		dorr1.addActionListener(k -> vRum3());
		Dimension sizeDorr1 = dorr1.getPreferredSize();
		dorr1.setBackground(null);
		dorr1.setBounds(720, 190, sizeDorr1.width, sizeDorr1.height);

		panel.add(thumb4);

		thumb4.setIcon(sovrum14);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	}

	private void hRum1() {
		room = "hRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(hall2);
		hall2.addActionListener(e -> vRum1());
		Dimension sizeHall2 = hall2.getPreferredSize();
		hall2.setBackground(null);
		hall2.setBounds(260, 150, sizeHall2.width, sizeHall2.height);
		panel.add(dorr2);
		dorr2.addActionListener(e -> bRum0());
		Dimension sizeDorr = dorr2.getPreferredSize();
		dorr2.setBackground(null);
		dorr2.setBounds(720, 190, sizeDorr.width, sizeDorr.height);

		panel.add(thumb4);

		thumb4.setIcon(hallen);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	}

	private void hRum2() {
		room = "hRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(dorr4);
		dorr4.addActionListener(e -> s2Rum());
		Dimension sizeDorr = dorr4.getPreferredSize();
		dorr4.setBackground(null);
		dorr4.setBounds(120, 190, sizeDorr.width, sizeDorr.height);

		panel.add(thumb4);

		thumb4.setIcon(hallen1);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	} 
	private void s2Rum() {
		room = "s2Rum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		

		panel.add(thumb4);

		thumb4.setIcon(sovrum21);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}
	private void s2Rum1() {
		room = "s2Rum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		

		panel.add(thumb4);

		thumb4.setIcon(sovrum22);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}
	private void s2Rum2() {
		room = "s2Rum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		

		panel.add(thumb4);

		thumb4.setIcon(sovrum23);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}
	private void s2Rum3() {
		room = "s2Rum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		

		panel.add(thumb4);

		thumb4.setIcon(sovrum24);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void vRum1() {
		room = "vRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);
		panel.add(In);
		panel.add(hall);
		hall.addActionListener(e -> hRum1());
		Dimension sizeHall = hall.getPreferredSize();
		hall.setBackground(null);
		hall.setBounds(520, 190, sizeHall.width, sizeHall.height);

		panel.add(thumb4);

		thumb4.setIcon(vardagsrum1);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void vRum2() {
		room = "vRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);

		panel.add(In);

		panel.add(thumb4);

		thumb4.setIcon(vardagsrum3);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void vRum3() {
		room = "vRum";
		panel.removeAll();
		panel.add(closeButton);
		panel.add(right);
		panel.add(left);

		panel.add(In);
		panel.add(dorr);
		dorr.addActionListener(e -> s1Rum1());
		Dimension sizeDorr = dorr.getPreferredSize();
		dorr.setBackground(null);
		dorr.setBounds(720, 190, sizeDorr.width, sizeDorr.height);

		panel.add(thumb4);

		thumb4.setIcon(vardagsrum2);
		Dimension sizeThumb4 = thumb4.getPreferredSize();
		thumb4.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();
	}

	private void next4Button() {
		key1 = 1;

	}

	private void buttonActionIn() {
		panel.removeAll();
		panel.add(closeButton);
		System.out.println(level);
		if (key1 == 1) {
			panel.add(imageLabel);

			imageLabel.setIcon(key);
			Dimension size6 = imageLabel.getPreferredSize();
			imageLabel.setBounds(200, 100, tk.getScreenSize().width, tk.getScreenSize().height);

		}
		if (room.equals("vRum")) {

			if (vLevel == 0) {
				panel.add(In1);
				In1.addActionListener(l -> vRum0());
				Dimension sizeIn1 = In1.getPreferredSize();
				In1.setBackground(null);
				In1.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn1.width,
						sizeIn1.height);
			} else if (vLevel == 1) {
				panel.add(In2);
				In2.addActionListener(o -> vRum1());
				Dimension sizeIn2 = In2.getPreferredSize();
				In2.setBackground(null);
				In2.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn2.width,
						sizeIn2.height);
			} else if (vLevel == 2) {
				panel.add(In3);
				In3.addActionListener(k -> vRum2());
				Dimension sizeIn3 = In3.getPreferredSize();
				In3.setBackground(null);
				In3.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn3.width,
						sizeIn3.height);
			} else if (vLevel == 3) {
				panel.add(In4);
				In4.addActionListener(k -> vRum3());
				Dimension sizeIn4 = In4.getPreferredSize();
				In4.setBackground(null);
				In4.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn4.width,
						sizeIn4.height);
			}
		}
		if (room.equals("sRum")) {

			// Sovrum 1
			if (sLevel == 0) {
				panel.add(In5);
				In5.addActionListener(e -> s1Rum1());
				Dimension sizeIn5 = In5.getPreferredSize();
				In5.setBackground(null);
				In5.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn5.width,
						sizeIn5.height);
			} else if (sLevel == 1) {
				panel.add(In6);
				In6.addActionListener(e -> s1Rum2());
				Dimension sizeIn6 = In6.getPreferredSize();
				In6.setBackground(null);
				In6.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn6.width,
						sizeIn6.height);
			} else if (sLevel == 2) {
				panel.add(In7);
				In7.addActionListener(e -> s1Rum3());
				Dimension sizeIn7 = In7.getPreferredSize();
				In7.setBackground(null);
				In7.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn7.width,
						sizeIn7.height);
			} else if (sLevel == 3) {
				panel.add(In8);
				In8.addActionListener(e -> s1Rum4());
				Dimension sizeIn8 = In8.getPreferredSize();
				In8.setBackground(null);
				In8.setBounds(tk.getScreenSize().width - 200, tk.getScreenSize().height - 170, sizeIn8.width,
						sizeIn8.height);
			}
		}

		panel.add(thumb3);
		thumb3.setIcon(inventorybild); // bakgrundsbild
		Dimension sizeThumb = thumb3.getPreferredSize();
		thumb3.setBounds(0, 0, tk.getScreenSize().width, tk.getScreenSize().height);

		panel.repaint();

	}

	private void buttonActionScott() {
		level = 1;
		System.out.println("Scott");
		panel.removeAll();
		panel.add(closeButton);

		panel.repaint();

	}

	public void buttonActionNext() {
		nextButton.setText("<html><body><b style='color:red;text-decoration:underline;'>Ne</b><b>xt</b></body></html>");
		System.out.println("Next Button pressed!");
		level++;
		if (level == 2) {
			panel.removeAll();
			panel.add(closeButton);
			panel.add(okButton);
			okButton.setText("Okej");
			Dimension size = okButton.getPreferredSize();
			okButton.setSize(size);
			panel.repaint();
			go.addActionListener(x -> buttonActionNext());

		} else if (level == 3) {
			panel.removeAll();
			panel.add(closeButton);
			panel.add(textInfo);
			panel.repaint();
		}

	}

	public void buttonActionBack() {

		System.out.println("Back Button pressed!");
	}

	public void buttonAction() {
		textInfo.setText(textInfo.getText() + "<b style='color:#FFFFFF;'> <br>Use key button pressed!</b>");
	}

	public void buttonAction1() {
		text.setText(text.getText() + "<b style='color:#FFFFFF;'> <br>text!</b>");
	}

	public void buttonActionClose() {
		System.out.println("Close Button pressed!");
		System.exit(0);
	}

	public static void main(String[] args) {
		TestGame frame = new TestGame();
		frame.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");

	}

	public ImageIcon getPoopIcon1() {
		return poopIcon1;
	}

	public void setPoopIcon1(ImageIcon poopIcon1) {
		this.poopIcon1 = poopIcon1;
	}

	public void setPoopIcon2(ImageIcon poopIcon2) {
		this.poopIcon2 = poopIcon2;

	}

	public void setPoopIcon4(ImageIcon poopIcon4) {
		this.poopIcon4 = poopIcon4;
	}

	public void setPoopIcon5(ImageIcon poopIcon5) {
		this.poopIcon5 = poopIcon5;
	}

	public void setPoopIcon6(ImageIcon poopIcon6) {
		this.poopIcon6 = poopIcon6;

	}
}