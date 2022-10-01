package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Element {

    public Circle(int x, int y, int size) {
        super(x+size/2, y+size/2, size/2);
    }

    protected void draw(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(color);
        shapeRenderer.circle(x,y,size);
    }

}
