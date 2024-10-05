package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pct extends pcs {
    private final pgx c;
    private final pgx d;
    private int e;
    private boolean f;
    private int g;

    public pct(pcn pcnVar) {
        super(pcnVar);
        this.c = new pgx(pgv.a);
        this.d = new pgx(4);
    }

    @Override // defpackage.pcs
    protected final void a(pgx pgxVar, long j) {
        int i;
        int i2;
        float f;
        int h = pgxVar.h();
        long i3 = j + (pgxVar.i() * 1000);
        if (h != 0) {
            if (h == 1) {
                byte[] bArr = this.d.a;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int i4 = 4 - this.e;
                int i5 = 0;
                while (pgxVar.a() > 0) {
                    pgxVar.u(this.d.a, i4, this.e);
                    this.d.z(0);
                    int j2 = this.d.j();
                    this.c.z(0);
                    this.a.f(this.c, 4);
                    this.a.f(pgxVar, j2);
                    i5 = i5 + 4 + j2;
                }
                this.a.g(i3, this.g == 1 ? 1 : 0, i5, 0, null);
                return;
            }
            return;
        }
        if (this.f) {
            return;
        }
        pgx pgxVar2 = new pgx(new byte[pgxVar.a()]);
        pgxVar.u(pgxVar2.a, 0, pgxVar.a());
        pgxVar2.z(4);
        int h2 = (pgxVar2.h() & 3) + 1;
        opn.k(h2 != 3);
        ArrayList arrayList = new ArrayList();
        int h3 = pgxVar2.h() & 31;
        for (int i6 = 0; i6 < h3; i6++) {
            arrayList.add(pgv.e(pgxVar2));
        }
        int h4 = pgxVar2.h();
        for (int i7 = 0; i7 < h4; i7++) {
            arrayList.add(pgv.e(pgxVar2));
        }
        if (h3 > 0) {
            pgw pgwVar = new pgw((byte[]) arrayList.get(0));
            pgwVar.d((h2 + 1) * 8);
            pgu c = pgv.c(pgwVar);
            int i8 = c.b;
            int i9 = c.c;
            f = c.d;
            i = i8;
            i2 = i9;
        } else {
            i = -1;
            i2 = -1;
            f = 1.0f;
        }
        this.e = h2;
        this.a.d(MediaFormat.k("video/avc", this.b, i, i2, arrayList, f));
        this.f = true;
    }

    @Override // defpackage.pcs
    protected final boolean b(pgx pgxVar) {
        int h = pgxVar.h();
        int i = h >> 4;
        int i2 = h & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new pcr(sb.toString());
    }
}
