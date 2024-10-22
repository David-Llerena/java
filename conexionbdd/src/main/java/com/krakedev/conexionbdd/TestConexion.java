package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps=null;
		// 
//		try {
//			Class.forName("org.postgresql.Driver");
//			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","Sistemas1225");
//			System.out.println("Conexion Exitosa");
//			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
//					+ "values(?,?,?,?,?,?,?,?,?);");
//			ps.setString(1,"1713616123");
//			ps.setString(2,"Rosalia");
//			ps.setString(3,"Andrade");
//			ps.setString(4,"U");
//			ps.setInt(5,2);
//			ps.setDouble(6, 1.56);
//			ps.setBigDecimal(7, new BigDecimal(1200.45));
//
//			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//			String fechaStr="2020/03/22 10:05:04";
//			Date fecha = sf.parse(fechaStr);
//			System.out.println(fecha);
//			long fechaMilis=fecha.getTime();
//			System.out.println(fechaMilis);
//			
//			//crear un java.sql.Date, partiendo de un java.util.date
//			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
//			System.out.println(fechaSQL);
//			
//			Time timeSQL=new Time(fechaMilis);
//			System.out.println(timeSQL);
//			
//			ps.setDate(8,fechaSQL);
//			ps.setTime(9, timeSQL);
//			
//			ps.executeUpdate();
//			System.out.println("Ejecuta Insert tabla Personas");
			// FIN PERSONAS
			
			//TABLA transacciones
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","Sistemas1225");
//				System.out.println("Conexion Exitosa");
//				ps=connection.prepareStatement("insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
//						+ "values(?,?,?,?,?,?);");
//				ps.setInt(1,2);
//				ps.setString(2, "22222");
//				ps.setBigDecimal(3, new BigDecimal(500.0));
//				ps.setString(4,"C");
//				
//
//				SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//				String fechaStr="2024/03/22 10:07:04";
//				Date fecha = sf.parse(fechaStr);
//				System.out.println(fecha);
//				long fechaMilis=fecha.getTime();
//				System.out.println(fechaMilis);
//				
//				//crear un java.sql.Date, partiendo de un java.util.date
//				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
//				System.out.println(fechaSQL);
//				
//				Time timeSQL=new Time(fechaMilis);
//				System.out.println(timeSQL);
//				
//				ps.setDate(5,fechaSQL);
//				ps.setTime(6, timeSQL);
//				
//				ps.executeUpdate();
//				System.out.println("Ejecuta Insert tabla TRANSACCIONES");
				
			//fin del insert tabla transacciones
			//TABLA registro_entrada
				try {
					Class.forName("org.postgresql.Driver");
					connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","Sistemas1225");
					System.out.println("Conexion Exitosa");
					ps=connection.prepareStatement("insert into registro_entrada(codigo_registro,cedula_empleado,fecha,hora)"
							+ "values(?,?,?,?);");
					ps.setInt(1,2222);
					ps.setString(2, "2222222222");
					

					SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					String fechaStr="2024/03/22 10:07:04";
					Date fecha = sf.parse(fechaStr);
					System.out.println(fecha);
					long fechaMilis=fecha.getTime();
					System.out.println(fechaMilis);
					
					//crear un java.sql.Date, partiendo de un java.util.date
					java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
					System.out.println(fechaSQL);
					
					Time timeSQL=new Time(fechaMilis);
					System.out.println(timeSQL);
					
					ps.setDate(3,fechaSQL);
					ps.setTime(4, timeSQL);
					
					ps.executeUpdate();
					System.out.println("Ejecuta Insert tabla REGISTRO_ENTRADA");
				//fin de insert registro_entrada
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
