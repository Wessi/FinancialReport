package net.mofed.reportracking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.mofed.reportracking.app.model.Penalty;


@Repository
public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {

}
