package com.opemr.endocrine_opassess.repository;

import com.opemr.endocrine_opassess.entity.Endocrinedet;
import com.opemr.endocrine_opassess.entity.PKkey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpassessmentRepository extends JpaRepository<Endocrinedet, PKkey> {

}
