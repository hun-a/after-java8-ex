package io.huna.data;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@RequiredArgsConstructor
public class Apple {
    private final Color color;
    private final Integer weight;
}
