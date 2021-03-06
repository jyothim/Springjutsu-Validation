/*
 * Copyright 2010-2011 Duplichien, Wicksell, Springjutsu.org
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

package org.springjutsu.validation.executors;


/**
 * Asserts a value is valid if it is empty, or matches a given regex.
 * @author Clark Duplichien
 */
public abstract class RegexMatchRuleExecutor extends ValidWhenEmptyRuleExecutor {

	public boolean doValidate(Object model, Object argument) {
		return  String.valueOf(model).matches(getRegularExpression());
	}
	
	public abstract String getRegularExpression();

}
