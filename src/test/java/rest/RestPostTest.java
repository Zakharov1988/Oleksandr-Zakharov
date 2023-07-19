package rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import rest.entities.*;

import java.io.IOException;

public class RestPostTest {
    @Test
    public void getAllPostsTest() throws IOException {
       // PostController postController = new PostController();
        //postController.getAllPosts();

       // postController.getPostById(1);
       // postController.getPostById(10);

//        postController.crateNewPostWithJson("Post title from test",
//                "Post body from test");

//        Post post  = new Post();
//        post.setUserId(1);
//        post.setTitle("GSON title");
//        post.setBody("GSON body");
//
//        Post newPost = postController.createNewPostWithGson(post);
//        //System.out.println(newPost);
//        Assert.assertEquals(post, newPost, "Post is not created successfully");
//        Assert.assertNotEquals(newPost.getId(), 0, "NewID is empty");
//
//
//        Comment comment = new Comment();

        Get get = new Get();
        System.out.println(new Get());



        Put put = new Put();
        System.out.println(new Put());


        Delete delete = new Delete();
        System.out.println(new Delete());


    }


}
