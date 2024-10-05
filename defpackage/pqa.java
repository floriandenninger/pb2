package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pqa extends asy implements ppw {
    private ppw a;
    private long b;

    @Override // defpackage.ppw
    public final int a() {
        ppw ppwVar = this.a;
        pse.c(ppwVar);
        return ppwVar.a();
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        ppw ppwVar = this.a;
        pse.c(ppwVar);
        return ppwVar.b(j - this.b);
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        ppw ppwVar = this.a;
        pse.c(ppwVar);
        return ppwVar.c(i) + this.b;
    }

    @Override // defpackage.asp
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        ppw ppwVar = this.a;
        pse.c(ppwVar);
        return ppwVar.d(j - this.b);
    }

    public final void e(long j, ppw ppwVar, long j2) {
        this.timeUs = j;
        this.a = ppwVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }
}
