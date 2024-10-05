package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhj implements ajnf {
    final /* synthetic */ ajpd a;
    final /* synthetic */ abht b;

    public abhj(abht abhtVar, ajpd ajpdVar) {
        this.b = abhtVar;
        this.a = ajpdVar;
    }

    private final void f() {
        abhs abhsVar = this.b.i;
        if (abhsVar != null) {
            ntb ntbVar = (ntb) abhsVar;
            ntbVar.j = this.a.size() > 0;
            ntbVar.i();
        }
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        f();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        f();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        f();
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        f();
        abgf abgfVar = this.b.g;
        if (abgfVar != null) {
            Iterator it = ((abhc) abgfVar).a.iterator();
            while (it.hasNext()) {
                ((abjn) it.next()).b();
            }
        }
    }
}
