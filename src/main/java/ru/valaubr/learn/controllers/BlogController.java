/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.valaubr.learn.models.Post;
import ru.valaubr.learn.repo.PostRepo;

/**
 *
 * @author valaubr
 */
@Controller
public class BlogController {
    
    @Autowired
    private PostRepo postRepo;
    
    @GetMapping("/blog")
    public String page(Model model) {
        Iterable<Post> posts = postRepo.findAll();
        model.addAttribute("posts", posts);
        return "blog";
    }
    
    @GetMapping("/blog/add")
    public String addBlog(Model model) {
        return "blogAdd";
    }
    
    @GetMapping("/blog/{id}")
    public String fullPost(@PathVariable(value = "id") long id, Model model) {
        if(!postRepo.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post> post = postRepo.findById(id);
        List<Post> res = new ArrayList<>();
        post.ifPresent((e) -> res.add(e));
        model.addAttribute("post", res);
        return "fullPost";
    }
    
    @PostMapping("/blog/{id}/remove")
    public String removePost(@PathVariable(value = "id") long id, Model model) {
        if(!postRepo.existsById(id)){
            return "redirect:/blog";
        }
        Post post = postRepo.findById(id).orElseThrow(() -> {
            return null; //To change body of generated lambdas, choose Tools | Templates.
        });
        postRepo.delete(post);
        return "redirect:/blog";
    }
    
    @GetMapping("/blog/{id}/edit")
    public String postEditGet(@PathVariable(value = "id") long id, Model model) {
        if(!postRepo.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post> post = postRepo.findById(id);
        List<Post> res = new ArrayList<>();
        post.ifPresent((e) -> res.add(e));
        model.addAttribute("post", res);
        return "postEdit";
    }
    
    @PostMapping("/blog/{id}/edit")
    public String postEditPost(@PathVariable(value = "id") long id, 
            @RequestParam String title, 
            @RequestParam String full_text,
            Model model) {
        if(!postRepo.existsById(id)){
            return "redirect:/blog";
        }
        Post post = postRepo.findById(id).orElseThrow(() -> {return null;});
        post.setTitle(title);
        post.setFull_text(full_text);
        postRepo.save(post);
        return "redirect:/blog";
    }
    
    @PostMapping("/blog/add")
    public String addBlogPost(@RequestParam String title, @RequestParam String full_text, Model model) {
        Post post = new Post();
        post.setTitle(title);
        post.setFull_text(full_text);
        postRepo.save(post);
        return "redirect:/blog";
    }
    
}
