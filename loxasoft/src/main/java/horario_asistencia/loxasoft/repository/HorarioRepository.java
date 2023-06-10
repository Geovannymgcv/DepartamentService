package horario_asistencia.loxasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import horario_asistencia.loxasoft.entity.HorarioAsistencia;

public interface HorarioRepository extends JpaRepository<HorarioAsistencia, Integer>{

}
