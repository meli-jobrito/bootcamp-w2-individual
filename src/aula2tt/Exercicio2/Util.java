package aula2tt.Exercicio2;

import java.util.ArrayList;

public class Util {
    public static double areaMedia(ArrayList<GeometricFigure> l){
        double areaTotal = 0;
        for(GeometricFigure g : l){
            areaTotal += g.area();
        }
        return areaTotal / l.size();
    }
}
