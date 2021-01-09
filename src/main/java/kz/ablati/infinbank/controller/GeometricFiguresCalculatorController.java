package kz.ablati.infinbank.controller;


import kz.ablati.infinbank.service.GeometricFiguresCalculatorService;
import kz.ablati.infinbank.utility.ConflictException;
import kz.ablati.infinbank.utility.ExceptionResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/calculate")
public class GeometricFiguresCalculatorController {

    @Autowired
    private GeometricFiguresCalculatorService geometricFiguresCalculatorService;

    @GetMapping("perimeter/triangle")
    ResponseEntity<Map<String, Object>> calculatePerimeterTriangle(@RequestParam(required = true) double a,
                                                           @RequestParam (required = true) double b,
                                                           @RequestParam(required = true) double c) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculatePerimeterTriangle(a, b, c);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception exc) {
            return new ResponseEntity<>(ExceptionResponseBase.create(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("perimeter/rectangle")
    ResponseEntity<Map<String, Object>> calculatePerimeterRectangle(@RequestParam(required = true) double a,
                                                           @RequestParam(required = true) double b) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculatePerimeterRectangle(a, b);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception exc) {
            return new ResponseEntity<>(ExceptionResponseBase.create(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("perimeter/square")
    ResponseEntity<Map<String, Object>> calculatePerimeterSquare(@RequestParam(required = true) double a) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculatePerimeterSquare(a);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception exc) {
            return new ResponseEntity<>(ExceptionResponseBase.create(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("perimeter/circle")
    ResponseEntity<Map<String, Object>> calculatePerimeterCircle(@RequestParam(required = true) double r) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculatePerimeterCirclele(r);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception exc) {
            return new ResponseEntity<>(ExceptionResponseBase.create(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("area/triangle")
    ResponseEntity<Map<String, Object>> calculateAreaTriangle(@RequestParam(required = true) double a,
                                                      @RequestParam (required = true) double b,
                                                      @RequestParam(required = true) double c) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculateAreaTriangle(a, b, c);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch ( ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("area/rectangle")
    ResponseEntity<Map<String, Object>> calculateAreaRectangle(@RequestParam(required = true) double a,
                                                      @RequestParam (required = true) double b) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculateAreaRectangle(a, b);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch ( ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("area/square")
    ResponseEntity<Map<String, Object>> calculateAreaSquare(@RequestParam(required = true) double a) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculateAreaSquare(a);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch ( ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("area/circle")
    ResponseEntity<Map<String, Object>> calculateAreaCircle(@RequestParam(required = true) double r) {
        try {
            Map<String, Object> response = geometricFiguresCalculatorService.calculateAreaCircle(r);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch ( ConflictException ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), ext.getStatus()), HttpStatus.valueOf(ext.getStatus()));
        } catch (Exception ext) {
            return new ResponseEntity<>(ExceptionResponseBase.create(ext.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.FORBIDDEN);
        }
    }

}
