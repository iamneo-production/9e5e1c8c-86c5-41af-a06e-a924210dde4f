package com.examly.springapp.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.models.ComplaintModel;

@Repository
public interface ComplaintRepository extends JpaRepository<ComplaintModel,Long> {
	void deleteComplaintById(String id);

    List<ComplaintModel> findByComplaintId(String id);
	
}
