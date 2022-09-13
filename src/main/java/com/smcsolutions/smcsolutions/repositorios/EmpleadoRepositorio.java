package com.smcsolutions.smcsolutions.repositorios;

<<<<<<< HEAD
//import java.util.ArrayList;
=======
import java.util.ArrayList;
>>>>>>> 07f305a4a09fb7cd71282652c4e11d8a52b64f77

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smcsolutions.smcsolutions.modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Long> {
<<<<<<< HEAD
    public abstract boolean findAllByEmpleado(Empleado empleado);

}
=======
    public abstract ArrayList<Empleado> findAllByEmpleado(String empleado);

}
>>>>>>> 07f305a4a09fb7cd71282652c4e11d8a52b64f77
