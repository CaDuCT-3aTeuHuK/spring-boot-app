package ru.neoflex.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.neoflex.springbootapp.model.Author;
import ru.neoflex.springbootapp.service.AuthorService;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String findAll(Model model) {
        List<Author> authors = authorService.findAll();
        model.addAttribute("authors", authors);
        return "author-list";
    }

    @GetMapping("/author-create")
    public String createAuthorForm(Author author){
        return "author-create";
    }

    @PostMapping("/author-create")
    public String createAuthor(Author author){
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/author-delete/{id}")
    public String deleteAuthor(@PathVariable("id") Integer id){
        authorService.deleteById(id);
        return "redirect:/authors";
    }

    @GetMapping("/author-update/{id}")
    public String updateAuthorForm(@PathVariable("id") Integer id, Model model){
        Author author = authorService.findById(id);
        model.addAttribute("author", author);
        return "/author-update";
    }

    @PostMapping("/author-update")
    public String updateAuthor(Author author){
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }
}
