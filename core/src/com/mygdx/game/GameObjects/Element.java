package com.mygdx.game.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

import java.util.Random;

public class Element {
    protected int x;
    protected int y;
    protected int size;
    protected int xSpeed;
    protected int ySpeed;
    protected Color color = Color.WHITE;

    public Element(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Element(int x, int y, int size, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    protected void draw(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(color);
        shapeRenderer.rect(x,y,size,size);
    }

    public void render(ShapeRenderer shapeRenderer) {
        draw(shapeRenderer);
    }

    public void update() {
        x += xSpeed;
        y += ySpeed;
        if (x < size || x > Gdx.graphics.getWidth()-size ) {
            xSpeed = -xSpeed;
        }
        if (y < size || y > Gdx.graphics.getHeight()-size ) {
            ySpeed = -ySpeed;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
