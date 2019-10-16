package com.company.base.accenture.bullsncows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueRandom {
    public String getRandom(int count) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
            Collections.shuffle(numbers);

        String result = "";

        for (int i = 0; i < count; i++) {
            result += numbers.get(i).toString();
        }
        return result;
    }
}
