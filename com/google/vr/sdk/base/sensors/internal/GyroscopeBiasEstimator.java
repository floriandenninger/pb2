package com.google.vr.sdk.base.sensors.internal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GyroscopeBiasEstimator {
    private LowPassFilter accelLowPass;
    private LowPassFilter gyroBiasLowPass;
    private LowPassFilter gyroLowPass;
    private IsStaticCounter isAccelStatic;
    private IsStaticCounter isGyroStatic;
    private Vector3d smoothedAccelDiff;
    private Vector3d smoothedGyroDiff;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class IsStaticCounter {
        private int consecutiveIsStatic;
        private final int minStaticFrames = 10;

        public IsStaticCounter(int i) {
        }

        public void appendFrame(boolean z) {
            this.consecutiveIsStatic = !z ? 0 : this.consecutiveIsStatic + 1;
        }

        public boolean isRecentlyStatic() {
            return this.consecutiveIsStatic >= this.minStaticFrames;
        }
    }

    public GyroscopeBiasEstimator() {
        reset();
    }

    private void updateGyroBias(Vector3d vector3d, long j) {
        if (vector3d.length() >= 0.3499999940395355d) {
            return;
        }
        double max = Math.max(0.0d, 1.0d - (vector3d.length() / 0.3499999940395355d));
        this.gyroBiasLowPass.addWeightedSample(this.gyroLowPass.getFilteredData(), j, max * max);
    }

    public void getGyroBias(Vector3d vector3d) {
        if (this.gyroBiasLowPass.getNumSamples() < 30) {
            vector3d.setZero();
            return;
        }
        vector3d.set(this.gyroBiasLowPass.getFilteredData());
        double numSamples = this.gyroBiasLowPass.getNumSamples() - 30;
        Double.isNaN(numSamples);
        vector3d.scale(Math.min(1.0d, numSamples / 100.0d));
    }

    public void processAccelerometer(Vector3d vector3d, long j) {
        this.accelLowPass.addSample(vector3d, j);
        Vector3d.sub(vector3d, this.accelLowPass.getFilteredData(), this.smoothedAccelDiff);
        this.isAccelStatic.appendFrame(this.smoothedAccelDiff.length() < 0.5d);
    }

    public void processGyroscope(Vector3d vector3d, long j) {
        this.gyroLowPass.addSample(vector3d, j);
        Vector3d.sub(vector3d, this.gyroLowPass.getFilteredData(), this.smoothedGyroDiff);
        this.isGyroStatic.appendFrame(this.smoothedGyroDiff.length() < 0.00800000037997961d);
        if (this.isGyroStatic.isRecentlyStatic() && this.isAccelStatic.isRecentlyStatic()) {
            updateGyroBias(vector3d, j);
        }
    }

    public void reset() {
        this.smoothedGyroDiff = new Vector3d();
        this.smoothedAccelDiff = new Vector3d();
        this.accelLowPass = new LowPassFilter(1.0d);
        this.gyroLowPass = new LowPassFilter(10.0d);
        this.gyroBiasLowPass = new LowPassFilter(0.15000000596046448d);
        this.isAccelStatic = new IsStaticCounter(10);
        this.isGyroStatic = new IsStaticCounter(10);
    }
}
