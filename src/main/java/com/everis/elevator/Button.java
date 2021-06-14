package com.everis.elevator;

import java.util.List;

public abstract class Button {
	protected List<ExternalButton> eButton;
	protected List<InternalButton> iButton;
	protected boolean lighted;
	protected boolean pushed;

	public void switchLight() {
		if (lighted == false) {
			lighted = true;
		} else {
			lighted = false;
		}
	}

	public boolean isPushed() {
		if (pushed == true) {
			return true;
		} else {
			return false;
		}
	}

	public void push() {
		pushed = true;
	}

	public void unPush() {
		pushed = false;
	}

	public Button(boolean lighted, boolean pushed) {
		super();
		this.lighted = false;
		this.pushed = false;
	}

}
