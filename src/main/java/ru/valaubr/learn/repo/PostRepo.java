/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn.repo;

import org.springframework.data.repository.CrudRepository;
import ru.valaubr.learn.models.Post;

/**
 *
 * @author valaubr
 */
public interface PostRepo extends CrudRepository<Post, Long>{
    
}
