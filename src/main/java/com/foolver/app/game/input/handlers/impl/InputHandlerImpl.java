package com.foolver.app.game.input.handlers.impl;

import com.foolver.app.game.input.handlers.abstr.*;

public class InputHandlerImpl implements InputHandler {

	private MouseHandler mouseHandler;
	private KeyboardHandler keyboardHandler;

	public InputHandlerImpl(MouseHandler mouseHandler, KeyboardHandler keyboardHandler) {
		this.mouseHandler = mouseHandler;
		this.keyboardHandler = keyboardHandler;
	}

	@Override
	public MouseHandler getMouseHandler() {
		return this.mouseHandler;
	}

	@Override
	public KeyboardHandler getKeyboardHandler() {
		return this.keyboardHandler;
	}
}
