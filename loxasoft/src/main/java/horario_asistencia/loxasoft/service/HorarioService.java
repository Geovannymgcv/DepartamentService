package horario_asistencia.loxasoft.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import horario_asistencia.loxasoft.dto.DepartamentDTO;
import horario_asistencia.loxasoft.dto.EmployeeDTO;
import horario_asistencia.loxasoft.dto.ResponseDTO;
import horario_asistencia.loxasoft.entity.HorarioAsistencia;
import horario_asistencia.loxasoft.repository.HorarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HorarioService {
	private final HorarioRepository horarioRepository;
	private final RestTemplate restTemplate = new RestTemplate();
	
	public HorarioService(HorarioRepository horarioRepository) {
		this.horarioRepository = horarioRepository;
	}
	
	public HorarioAsistencia saveHorario(HorarioAsistencia asistencia) {
		return horarioRepository.save(asistencia);
	}
	
	public List<HorarioAsistencia> getHorarios(){
		return horarioRepository.findAll();
	}
	
	public ResponseDTO getHorarioById(Integer id) {
		ResponseDTO responseDTO = new ResponseDTO();
		HorarioAsistencia horarioAsistencia = new HorarioAsistencia();
		horarioAsistencia = horarioRepository.findById(id).get();
		
		ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8082/api/departament" + horarioAsistencia.getDepartmentId(),
				DepartamentDTO.class);
		ResponseEntity<EmployeeDTO> responseEntity1 = restTemplate.getForEntity("http://localhost:8081/api/employee" + horarioAsistencia.getEmployyeId(),
				EmployeeDTO.class);
		
		DepartamentDTO departamentDTO = responseEntity.getBody();
		EmployeeDTO employeeDTO = responseEntity1.getBody();
		responseDTO.setAsistencia(horarioAsistencia);
		responseDTO.setDepartamentDTO(departamentDTO);
		responseDTO.setEmployeeDTO(employeeDTO);
		
		return responseDTO;
	}
}
