/**
 * 
 */
package org.sd3f4j.domain;

/**
 * Entity as specified in the DDD book.<br>
 * @author Julien Moutsinga
 *
 */
@FunctionalInterface
public interface Entity {

	/**
	 * @return the unique identifier of the entity
	 */
	<T> Identity<T> getIdentity();
	
}
