package com.isma8.Sesion;

import com.isma8.Sesion.clases.DtoSesion;
import org.springframework.stereotype.Service;

@Service("SesionService")
public class SesionService {

    public boolean iniSesion(DtoSesion sesion){
        System.out.println(sesion.toString());
        return true;
    }
}

//Tiene la lógica de las operaciones que se hacen