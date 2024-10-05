package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfy {
    public boolean a;
    public boolean b = false;
    public akfw c;

    public static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (amkq.e(str2, str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public static String b(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? "" : "audio/flac" : "audio/amr-wb";
    }

    public static int c(int i) {
        switch (i - 1) {
            case 1:
                return 3;
            case 6600:
            case 8850:
            case 12650:
            case 14250:
            case 15850:
            case 18250:
            case 19850:
            case 23050:
            case 23850:
                return 2;
            case 12000:
            case 16000:
                return 4;
            default:
                return 1;
        }
    }
}
