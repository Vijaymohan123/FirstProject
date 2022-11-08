package ProjectKanban.User.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    String userComment;
    
    public Comment() {
        
    }
    
    public Comment(int id,String userComment)
    {
        this.id=id;
        this.userComment=userComment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    @Override
    public String toString() {
        return "Comment [id=" + id + ", userComment=" + userComment + "]";
    }
    

}
