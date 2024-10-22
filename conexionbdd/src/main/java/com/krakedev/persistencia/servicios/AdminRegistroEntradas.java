package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.RegistroEntradas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminRegistroEntradas {

	private  static final Logger LOGGER=LogManager.getLogger(AdminRegistroEntradas.class);

		public static void insertar(RegistroEntradas registro) throws Exception {
			Connection con = null;
			PreparedStatement ps;
			LOGGER.trace("Registra entrada a >>>>"+ registro);
			try {
				//Abrir conexion
				con = ConexionBDD.conectar();
				//Insertar
		
				ps=con.prepareStatement("insert into Registro_Entradas(codigo_registro,cedula_empleado,fecha,hora)"
						+ "values(?,?,?,?);");
				ps.setInt(1,registro.getCodigo_registro());
				ps.setString(2,registro.getCedula());
			
				ps.setDate(3, new java.sql.Date(registro.getFecha().getTime()));
				ps.setTime(4, new Time(registro.getHora().getTime()));
				
				ps.executeUpdate();
					
			} catch (Exception e) {
				LOGGER.error("Error al insertar",e);
				throw new Exception("Error al insertar");

			}finally {
				//cerrar conexion
				try {
					con.close();
				} catch (SQLException e) {
					LOGGER.error("Error con la base de datos",e);
					throw new Exception("Error con la base de datos");
				}
			}
		}
		
		public static void actualizar(RegistroEntradas registro) throws Exception {
			Connection con = null;
			PreparedStatement ps;
			LOGGER.trace("Registra entrada a actualizar>>>>"+ registro);
	        try {
	            // Abrir conexión
	            con = ConexionBDD.conectar();
	            // Preparar sentencia SQL para actualizar

	            ps = con.prepareStatement(
	                "UPDATE transacciones SET cedula_empleado=?, fecha=?, hora=?, " +
	                "WHERE codigo_registro=?"
	            );
	            
	            // Establecer los parámetros
				ps.setString(1,registro.getCedula());
				ps.setDate(2, new java.sql.Date(registro.getFecha().getTime()));
				ps.setTime(3, new Time(registro.getHora().getTime()));
				ps.setInt(4,registro.getCodigo_registro());  // Criterio WHERE
	            
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

		public static void eliminar(Integer codigo) throws Exception {
	        Connection con = null;
	        PreparedStatement ps = null;
	        
	        try {
	            // Abrir conexión
	            con = ConexionBDD.conectar();
	            
	            // Preparar sentencia SQL para eliminar
	            ps = con.prepareStatement("DELETE FROM registro_entradas WHERE codigo_registro = ?");
	            
	            // Establecer el parámetro
	            ps.setInt(1, codigo);
	            
	            // Ejecutar la eliminación
	            int filasAfectadas = ps.executeUpdate();
	            
	            if (filasAfectadas > 0) {
	            	LOGGER.debug("Registro de entrada con codigo " + codigo + " eliminada exitosamente.");
	            } else {
	            	LOGGER.error("No se encontró ningun registro de entrada con codigo " + codigo);
	            }
	        
			} catch (Exception e) {
				LOGGER.error("Error al eliminar",e);
				throw new Exception("Error al eliminar");
	            
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

	}
