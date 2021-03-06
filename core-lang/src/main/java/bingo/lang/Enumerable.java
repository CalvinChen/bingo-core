/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bingo.lang;

import java.util.List;
import java.util.Set;

/**
 * Iterable interface for extending {@link Iterable}
 *
 * @author fenghm (fenghm@bingosoft.net)
 *
 * @since 0.1
 */
public interface Enumerable<T> extends Iterable<T> {

	int size();
	
	boolean isEmpty();

	T first();

	T firstOrNull();

	boolean contains(T value);
	
	T[] toArray(Class<T> clazz);

	List<T> toList();

	Set<T> toSet();	
}