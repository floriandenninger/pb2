package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sba {
    public final List a;
    public final String b;
    public ajun c = new ajun((char[]) null, (byte[]) null);
    public ajun d = new ajun((short[]) null, (byte[]) null);

    public sba(String str, List list) {
        sbt.g(str, "name");
        this.b = str;
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final saw b(sax saxVar, sax saxVar2) {
        saw A;
        saw A2 = this.d.A(saxVar);
        return (A2 != null || (A = this.d.A(saxVar2)) == null) ? A2 : new saz(A);
    }

    public final saw c(sax saxVar) {
        return this.d.A(saxVar);
    }

    public final saw d(sax saxVar, Object obj) {
        ajun ajunVar = this.d;
        sbt.h(obj);
        saw sawVar = (saw) ajunVar.a.get(saxVar);
        return sawVar != null ? sawVar : new sbf(obj, 0);
    }

    public final Object e(sbb sbbVar, Object obj) {
        Object obj2 = this.c.a.get(sbbVar);
        return obj2 != null ? obj2 : obj;
    }

    public final void f(sax saxVar, saw sawVar) {
        this.d.a.put(saxVar, sawVar);
    }

    public final void g(sax saxVar, Object obj) {
        this.d.a.put(saxVar, obj != null ? new sbf(obj, 1) : null);
    }

    public final void h(Integer num) {
        g(sax.e, num);
    }
}
