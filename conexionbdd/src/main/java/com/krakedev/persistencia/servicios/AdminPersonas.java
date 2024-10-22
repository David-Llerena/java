package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private  static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>>"+ persona);
		try {
			//Abrir conexion
			con = ConexionBDD.conectar();
			//Insertar
			ps=con.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1,persona.getCedula());
			ps.setString(2,persona.getNombre());
			ps.setString(3,persona.getApellido());
			ps.setString(4,persona.getEstadoCivil().getCodigo());
			ps.setInt(5,persona.getNumeroHijos());
			ps.setDouble(6,persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			
			
			ps.executeUpdate();
	
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");

		} finally {
			//cerrar la conexion
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>>>"+ persona);
        try {
            // Abrir conexión
            con = ConexionBDD.conectar();
            // Preparar sentencia SQL para actualizar
            ps = con.prepareStatement(
                "UPDATE personas SET nombre=?, apellido=?, estado_civil_codigo=?, " +
                "numero_hijos=?, estatura=?, cantidad_ahorrada=?, " +
                "fecha_nacimiento=?, hora_nacimiento=? " +
                "WHERE cedula=?"
            );
            
            // Establecer los parámetros
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEstadoCivil().getCodigo());
            ps.setInt(4, persona.getNumeroHijos());
            ps.setDouble(5, persona.getEstatura());
            ps.setBigDecimal(6, persona.getCantidadAhorrada());
            ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
            ps.setString(9, persona.getCedula());  // Criterio WHERE
            
            // Ejecutar la actualización
            ps.executeUpdate();
            
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
            
        } finally {
			//cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(String cedula) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            // Abrir conexión
            con = ConexionBDD.conectar();
            
            // Preparar sentencia SQL para eliminar
            ps = con.prepareStatement("DELETE FROM personas WHERE cedula = ?");
            
            // Establecer el parámetro
            ps.setString(1, cedula);
            
            // Ejecutar la eliminación
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
            	LOGGER.debug("Persona con cédula " + cedula + " eliminada exitosamente.");
            } else {
            	LOGGER.error("No se encontró ninguna persona con la cédula " + cedula);
            }
        
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
            
//        } finally {
//			//cerrar conexion
//			try {
//				con.close();
//			} catch (SQLException e) {
//				LOGGER.error("Error con la base de datos",e);
//				throw new Exception("Error con la base de datos");	
//			}
		}
        finally {
            // Cerrar recursos verificando que no sean null
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
	}
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
	    ArrayList<Persona> personas = new ArrayList<Persona>();
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    
	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("select * from personas where nombre like ?");
	        ps.setString(1,"%" + nombreBusqueda + "%");
	        rs = ps.executeQuery();
	        
	        while (rs.next()) {
	            String nombre = rs.getString("nombre");
	            String cedula = rs.getString("cedula");
	            Persona p = new Persona();
	            p.setCedula(cedula);
	            p.setNombre(nombre);
	            personas.add(p);
	        }
	        
	    } catch (Exception e) {
	        LOGGER.error("Error al consultar por nombre", e);
	        throw new Exception("Error al consultar por nombre");
	    } finally {
	        //cerrar la conexion
	        try {
	            con.close();
	        } catch(SQLException e) {
	            LOGGER.error("Error con la base de datos",e);
	            throw new Exception("Error con la base de datos");
	        }
	    }
	    
	    return personas;
	}
	
}
	