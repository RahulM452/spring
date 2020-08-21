package com.example.demo.Forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ForumService {

    @Autowired
    private ForumRepositary forumRepositary;


       private List<Forum> forums= new ArrayList<>(Arrays.asList(
        new Forum("1","Jai jawan jai kisan"),
                new Forum("2","Jai singh "),
                new Forum("3","Jai ho")
        ));

       public List<Forum> getAllForums()
       {
          // return forums;
           List<Forum> forums = new ArrayList<>();

           forumRepositary.findAll().forEach(forums::add);
           return forums;

       }

       public Forum getForum(String id)
       {
           return forums.stream().filter(t -> t.getId().equals(id)).findFirst().get();
       }

    public void addForum(Forum forum) {
       // System.out.println("2");
           //forums.add(forum);
           forumRepositary.save(forum);


    }

    public void updateForum(String id, Forum forum) {

           forumRepositary.save(forum);
//            for(int i=0;i<forums.size(); i++)
//            {
//                Forum f = forums.get(i);
//                if(f.getId().equals(id)){
//                    forums.set(i,forum);
//                    return;
//                }
//            }
    }

    public void deleteForum(String id) {
           forumRepositary.deleteById(id);

           //forums.removeIf(t -> t.getId().equals(id));
    }
}
