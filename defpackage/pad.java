package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pad {
    public final MediaFormat a;
    public final int b;
    public final int c;
    public final int d;
    public final ozv e;
    public final ozv[] f;

    public pad(MediaFormat mediaFormat, int i, ozv ozvVar) {
        this.a = mediaFormat;
        this.d = i;
        this.e = ozvVar;
        this.f = null;
        this.b = -1;
        this.c = -1;
    }

    public pad(MediaFormat mediaFormat, int i, ozv[] ozvVarArr, int i2, int i3) {
        this.a = mediaFormat;
        this.d = i;
        this.f = ozvVarArr;
        this.b = i2;
        this.c = i3;
        this.e = null;
    }

    public final boolean a() {
        return this.f != null;
    }
}
