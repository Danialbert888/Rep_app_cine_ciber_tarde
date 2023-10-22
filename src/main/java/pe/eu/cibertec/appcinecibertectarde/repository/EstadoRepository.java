package pe.eu.cibertec.appcinecibertectarde.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.eu.cibertec.appcinecibertectarde.model.bd.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {


}
