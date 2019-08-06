package com.collabera.retailtester;

public class Taxes extends Salary
{
	float fedRate = 11.80f;
	float stateRate = 6.625f;
	float cityRate;

	int federaltax = (int) 11.80f;
	int statetax = (int) 6.625f;
	public float getFedRate() {
		return fedRate;
	}
	public void setFedRate(float fedRate) {
		this.fedRate = fedRate;
	}
	public float getStateRate() {
		return stateRate;
	}
	public void setStateRate(float stateRate) {
		this.stateRate = stateRate;
	}
	public float getCityRate() {
		return cityRate;
	}
	public void setCityRate(float cityRate) {
		this.cityRate = cityRate;
	}
	public int getFederaltax() {
		return federaltax;
	}
	public void setFederaltax(int federaltax) {
		this.federaltax = federaltax;
	}
	public int getStatetax() {
		return statetax;
	}
	public void setStatetax(int statetax) {
		this.statetax = statetax;
	}
}
