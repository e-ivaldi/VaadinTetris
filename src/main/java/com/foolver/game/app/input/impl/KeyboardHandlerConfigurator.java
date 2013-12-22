package com.foolver.game.app.input.impl;

import java.util.*;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.*;

public class KeyboardHandlerConfigurator {

	private Map<Integer, ButtonExtended> buttons;

	public KeyboardHandlerConfigurator(Layout layout) {
		buttons = new HashMap<>();
		configureAllKeyboardButtons(layout);
	}

	private void configureAllKeyboardButtons(Layout layout) {
		// TODO configuring only enter for now, needs to create a data
		// structured fitted to keep track
		// of the keyboard keys as in com.vaadin.event.ShortcutAction.KeyCode
		for (int keyCode = 13; keyCode < 14; keyCode++) {
			ButtonExtended button = configureButton(layout, keyCode);
			addButtonToButtonsMap(keyCode, button);
		}
	}

	private void addButtonToButtonsMap(int keyCode, ButtonExtended button) {
		buttons.put(keyCode, button);
	}

	@SuppressWarnings("serial")
	private ButtonExtended configureButton(Layout layout, int keyCode) {
		final ButtonExtended button = new ButtonExtended();
		ClickListener clickListener = new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				button.setClicked();
			}
		};
		button.setClickShortcut(keyCode);
		button.addClickListener(clickListener);
		layout.addComponent(button);
		return button;
	}

	public boolean isButtonClicked(int keyCode) {
		boolean result = false;
		ButtonExtended button = buttons.get(keyCode);
		if (button != null)
			result = button.isClicked();
		return result;
	}

}
