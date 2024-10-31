/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_AllanAzofeifa.demo.controller;

import EjercicioPractico1_AllanAzofeifa.demo.domain.Farmacia;
import EjercicioPractico1_AllanAzofeifa.demo.Service.FarmaciaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@Slf4j
@RequestMapping("/Farmacia")


public class farmaciaController {
    
    @Autowired
    FarmaciaService FarmaciaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var farmacia = FarmaciaService.getFarmacia();
        model.addAttribute("Farmacias", farmacia);
        model.addAttribute("totalFarmacias", farmacia.size());
        return "/Farmacia/listado";
    }
    @GetMapping("/nuevo")
    public String FarmaciaNuevo(Farmacia Farmacia) {
        return "/Farmacia/modifica";
    }
    

    @GetMapping("/eliminar/{FarmaciaId}")
     public String FarmaciaEliminar(Farmacia Farmacia) {
        FarmaciaService.delete(Farmacia);
        return "redirect:/Farmacia/listado";
    }

    @GetMapping("/modificar/{FarmaciaId}")
    public String FarmaciaModificar(Farmacia Farmacia, Model model) {
        Farmacia = FarmaciaService.getFarmacia(Farmacia);
        model.addAttribute("Farmacia", Farmacia);
        return "/Farmacia/modifica";
    }   
    
}
