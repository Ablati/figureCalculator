package kz.ablati.infinbank.service;

import kz.ablati.infinbank.constants.Constants;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GeometricFiguresCalculatorService {

    private Double getTrianglePerimetre(Double a, Double b, Double c) {
        return  a + b + c;
    }


    public Map<String, Object> calculatePerimeterTriangle(Double a, Double b, Double c) {
        Map<String, Object> response = new HashMap<>();
        response.put("perimeter", getTrianglePerimetre(a, b, c));
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculatePerimeterRectangle(Double a, Double b) {
        Map<String, Object> response = new HashMap<>();
        response.put("perimeter", a*2 + b*2);
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculatePerimeterSquare(Double a) {
        Map<String, Object> response = new HashMap<>();
        response.put("perimeter", a*4);
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculatePerimeterCirclele(Double r) {
        Map<String, Object> response = new HashMap<>();
        response.put("length", r*Constants.PI*2);
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculateAreaTriangle(double a, double b, double c) {
        Map<String, Object> response = new HashMap<>();
        Double perimeter = getTrianglePerimetre(a, b, c);
        response.put("area", Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)));
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculateAreaRectangle(double a, double b) {
        Map<String, Object> response = new HashMap<>();
        response.put("area", a*b);
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculateAreaSquare(double a) {
        Map<String, Object> response = new HashMap<>();
        response.put("area", square(a));
        response.put("status", 200);
        return response;
    }

    public Map<String, Object> calculateAreaCircle(double r) {
        Map<String, Object> response = new HashMap<>();
        response.put("area", square(r)*Constants.PI);
        response.put("status", 200);
        return response;
    }

    private double square(double number) {
        return number*number;
    }
}
