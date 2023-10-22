package pe.eu.cibertec.appcinecibertectarde.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.eu.cibertec.appcinecibertectarde.service.EstadoService;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;

    @GetMapping("/frmestado")
    public String frmEstado(Model model){

        model.addAttribute("listaestados",estadoService.listarEstados());

        return "administracion/frmestado";
    }
}
