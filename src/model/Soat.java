package model;

public class Soat extends Document{

	private double hedgingPrice;
	private int [][] soatImage;
	private String code;
	
	

	public Soat(int choice, int documentType, double documentsPrice, int documentsDate, double hedgingPrice) {
		super(choice, documentType, documentsPrice, documentsDate);
		
		this.hedgingPrice = hedgingPrice;
		this.code = codeGeneratorL();
		this.soatImage = new int[4][4];
	}

	public double getHedgingPrice() {
		return hedgingPrice;
	}

	public void setHedgingPrice(double hedgingPrice) {
		this.hedgingPrice = hedgingPrice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int [][] getSoatImage() {
		return soatImage;
	}

	public void setSoatImage(int [][] soatImage) {
		this.soatImage = soatImage;
	}
	
	/**pre
	 *<strong>Description:</strong> the codeGeneratorL is used to generate the code of the 
	 *soat in a L form.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pos:</strong> N/A
	 *@return code <strong>String</strong> this variable is use to save the message that the user will see in the program
	 *in this case, it will show the code generated.
	 *pre
	*/
	
	public String codeGeneratorL() {
		String code = "";
		boolean stopFlag1 = false;
		int[][] soatImage = new int[4][4];
		soatImage = getDocumentsImage();
		
		for (int i = 0; i <= soatImage.length; i++) {
			if (i > 0) {
				stopFlag1 = true;
			}
			for (int j = 0; i < soatImage[0].length && stopFlag1 == false; i++) {
				
				code += soatImage[i][j] + " ";
				
			}
		}
		
		for (int i = soatImage.length - 1; i < soatImage.length; i++) {
			for (int j = 0; j < soatImage[0].length; j++) {
				if (i + j != soatImage.length - 1) {
					code += soatImage[i][j] + " ";
				}
			}
		}
		
		
		return code;
		
	}

	@Override
	public String toString() {
		String msg = "";
		
		msg += "\nSoat information:\n";
		msg += "Year: " + getDocumentsDate() + "\n";
		msg += "Price: " + getDocumentsPrice() + "\n";
		msg += "Matrix generated:\n" + printImage();
		msg += "Soat code: " + code;
		
		
		return msg ;
	}
	
	
}
