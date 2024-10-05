package org.webrtc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoCodecInfo {
    public final String a;
    public final Map b;

    public VideoCodecInfo(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoCodecInfo)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
        return this.a.equalsIgnoreCase(videoCodecInfo.a) && this.b.equals(videoCodecInfo.b);
    }

    public String getName() {
        return this.a;
    }

    Map getParams() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.toUpperCase(Locale.ROOT), this.b});
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length());
        sb.append("VideoCodec{");
        sb.append(str);
        sb.append(" ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
