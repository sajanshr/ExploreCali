package com.example.ec.ExploreCali.repo;

import com.example.ec.ExploreCali.Domain.TourRating;
import com.example.ec.ExploreCali.Domain.TourRatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {
    /**
     * Lookup all the TourRatings for a tour.
     *
     * @param tourId is the tour Identifier
     * @return a List of any found TourRatings
     */


    List<TourRating> findByPkTourId(Integer tourId);

    /**
     * Lookup a TourRating by the TourId and Customer Id
     * @param tourId tour identifier
     * @param customerId customer identifier
     * @return Optional of found TourRatings.
     */

    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);


    /**
     * Fetch a Page of TourRatings
     *
     * @param tourId the tour identifier
     * @param pageable info to determine page
     * @return Page of Tour Ratings
     */


    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);



}
