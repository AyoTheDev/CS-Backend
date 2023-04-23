package com.scienta.cs.tracker.repository;

import com.scienta.cs.tracker.model.entity.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TrackerRepository extends JpaRepository<Tracker, String> {

    @Query("select t from Tracker t where t.trackingCode=:code")
    Optional<Tracker> getByTrackingCode(@Param("code") String code);

}
