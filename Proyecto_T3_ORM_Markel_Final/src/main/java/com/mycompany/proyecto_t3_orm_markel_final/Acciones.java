package com.mycompany.proyecto_t3_orm_markel_final;

import com.mycompany.*;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.persistence.PersistenceException;
import java.util.ArrayList;

public class Acciones {

    public static void main(String[] args) {
        Acciones operaciones = new Acciones();

        GestionEntity gestion = operaciones.recuperarGestionCodigo(new String[]{"PI0001", "PY0001", "PV0001"});
        System.out.println(gestion.getPiezasCodigo());
    }


    //Funciones Piezas
    public int anadirPieza(PiezasEntity pieza) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(pieza);
            tx.commit();
            session.close();
            return 0;
        } catch (HibernateException e) {
            session.close();
            return 1;
        } catch (PersistenceException e) {
            return 2;
        }
    }

    public PiezasEntity recuperarPiezaCodigo(String cod) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        PiezasEntity piezas = new PiezasEntity();
        try {
            piezas = (PiezasEntity) session.get(PiezasEntity.class, cod);
            tx.commit();
            session.close();
            return piezas;
        } catch (ObjectNotFoundException ignored) {

        }
        tx.commit();
        session.close();
        return new PiezasEntity();
    }

    public int actualizarPieza(PiezasEntity dpieza) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        PiezasEntity p;

        try {
            p = recuperarPiezaCodigo(dpieza.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                if (!dpieza.getNombre().equals("")) {
                    p.setNombre(dpieza.getNombre());
                }

                if (dpieza.getPrecio() > 0.0) {
                    p.setPrecio(dpieza.getPrecio());
                }

                if (!dpieza.getDescripcion().equals("")) {
                    p.setDescripcion(dpieza.getDescripcion());
                }

                session.update(p);
                tx.commit();
                session.close();
                return 0;

            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public int eliminarPieza(PiezasEntity dpieza) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        PiezasEntity p;

        try {
            p = recuperarPiezaCodigo(dpieza.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                session.delete(p);
                tx.commit();
                session.close();
                return 0;
            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public ArrayList<PiezasEntity> listarPiezas() {
        ArrayList<PiezasEntity> lpiezas = new ArrayList<PiezasEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM piezas ORDER BY codigo;").list()) {
            Object[] tupla = (Object[]) value;
            PiezasEntity pie = new PiezasEntity();
            pie.setCodigo((String) tupla[0]);
            pie.setNombre((String) tupla[1]);
            pie.setPrecio(Double.parseDouble(tupla[2].toString()));
            pie.setDescripcion((String) tupla[3]);
            lpiezas.add(pie);
        }

        tx.commit();
        session.close();
        return lpiezas;
    }

    public ArrayList<PiezasEntity> listarPiezasFiltro(String campo, String filtro) {
        ArrayList<PiezasEntity> lpiezas = new ArrayList<PiezasEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM piezas  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] tupla = (Object[]) value;
            PiezasEntity pie = new PiezasEntity();
            pie.setCodigo((String) tupla[0]);
            pie.setNombre((String) tupla[1]);
            pie.setPrecio(Double.parseDouble(tupla[2].toString()));
            pie.setDescripcion((String) tupla[3]);
            lpiezas.add(pie);
        }

        tx.commit();
        session.close();
        return lpiezas;
    }


    //Funciones Proveedor
    public int anadirProveedor(ProveedoresEntity proveedores) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(proveedores);
            tx.commit();
            session.close();
            return 0;
        } catch (HibernateException e) {
            session.close();
            return 1;
        } catch (PersistenceException e) {
            return 2;
        }
    }

    public ProveedoresEntity recuperarProveedorCodigo(String cod) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProveedoresEntity proveedor = new ProveedoresEntity();
        try {
            proveedor = (ProveedoresEntity) session.get(ProveedoresEntity.class, cod);
            tx.commit();
            session.close();
            return proveedor;
        } catch (ObjectNotFoundException ignored) {

        }
        tx.commit();
        session.close();
        return new ProveedoresEntity();
    }

    public int actualizarProveedor(ProveedoresEntity dproveedor) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProveedoresEntity p;

        try {
            p = recuperarProveedorCodigo(dproveedor.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                if (!dproveedor.getNombre().equals("")) {
                    p.setNombre(dproveedor.getNombre());
                }

                if (!dproveedor.getApellidos().equals("")) {
                    p.setApellidos(dproveedor.getApellidos());
                }

                if (!dproveedor.getDireccion().equals("")) {
                    p.setDireccion(dproveedor.getDireccion());
                }

                session.update(p);
                tx.commit();
                session.close();
                return 0;

            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public int eliminarProveedor(ProveedoresEntity dproveedor) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProveedoresEntity p;

        try {
            p = recuperarProveedorCodigo(dproveedor.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                session.delete(p);
                tx.commit();
                session.close();
                return 0;
            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public ArrayList<ProveedoresEntity> listarProveedores() {
        ArrayList<ProveedoresEntity> lproveedores = new ArrayList<ProveedoresEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM proveedores ORDER BY codigo;").list()) {
            Object[] tupla = (Object[]) value;
            ProveedoresEntity prov = new ProveedoresEntity();
            prov.setCodigo((String) tupla[0]);
            prov.setNombre((String) tupla[1]);
            prov.setApellidos((String) tupla[2]);
            prov.setDireccion((String) tupla[3]);
            lproveedores.add(prov);
        }

        tx.commit();
        session.close();
        return lproveedores;
    }

    public ArrayList<ProveedoresEntity> listarProveedorFiltro(String campo, String filtro) {
        ArrayList<ProveedoresEntity> lproveedores = new ArrayList<ProveedoresEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM proveedores  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] tupla = (Object[]) value;
            ProveedoresEntity prov = new ProveedoresEntity();
            prov.setCodigo((String) tupla[0]);
            prov.setNombre((String) tupla[1]);
            prov.setApellidos((String) tupla[2]);
            prov.setDireccion((String) tupla[3]);
            lproveedores.add(prov);
        }

        tx.commit();
        session.close();
        return lproveedores;
    }


    //Funciones Proyecto
    public int anadirProyecto(ProyectosEntity proyecto) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(proyecto);
            tx.commit();
            session.close();
            return 0;
        } catch (HibernateException e) {
            session.close();
            return 1;
        } catch (PersistenceException e) {
            return 2;
        }
    }

    public ProyectosEntity recuperarProyectoCodigo(String cod) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProyectosEntity proyecto = new ProyectosEntity();
        try {
            proyecto = (ProyectosEntity) session.get(ProyectosEntity.class, cod);
            tx.commit();
            session.close();
            return proyecto;
        } catch (ObjectNotFoundException ignored) {

        }
        tx.commit();
        session.close();
        return new ProyectosEntity();
    }

    public int actualizarProyecto(ProyectosEntity dproyecto) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProyectosEntity p;

        try {
            p = recuperarProyectoCodigo(dproyecto.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                if (!dproyecto.getNombre().equals("")) {
                    p.setNombre(dproyecto.getNombre());
                }

                if (!dproyecto.getCiudad().equals("")) {
                    p.setCiudad(dproyecto.getCiudad());
                }

                session.update(p);
                tx.commit();
                session.close();
                return 0;

            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public int eliminarProyecto(ProyectosEntity dproyecto) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProyectosEntity p;

        try {
            p = recuperarProyectoCodigo(dproyecto.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (p != null) {

            try {
                session.delete(p);
                tx.commit();
                session.close();
                return 0;
            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public ArrayList<ProyectosEntity> listarProyectos() {
        ArrayList<ProyectosEntity> lproyectos = new ArrayList<ProyectosEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM proyectos ORDER BY codigo;").list()) {
            Object[] tupla = (Object[]) value;
            ProyectosEntity pro = new ProyectosEntity();
            pro.setCodigo((String) tupla[0]);
            pro.setNombre((String) tupla[1]);
            pro.setCiudad((String) tupla[2]);
            lproyectos.add(pro);
        }

        tx.commit();
        session.close();
        return lproyectos;
    }

    public ArrayList<ProyectosEntity> listarProyectosFiltro(String campo, String filtro) {
        ArrayList<ProyectosEntity> lproyectos = new ArrayList<ProyectosEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM proyectos  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] tupla = (Object[]) value;
            ProyectosEntity pro = new ProyectosEntity();
            pro.setCodigo((String) tupla[0]);
            pro.setNombre((String) tupla[1]);
            pro.setCiudad((String) tupla[2]);
            lproyectos.add(pro);
        }

        tx.commit();
        session.close();
        return lproyectos;
    }


    //Funciones Gestion

    public int anadirGestion(GestionEntity gestion) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(gestion);
            tx.commit();
            session.close();
            return 0;
        } catch (HibernateException e) {
            session.close();
            return 1;
        } catch (PersistenceException e) {
            return 2;
        }
    }

    public GestionEntity recuperarGestionCodigo(String[] codigos) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        GestionEntity gestion = new GestionEntity();
        GestionEntityPK gestionPK = new GestionEntityPK();
        gestionPK.setPiezasCodigo(codigos[0]);
        gestionPK.setProyectosCodigo(codigos[1]);
        gestionPK.setProveedoresCodigo(codigos[2]);
        try {
            gestion = session.get(GestionEntity.class, gestionPK);
            tx.commit();
            session.close();
            return gestion;
        } catch (ObjectNotFoundException ignored) {

        }
        tx.commit();
        session.close();
        return new GestionEntity();
    }

    public int actualizarGestion(String[] dgestion, double cantidad) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        GestionEntity g;

        try {
            g = recuperarGestionCodigo(dgestion);
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (g != null) {

            try {
                if (cantidad > 0) {
                    g.setCantidad(cantidad);
                }

                session.update(g);
                tx.commit();
                session.close();
                return 0;

            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public int eliminarGestion(String[] dgestion) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        GestionEntity g;

        try {
            g = recuperarGestionCodigo(dgestion);
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (g != null) {

            try {
                session.delete(g);
                tx.commit();
                session.close();
                return 0;
            } catch (Exception ignored) {
            }
            session.close();
            return 2;
        } else {
            session.close();
            return 1;
        }
    }

    public ArrayList<GestionEntity> listarGestion() {
        ArrayList<GestionEntity> lgestion = new ArrayList<GestionEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM gestion;").list()) {
            Object[] tupla = (Object[]) value;
            GestionEntity gest = new GestionEntity();
            gest.setCantidad((Double) tupla[0]);
            gest.setPiezasCodigo((String) tupla[1]);
            gest.setProyectosCodigo((String) tupla[2]);
            gest.setProveedoresCodigo((String) tupla[3]);
            lgestion.add(gest);
        }

        tx.commit();
        session.close();
        return lgestion;
    }

    public ArrayList<Object[]> listarTablaPiezaProveedor() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.codigo, p.nombre, p.apellidos, (SELECT COUNT( DISTINCT piezas_codigo) FROM gestion WHERE proveedores_codigo = p.codigo), COALESCE((SELECT SUM(cantidad) FROM gestion WHERE proveedores_codigo = p.codigo) , 0), (SELECT COUNT( DISTINCT proyectos_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) FROM proveedores p;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        tx.commit();
        session.close();
        return datos;
    }

    public ArrayList<Object[]> listarTablaPiezaProyecto() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, (SELECT COUNT( DISTINCT piezas_codigo) FROM gestion WHERE proyectos_codigo = p.codigo), COALESCE((SELECT SUM(cantidad) FROM gestion WHERE proyectos_codigo = p.codigo) , 0), (SELECT COUNT( DISTINCT proveedores_codigo) FROM gestion WHERE proyectos_codigo = p.codigo) FROM proyectos p;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        tx.commit();
        session.close();
        return datos;
    }

    public ArrayList<Object[]> listarDatosEstadisticas() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT piezas_codigo, MAX(sums) FROM (SELECT piezas_codigo,SUM(cantidad) AS sums FROM gestion GROUP BY piezas_codigo) as subtabla;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        for (Object value : session.createSQLQuery("SELECT piezas_codigo, MAX(cuenta) FROM (SELECT piezas_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY piezas_codigo) as subtabla;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(sums) FROM (SELECT proveedores_codigo,SUM(cantidad) AS sums FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(cuenta) FROM (SELECT proveedores_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(cuenta) FROM (SELECT proveedores_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        tx.commit();
        session.close();
        return datos;
    }

    public ArrayList<Object[]> listarDatosSuministrosPiezas() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, COALESCE((SELECT SUM(cantidad) AS sums FROM gestion g WHERE g.piezas_codigo = p.codigo), 0) as canttotal ,(SELECT COUNT(DISTINCT g.proyectos_codigo) AS count FROM gestion g WHERE g.piezas_codigo = p.codigo) as nproyectos, (SELECT COUNT(DISTINCT g.proveedores_codigo) AS count FROM gestion g WHERE g.piezas_codigo = p.codigo) as nproveedores  FROM piezas p").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        tx.commit();
        session.close();
        return datos;
    }

    public ArrayList<Object[]> listarDatosSuministrosProveedor() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, (SELECT COUNT(DISTINCT piezas_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) AS npieza, (SELECT COUNT(DISTINCT proveedores_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) AS nproyectos   FROM proveedores p;").list()) {
            Object[] tupla = (Object[]) value;
            datos.add(tupla);
        }

        tx.commit();
        session.close();
        return datos;
    }
}
