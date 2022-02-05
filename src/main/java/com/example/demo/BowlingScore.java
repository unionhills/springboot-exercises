package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BowlingScore {
	private int length;
	private BowlingFrameScore[] frameScores;
	private int finalScore;

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public BowlingFrameScore[] getFrameScores() {
		return frameScores;
	}
	public void setFrameScores(BowlingFrameScore[] frameScores) {
		this.frameScores = frameScores;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
}
