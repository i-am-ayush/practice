package com.learn.spring.service;

import com.learn.spring.model.Circle;
import com.learn.spring.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}

	public ShapeService setCircle(Circle circle) {
		this.circle = circle;
		return this;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public ShapeService setTriangle(Triangle triangle) {
		this.triangle = triangle;
		return this;
	}
}
