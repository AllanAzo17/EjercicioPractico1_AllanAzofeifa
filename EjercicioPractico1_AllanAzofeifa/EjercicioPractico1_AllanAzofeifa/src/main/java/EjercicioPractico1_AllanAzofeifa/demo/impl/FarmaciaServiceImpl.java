/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_AllanAzofeifa.demo.impl;

import EjercicioPractico1_AllanAzofeifa.demo.dao.FarmaciaDao;
import EjercicioPractico1_AllanAzofeifa.demo.domain.Farmacia;
import EjercicioPractico1_AllanAzofeifa.demo.Service.FarmaciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service


public class FarmaciaServiceImpl implements FarmaciaService {
    
    @Autowired
    private FarmaciaDao categoriaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Farmacia> getFarmacia() {
        var lista=categoriaDao.findAll();
        
        return lista;
    }
    @Override
    @Transactional (readOnly = true)
    public Farmacia getFarmacia(Farmacia farmacia) {
        return categoriaDao.findById(farmacia.getIdFarmacia()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Farmacia farmacia) {
        categoriaDao.save(farmacia);
    }
    @Override
    @Transactional
    public void delete(Farmacia farmacia) {
        categoriaDao.delete(farmacia);
    }
    
}
