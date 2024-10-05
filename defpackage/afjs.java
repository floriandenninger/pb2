package defpackage;

import android.media.MediaCodecInfo;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afjs {
    public final Object a(String str, boolean z, Set set, Set set2, int i) {
        boolean equalsIgnoreCase = "video/avc".equalsIgnoreCase(str);
        char c = true != equalsIgnoreCase ? (char) 0 : '@';
        if (true == equalsIgnoreCase) {
            i = 2;
        }
        for (Object obj : c(str, z)) {
            String b = b(obj);
            if (!set.contains(b) && !set2.contains(b)) {
                if (i <= 0) {
                    return obj;
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : d(obj)) {
                    if (codecProfileLevel.profile == i && (c <= 0 || codecProfileLevel.level >= 64)) {
                        return obj;
                    }
                }
            }
        }
        return null;
    }

    protected abstract String b(Object obj);

    protected abstract List c(String str, boolean z);

    protected abstract MediaCodecInfo.CodecProfileLevel[] d(Object obj);
}
