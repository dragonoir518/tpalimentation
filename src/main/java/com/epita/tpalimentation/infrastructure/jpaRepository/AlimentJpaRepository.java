package com.epita.tpalimentation.infrastructure.jpaRepository;

import com.epita.tpalimentation.domaine.entity.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AlimentJpaRepository extends JpaRepository<Aliment,String> {

    @Query(nativeQuery = true, value =
            "select * from aliment a where a.composition_autres_composition_autres_code = " +
                    "                           (select composition_autres_code\n" +
                    "                            from public.composition_autres \n" +
                    "                            where calcium = (select max(calcium)\n" +
                    "                            from public.composition_autres))"
          )
    Aliment findByWhatever();
}
