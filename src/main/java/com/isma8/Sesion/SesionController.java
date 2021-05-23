package com.isma8.Sesion;

import com.isma8.Sesion.clases.DtoSesion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sesion")
public class SesionController {
    @Autowired
    @Qualifier("SesionService")
    private SesionService sesionService;

    @PostMapping("/iniciar")
    public void iniSesion(@RequestBody DtoSesion sesion){
        sesionService.iniSesion(sesion);
    }


}
