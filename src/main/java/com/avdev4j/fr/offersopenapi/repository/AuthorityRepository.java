package com.avdev4j.fr.offersopenapi.repository;

import com.avdev4j.fr.offersopenapi.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
