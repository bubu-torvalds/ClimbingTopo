package mb.app.climbingTopo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import mb.app.climbingTopo.dto.GradeDto;
import mb.app.climbingTopo.entity.Grade;

/**
 * 
 * @author Maxime
 *
 */
@Mapper
public interface GradeMapper {

	public GradeDto mapGradeToDto(Grade grade);
	
	public List<GradeDto> mapGradeListToDto(List<Grade> gradeList);
	
}
