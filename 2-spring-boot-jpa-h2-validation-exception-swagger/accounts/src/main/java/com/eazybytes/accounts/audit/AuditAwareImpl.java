package com.eazybytes.accounts.audit;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware {

  /**
   * Returns the current auditor of the application.
   *
   * @return the current auditor.
   */
  @Override
  public Optional getCurrentAuditor() {
    return Optional.of("ACCOUNT_MS");
  }
}
