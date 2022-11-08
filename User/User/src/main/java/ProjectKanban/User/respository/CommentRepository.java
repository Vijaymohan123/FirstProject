package ProjectKanban.User.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProjectKanban.User.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
   
//  //To store comment details
//    Comment save(Comment text);

}
