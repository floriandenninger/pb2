package com.google.vr.ndk.base;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DaydreamCompatibility {
    private final int supportedHeadsets;

    public DaydreamCompatibility() {
        this(0);
    }

    public DaydreamCompatibility(int i) {
        this.supportedHeadsets = i;
    }

    private boolean supportsCardboard() {
        return (this.supportedHeadsets & 2) != 0;
    }

    public int getSupportedHeadsets() {
        return this.supportedHeadsets;
    }

    public boolean requiresDaydream() {
        return supportsDaydream() && !supportsCardboard();
    }

    public boolean supportsDaydream() {
        return (this.supportedHeadsets & 5) != 0;
    }

    public int toDeprecated() {
        if (requiresDaydream()) {
            return 3;
        }
        return supportsDaydream() ? 2 : 1;
    }
}
