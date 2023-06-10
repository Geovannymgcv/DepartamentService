package horario_asistencia.loxasoft.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horario_asistencia.loxasoft.dto.ResponseDTO;
import horario_asistencia.loxasoft.entity.HorarioAsistencia;
import horario_asistencia.loxasoft.service.HorarioService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/horario")
@AllArgsConstructor
public class HorarioController {
	private final HorarioService horarioService;
	
	public HorarioController(HorarioService horarioService) {
		this.horarioService = horarioService;
	}
		@PostMapping
		public HorarioAsistencia saveHorario(@RequestBody HorarioAsistencia horarioAsistencia) {
			return horarioService.saveHorario(horarioAsistencia);
		}
		@GetMapping("/{id}")
		public ResponseDTO getHorarioById(@PathVariable Integer id) {
			return horarioService.getHorarioById(id);
		}
		@GetMapping
		public List<HorarioAsistencia> getHorarioAll() {
			return horarioService.getHorarios();
		}
}
