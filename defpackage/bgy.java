package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgy {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            prh.j("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static bio b(pth pthVar) {
        pthVar.H(1);
        int k = pthVar.k();
        long j = pthVar.b + k;
        int i = k / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long o = pthVar.o();
            if (o != -1) {
                jArr[i2] = o;
                jArr2[i2] = pthVar.o();
                pthVar.H(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        pthVar.H((int) (j - pthVar.b));
        return new bio(jArr, jArr2);
    }

    public static Metadata c(bii biiVar, boolean z) {
        Metadata a = new bit().a(biiVar, z ? null : ppj.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }
}
