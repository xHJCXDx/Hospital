package modelo;

import entidades.Doctor;
import herramientas.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ModDoctor {
    public void crearDoctor(Doctor doctor) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            gerenteEntidad.persist(doctor);
            transaccion.commit();
        } catch (Exception e) {
            if (transaccion.isActive()) {
                transaccion.rollback();
            }
        } finally {
            gerenteEntidad.close();
        }
    }

    public Doctor leerDoctor(int codigo) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        Doctor doctor = null;
        try {
            doctor = gerenteEntidad.find(Doctor.class, codigo);
        } finally {
            gerenteEntidad.close();
        }
        return doctor;
    }

    public void actualizarDoctor(Doctor doctor) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            gerenteEntidad.merge(doctor);
            transaccion.commit();
        } catch (Exception e) {
            if (transaccion.isActive()) {
                transaccion.rollback();
            }
        } finally {
            gerenteEntidad.close();
        }
    }

    public void eliminarDoctor(int codigo) {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        EntityTransaction transaccion = gerenteEntidad.getTransaction();
        try {
            transaccion.begin();
            Doctor doctor = gerenteEntidad.find(Doctor.class, codigo);
            if (doctor != null) {
                gerenteEntidad.remove(doctor);
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

    public List<Doctor> listarDoctores() {
        EntityManager gerenteEntidad = JPAUtil.getEntityManager();
        List<Doctor> doctores = null;
        try {
            doctores = gerenteEntidad.createQuery("from Doctor", Doctor.class).getResultList();
        } finally {
            gerenteEntidad.close();
        }
        return doctores;
    }
}
