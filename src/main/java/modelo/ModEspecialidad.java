package modelo;

import entidades.Especialidad;
import herramientas.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

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

    public Especialidad leerEspecialidad(int codigo) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        Especialidad especialidad = null;
        try {
            especialidad = gerenteEntidad.find(Especialidad.class, codigo);
        } finally {
            gerenteEntidad.close();
        }
        return especialidad;
    }

    public void actualizarEspecialidad(Especialidad especialidad) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            gerenteEntidad.merge(especialidad);
            transaccion.commit();
        } catch (Exception e) {
            if (transaccion.isActive()) {
                transaccion.rollback();
            }
        } finally {
            gerenteEntidad.close();
        }
    }

    public void eliminarEspecialidad(int codigo) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            Especialidad especialidad = gerenteEntidad.find(Especialidad.class, codigo);
            if (especialidad != null) {
                gerenteEntidad.remove(especialidad);
            }
            transaccion.commit();
        } catch (Exception e) {
            if (transaccion.isActive()) {
                transaccion.rollback();
            }
        } finally {
            gerenteEntidad.close();
        }
    }

    public List<Especialidad> listarEspecialidades() {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        List<Especialidad> especialidades = null;
        try {
            especialidades = gerenteEntidad.createQuery("from Especialidad", Especialidad.class).getResultList();
        } finally {
            gerenteEntidad.close();
        }
        return especialidades;
    }
}
