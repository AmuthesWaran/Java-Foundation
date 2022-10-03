package assignment_1_DM;

public class DataMungar2 {

private String nameOfField, aggregateFunction;
	
	// Write logic for constructor
	public void AggregateFunction(String nameOfField, String aggregateFunction) {
		this.nameOfField = nameOfField;
		this.aggregateFunction = aggregateFunction;
	}

	public String getAggregateFunction() {
		return aggregateFunction;
	}

	public void setAggregateFunction(String aggregateFunction) {
		this.aggregateFunction = aggregateFunction;
	}
	
	@Override
	public String toString() {
		return  this.nameOfField + " " + this.aggregateFunction;
	}
	
	
	public static void main(String[] args) {
			
		
		
		
		
	}

}
