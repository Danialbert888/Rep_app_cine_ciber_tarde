package pe.eu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.eu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.eu.cibertec.appcinecibertectarde.repository.EstadoRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EstadoService {
    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados(){
        return (List<Estado>) estadoRepository.findAll();
    }
    public boolean registrarEstado(Estado estado){
        return  estadoRepository.save(estado) !=null;
    }
    public void eliminarEstado(Integer idestado){
        estadoRepository.deleteById(idestado);
    }
}
