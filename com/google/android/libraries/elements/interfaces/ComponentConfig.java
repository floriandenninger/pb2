package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ComponentConfig {
    final int materializationBloatMs;
    final boolean useEkoCanaryChannel;

    public ComponentConfig(boolean z, int i) {
        this.useEkoCanaryChannel = z;
        this.materializationBloatMs = i;
    }

    public int getMaterializationBloatMs() {
        return this.materializationBloatMs;
    }

    public boolean getUseEkoCanaryChannel() {
        return this.useEkoCanaryChannel;
    }

    public String toString() {
        boolean z = this.useEkoCanaryChannel;
        int i = this.materializationBloatMs;
        StringBuilder sb = new StringBuilder(77);
        sb.append("ComponentConfig{useEkoCanaryChannel=");
        sb.append(z);
        sb.append(",materializationBloatMs=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
