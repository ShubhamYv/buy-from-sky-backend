package com.ecommerce.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.exception.ProductException;
import com.ecommerce.modal.Product;
import com.ecommerce.modal.Rating;
import com.ecommerce.modal.User;
import com.ecommerce.repository.RatingRepository;
import com.ecommerce.request.RatingRequest;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.RatingServices;

@Service
public class RatingServiceImplementation implements RatingServices {

	private RatingRepository ratingRepository;
	private ProductService productService;

	public RatingServiceImplementation(RatingRepository ratingRepository, ProductService productService) {
		this.ratingRepository = ratingRepository;
		this.productService = productService;
	}

	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {

		Product product = productService.findProductById(req.getProductId());

		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());

		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		return ratingRepository.getAllProductsRating(productId);
	}

}
