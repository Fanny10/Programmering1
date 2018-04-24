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
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javafx.scene.layout.Background;

public class TestGame extends JFrame implements WindowListener {
	private JPanel panel = new JPanel();

	private ImageIcon poopIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/poop.jpeg");
	private ImageIcon poopIcon1 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/red-error-158.png");
	private ImageIcon poopIcon2 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/red-invisible-16.png");
	private ImageIcon poopIcon3 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/black-shoping-bag-90.png");
	private ImageIcon poopIcon4 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/norea.png");
	private ImageIcon poopIcon5 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/Scott.png");
	private ImageIcon poopIcon6 = new ImageIcon("C:/Users/fanny.lindqvist/Desktop/spel/kontor1.png");

	private JLabel imageLabel = new JLabel(poopIcon);

	private JButton okButton = new JButton(poopIcon2);
	private JButton closeButton = new JButton("Close");
	private JButton nextButton = new JButton("Next");
	private JButton backButton = new JButton("B");
	private JButton go = new JButton("Go");
	private JButton scott = new JButton(poopIcon5);
	private JButton norea = new JButton(poopIcon4);
	private JButton In = new JButton(poopIcon3);
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private JButton next1Button = new JButton("Next");

	private JLabel textInfo = new JLabel(".....");

	private int level = 1;

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

		{ // close
			panel.add(closeButton);
			closeButton.addActionListener(e -> buttonActionClose());
			closeButton.setMnemonic(KeyEvent.VK_C);
			Dimension size = closeButton.getPreferredSize();
			closeButton.setBounds(tk.getScreenSize().width - 200, 20, size.width, size.height);

		}
		// end of close
		
		panel.add(next1Button);
		next1Button.addActionListener(e -> Next1());
		Dimension size = next1Button.getPreferredSize();
		next1Button.setBounds(1600, 1000, size.width, size.height);

	}
	

	public void Next1() {

		panel.removeAll();
		
		
		panel.add(closeButton);
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
		
		thumb.setIcon(poopIcon6);
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
	 * buttonAction()); Dimension sizeOKButton = okButton.getPreferredSize();
	 * okButton.setBackground(null); okButton.setBounds(tk.getScreenSize().width -
	 * 400, tk.getScreenSize().height - 200, sizeOKButton.width,
	 * sizeOKButton.height); } panel.add(In); In.addActionListener(t ->
	 * buttonAction()); Dimension sizeIn = In.getPreferredSize();
	 * In.setBackground(null); In.setBounds(tk.getScreenSize().width - 200,
	 * tk.getScreenSize().height - 170, sizeIn.width, sizeIn.height);
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
		System.out.println("Norea");
		panel.removeAll();
		panel.add(closeButton);
		
		
		panel.repaint();
		
		
		
		
	}

	private void buttonActionScott() {
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