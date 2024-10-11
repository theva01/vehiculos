package com.fnf.ejercicioDeAutomovil.fabricas;

import com.fnf.ejercicioDeAutomovil.piezas.Chasis;
import com.fnf.ejercicioDeAutomovil.piezas.Cojineria;
import com.fnf.ejercicioDeAutomovil.piezas.Motor;

public interface VehiculoFactory {

    Chasis crearChasis();
    Motor crearMotor();
    Cojineria crearCojineria();

}
