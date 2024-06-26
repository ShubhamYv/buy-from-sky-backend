package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.ProductException;
import com.ecommerce.modal.Rating;
import com.ecommerce.modal.User;
import com.ecommerce.request.RatingRequest;

public interface RatingServices {
	
	Rating createRating(RatingRequest req,User user) throws ProductException;
	
	List<Rating> getProductsRating(Long productId);

}
