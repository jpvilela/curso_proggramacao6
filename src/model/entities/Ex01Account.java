package model.entities;

import model.exceptions.Ex01BalanceException;

public class Ex01Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Ex01Account(Integer number, String holder, Double initialBalance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = initialBalance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new Ex01BalanceException("The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new Ex01BalanceException("Not enough balance");
		} else {
			this.balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", balance);
	}
	
	
	

}
