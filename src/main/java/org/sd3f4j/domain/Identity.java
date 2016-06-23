/**
 * 
 */
package org.sd3f4j.domain;

/**
 * 
 * @author Julien Moutsinga
 * @param <T> the type of the internal value of the Identity
 *
 */
public class Identity<T> extends ValueObject<T> {

	protected Identity(T value) {
		super(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getValue().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Identity)) {
			return false;
		}
		Identity<?> other = (Identity<?>) obj;
		return getValue().equals(other.getValue());
	}
}
