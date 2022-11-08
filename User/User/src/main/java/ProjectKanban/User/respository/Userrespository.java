package ProjectKanban.User.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ProjectKanban.User.model.User;


@Repository
public interface Userrespository extends JpaRepository<User,Integer>
{
    //To get single user
    User findById(int dasId);
    
    //To get candidateName by using search query
    @Query(value = "select rl.candidate_name from registerlogin rl where candidate_name LIKE %:query%",nativeQuery=true)
    List<String> search(String query);

    //TO see cardStatus 
    @Query (value="update registerlogin set movingStatus=:cardStatus where id=:dasId",nativeQuery=true)
 //   User save(String cardStatus,dasId);
    User cardStatus(String cardStatus, int dasId);

//    User findAll(String cardStatus, int dasId);

//    User findById(int dasId);
}