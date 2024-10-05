package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class col {
    public final cwb a;
    public final dbl b = new dbl();
    public final dbk c = new dbk();
    public final hy d;
    public final rzb e;
    public final vak f;
    public final vak g;
    public final vak h;
    private final crb i;
    private final vak j;

    public col() {
        hy a = ddu.a(new ia(20), new cun(2), new ddp());
        this.d = a;
        this.a = new cwb(a);
        this.g = new vak((byte[]) null, (byte[]) null, (byte[]) null);
        this.e = new rzb(null, null);
        this.f = new vak((byte[]) null, (char[]) null);
        this.i = new crb();
        this.h = new vak((short[]) null, (byte[]) null);
        this.j = new vak((char[]) null, (byte[]) null);
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.e.g(arrayList);
    }

    public final cqy a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List j = this.j.j();
        if (j.isEmpty()) {
            throw new coh();
        }
        return j;
    }

    public final List c(Object obj) {
        List b = this.a.b(obj.getClass());
        if (b.isEmpty()) {
            throw new coi(obj);
        }
        int size = b.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            cvz cvzVar = (cvz) b.get(i);
            if (cvzVar.b(obj)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                }
                emptyList.add(cvzVar);
                z = false;
            }
        }
        if (emptyList.isEmpty()) {
            throw new coi(obj, b);
        }
        return emptyList;
    }

    public final void d(Class cls, cpx cpxVar) {
        this.g.m(cls, cpxVar);
    }

    public final void e(Class cls, cqq cqqVar) {
        this.f.i(cls, cqqVar);
    }

    public final void f(Class cls, Class cls2, cqp cqpVar) {
        h("legacy_append", cls, cls2, cqpVar);
    }

    public final void g(Class cls, Class cls2, cwa cwaVar) {
        this.a.c(cls, cls2, cwaVar);
    }

    public final void h(String str, Class cls, Class cls2, cqp cqpVar) {
        this.e.f(str, cqpVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, cqp cqpVar) {
        this.e.h(cqpVar, cls, cls2);
    }

    public final void j(Class cls, Class cls2, cwa cwaVar) {
        this.a.d(cls, cls2, cwaVar);
    }

    public final void k(cpz cpzVar) {
        this.j.k(cpzVar);
    }

    public final void l(cqx cqxVar) {
        this.i.b(cqxVar);
    }

    public final void m(Class cls, Class cls2, czz czzVar) {
        this.h.p(cls, cls2, czzVar);
    }

    public final void n(Class cls, Class cls2, cwa cwaVar) {
        this.a.e(cls, cls2, cwaVar);
    }
}
