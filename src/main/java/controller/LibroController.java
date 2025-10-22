package controller;

import domain.Libro;
import service.LibroService;
import service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
 *
 * @author kathe
 */
@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("libros", libroService.getLibrosDisponibles());
        return "libros/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("libro", new Libro());
        model.addAttribute("categorias", categoriaService.getAll());
        return "libros/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Libro libro, BindingResult result) {
        if (result.hasErrors()) {
            return "libros/formulario";
        }
        libroService.save(libro);
        return "redirect:/libros/listado";
    }
}
