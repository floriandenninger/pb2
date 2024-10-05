package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayoq {
    public final axzp a;
    public final axzo b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ayoq(axzp axzpVar, axzo axzoVar) {
        axzpVar.getClass();
        this.a = axzpVar;
        this.b = axzoVar;
    }

    public abstract ayoq a(axzp axzpVar, axzo axzoVar);

    public final ayoq d(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.a(ayaj.c(j, timeUnit)));
    }

    public final ayoq e(axzs... axzsVarArr) {
        return a(axzw.b(this.a, axzsVarArr), this.b);
    }
}
