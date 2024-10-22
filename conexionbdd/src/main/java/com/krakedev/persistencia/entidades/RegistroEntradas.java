package com.krakedev.persistencia.entidades;

import java.util.Date;

public class RegistroEntradas {

		private int codigo_registro;
		private String cedula;
		private Date fecha;
		private Date hora;
		public RegistroEntradas(int codigo_registro, String cedula, Date fecha, Date hora) {
			super();
			this.codigo_registro = codigo_registro;
			this.cedula = cedula;
			this.fecha = fecha;
			this.hora = hora;
		}
		public RegistroEntradas() {
			super();
		}
		public int getCodigo_registro() {
			return codigo_registro;
		}
		public void setCodigo_registro(int codigo_registro) {
			this.codigo_registro = codigo_registro;
		}
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public Date getHora() {
			return hora;
		}
		public void setHora(Date hora) {
			this.hora = hora;
		}
		@Override
		public String toString() {
			return "RegistroEntradas [codigo_registro=" + codigo_registro + ", cedula=" + cedula + ", fecha=" + fecha
					+ ", hora=" + hora + "]";
		}
		public RegistroEntradas(int codigo_registro, String cedula) {
			super();
			this.codigo_registro = codigo_registro;
			this.cedula = cedula;
		}
		
		
		
}
