package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.video.media.VideoMetaData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyi implements vca {
    public Context c;
    public boolean d;
    public vyg f;
    public vuq g;
    public boolean h;
    final vut a = vut.a;
    final vum b = vum.a;
    public boolean e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] f(VideoMetaData videoMetaData, int i) {
        long j;
        int i2;
        int i3;
        int i4 = 1;
        amkq.E(true);
        long j2 = videoMetaData.g / i;
        int[] iArr = new int[i];
        int i5 = 0;
        while (i5 < i) {
            long j3 = i5 * j2;
            long j4 = j3 + j2;
            long max = (((float) j2) * (i5 / Math.max(i4, i - 1))) + j3;
            vcp.b(j3 <= j4);
            int c = videoMetaData.c(j3);
            int e = videoMetaData.e(j4 - 1);
            if (c == -1 || e == -1 || c > e) {
                j = j2;
                i2 = i5;
                i3 = -1;
            } else {
                j = j2;
                i2 = i5;
                long max2 = Math.max(Math.min(max, videoMetaData.l(e)), videoMetaData.l(c));
                i3 = videoMetaData.c(max2);
                vcp.d(i3 != -1 && i3 <= e);
                int e2 = videoMetaData.e(max2);
                vcp.d(e2 != -1 && e2 >= c);
                long[] jArr = videoMetaData.i;
                if (jArr[i3] - max > max - jArr[e2]) {
                    i3 = e2;
                }
            }
            if (i3 != -1) {
                iArr[i2] = i3;
            } else {
                iArr[i2] = videoMetaData.g(j3);
            }
            i5 = i2 + 1;
            j2 = j;
            i4 = 1;
        }
        return iArr;
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getBoolean("extractor_is_enabled");
        }
    }

    public final void b() {
        vyg vygVar = this.f;
        if (vygVar != null) {
            vygVar.f();
        }
    }

    public final void c() {
        vyg vygVar = this.f;
        if (vygVar != null) {
            vygVar.g();
        }
        this.d = false;
    }

    public final void d() {
        this.d = true;
        vyg vygVar = this.f;
        if (vygVar != null) {
            vygVar.e();
        }
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("extractor_is_enabled", this.e);
    }
}
