package com.fnf.ejercicioDeAutomovil.fabricas.ford;

import com.fnf.ejercicioDeAutomovil.fabricas.VehiculoFactory;
import com.fnf.ejercicioDeAutomovil.piezas.Chasis;
import com.fnf.ejercicioDeAutomovil.piezas.Cojineria;
import com.fnf.ejercicioDeAutomovil.piezas.Motor;
import com.fnf.ejercicioDeAutomovil.piezas.toyota.ToyotaChasis;
import com.fnf.ejercicioDeAutomovil.piezas.toyota.ToyotaCojineria;
import com.fnf.ejercicioDeAutomovil.piezas.toyota.ToyotaMotor;

public class FordFactory implements VehiculoFactory {
    @Override
    public Chasis crearChasis() {
        return new ToyotaChasis();
    }

    @Override
    public Motor crearMotor() {
        return new ToyotaMotor();
    }

    @Override
    public Cojineria crearCojineria() {
        return new ToyotaCojineria();
    }
}
