package com.aptkode.time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeekTest {

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = { "TUESDAY", "THURSDAY"}, mode = EnumSource.Mode.MATCH_ANY)
    void dayOfWeekShortFormatTest(DayOfWeek day){
        assertEquals("T", day.getDisplayName(TextStyle.NARROW, Locale.getDefault()));
    }

}
