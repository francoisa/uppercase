package net.jmf.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class UppercaseTest  {

	@Test
    public void stringInArrayIsUppercase() {
		String[] input = {"a", "few", "words"};
        Uppercase u = new Uppercase(input);
        String[] expectedOutput = {"A", "FEW", "WORDS"};
        for (int i = 0; i < expectedOutput.length; ++i) {
        	assertThat(u.get(i), is(equalTo(expectedOutput[i])));
        }
    }
}
