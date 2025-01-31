package dev.beejh02.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import dev.beejh02.demo.model.Post;

@Mapper
public interface PostMapper {

    public List<Post> listPost();

}
