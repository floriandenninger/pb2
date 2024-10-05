package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwc implements cqw, cqv {
    private final List a;
    private final hy b;
    private int c;
    private cof d;
    private cqv e;
    private List f;
    private boolean g;

    public cwc(List list, hy hyVar) {
        this.b = hyVar;
        did.as(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            d(this.d, this.e);
        } else {
            did.ap(this.f);
            this.e.g(new csz("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.cqw
    public final Class a() {
        return ((cqw) this.a.get(0)).a();
    }

    @Override // defpackage.cqw
    public final void b() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cqw) it.next()).b();
        }
    }

    @Override // defpackage.cqw
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cqw) it.next()).c();
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        this.d = cofVar;
        this.e = cqvVar;
        this.f = (List) this.b.a();
        ((cqw) this.a.get(this.c)).d(cofVar, this);
        if (this.g) {
            b();
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return ((cqw) this.a.get(0)).e();
    }

    @Override // defpackage.cqv
    public final void f(Object obj) {
        if (obj != null) {
            this.e.f(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.cqv
    public final void g(Exception exc) {
        List list = this.f;
        did.ap(list);
        list.add(exc);
        h();
    }
}
