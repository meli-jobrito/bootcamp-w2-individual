package Modulo5.aula2tt.Exercicio2;

import java.util.ArrayList;

public class Util {
    public static double areaMedia(ArrayList<GeometricFigure> l){
        double areaTotal = l.stream().mapToDouble(GeometricFigure::area).sum();//uau
        //        for(GeometricFigure g : l){
//            areaTotal += g.area();
//        }
        return areaTotal / l.size();
    }
}
