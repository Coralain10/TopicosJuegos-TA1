package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Element;

import java.util.ArrayList;

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
            build(index, y);
        }
    }

    public void build(int index, int y) {
        Element element = new Element(0, 0,sizeBase);
        int x = index * (element.getSize() + padding);
        element.setY(Gdx.graphics.getHeight() - y);
        element.setX(x);
        elements.add(element);
    }

    public void render(ShapeRenderer shapeRenderer) {
        for (Element element : elements) {
            element.render(shapeRenderer);
        }
    }
}
