package es.jab.NaturalNumberFactory;

public class NaturalNumberFr extends NaturalNumber {

	private static final String[] textValue = {"zéro", "un", "deux", "trois", "quatre", "cinq"};

	public NaturalNumberFr(){
		super();
	}
	
	@Override
	public String getTextValue() {
		  if (this.value < textValue.length) {
	            return NaturalNumberFr.textValue[this.value];
	        } else {
	            return "???";
	        }
	}

}
