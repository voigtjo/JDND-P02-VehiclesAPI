//package com.udacity.pricing.service;
//
//import com.udacity.pricing.domain.price.Price;
//import com.udacity.pricing.domain.price.PriceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//
///**
// * Implements the pricing service to get prices for each vehicle.
// */
//@Service
//public class PricingService {
//    @Autowired
//    PriceRepository priceRepository;
//
//    /**
//     * If a valid vehicle ID, gets the price of the vehicle from the stored array.
//     * @param vehicleId ID number of the vehicle the price is requested for.
//     * @return price of the requested vehicle
//     * @throws PriceException vehicleID was not found
//     */
//    public Price getPrice(Long vehicleId) throws PriceException {
//        Optional<Price> optionalPrice = priceRepository.findById(vehicleId);
//
//        Price price = optionalPrice.orElseThrow(PriceNotFoundException::new);
//        return price;
//    }
//
//
//
//}
