package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angp extends anft {
    private ango c;

    public angp(amrl amrlVar, boolean z, Executor executor, anfy anfyVar) {
        super(amrlVar, z, false);
        this.c = new angm(this, anfyVar, executor);
        r();
    }

    @Override // defpackage.anft
    public final void g(int i, Object obj) {
    }

    @Override // defpackage.anfm
    protected final void m() {
        ango angoVar = this.c;
        if (angoVar != null) {
            angoVar.h();
        }
    }

    @Override // defpackage.anft
    public final void q() {
        ango angoVar = this.c;
        if (angoVar != null) {
            angoVar.f();
        }
    }

    @Override // defpackage.anft
    public final void s(int i) {
        super.s(i);
        if (i == 1) {
            this.c = null;
        }
    }

    public angp(amrl amrlVar, boolean z, Executor executor, Callable callable) {
        super(amrlVar, z, false);
        this.c = new angn(this, callable, executor);
        r();
    }
}
