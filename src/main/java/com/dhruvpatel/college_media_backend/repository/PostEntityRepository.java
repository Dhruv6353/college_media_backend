package com.dhruvpatel.college_media_backend.repository;

import com.dhruvpatel.college_media_backend.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {

}
