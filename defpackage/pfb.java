package defpackage;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfb implements pbz, pcm {
    private pca a;
    private pcn b;
    private pfc c;
    private int d;
    private int e;

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.a = pcaVar;
        this.b = pcaVar.pH(0);
        this.c = null;
        pcaVar.pJ();
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        pfc pfcVar = this.c;
        int i = pfcVar.c;
        long j2 = pfcVar.d;
        return ((((j * i) / 1000000) / j2) * j2) + pfcVar.g;
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pbz
    public final void d() {
        this.e = 0;
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        return opn.n(pbwVar) != null;
    }

    @Override // defpackage.pbz
    public final int f(pbw pbwVar, tfq tfqVar) {
        pfc pfcVar = this.c;
        if (pfcVar == null) {
            pfcVar = opn.n(pbwVar);
            this.c = pfcVar;
            if (pfcVar != null) {
                this.d = pfcVar.d;
            } else {
                throw new oyo("Error initializing WavHeader. Did you sniff first?");
            }
        }
        if (pfcVar.g == 0 || pfcVar.h == 0) {
            opn.h(pfcVar);
            pbwVar.i();
            pgx pgxVar = new pgx(8);
            aeqp d = aeqp.d(pbwVar, pgxVar);
            while (d.b != pgz.c("data")) {
                int i = d.b;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Ignoring unknown WAV chunk: ");
                sb.append(i);
                Log.w("WavHeaderReader", sb.toString());
                long j = d.a + 8;
                if (d.b == pgz.c("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    pbwVar.j((int) j);
                    d = aeqp.d(pbwVar, pgxVar);
                } else {
                    int i2 = d.b;
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(i2);
                    throw new oyo(sb2.toString());
                }
            }
            pbwVar.j(8);
            long j2 = pbwVar.c;
            long j3 = d.a;
            pfcVar.g = j2;
            pfcVar.h = j3;
            pcn pcnVar = this.b;
            pfc pfcVar2 = this.c;
            int i3 = pfcVar2.b;
            int i4 = pfcVar2.e;
            int i5 = pfcVar2.a;
            pcnVar.d(MediaFormat.c(null, "audio/raw", i4 * i3 * i5, 32768, ((pfcVar2.h / pfcVar2.d) * 1000000) / i3, i5, i3, null, null, pfcVar2.f));
            this.a.pK(this);
        }
        int j4 = this.b.j(pbwVar, 32768 - this.e, true);
        if (j4 != -1) {
            this.e += j4;
        }
        int i6 = this.e;
        int i7 = this.d;
        int i8 = (i6 / i7) * i7;
        if (i8 > 0) {
            long j5 = pbwVar.c;
            int i9 = i6 - i8;
            this.e = i9;
            this.b.g(((j5 - i6) * 1000000) / this.c.c, 1, i8, i9, null);
        }
        return j4 == -1 ? -1 : 0;
    }
}
