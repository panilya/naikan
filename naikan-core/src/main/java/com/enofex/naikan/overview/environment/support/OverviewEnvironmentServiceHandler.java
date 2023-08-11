package com.enofex.naikan.overview.environment.support;

import com.enofex.naikan.Filterable;
import com.enofex.naikan.overview.OverviewGroup;
import com.enofex.naikan.overview.OverviewTopGroups;
import com.enofex.naikan.overview.environment.OverviewEnvironmentRepository;
import com.enofex.naikan.overview.environment.OverviewEnvironmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class OverviewEnvironmentServiceHandler implements OverviewEnvironmentService {

  private final OverviewEnvironmentRepository overviewEnvironmentRepository;

  OverviewEnvironmentServiceHandler(OverviewEnvironmentRepository overviewEnvironmentRepository) {
    this.overviewEnvironmentRepository = overviewEnvironmentRepository;
  }

  @Override
  public Page<OverviewGroup> findAll(Filterable filterable, Pageable pageable) {
    return overviewEnvironmentRepository.findAll(filterable, pageable);
  }

  @Override
  public OverviewTopGroups findTopEnvironments(long topN) {
    return overviewEnvironmentRepository.findTopEnvironments(topN);
  }

}
