package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ozz extends ozk {
    public final long g;
    public final long h;
    public final int i;
    public final boolean j;
    public pbx k;
    public int l;

    public ozz(pfq pfqVar, pfs pfsVar, int i, ozv ozvVar, long j, long j2, int i2, boolean z, int i3) {
        super(pfqVar, pfsVar, 1, i, ozvVar, i3);
        opn.h(ozvVar);
        this.g = j;
        this.h = j2;
        this.i = i2;
        this.j = z;
    }

    public abstract MediaFormat e();

    public abstract pbg h();

    public int m() {
        return this.i + 1;
    }
}
