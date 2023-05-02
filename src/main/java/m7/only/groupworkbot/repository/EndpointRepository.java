package m7.only.groupworkbot.repository;

import m7.only.groupworkbot.entity.Endpoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Репозиторий сущности {@linkplain Endpoint Endpoint}
 */
public interface EndpointRepository extends JpaRepository<Endpoint, Long> {
    Optional<Endpoint> findByEndpointText(String endpointText);
}
