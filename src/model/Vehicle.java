package model;

import java.util.ArrayList;

public abstract class Vehicle implements ConsumptionCalculation, vehiclePriceCalculation {

	private double basePrice;
	private double sellPrice;
	private String brand;
	private int vehicleModel;
	private double cylinderCapacity;
	private double mileage;
	private int newOrUsed;
	private String plaque;
	private int vehicleType;
	private ArrayList<Document> documents;

	public Vehicle(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType) {
		super();
		this.basePrice = basePrice;
		this.sellPrice = sellPrice;
		this.brand = brand;
		this.vehicleModel = vehicleModel;
		this.cylinderCapacity = cylinderCapacity;
		this.mileage = mileage;
		this.newOrUsed = newOrUsed;
		this.plaque = plaque;
		this.vehicleType = vehicleType;
		documents = new ArrayList<Document>();
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public int getNewOrUsed() {
		return newOrUsed;
	}

	public void setNewOrUsed(int newOrUsed) {
		this.newOrUsed = newOrUsed;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public int getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	/**pre
	 *<strong>Description:</strong> the addSoat method is used to add this document to the arrayList documents.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@param hedgingPrice <strong>double</strong> this variable is used to save the insurance cover of the document.
	 *@return documents <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean addDocumentSoat(int choice, int documentType, double documentsPrice, int documentsDate,
			double hedgingPrice) {
		return documents.add(new Soat(choice, documentType, documentsPrice, documentsDate, hedgingPrice));
	}

	/**pre
	 *<strong>Description:</strong> the addPropertyCard method is used to add this document to the arrayList documents.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@return documents <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean addDocumentPropertyCard(int choice, int documentType, double documentsPrice, int documentsDate) {
		return documents.add(new PropertyCard(choice, documentType, documentsPrice, documentsDate));
	}

	/**pre
	 *<strong>Description:</strong> the addDocumentMechanicalTechnician method is used to add this document to the arrayList documents.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@param gasLevel <strong>double</strong> this variable is used to save the gas levels that the vehicle produce.
	 *@return documents <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean addDocumentMechanicalTechnician(int choice, int documentType, double documentsPrice,
			int documentsDate, double gasLevel) {
		return documents.add(new MechanicalTechnician(choice, documentType, documentsPrice, documentsDate, gasLevel));
	}

	/**pre
	 *<strong>Description:</strong> the showDocumentsInfo method is use to show to the user the info of the
	 *documents that he/she already entered in the program.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pre:</strong> this method needs the creation of a document.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showDocumentsInfo() {
		String msg = "";

		for (int i = 0; i < documents.size(); i++) {
			if (documents.get(i) instanceof Soat) {
				msg += documents.get(i).toString();
			} else if (documents.get(i) instanceof PropertyCard) {
				msg += documents.get(i).toString();
			} else if (documents.get(i) instanceof MechanicalTechnician) {
				msg += documents.get(i).toString();
			}
		}
		return msg;
	}

	/**pre
	 *<strong>Description:</strong> the documentStatus method is use to show to the user the info of the
	 *documents that he/she already entered in the program.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pre:</strong> this method needs the creation of a document.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String documentStatus() {
		String msg = "";

		for (int i = 0; i < documents.size(); i++) {
			if (documents.get(i) instanceof Soat) {
				if (documents.get(i).getDocumentsDate() == 2022) {
					msg += "\nThe soat is active and is valid for the current year\n";
				} else if (documents.get(i).getDocumentsDate() != 2022) {
					msg += "\nThe soat is not valid and it isn't valid for the current year\n";
				}
			} else {
				msg += "\nThe vehicle does not have soat\n";
			}

			if (documents.get(i) instanceof MechanicalTechnician) {
				if (documents.get(i).getDocumentsDate() == 2022) {
					msg += "\nThe techno mechanic is active and is valid for the current year\n";
				} else if (documents.get(i).getDocumentsDate() != 2022) {
					msg += "\nThe techno mechanic is not valid and it isn't valid for the current year\n";
				}
			} else {
				msg += "\nThe vehicle does not have a techno mechanic\n";
			}

			if (documents.get(i) instanceof PropertyCard) {
				msg += "\nThe vehicle has a property card\n";
			} else {
				msg += "\nThe vehicle doesn't have a property card\n";
			}
		}

		return msg;
	}

}
