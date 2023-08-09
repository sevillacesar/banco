package com.example.banco.controller;

import com.example.banco.service.UserService;
import com.example.banco.util.ResponseObject;
import com.example.banco.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/cliente/{code}")
    public ResponseEntity<ResponseObject> getCustomer(@PathVariable String code) {
        ResponseObject response = new ResponseObject();
        if (!Utils.getInstance().validateCode(code)) {
            response.badResponse("El codigo debe tener el formato [NNNNNNNNN]");
            return ResponseEntity.badRequest().body(response);
        }
        try {
            response.successResponse(service.getUser(code, "C"), "Datos del cliente.");
        } catch (Exception e) {
            response.badResponse(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @GetMapping("/empleado/{code}")
    public ResponseEntity<ResponseObject> getEmployee(@PathVariable String code) {
        ResponseObject response = new ResponseObject();
        if (!Utils.getInstance().validateCode(code)) {
            response.badResponse("El codigo debe tener el formato [NNNNNNNNN]");
            return ResponseEntity.badRequest().body(response);
        }
        try {
            response.successResponse(service.getUser(code, "E"), "Datos del empleado.");
        } catch (Exception e) {
            response.badResponse(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
