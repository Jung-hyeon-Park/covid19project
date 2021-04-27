package com.parkjh.covid19project.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HomeDtoTest {

    @Test
    public void lombokTest() {

        String name = "test";
        int amount = 100;

        HomeDto homeDto = new HomeDto(name, amount);

        assertThat(homeDto.getName()).isEqualTo(name);
        assertThat(homeDto.getAmount()).isEqualTo(amount);
    }
}
