package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pev {
    private final pcn a;

    public pev(pcn pcnVar) {
        this.a = pcnVar;
        pcnVar.d(MediaFormat.e(null, "application/eia-608", -1, -1L, null));
    }

    public final void a(long j, pgx pgxVar) {
        int h;
        int i;
        while (pgxVar.a() > 1) {
            int i2 = 0;
            int i3 = 0;
            do {
                h = pgxVar.h();
                i3 += h;
            } while (h == 255);
            while (true) {
                int h2 = pgxVar.h();
                i = i2 + h2;
                if (h2 != 255) {
                    break;
                } else {
                    i2 = i;
                }
            }
            if (i3 == 4 && i >= 8) {
                int i4 = pgxVar.b;
                int h3 = pgxVar.h();
                int k = pgxVar.k();
                int c = pgxVar.c();
                int h4 = pgxVar.h();
                pgxVar.z(i4);
                if (h3 == 181 && k == 49 && c == 1195456820 && h4 == 3) {
                    this.a.f(pgxVar, i);
                    this.a.g(j, 1, i, 0, null);
                }
            }
            pgxVar.A(i);
        }
    }
}
