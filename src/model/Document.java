package model;

import java.util.Random;

public class Document {

	private int documentsDate;
	private double documentsPrice;
	private int documentType;
	private int choice;
	private int[][] documentsImage;

	public Document(int choice, int documentType, double documentsPrice, int documentsDate) {
		super();
		this.documentsImage = new int[4][4];
		random();
		this.documentsDate = documentsDate;
		this.documentsPrice = documentsPrice;
		this.documentType = documentType;
		this.choice = choice;
	}

	public int getDocumentsDate() {
		return documentsDate;
	}

	public void setDocumentsDate(int documentsDate) {
		this.documentsDate = documentsDate;
	}

	public double getDocumentsPrice() {
		return documentsPrice;
	}

	public void setDocumentsPrice(double documentsPrice) {
		this.documentsPrice = documentsPrice;
	}

	public int[][] getDocumentsImage() {
		return documentsImage;
	}

	public void setDocumentsImage(int[][] documentsImage) {
		this.documentsImage = documentsImage;
	}
	
	public int getDocumentType() {
		return documentType;
	}

	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice= choice;
	}

	/**pre
	 *<strong>Description:</strong> the random method is use to fill the matrix with random numbers
	 *from 0 to 9.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pre:</strong> this method needs the creation of a document.
	 *<strong>pos:</strong> N/A
	 *pre
	*/
	
	public void random() {
		Random rd = new Random();

		for (int i = 0; i < documentsImage.length; i++) {
			for (int j = 0; j < documentsImage[0].length; j++) {

				documentsImage[i][j] = rd.nextInt(10);

			}
		}
	}
	
	/**pre
	 *<strong>Description:</strong> the printImage method is use to show the matrix made to the user.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pre:</strong> this method needs the creation of a document.
	 *<strong>pos:</strong> N/A
	 *@return print <strong>String</strong> this variable is use to save the message that the user will see in the program
	 *in this case, it will show the matrix.
	 *pre
	*/
	
	public String printImage() {

		String print = "";
		for (int i = 0; i < documentsImage.length; i++) {
			for (int j = 0; j < documentsImage[0].length; j++) {
				print += documentsImage[i][j] + " | ";
			}
			print += "\n";
			for (int k = 0; k < documentsImage.length; k++) {
				print += "----";
			}
			print += "\n";
		}
		return print;
	}
}
