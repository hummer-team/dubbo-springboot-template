package com.dubbo.template.service.facade;

import com.dubbo.template.dao.SimpleDemoDao;
import com.dubbo.template.facade.SimpleDemoFacade;
import com.dubbo.template.facade.dto.request.SimpleDemoSaveReqDto;
import com.hummer.dao.annotation.TargetDataSourceTM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SimpleDemoFacadeImpl implements SimpleDemoFacade {

    @Autowired(required = false)
    private SimpleDemoDao simpleDemoDao;

    @Override
    @TargetDataSourceTM(dbName = "delivery_w"
            , transactionManager = "delivery_w_TM"
            , rollbackFor = Exception.class)
    public void save(SimpleDemoSaveReqDto batchDto) {
        log.debug("this is demo request , info {}", batchDto);
        //ignore
    }

    @Override
    public SimpleDemoSaveReqDto querySingleById(String id) {
        SimpleDemoSaveReqDto dto = new SimpleDemoSaveReqDto();
        dto.setBuyerId("hello word");
        dto.setCreatedUserId(id);
        dto.setThirdPartyDeliveryId("hell word#1");
        dto.setDeliveryType(566);
        return dto;
    }
}