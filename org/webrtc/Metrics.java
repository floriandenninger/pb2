package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Metrics {
    public final Map a = new HashMap();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class HistogramInfo {
        public final Map a = new HashMap();

        public HistogramInfo(int i, int i2, int i3) {
        }

        public void addSample(int i, int i2) {
            this.a.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    Metrics() {
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.a.put(str, histogramInfo);
    }

    public static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}
