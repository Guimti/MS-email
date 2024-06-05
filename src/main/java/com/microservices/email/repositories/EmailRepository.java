package com.microservices.email.repositories;

import com.microservices.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository  extends JpaRepository<EmailModel, Long> {


}
