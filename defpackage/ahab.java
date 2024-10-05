package defpackage;

import com.google.android.youtube.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahab {
    public static final Comparator a = ahaa.a;
    public static final Comparator b = ahaa.c;
    public static final Comparator c = unt.r;
    public static final Comparator d = unt.s;
    public static final Comparator e = unt.t;
    public static final Comparator f = ahaa.b;
    public static final Map g;
    public static final Map h;
    private static final Map i;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        HashMap hashMap2 = new HashMap();
        i = hashMap2;
        HashMap hashMap3 = new HashMap();
        h = hashMap3;
        hashMap.put(atrx.AUDIO_ONLY, 0);
        hashMap.put(atrx.LD, 144);
        hashMap.put(atrx.LD_240, 240);
        hashMap.put(atrx.SD, 360);
        hashMap.put(atrx.SD_480, 480);
        hashMap.put(atrx.HD, 720);
        hashMap.put(atrx.HD_1080, 1080);
        hashMap.put(atrx.HD_1440, 1440);
        hashMap.put(atrx.HD_2160, 2160);
        hashMap2.put(0, atrx.AUDIO_ONLY);
        hashMap2.put(144, atrx.LD);
        hashMap2.put(240, atrx.LD_240);
        hashMap2.put(360, atrx.SD);
        hashMap2.put(480, atrx.SD_480);
        hashMap2.put(720, atrx.HD);
        hashMap2.put(1080, atrx.HD_1080);
        hashMap2.put(1440, atrx.HD_1440);
        hashMap2.put(2160, atrx.HD_2160);
        hashMap3.put(atrx.AUDIO_ONLY, Integer.valueOf(R.string.offline_video_quality_audio_only));
        hashMap3.put(atrx.LD, Integer.valueOf(R.string.offline_video_quality_144p));
        hashMap3.put(atrx.SD, Integer.valueOf(R.string.offline_video_quality_360p));
        hashMap3.put(atrx.HD, Integer.valueOf(R.string.offline_video_quality_720p));
        hashMap3.put(atrx.HD_1080, Integer.valueOf(R.string.offline_video_quality_1080p));
    }

    public static int a(atrx atrxVar, int i2) {
        Map map = g;
        return map.containsKey(atrxVar) ? ((Integer) map.get(atrxVar)).intValue() : i2;
    }

    public static atrx b(int i2) {
        atrx atrxVar = (atrx) i.get(Integer.valueOf(i2));
        return atrxVar != null ? atrxVar : atrx.UNKNOWN_FORMAT_TYPE;
    }
}
