package es.jab.NaturalNumberFactory;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEn();
	}

}
