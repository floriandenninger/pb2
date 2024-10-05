package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ozm implements pca, pcn {
    private final pbz a;
    private boolean b;
    private ozl c;
    private boolean d;
    private int e;

    public ozm(pbz pbzVar) {
        this.a = pbzVar;
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        this.c.d(mediaFormat);
    }

    public final void e(ozl ozlVar) {
        this.c = ozlVar;
        if (this.b) {
            this.a.d();
        } else {
            this.a.a(this);
            this.b = true;
        }
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        this.c.f(pgxVar, i);
    }

    public void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.c.g(j, i, i2, i3, bArr);
    }

    public final int i(pbw pbwVar) {
        int f = this.a.f(pbwVar, null);
        opn.k(f != 1);
        return f;
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        return this.c.j(pbwVar, i, z);
    }

    @Override // defpackage.pca
    public final pcn pH(int i) {
        opn.k(!this.d || i == this.e);
        this.d = true;
        this.e = i;
        return this;
    }

    @Override // defpackage.pca
    public final void pI(pbg pbgVar) {
        this.c.b(pbgVar);
    }

    @Override // defpackage.pca
    public final void pJ() {
        opn.k(this.d);
    }

    @Override // defpackage.pca
    public final void pK(pcm pcmVar) {
        this.c.c(pcmVar);
    }
}
