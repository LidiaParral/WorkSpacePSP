package com.ejercicioUsuarios.modelo.entidad;

public class Usuario {
	
	private int id;
	private String name;
	private String password;
	private String addres;
	private int age;
	private String bank;
	private double money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Usuario - id:" + id + ", nombre:" + name + ", contraseña:" + password + ", e-mail:" + addres + ", edad:" + age
				+ ", banco:" + bank + ", dinero:" + money + " euros.";
	}
	
	
	
	
	
	
}
