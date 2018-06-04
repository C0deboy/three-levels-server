package com.placeholder.threelevels.goals.models;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Level {
    @NotNull(message = "{Level.corrupted}")
    private int level;
    @Size.List({
        @Size(min = 3, message = "{Level.name.min}"),
        @Size(max = 80, message = "{Level.name.max}")
    })
    private String name;
    @Size(max = 80, message = "{Level.reward.max}")
    private String reward;
    @NotNull(message = "{Level.corrupted}")
    private boolean achieved;
}
