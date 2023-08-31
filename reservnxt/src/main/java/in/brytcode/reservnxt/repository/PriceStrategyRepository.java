package in.brytcode.reservnxt.repository;

import in.brytcode.reservnxt.entity.PriceStrategy;
import in.brytcode.reservnxt.entity.StrategyKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceStrategyRepository extends JpaRepository<PriceStrategy, StrategyKey> {
}
