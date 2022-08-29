package fsynth.program.db.statistics;

import fsynth.program.Algorithm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation annotates a statistic class that should be instantiated for each algorithm.
 * The constructor MUST be a single-element constructor that takes a {@link Algorithm} as argument
 *
 * @author anonymous
 * @since 2020-05-26
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ForEachAlgorithmStatistics {
}
