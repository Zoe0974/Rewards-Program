package com.example.RewardsProgram.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Transient;

public abstract class Reward {
    // including Jackson serialization
    @JsonInclude
    // marking a field as not persistable
    @Transient
    protected Long points;

    public abstract Long getPoints();
}
