package com.devhb.organizationservice.service.impl;

import com.devhb.organizationservice.dto.OrganizationDto;
import com.devhb.organizationservice.entity.Organization;
import com.devhb.organizationservice.mapper.OrganizationMapper;
import com.devhb.organizationservice.repository.OrganizationRepository;
import com.devhb.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        //Convert OrganizationDto into Organization Jpa Entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization =organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization =organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
