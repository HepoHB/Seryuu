package dev.nerohaziel.seryu.model;

import lombok.Getter;
import lombok.Setter;

public abstract class Entity{
    @Getter @Setter
    protected String name;
    @Getter @Setter
    protected byte statusCode = 0;
    @Getter @Setter
    protected int code = 0;

    public Entity(String name){
        this.name = name;

    }

}
