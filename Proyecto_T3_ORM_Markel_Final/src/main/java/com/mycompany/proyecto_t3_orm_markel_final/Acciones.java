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

        GestionEntity gestion = operaciones.mostrarGestionPorCodigo(new String[]{"PI0001", "PY0001", "PV0001"});
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

    public PiezasEntity mostrarPiezaPorCodigo(String cod) {
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

    public int actualizarPieza(PiezasEntity pieza) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        PiezasEntity piezas;

        try {
            piezas = mostrarPiezaPorCodigo(pieza.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (piezas != null) {

            try {
                if (!pieza.getNombre().equals("")) {
                    piezas.setNombre(pieza.getNombre());
                }

                if (pieza.getPrecio() > 0.0) {
                    piezas.setPrecio(pieza.getPrecio());
                }

                if (!pieza.getDescripcion().equals("")) {
                    piezas.setDescripcion(pieza.getDescripcion());
                }

                session.update(piezas);
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

    public int eliminarPieza(PiezasEntity pieza) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        PiezasEntity piezas;

        try {
            piezas = mostrarPiezaPorCodigo(pieza.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (piezas != null) {

            try {
                session.delete(piezas);
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

    public ArrayList<PiezasEntity> mostraPiezas() {
        ArrayList<PiezasEntity> lpiezas = new ArrayList<PiezasEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM piezas ORDER BY codigo;").list()) {
            Object[] linea = (Object[]) value;
            PiezasEntity piezas = new PiezasEntity();
            piezas.setCodigo((String) linea[0]);
            piezas.setNombre((String) linea[1]);
            piezas.setPrecio(Double.parseDouble(linea[2].toString()));
            piezas.setDescripcion((String) linea[3]);
            lpiezas.add(piezas);
        }

        tx.commit();
        session.close();
        return lpiezas;
    }

    public ArrayList<PiezasEntity> mostrarPiezasPorFiltro(String campo, String filtro) {
        ArrayList<PiezasEntity> lpiezas = new ArrayList<PiezasEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM piezas  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] linea = (Object[]) value;
            PiezasEntity pie = new PiezasEntity();
            pie.setCodigo((String) linea[0]);
            pie.setNombre((String) linea[1]);
            pie.setPrecio(Double.parseDouble(linea[2].toString()));
            pie.setDescripcion((String) linea[3]);
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

    public ProveedoresEntity mostrarProveedorPorCodigo(String cod) {
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

    public int actualizarProveedores(ProveedoresEntity dproveedor) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ProveedoresEntity proveedores;

        try {
            proveedores = mostrarProveedorPorCodigo(dproveedor.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (proveedores != null) {

            try {
                if (!dproveedor.getNombre().equals("")) {
                    proveedores.setNombre(dproveedor.getNombre());
                }

                if (!dproveedor.getApellidos().equals("")) {
                    proveedores.setApellidos(dproveedor.getApellidos());
                }

                if (!dproveedor.getDireccion().equals("")) {
                    proveedores.setDireccion(dproveedor.getDireccion());
                }

                session.update(proveedores);
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

        ProveedoresEntity proveedores;

        try {
            proveedores = mostrarProveedorPorCodigo(dproveedor.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (proveedores != null) {

            try {
                session.delete(proveedores);
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
        ArrayList<ProveedoresEntity> listaProveedores = new ArrayList<ProveedoresEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM proveedores ORDER BY codigo;").list()) {
            Object[] linea = (Object[]) value;
            ProveedoresEntity prov = new ProveedoresEntity();
            prov.setCodigo((String) linea[0]);
            prov.setNombre((String) linea[1]);
            prov.setApellidos((String) linea[2]);
            prov.setDireccion((String) linea[3]);
            listaProveedores.add(prov);
        }

        tx.commit();
        session.close();
        return listaProveedores;
    }

    public ArrayList<ProveedoresEntity> mostrarProveedorPorFiltro(String campo, String filtro) {
        ArrayList<ProveedoresEntity> listaProveedores = new ArrayList<ProveedoresEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM proveedores  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] linea = (Object[]) value;
            ProveedoresEntity prov = new ProveedoresEntity();
            prov.setCodigo((String) linea[0]);
            prov.setNombre((String) linea[1]);
            prov.setApellidos((String) linea[2]);
            prov.setDireccion((String) linea[3]);
            listaProveedores.add(prov);
        }

        tx.commit();
        session.close();
        return listaProveedores;
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

    public ProyectosEntity mostrarProyectoPorCodigo(String cod) {
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

        ProyectosEntity proyectos;

        try {
            proyectos = mostrarProyectoPorCodigo(dproyecto.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (proyectos != null) {

            try {
                if (!dproyecto.getNombre().equals("")) {
                    proyectos.setNombre(dproyecto.getNombre());
                }

                if (!dproyecto.getCiudad().equals("")) {
                    proyectos.setCiudad(dproyecto.getCiudad());
                }

                session.update(proyectos);
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

        ProyectosEntity proyectos;

        try {
            proyectos = mostrarProyectoPorCodigo(dproyecto.getCodigo());
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (proyectos != null) {

            try {
                session.delete(proyectos);
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

    public ArrayList<ProyectosEntity> mostrarProyectos() {
        ArrayList<ProyectosEntity> listaProyectos = new ArrayList<ProyectosEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM proyectos ORDER BY codigo;").list()) {
            Object[] linea = (Object[]) value;
            ProyectosEntity pro = new ProyectosEntity();
            pro.setCodigo((String) linea[0]);
            pro.setNombre((String) linea[1]);
            pro.setCiudad((String) linea[2]);
            listaProyectos.add(pro);
        }

        tx.commit();
        session.close();
        return listaProyectos;
    }

    public ArrayList<ProyectosEntity> mostrarProyectosPorFiltro(String campo, String filtro) {
        ArrayList<ProyectosEntity> listaProyectos = new ArrayList<ProyectosEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        filtro = "'%" + filtro.toLowerCase() + "%'";
        for (Object value : session.createSQLQuery("SELECT * FROM proyectos  WHERE LOWER(" + campo + ") LIKE " + filtro + "").list()) {
            Object[] linea = (Object[]) value;
            ProyectosEntity pro = new ProyectosEntity();
            pro.setCodigo((String) linea[0]);
            pro.setNombre((String) linea[1]);
            pro.setCiudad((String) linea[2]);
            listaProyectos.add(pro);
        }

        tx.commit();
        session.close();
        return listaProyectos;
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

    public GestionEntity mostrarGestionPorCodigo(String[] codigos) {
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

        GestionEntity gestion;

        try {
            gestion = mostrarGestionPorCodigo(dgestion);
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (gestion != null) {

            try {
                if (cantidad > 0) {
                    gestion.setCantidad(cantidad);
                }

                session.update(gestion);
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

        GestionEntity gestion;

        try {
            gestion = mostrarGestionPorCodigo(dgestion);
        } catch (Exception e) {
            session.close();
            return 1;
        }
        if (gestion != null) {

            try {
                session.delete(gestion);
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

    public ArrayList<GestionEntity> mostrarGestion() {
        ArrayList<GestionEntity> listaGestion = new ArrayList<GestionEntity>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT * FROM gestion;").list()) {
            Object[] linea = (Object[]) value;
            GestionEntity gestion = new GestionEntity();
            gestion.setCantidad((Double) linea[0]);
            gestion.setPiezasCodigo((String) linea[1]);
            gestion.setProyectosCodigo((String) linea[2]);
            gestion.setProveedoresCodigo((String) linea[3]);
            listaGestion.add(gestion);
        }

        tx.commit();
        session.close();
        return listaGestion;
    }

    public ArrayList<Object[]> mostrarTablaDePiezaProveedor() {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.codigo, p.nombre, p.apellidos, (SELECT COUNT( DISTINCT piezas_codigo) FROM gestion WHERE proveedores_codigo = p.codigo), COALESCE((SELECT SUM(cantidad) FROM gestion WHERE proveedores_codigo = p.codigo) , 0), (SELECT COUNT( DISTINCT proyectos_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) FROM proveedores p;").list()) {
            Object[] linea = (Object[]) value;
            datos.add(linea);
        }

        tx.commit();
        session.close();
        return datos;
    }

    public ArrayList<Object[]> listarTablaPiezaProyecto() {
        ArrayList<Object[]> datosProy = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, (SELECT COUNT( DISTINCT piezas_codigo) FROM gestion WHERE proyectos_codigo = p.codigo), COALESCE((SELECT SUM(cantidad) FROM gestion WHERE proyectos_codigo = p.codigo) , 0), (SELECT COUNT( DISTINCT proveedores_codigo) FROM gestion WHERE proyectos_codigo = p.codigo) FROM proyectos p;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        tx.commit();
        session.close();
        return datosProy;
    }

    public ArrayList<Object[]> mostrarDatosDeEstadisticas() {
        ArrayList<Object[]> datosProy = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT piezas_codigo, MAX(sums) FROM (SELECT piezas_codigo,SUM(cantidad) AS sums FROM gestion GROUP BY piezas_codigo) as subtabla;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        for (Object value : session.createSQLQuery("SELECT piezas_codigo, MAX(cuenta) FROM (SELECT piezas_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY piezas_codigo) as subtabla;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(sums) FROM (SELECT proveedores_codigo,SUM(cantidad) AS sums FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(cuenta) FROM (SELECT proveedores_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        for (Object value : session.createSQLQuery("SELECT proveedores_codigo, MAX(cuenta) FROM (SELECT proveedores_codigo,COUNT(DISTINCT proyectos_codigo) AS cuenta FROM gestion GROUP BY proveedores_codigo) as subtabla;").list()) {
            Object[] linea = (Object[]) value;
            datosProy.add(linea);
        }

        tx.commit();
        session.close();
        return datosProy;
    }

    public ArrayList<Object[]> listarDatosSuministrosPiezas() {
        ArrayList<Object[]> datosPie = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, COALESCE((SELECT SUM(cantidad) AS sums FROM gestion g WHERE g.piezas_codigo = p.codigo), 0) as canttotal ,(SELECT COUNT(DISTINCT g.proyectos_codigo) AS count FROM gestion g WHERE g.piezas_codigo = p.codigo) as nproyectos, (SELECT COUNT(DISTINCT g.proveedores_codigo) AS count FROM gestion g WHERE g.piezas_codigo = p.codigo) as nproveedores  FROM piezas p").list()) {
            Object[] linea = (Object[]) value;
            datosPie.add(linea);
        }

        tx.commit();
        session.close();
        return datosPie;
    }

    public ArrayList<Object[]> listarDatosSuministrosProveedor() {
        ArrayList<Object[]> datosProv = new ArrayList<Object[]>();
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        for (Object value : session.createSQLQuery("SELECT p.*, (SELECT COUNT(DISTINCT piezas_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) AS npieza, (SELECT COUNT(DISTINCT proveedores_codigo) FROM gestion WHERE proveedores_codigo = p.codigo) AS nproyectos   FROM proveedores p;").list()) {
            Object[] linea = (Object[]) value;
            datosProv.add(linea);
        }

        tx.commit();
        session.close();
        return datosProv;
    }
}
