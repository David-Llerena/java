package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

		
		// se realiza la busqueda por solo la clave primaria
		public static RegistroEntradas buscarPorCedula (String cedula) throws Exception {
		    RegistroEntradas registroEntrada = new RegistroEntradas();
		    Connection con = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;
		    
		    try {
		        con = ConexionBDD.conectar();
		        ps = con.prepareStatement("select * from registro_entrada where cedula_empleado = ?");
		        ps.setString(1,cedula);
		        rs = ps.executeQuery();
		        
		        if(rs.next()) {
		        	int codigo = rs.getInt("codigo_registro");
		        	Date fecha = rs.getDate("fecha");
		        	Date hora = rs.getTime("hora");
		        	registroEntrada.setCedula(cedula);
		        	registroEntrada.setCodigo_registro(codigo);
		        	registroEntrada.setFecha(fecha);
		        	registroEntrada.setHora(hora);
		        }
		        
		        
		    } catch (Exception e) {
		        LOGGER.error("Error al consultar por cedula", e);
		        throw new Exception("Error al consultar por cedula");
		    } finally {
		        //cerrar la conexion
		        try {
		            con.close();
		        } catch(SQLException e) {
		            LOGGER.error("Error con la base de datos",e);
		            throw new Exception("Error con la base de datos");
		        }
		    }
		    
		    return registroEntrada;
		}
		
		
		// se realiza la busqueda para varios registros por ejemplo las fechas
		public static ArrayList<RegistroEntradas> buscarPorFecha(String fecha1, String fecha2) throws Exception {
		    ArrayList<RegistroEntradas> registroEntrada = new ArrayList<RegistroEntradas>();
		    Connection con = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;

		    try {
		        con = ConexionBDD.conectar();
		        
		        // Primero, vamos a imprimir la consulta SQL para debug
		        String sql = "SELECT * FROM registro_entrada WHERE fecha BETWEEN ? AND ?";
		        System.out.println("SQL Query: " + sql);
		        
		        ps = con.prepareStatement(sql);
		        
		        // Convertir los String a java.sql.Date
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        java.sql.Date sqlFecha1 = new java.sql.Date(sdf.parse(fecha1).getTime());
		        java.sql.Date sqlFecha2 = new java.sql.Date(sdf.parse(fecha2).getTime());
		        
		        ps.setDate(1, sqlFecha1);
		        ps.setDate(2, sqlFecha2);
		        
		        rs = ps.executeQuery();

		        // Imprimir los nombres de las columnas disponibles para debug
		        ResultSetMetaData rsmd = rs.getMetaData();
		        int columnCount = rsmd.getColumnCount();
		        System.out.println("Columnas disponibles:");
		        for (int i = 1; i <= columnCount; i++) {
		            System.out.println(rsmd.getColumnName(i));
		        }

		        while (rs.next()) {
		            RegistroEntradas registro = new RegistroEntradas();
		            
		            // Ajusta estos getters según los nombres exactos de tus columnas
		            // y los atributos de tu clase RegistroEntradas
		            try {

		                if (tieneColumna(rs, "cedula_empleado")) { 
		                    registro.setCedula(rs.getString("cedula_empleado"));
		                }
		                if (tieneColumna(rs, "fecha")) {
		                    registro.setFecha(rs.getDate("fecha"));
		                }
		                // Añade aquí los demás campos según tu estructura
		                
		                registroEntrada.add(registro);
		            } catch (SQLException e) {
		                LOGGER.error("Error al mapear columnas: " + e.getMessage());
		                throw new Exception("Error al mapear columnas: " + e.getMessage());
		            }
		        }

		    } catch (Exception e) {
		        LOGGER.error("Error al buscar por fechas", e);
		        throw new Exception("Error al buscar por fechas: " + e.getMessage());
		    } finally {
		        try {
		            if (rs != null) rs.close();
		            if (ps != null) ps.close();
		            if (con != null) con.close();
		        } catch (SQLException e) {
		            LOGGER.error("Error al cerrar la conexión", e);
		            throw new Exception("Error al cerrar la conexión con la base de datos");
		        }
		    }

		    return registroEntrada;
		}

		// Método auxiliar para verificar si existe una columna
		private static boolean tieneColumna(ResultSet rs, String columnName) throws SQLException {
		    ResultSetMetaData rsmd = rs.getMetaData();
		    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		        if (columnName.equalsIgnoreCase(rsmd.getColumnName(i))) {
		            return true;
		        }
		    }
		    return false;
		}
	}
