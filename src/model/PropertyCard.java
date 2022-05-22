package model;

public class PropertyCard extends Document {

	private int [][] propertyCardImage;
	private String code;
	
	public PropertyCard(int choice, int documentType, double documentsPrice, int documentsDate) {
		super(choice, documentType, documentsPrice, documentsDate);
		
		this.code = generateCodePare();
		this.propertyCardImage = new int[4][4];
	}

	public int [][] getPropertyCardImage() {
		return propertyCardImage;
	}

	public void setPropertyCardImage(int [][] propertyCardImage) {
		this.propertyCardImage = propertyCardImage;
	}

	/**pre
	 *<strong>Description:</strong> the generateCodePare is used to generate the code of the 
	 *property card with the pare positions of the matrix.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pos:</strong> N/A
	 *@return code <strong>String</strong> this variable is use to save the message that the user will see in the program
	 *in this case, it will show the code generated.
	 *pre
	*/
	
	public String generateCodePare() {
		String code = "";
		int[][] propertyImage = new int[4][4];
		propertyImage = getDocumentsImage();
		
		for (int i = propertyImage.length - 1; i >= 0; i--) {
			for (int j = propertyImage.length - 1; j >= 0; j--) {
				if ((i + j)%2 == 0 && (i + j) != 0) {
					code += propertyImage[i][j] + " ";
				}
			}
		}
		
		return code;
	}

	@Override
	public String toString() {
		String msg = "";
		
		msg += "\nProperty card information:\n";
		msg += "Year: " + getDocumentsDate() + "\n";
		msg += "Price: " + getDocumentsPrice() + "\n";
		msg += "Matrix generated:\n" + printImage();
		msg += "Property card Code: " + code;
		
		return msg;
	}
	
	
	
}
