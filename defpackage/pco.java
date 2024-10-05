package defpackage;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pco extends pcs {
    private boolean c;
    private boolean d;

    public pco(pcn pcnVar) {
        super(pcnVar);
    }

    @Override // defpackage.pcs
    protected final void a(pgx pgxVar, long j) {
        int h = pgxVar.h();
        if (h != 0) {
            if (h == 1) {
                int a = pgxVar.a();
                this.a.f(pgxVar, a);
                this.a.g(j, 1, a, 0, null);
                return;
            }
            return;
        }
        if (this.d) {
            return;
        }
        int a2 = pgxVar.a();
        byte[] bArr = new byte[a2];
        pgxVar.u(bArr, 0, a2);
        Pair a3 = pgj.a(bArr);
        this.a.d(MediaFormat.b(null, "audio/mp4a-latm", -1, -1, this.b, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), Collections.singletonList(bArr), null));
        this.d = true;
    }

    @Override // defpackage.pcs
    protected final boolean b(pgx pgxVar) {
        if (this.c) {
            pgxVar.A(1);
        } else {
            int h = pgxVar.h() >> 4;
            if (h == 10) {
                this.c = true;
            } else {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(h);
                throw new pcr(sb.toString());
            }
        }
        return true;
    }
}
