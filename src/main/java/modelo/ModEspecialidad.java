package modelo;

import entidades.Doctor;
import entidades.Especialidad;
import herramientas.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ModEspecialidad {
    public void crearEspecialidad(Especialidad especialidad) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            gerenteEntidad.persist(especialidad);
            transaccion.commit();
        } catch (Exception e) {
            if (transaccion.isActive()) {
                transaccion.rollback();
            }
        } finally {
            gerenteEntidad.close();
        }
    }
}
