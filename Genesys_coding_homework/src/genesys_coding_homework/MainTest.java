package genesys_coding_homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void combTest(){
        combinationGenerator combgen = new combinationGenerator();
        String[] letterTable = {"0", "1", "abc", "def", "ghi", "jkl", "mno",  "pqrs", "tuv", "wxyz"};
        combgen.combinationGenerating("23", letterTable);
        combgen.combinationGenerating("543", letterTable);
        combgen.combinationGenerating("34", letterTable);
        combgen.combinationGenerating("7564", letterTable);
        combgen.combinationGenerating("23456789", letterTable); //it works, because if I call the method like this, it skips the inputNumbers method


    }


}