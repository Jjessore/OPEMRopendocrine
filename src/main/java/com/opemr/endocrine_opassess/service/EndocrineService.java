package com.opemr.endocrine_opassess.service;

import com.opemr.endocrine_opassess.entity.Endocrinedet;
import com.opemr.endocrine_opassess.entity.PKkey;
import org.springframework.stereotype.Component;

@Component
public interface EndocrineService {
    Endocrinedet createDet(Endocrinedet endocrinedet);
    Endocrinedet getDet(PKkey pKkey);
    Endocrinedet updateDet(Endocrinedet endocrinedet);
}