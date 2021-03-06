package de.interactive_instruments.ShapeChange.Model.Generic;

import de.interactive_instruments.ShapeChange.Model.Constraint;
import de.interactive_instruments.ShapeChange.Model.Info;
import de.interactive_instruments.ShapeChange.Model.TextConstraint;
import de.interactive_instruments.ShapeChange.Model.TextConstraintImpl;

/**
 * ShapeChange - processing application schemas for geographic information
 *
 * This file is part of ShapeChange. ShapeChange takes a ISO 19109 
 * Application Schema from a UML model and translates it into a 
 * GML Application Schema or other implementation representations.
 *
 * Additional information about the software can be found at
 * http://shapechange.net/
 *
 * (c) 2002-2013 interactive instruments GmbH, Bonn, Germany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact:
 * interactive instruments GmbH
 * Trierer Strasse 70-72
 * 53115 Bonn
 * Germany
 */

/**
 * @author echterhoff
 * 
 */
public class GenericTextConstraint extends TextConstraintImpl {

//	private Info contextModelElmt = null;
//	private ModelElmtContextType contextModelElmtType = null;
//	private String name = null;
//	private String status = null;
//	private String text = null;
//	private String type = null;

	/**
	 * Creates a generic TextConstraint implementation from a given one.
	 * 
	 * @param constraint
	 */
	public GenericTextConstraint(TextConstraint constraint) {
		contextModelElmt = constraint.contextModelElmt();
		contextModelElmtType = constraint.contextModelElmtType();
		constraintName = constraint.name();
		constraintStatus = constraint.status();
		constraintText = constraint.text();
	}

//	/**
//	 * Constructor used in case that all constraint attributes shall be assigned
//	 * via the set methods.
//	 */
//	public GenericConstraint() {
//
//	}
	
//	public GenericConstraint(Info contextModelElmt,
//			ModelElmtContextType contextModelElmtType, String name,
//			String status, String text) {
//		super();
//		this.contextModelElmt = contextModelElmt;
//		this.contextModelElmtType = contextModelElmtType;
//		this.name = name;
//		this.status = status;
//		this.text = text;
//	}

	/**
	 * @param genCi context model element of the new constraint
	 * @param origCon Constraint to copy the text information from
	 */
	public GenericTextConstraint(GenericClassInfo genCi, Constraint origCon) {
		super();
		contextModelElmt = genCi;
		contextModelElmtType = ModelElmtContextType.CLASS;
		constraintName = origCon.name();
		constraintStatus = origCon.status();
		constraintText = origCon.text();
	}
	
	/**
	 * @param genPi context model element of the new constraint
	 * @param origCon Constraint to copy the text information from
	 */
	public GenericTextConstraint(GenericPropertyInfo genPi, Constraint origCon) {
		super();
		contextModelElmt = genPi;
		contextModelElmtType = ModelElmtContextType.ATTRIBUTE;
		constraintName = origCon.name();
		constraintStatus = origCon.status();
		constraintText = origCon.text();
	}
//
//	public String name() {
//		return name;
//	}
//
//	public String status() {
//		return status;
//	}
//
//	public String text() {
//		return text;
//	}
//
//	public Info contextModelElmt() {
//		return contextModelElmt;
//	}
//
//	public ModelElmtContextType contextModelElmtType() {
//		return contextModelElmtType;
//	}

	public void setContextModelElmt(Info contextModelElmt) {
		this.contextModelElmt = contextModelElmt;
	}

	public void setContextModelElmtType(
			ModelElmtContextType contextModelElmtType) {
		this.contextModelElmtType = contextModelElmtType;
	}

	public void setName(String name) {
		constraintName = name;
	}

	public void setStatus(String status) {
		constraintStatus = status;
	}

	public void setText(String text) {
		constraintText = text;
	}

}
