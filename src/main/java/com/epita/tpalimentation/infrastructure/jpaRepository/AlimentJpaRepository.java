package com.epita.tpalimentation.infrastructure.jpaRepository;

import com.epita.tpalimentation.domaine.entity.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AlimentJpaRepository extends JpaRepository<Aliment,String> {

    @Query(nativeQuery = true, value =
            "select * from aliment a where a.composition_autres_composition_autres_code = " +
                    "                           (select max(composition_autres_code) from composition_autres)"
          )
    Aliment findByWhatever();
}
