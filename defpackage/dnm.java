package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnm extends dnk {
    private final List a;
    private final dnj b;
    private final HashSet c = new HashSet();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private dmp g;

    public dnm(List list) {
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.b = new dnl(this);
    }

    @Override // defpackage.dni
    public final void b(ArrayList arrayList) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((dni) this.a.get(i)).b(arrayList);
        }
    }

    @Override // defpackage.dni
    public final void d() {
        if (this.f) {
            this.f = false;
            this.g = null;
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                dni dniVar = (dni) this.a.get(i);
                if (dniVar.e()) {
                    dniVar.d();
                }
            }
        }
    }

    @Override // defpackage.dni
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.dni
    public final void f(dmp dmpVar) {
        if (this.e) {
            throw new RuntimeException("Starting binding multiple times");
        }
        this.e = true;
        this.g = dmpVar;
        if (!j()) {
            g();
            return;
        }
        i();
        this.f = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dni) it.next()).a(this.b);
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((dni) this.a.get(i)).f(this.g);
        }
        this.a.size();
    }

    public final void k(dni dniVar) {
        if (this.c.contains(dniVar)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        this.c.add(dniVar);
        this.d++;
        dniVar.c(this.b);
        if (this.d >= this.a.size()) {
            this.f = false;
            h();
        }
    }
}
