package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hhr implements bgw {
    final /* synthetic */ vsy a;
    final /* synthetic */ zpi b;

    public hhr(vsy vsyVar, zpi zpiVar) {
        this.a = vsyVar;
        this.b = zpiVar;
    }

    @Override // defpackage.bgw
    public final void a(long j, long j2, pms pmsVar, MediaFormat mediaFormat) {
        vsy vsyVar = this.a;
        if (vsyVar != null) {
            j -= vsyVar.n();
        }
        this.b.a.e(j2, Long.valueOf(j));
    }
}
