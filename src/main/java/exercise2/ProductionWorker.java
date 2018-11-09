package exercise2;

public class ProductionWorker implements Payable{

	private int salaryPerProducedPiece=0;
	private int production=0;

	public ProductionWorker(int salaryPerProducedPiece){
		this.salaryPerProducedPiece=salaryPerProducedPiece;
	}

	public void produceOnePiece() {
		production++;
	}

	public int computeSalary() {
		return salaryPerProducedPiece*production;
	}
}
