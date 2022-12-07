import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class ActorSearchResults {

	public static JPanel showActorSearchResults(Actor[] results) throws MalformedURLException {
		MainGUI.backButton.setVisible(false);
		JPanel firstResult = new JPanel(new BorderLayout());
		JPanel secondResult = new JPanel(new BorderLayout());
		JPanel thirdResult = new JPanel(new BorderLayout());
		JPanel fourthResult = new JPanel(new BorderLayout());
		JPanel mainPanel = new JPanel(new GridLayout(2, 2));

		JLabel firstLabel;
		JLabel secondLabel;
		JLabel thirdLabel;
		JLabel fourthLabel;
		Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);

		Color purple = new Color(181, 153, 206);

		mainPanel.add(firstResult);
		mainPanel.add(secondResult);
		mainPanel.add(thirdResult);
		mainPanel.add(fourthResult);

		firstResult.setSize(250, 75);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(purple);
		String actorResultOne = String.format("%s", results[0].getName());
		firstLabel = new JLabel(actorResultOne);
		firstLabel.setBackground(Color.blue);
		firstLabel.setHorizontalAlignment(JLabel.CENTER);
		firstResult.add(firstLabel, BorderLayout.NORTH);
		firstResult.setVisible(true);

		JLabel poster = new JLabel();
		if (results[0].getImage() != null) {
			try {
				URL posterLink = new URL(results[0].getImage());
				ImageIcon posterImage = new ImageIcon(posterLink);
				poster.setIcon(new ImageIcon(normalizeImage(posterImage)));
				poster.setHorizontalAlignment(SwingConstants.TRAILING);
				firstResult.add(poster, JLabel.CENTER); // CENTER DOESNT WORK
			} catch (MalformedURLException e) {
				Image icon = (new ImageIcon("NoImageLink.png")).getImage();
				poster.setIcon(new ImageIcon(icon));
				poster.setHorizontalAlignment(SwingConstants.TRAILING);
				firstResult.add(poster, JLabel.CENTER); // CENTER DOESNT WORK
			}
		}

		secondResult.setSize(250, 75);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(purple);
		String actorResultTwo = String.format("%s", results[1].getName());
		secondLabel = new JLabel(actorResultTwo);
		secondLabel.setBackground(Color.blue);
		secondLabel.setHorizontalAlignment(JLabel.CENTER);
		secondResult.add(secondLabel, BorderLayout.NORTH);
		secondResult.setVisible(true);

		JLabel posterTwo = new JLabel();
		if (results[1].getImage() != null) {
			try {

				URL posterLinkTwo = new URL(results[1].getImage());
				ImageIcon posterImageTwo = new ImageIcon(posterLinkTwo);
				posterTwo.setIcon(new ImageIcon(normalizeImage(posterImageTwo)));
				posterTwo.setHorizontalAlignment(SwingConstants.TRAILING);
				secondResult.add(posterTwo, JLabel.CENTER); // CENTER DOESNT WORK
			} catch (MalformedURLException e) {
				Image icon = (new ImageIcon("NoImageLink.png")).getImage();
				posterTwo.setIcon(new ImageIcon(icon));
				posterTwo.setHorizontalAlignment(SwingConstants.TRAILING);
				secondResult.add(posterTwo, JLabel.CENTER); // CENTER DOESNT WORK
			}
		}

		thirdResult.setSize(250, 75);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(purple);
		String actorResultThree = String.format("%s", results[2].getName());
		thirdLabel = new JLabel(actorResultThree);
		thirdLabel.setBackground(Color.blue);
		thirdLabel.setHorizontalAlignment(JLabel.CENTER);
		thirdResult.add(thirdLabel, BorderLayout.NORTH);
		thirdResult.setVisible(true);

		JLabel posterThree = new JLabel();
		if (results[2].getImage() != null) {
			try {
				URL posterLinkThree = new URL(results[2].getImage());
				ImageIcon posterImageThree = new ImageIcon(posterLinkThree);
				posterThree.setIcon(new ImageIcon(normalizeImage(posterImageThree)));
				posterThree.setHorizontalAlignment(SwingConstants.TRAILING);
				thirdResult.add(posterThree, JLabel.CENTER); // CENTER DOESNT WORK
			} catch (MalformedURLException e) {
				Image icon = (new ImageIcon("NoImageLink.png")).getImage();
				posterThree.setIcon(new ImageIcon(icon));
				posterThree.setHorizontalAlignment(SwingConstants.TRAILING);
				thirdResult.add(posterThree, JLabel.CENTER); // CENTER DOESNT WORK
			}
		}

		fourthResult.setSize(250, 75);
		fourthResult.setBorder(blackBorder);
		fourthResult.setBackground(purple);
		String actorResultFour = String.format("%s", results[3].getName());
		fourthLabel = new JLabel(actorResultFour);
		fourthLabel.setBackground(Color.blue);
		fourthLabel.setHorizontalAlignment(JLabel.CENTER);
		fourthResult.add(fourthLabel, BorderLayout.NORTH);
		fourthResult.setVisible(true);

		JLabel posterFour = new JLabel();
		if (results[3].getImage() != null) {
			try {
				URL posterLinkFour = new URL(results[3].getImage());
				ImageIcon posterImageFour = new ImageIcon(posterLinkFour);
				posterFour.setIcon(new ImageIcon(normalizeImage(posterImageFour)));
				posterFour.setHorizontalAlignment(SwingConstants.TRAILING);
				fourthResult.add(posterFour, JLabel.CENTER); // CENTER DOESNT WORK
			} catch (MalformedURLException e) {
				Image icon = (new ImageIcon("NoImageLink.png")).getImage();
				posterFour.setIcon(new ImageIcon(icon));
				posterFour.setHorizontalAlignment(SwingConstants.TRAILING);
				fourthResult.add(posterFour, JLabel.CENTER); // CENTER DOESNT WORK
			}
		}

		/*
		 * fifthResult.setSize(250, 75); fifthResult.setBorder(blackBorder);
		 * fifthResult.setBackground(purple); String actorResultFive =
		 * String.format("%s", results[0].getName()); fifthLabel = new
		 * JLabel(actorResultFive); fifthLabel.setBackground(Color.blue);
		 * fifthLabel.setHorizontalAlignment(JLabel.CENTER);
		 * fifthResult.add(fifthLabel,BorderLayout.NORTH); fifthResult.setVisible(true);
		 * 
		 * 
		 * JButton button5 = new JButton("View " + results[0].getName());
		 * button5.setSize(50, 10); button5.setHorizontalAlignment(JButton.CENTER);
		 * fifthResult.add(button5, BorderLayout.SOUTH);
		 * 
		 * button5.addActionListener(e -> { //try {
		 * //MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(
		 * results[4].getID()))); //} catch (IOException e1) { // TODO Auto-generated
		 * catch block //e1.printStackTrace(); //} });
		 * 
		 * sixthResult.setSize(250, 75); sixthResult.setBorder(blackBorder);
		 * sixthResult.setBackground(purple); String actorResultSix =
		 * String.format("%s", results[0].getName()); sixthLabel = new
		 * JLabel(actorResultSix); sixthLabel.setBackground(Color.blue);
		 * sixthLabel.setHorizontalAlignment(JLabel.CENTER);
		 * sixthResult.add(sixthLabel,BorderLayout.NORTH); sixthResult.setVisible(true);
		 * 
		 * 
		 * JButton button6 = new JButton("View " + results[0].getName());
		 * button6.setSize(50, 10); button6.setHorizontalAlignment(JButton.CENTER);
		 * sixthResult.add(button6, BorderLayout.SOUTH);
		 * 
		 * button6.addActionListener(e -> { //try {
		 * //MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(
		 * results[4].getID()))); //} catch (IOException e1) { // TODO Auto-generated
		 * catch block //e1.printStackTrace(); //} });
		 */

		return mainPanel;
	}

	private static Image normalizeImage(ImageIcon image) {

		Dimension dimensions = MainGUI.screenSize;
		double idealHeight = dimensions.height * .3;
		double idealWidth = (idealHeight / image.getIconHeight()) * image.getIconWidth();
		System.out.println(dimensions);
		System.out.println(idealWidth + " " + idealHeight);

		return image.getImage().getScaledInstance((int) idealWidth, (int) idealHeight, Image.SCALE_SMOOTH);
	}
}