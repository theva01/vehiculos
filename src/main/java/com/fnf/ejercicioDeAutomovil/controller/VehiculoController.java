package com.fnf.ejercicioDeAutomovil.controller;

import com.fnf.ejercicioDeAutomovil.*;
import com.fnf.ejercicioDeAutomovil.fabricas.*;
import com.fnf.ejercicioDeAutomovil.fabricas.ford.FordFactory;
import com.fnf.ejercicioDeAutomovil.fabricas.mazda.MazdaFactory;
import com.fnf.ejercicioDeAutomovil.fabricas.toyota.ToyotaFactory;

import com.fnf.ejercicioDeAutomovil.piezas.Chasis;
import com.fnf.ejercicioDeAutomovil.piezas.Cojineria;
import com.fnf.ejercicioDeAutomovil.piezas.Motor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @PostMapping("/ensamblar")
    public Vehiculo ensamblarVehiculo(@RequestBody EnsamblarVehiculoRequest request) {
        VehiculoFactory factory;

        switch (request.getMarca()) {
            case "Toyota":
                factory = new ToyotaFactory();
                break;
            case "Ford":
                factory = new FordFactory();
                break;
            case "Mazda":
                factory = new MazdaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        Chasis chasis = factory.crearChasis();
        Motor motor = factory.crearMotor();
        Cojineria cojineria = factory.crearCojineria();

        return new Vehiculo(chasis, motor, cojineria, request.getColor(), LocalDate.now(), request.getNumeroEnsamblaje());
    }
}
