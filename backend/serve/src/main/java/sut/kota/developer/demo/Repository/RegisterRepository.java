package com.kota.developer.demo.Repository;
import com.kota.developer.demo.Entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")

public interface RegisterRepository  extends JpaRepository<Register, Long>{
    Register findByMaidId(Long maidId);

}
