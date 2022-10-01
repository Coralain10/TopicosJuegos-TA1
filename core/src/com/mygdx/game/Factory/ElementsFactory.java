package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Circle;
import com.mygdx.game.GameObjects.Element;

import java.util.ArrayList;
import java.util.Random;

public class ElementsFactory {
    ArrayList<Element> elements;
    int sizeBase;
    int padding;

    public ElementsFactory() {
        this.elements = new ArrayList<>();
        this.padding = 20;
    }

    public void locate(int qElems, int cols) {
        sizeBase = Gdx.graphics.getWidth() / cols;
        sizeBase -= padding;

        int y = 0;
        int index = -1;
        for (int i = 0; i < qElems; i ++) {
            index++;
            if ( index % cols == 0) {
                y += (sizeBase + padding);
                index = 0;
            }
            build(index, y, i);
        }
    }

    public void build(int index, int y, int i) {
        int x = index * (sizeBase + padding);
        y = Gdx.graphics.getHeight() - y;
        Random random = new Random();
        int xSpeed = random.nextInt(8);
        int ySpeed = random.nextInt(8);

        if ( i%2 == 0 ) {
            Element element = new Element(x, y, sizeBase, xSpeed, ySpeed);
            element.setColor( ySpeed%2==0 ? Color.SKY : Color.ROYAL );
            elements.add(element);
        }
        else {
            Circle circle = new Circle(x, y, sizeBase, xSpeed, ySpeed);
            circle.setColor( xSpeed%2==0 ? Color.GOLD : Color.MAGENTA );
            elements.add(circle);
        }
    }

    public void update(ShapeRenderer shapeRenderer) {
        for (Element element : elements) {
            element.update();
            element.render(shapeRenderer);
        }
    }
}
