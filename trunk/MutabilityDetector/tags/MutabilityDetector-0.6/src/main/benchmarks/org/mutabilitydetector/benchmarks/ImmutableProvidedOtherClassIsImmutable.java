/*
 * Mutability Detector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * Further licensing information for this project can be found in 
 * 		license/LICENSE.txt
 */

package org.mutabilitydetector.benchmarks;

public final class ImmutableProvidedOtherClassIsImmutable {
	
	public final ThisHasToBeImmutable assigned;

	public ImmutableProvidedOtherClassIsImmutable(ThisHasToBeImmutable assigned) {
		this.assigned = assigned;
	}
	
	public static interface ThisHasToBeImmutable { }
}
