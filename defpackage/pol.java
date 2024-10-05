package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pol implements bgw, poc {
    private bgw a;

    @Override // defpackage.bgw
    public final void a(long j, long j2, pms pmsVar, MediaFormat mediaFormat) {
        bgw bgwVar = this.a;
        if (bgwVar != null) {
            bgwVar.a(j, j2, pmsVar, mediaFormat);
        }
    }

    @Override // defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 7) {
            this.a = (bgw) obj;
        } else {
            if (i != 8) {
                if (i == 10000 && ((bhp) obj) != null) {
                    throw null;
                }
                return;
            }
        }
    }
}
