package es.jab.NaturalNumberFactory;

public abstract class NaturalNumber {
	
	protected int value;
	
	public NaturalNumber(){
		this.value = 0;
	}
	
	public int getValue(){
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
		
	}
	
	public void add(int value){
		this.setValue(this.value + value);
	}

	public abstract String getTextValue();
	
	
	@Override
	public boolean equals(Object other){
		return this.value == ((NaturalNumber)other).value
				&& this.getTextValue() == ((NaturalNumber)other).getTextValue();
	}
}
