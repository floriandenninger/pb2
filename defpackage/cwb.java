package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwb {
    private final cwg a;
    private final amsj b;

    public cwb(hy hyVar) {
        cwg cwgVar = new cwg(hyVar);
        this.b = new amsj((short[]) null, (byte[]) null);
        this.a = cwgVar;
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final synchronized List b(Class cls) {
        vak vakVar = (vak) this.b.a.get(cls);
        List list = vakVar == null ? null : vakVar.a;
        if (list != null) {
            return list;
        }
        List unmodifiableList = Collections.unmodifiableList(this.a.b(cls));
        if (((vak) this.b.a.put(cls, new vak(unmodifiableList, (char[]) null))) == null) {
            return unmodifiableList;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Already cached loaders for model: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final synchronized void c(Class cls, Class cls2, cwa cwaVar) {
        this.a.f(cls, cls2, cwaVar);
        this.b.A();
    }

    public final synchronized void d(Class cls, Class cls2, cwa cwaVar) {
        this.a.g(cls, cls2, cwaVar);
        this.b.A();
    }

    public final synchronized void e(Class cls, Class cls2, cwa cwaVar) {
        Iterator it = this.a.e(cls, cls2, cwaVar).iterator();
        while (it.hasNext()) {
            ((cwa) it.next()).d();
        }
        this.b.A();
    }
}
