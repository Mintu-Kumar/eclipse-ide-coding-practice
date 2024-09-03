package com.springcore.springexlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+11}")
	private int x;
	@Value("#{22+44}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}") //calling static method
	private int z;
	//@Value("#{T(java.lang.Math).PI)}") // calling static variable
	//@Value("#{T(new java.lang.String('Mintu'))}") // calling object variable
	@Value("#{8>6}")
	private boolean status;  // calling boolean
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", status=" + status + "]";
	}
	
	
	

	
}
