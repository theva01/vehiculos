package com.fnf.ejercicioDeAutomovil.piezas.toyota;

import com.fnf.ejercicioDeAutomovil.piezas.Chasis;

public class ToyotaChasis implements Chasis {
    @Override
    public int getNumeroEjes() { return 4; }

    @Override
    public String getNumeroPieza() { return "TOY-CHS-001"; }

    @Override
    public String getTipoTransmision() { return "Automática"; }
}
