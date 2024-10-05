package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class che implements cgo, chf {
    public final boolean a;
    public final chk b;
    public final chk c;
    public final chk d;
    public final int e;
    private final List f = new ArrayList();

    public che(cjp cjpVar, cjn cjnVar) {
        this.a = cjnVar.d;
        this.e = cjnVar.e;
        chk a = cjnVar.a.a();
        this.b = a;
        chk a2 = cjnVar.b.a();
        this.c = a2;
        chk a3 = cjnVar.c.a();
        this.d = a3;
        cjpVar.h(a);
        cjpVar.h(a2);
        cjpVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(chf chfVar) {
        this.f.add(chfVar);
    }

    @Override // defpackage.chf
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((chf) this.f.get(i)).d();
        }
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
    }

    @Override // defpackage.cgo
    public final String g() {
        throw null;
    }
}
