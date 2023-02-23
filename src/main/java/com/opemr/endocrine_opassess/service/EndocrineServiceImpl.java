package com.opemr.endocrine_opassess.service;

import com.opemr.endocrine_opassess.entity.Endocrinedet;
import com.opemr.endocrine_opassess.entity.PKkey;
import com.opemr.endocrine_opassess.repository.OpassessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EndocrineServiceImpl implements EndocrineService {

    @Autowired
    OpassessmentRepository opassessmentRepository;

    @Override
    public Endocrinedet createDet(Endocrinedet endocrinedet) {
        return opassessmentRepository.save(endocrinedet);
    }

    @Override
    public Endocrinedet getDet(PKkey pKkey) {
        return opassessmentRepository.getById(pKkey);
    }

    @Override
    public Endocrinedet updateDet(Endocrinedet endocrinedet) {
        return null;
    }

}
