package com.fnf.ejercicioDeAutomovil.piezas.toyota;

import com.fnf.ejercicioDeAutomovil.piezas.Cojineria;

public class ToyotaCojineria implements Cojineria {
    @Override
    public String getNumeroPieza() {
        return "123";
    }

    @Override
    public String getMaterial() {
        return "Cuero de bagre";
    }
}
