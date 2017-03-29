/**
 * 
 */
package com.rajiv.demo1;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Raji
 *
 */
@XmlRootElement
@XmlType(propOrder={"id","fname","lname"})
public class customers {

	private String id;
	private String fname;
	private String lname;
	
	public customers() {
		
		// TODO Auto-generated constructor stub
	}
	public customers(String id, String fname, String lname) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
