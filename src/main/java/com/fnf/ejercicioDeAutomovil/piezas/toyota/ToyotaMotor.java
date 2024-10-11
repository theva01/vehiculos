package com.fnf.ejercicioDeAutomovil.piezas.toyota;

import com.fnf.ejercicioDeAutomovil.piezas.Motor;

public class ToyotaMotor implements Motor {
    @Override
    public int getPotenciaMaxima() { return 200; }

    @Override
    public String getNumeroPieza() { return "TOY-MTR-002"; }

    @Override
    public String getTecnologia() { return "Híbrido"; }
}
