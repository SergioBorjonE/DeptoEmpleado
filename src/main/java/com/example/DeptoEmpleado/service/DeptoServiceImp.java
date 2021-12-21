package com.example.DeptoEmpleado.service;
import com.example.DeptoEmpleado.model.Depto;
import com.example.DeptoEmpleado.repository.DeptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptoServiceImp implements DeptoService {

    private DeptoRepository deptoRepository;

    public DeptoServiceImp(DeptoRepository deptoRepository) {
        this.deptoRepository = deptoRepository;
    }

    @Override
    public Depto getDepto(Integer numDepto) {
        return deptoRepository.findBynumdepto(numDepto);
    }

    @Override
    public List<Depto> getDesptos() {
        return deptoRepository.findAll();
    }
}
