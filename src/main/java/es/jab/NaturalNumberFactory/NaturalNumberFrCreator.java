package es.jab.NaturalNumberFactory;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberFr();
	}

}
