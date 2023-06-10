package horario_asistencia.loxasoft.entity;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "horarioAsistencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorarioAsistencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fecha;
	private LocalTime horaINgreso;
	private LocalTime horaSalida;
	private Integer employyeId;
	private Integer departmentId;
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	public LocalTime getHoraINgreso() {
		return horaINgreso;
	}
	public void setHoraINgreso(LocalTime horaINgreso) {
		this.horaINgreso = horaINgreso;
	}
	public Integer getEmployyeId() {
		return employyeId;
	}
	public void setEmployyeId(Integer employyeId) {
		this.employyeId = employyeId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
}
