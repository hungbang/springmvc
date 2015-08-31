/**
 * 
 */
package main.java;

/**
 * @author Nick
 *
 */
public class HelloWorldService {
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello from Java Configuration! "+ name);
	}
}
