package javaAvanzado;

import java.util.Optional;

public class ClaseOptional {

	public static void main(String[] args) {
		// Optional
		Optional<Double> result = averageScores();

	}
	public static Optional<Double> averageScores(Double ...scores){
		if(scores.length==0) {
			return Optional.empty();
		}
		double sum=0;
		for(Double score : scores) sum+=score;
		return Optional.of(sum/scores.length);
	}

}
