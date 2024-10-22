package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminTransacciones {
	private  static final Logger LOGGER=LogManager.getLogger(AdminTransacciones.class);
	
	public static void insertar(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Transaccion a insertar>>>>"+ transaccion);
		try {
			//Abrir conexion
			con = ConexionBDD.conectar();
			//Insertar
			ps=con.prepareStatement("insert into Transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values(?,?,?,?,?,?);");
			ps.setInt(1,transaccion.getCodigo());
			ps.setString(2,transaccion.getNumero_cuenta());
			ps.setBigDecimal(3,transaccion.getMonto());
			ps.setString(4,transaccion.getTipo());
			
			ps.setDate(5, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(6, new Time(transaccion.getHora().getTime()));
			
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

	public static void actualizar(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Transaccion a actualizar>>>>"+ transaccion);
        try {
            // Abrir conexión
            con = ConexionBDD.conectar();
            // Preparar sentencia SQL para actualizar
            ps = con.prepareStatement(
                "UPDATE transacciones SET numero_cuenta=?, monto=?, tipo=?, fecha=?, hora=?, " +
                "WHERE codigo=?"
            );
            
            // Establecer los parámetros
			ps.setString(1,transaccion.getNumero_cuenta());
			ps.setBigDecimal(2,transaccion.getMonto());
			ps.setString(3,transaccion.getTipo());
			ps.setDate(4, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(5, new Time(transaccion.getHora().getTime()));
            ps.setInt(6, transaccion.getCodigo());  // Criterio WHERE
            
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
            ps = con.prepareStatement("DELETE FROM transacciones WHERE codigo = ?");
            
            // Establecer el parámetro
            ps.setInt(1, codigo);
            
            // Ejecutar la eliminación
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
            	LOGGER.debug("Transaccion con codigo " + codigo + " eliminada exitosamente.");
            } else {
            	LOGGER.error("No se encontró ninguna transaccion con codigo " + codigo);
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
