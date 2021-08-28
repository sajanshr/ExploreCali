package com.example.ec.ExploreCali.services;


import com.example.ec.ExploreCali.Domain.TourPackage;
import com.example.ec.ExploreCali.repo.TourPackageRepository;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name){
        return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    public Iterable<TourPackage> lookup(){return tourPackageRepository.findAll();}

    public long total(){
        return tourPackageRepository.count();
    }




}
