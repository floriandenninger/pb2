package com.google.vr.sdk.base.sensors.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LowPassFilter {
    private static final double NANOS_TO_SECONDS;
    private long lastTimestampNs;
    private int numSamples;
    private final double timeConstantSecs;
    private final Vector3d filteredData = new Vector3d();
    private final Vector3d temp = new Vector3d();

    static {
        double convert = TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS);
        Double.isNaN(convert);
        NANOS_TO_SECONDS = 1.0d / convert;
    }

    public LowPassFilter(double d) {
        this.timeConstantSecs = 1.0d / (d * 6.283185307179586d);
    }

    public void addSample(Vector3d vector3d, long j) {
        addWeightedSample(vector3d, j, 1.0d);
    }

    public void addWeightedSample(Vector3d vector3d, long j, double d) {
        int i = this.numSamples + 1;
        this.numSamples = i;
        if (i == 1) {
            this.filteredData.set(vector3d);
            this.lastTimestampNs = j;
            return;
        }
        double d2 = j - this.lastTimestampNs;
        Double.isNaN(d2);
        double d3 = d * d2 * NANOS_TO_SECONDS;
        double d4 = d3 / (this.timeConstantSecs + d3);
        this.filteredData.scale(1.0d - d4);
        this.temp.set(vector3d);
        this.temp.scale(d4);
        Vector3d vector3d2 = this.temp;
        Vector3d vector3d3 = this.filteredData;
        Vector3d.add(vector3d2, vector3d3, vector3d3);
        this.lastTimestampNs = j;
    }

    public Vector3d getFilteredData() {
        return this.filteredData;
    }

    public int getNumSamples() {
        return this.numSamples;
    }
}
