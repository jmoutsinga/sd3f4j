/**
 * 
 */
package org.sd3f4j.domain;

/**
 * @author Julien Moutsinga
 * @param <T> internal type of the value object 
 */
public abstract class ValueObject<T> {

	private final T value;

	protected ValueObject(T value) {
		if (value == null) {
			throw new IllegalArgumentException("Unable to create value object with null value");
		}
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return 31 * 1 + value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ValueObject<?>)) {
			return false;
		}
		ValueObject<?> other = (ValueObject<?>) obj;
		return value.equals(other.value);
	}
	
	
}
