package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
class H264Utils {
    static {
        new VideoCodecInfo("H264", a(false));
        new VideoCodecInfo("H264", a(true));
    }

    H264Utils() {
    }

    public static Map a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        hashMap.put("profile-level-id", true != z ? "42e01f" : "640c1f");
        return hashMap;
    }

    private static native boolean nativeIsSameH264Profile(Map map, Map map2);
}
