package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Factory.ElementsFactory;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;
	ElementsFactory elementsFactory;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		elementsFactory = new ElementsFactory();
		InitGame();
	}

	private void InitGame() {
		elementsFactory.locate(22, 11);
	}


	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		elementsFactory.render(shapeRenderer);
		shapeRenderer.end();
	}

	@Override
	public void dispose () {
	}
}
