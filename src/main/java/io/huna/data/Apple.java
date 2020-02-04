package io.huna.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Apple {
    private final Color color;
    private final Integer weight;
}
