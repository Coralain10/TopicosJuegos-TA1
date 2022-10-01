package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;

	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		InitGame();
	}

	private void InitGame() {
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);


		shapeRenderer.end();
		update();
	}

	private void update() {

	}
	
	@Override
	public void dispose () {
	}
}
