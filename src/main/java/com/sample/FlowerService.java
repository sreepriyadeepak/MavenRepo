package com.sample;

import com.sample.model.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class FlowerService {

    public List getAvailableFlowers(FlowerType type){
        System.out.println("Welcome");
        List fragrance = new ArrayList();

        if(type.equals(FlowerType.LILY)){
            fragrance.add("White Lilly");
            fragrance.add(("Yellow Lilly"));

        }else if(type.equals(FlowerType.JASMINE)){
            fragrance.add("White Jasmine");

        }else if(type.equals(FlowerType.ROSE)){
            fragrance.add("Red rose");
            fragrance.add(("Pink rose"));

        }else {
            fragrance.add("No Colors Available");
        }
    return fragrance;
    }
}
