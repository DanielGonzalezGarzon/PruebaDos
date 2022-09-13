package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.Empleado;
import com.smcsolutions.smcsolutions.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoServicio {
    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    public ArrayList<Empleado> obtenerEmpleados(){
        return (ArrayList<Empleado>) empleadoRepositorio.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado){
        return empleadoRepositorio.save(empleado);
    }

<<<<<<< HEAD
   /* public boolean eliminarEmpleado(Empleado empleado) {
        return empleadoRepositorio.findAllByEmpleado(empleado)(empleado -> {
        
        //(empleado.getNombre()).map(empleado)
        
        
=======
    public boolean eliminarEmpleado(Empleado empleado) {
        return empleadoRepositorio.findById(empleado.getRol()).map(empleado -> {
>>>>>>> 07f305a4a09fb7cd71282652c4e11d8a52b64f77
            empleadoRepositorio.delete(empleado);
            return true;
        }).orElse(false);  
    } */

    public Optional<Empleado> obtenerPorId(Long id) {
        return empleadoRepositorio.findById(id);
    }
}
