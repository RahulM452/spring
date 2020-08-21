package com.example.demo.Forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ForumController {

    @Autowired
    private ForumService forumService;



    @RequestMapping("/forum")
    public List<Forum> getAllForum()
    {
        return forumService.getAllForums();
    }
    @RequestMapping("/forum/{id}")
    public Forum getForum(@PathVariable String id)
    {
        return forumService.getForum(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/forum")
    public void addForum(@RequestBody Forum forum)
    {
        forumService.addForum(forum);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/forum/{id}")
    public void updateForum(@RequestBody Forum forum,@PathVariable String id)
    {
        forumService.updateForum(id,forum);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/forum/{id}")
    public void deleteForum(@PathVariable String id)
    {
         forumService.deleteForum(id);
    }

}
