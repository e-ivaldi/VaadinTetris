package com.foolver.game.app.input.handlers.impl;

import com.foolver.game.app.input.configurators.MouseHandlerConfigurator;
import com.foolver.game.app.input.handlers.abstr.MouseHandler;
import com.foolver.game.utils.*;

public class MouseHandlerImpl implements MouseHandler {

	private Position position = Position.getPositionZERO();
	private Position relativePosition = Position.getPositionZERO();
	private Position relativePositionInTile = Position.getPositionZERO();

	private MouseHandlerConfigurator mouseHandlerConfigurator;

	public MouseHandlerImpl(MouseHandlerConfigurator mouseHandlerConfigurator) {
		this.mouseHandlerConfigurator = mouseHandlerConfigurator;
	}

	@Override
	public Position getPosition() {
		position.setPosition(
				mouseHandlerConfigurator.getX(),
				mouseHandlerConfigurator.getY());
		return position;
	}

	@Override
	public Position getRelativePosition() {
		relativePosition.setPosition(
				mouseHandlerConfigurator.getRelativeX(),
				mouseHandlerConfigurator.getRelativeY());
		return relativePosition;
	}

	@Override
	public Position getRelativePositionInTiles() {
		relativePositionInTile.setPosition(
				mouseHandlerConfigurator.getRelativeX() / Constants.TILE_WIDTH,
				mouseHandlerConfigurator.getRelativeY() / Constants.TILE_HEIGHT);
		return relativePositionInTile;
	}
}
