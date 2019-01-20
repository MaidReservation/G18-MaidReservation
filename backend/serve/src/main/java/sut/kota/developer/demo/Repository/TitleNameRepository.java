package com.kota.developer.demo.Repository;
import com.kota.developer.demo.Entity.TitleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")

public interface TitleNameRepository  extends JpaRepository<TitleName, Long>{
    TitleName findByTitlenameId(Long titlenameId);
}
