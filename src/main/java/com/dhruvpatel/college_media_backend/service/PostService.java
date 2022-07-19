package com.dhruvpatel.college_media_backend.service;

import com.dhruvpatel.college_media_backend.model.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
