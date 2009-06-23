package texgit.type;

import texgit.type.component.Filler;


public interface IFixedField<G> extends IField<G>, IFixedLength{

	/**
	 * @return the filler
	 */
	public abstract Filler<?> getFiller();

	/**
	 * @param filler the filler to set
	 */
	public abstract void setFiller(Filler<?> filler);
}