package com.natural.service;

import com.natural.pojo.ContractOutage;
import com.natural.repository.ContractOutageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractOutageServiceImpl implements ContractOutageService {
    @Autowired
    private ContractOutageRepository contractOutageRepository;
    @Override
    public ContractOutage createContractOutage(ContractOutage contractOutage) {
        return contractOutageRepository.save(contractOutage);
    }
}