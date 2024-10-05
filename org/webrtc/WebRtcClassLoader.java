package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
class WebRtcClassLoader {
    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new RuntimeException("Failed to get WebRTC class loader.");
    }
}
