package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pby implements pcn {
    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        pgxVar.A(i);
    }

    @Override // defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        int c = pbwVar.c(i);
        if (c == 0) {
            c = pbwVar.b(pbwVar.a, 0, Math.min(i, 4096), 0, true);
        }
        pbwVar.f(c);
        return c;
    }
}
