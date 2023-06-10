package horario_asistencia.loxasoft.dto;

import horario_asistencia.loxasoft.entity.HorarioAsistencia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
	private HorarioAsistencia asistencia;
	private DepartamentDTO departamentDTO;
	private EmployeeDTO employeeDTO;
	public HorarioAsistencia getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(HorarioAsistencia asistencia) {
		this.asistencia = asistencia;
	}
	public DepartamentDTO getDepartamentDTO() {
		return departamentDTO;
	}
	public void setDepartamentDTO(DepartamentDTO departamentDTO) {
		this.departamentDTO = departamentDTO;
	}
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	
}
