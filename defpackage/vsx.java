package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsx {
    public VideoMetaData a;
    public boolean b = true;
    public long c = 1000000;
    private long d;

    public final vsy a() {
        amkq.E(this.a != null);
        return new vsy(this.a, this.c, this.d, this.b);
    }

    public final void b(long j) {
        this.d = Math.max(0L, j);
    }
}
