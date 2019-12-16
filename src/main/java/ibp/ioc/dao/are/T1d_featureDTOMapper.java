package ibp.ioc.dao.are;

import ibp.dto.are.T1d_featureDTO;
import java.util.List;

public interface T1d_featureDTOMapper {
    int insert(T1d_featureDTO record);

    List<T1d_featureDTO> selectAll();
}