package unam.ingenieriadesoftware.generico.miztliadas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PracticaController {

	@GetMapping("/integrante")
	public String nombreIntegrante(@RequestParam(name="nombre", required=false, defaultValue="Integrante") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "integrante.html";
	}
	
}
