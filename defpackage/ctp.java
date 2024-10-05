package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctp {
    private final cto a = new cto(null);
    private final Map b = new HashMap();

    private static void d(cto ctoVar) {
        cto ctoVar2 = ctoVar.d;
        ctoVar2.c = ctoVar.c;
        ctoVar.c.d = ctoVar2;
    }

    private static void e(cto ctoVar) {
        ctoVar.c.d = ctoVar;
        ctoVar.d.c = ctoVar;
    }

    public final Object a(ctw ctwVar) {
        cto ctoVar = (cto) this.b.get(ctwVar);
        if (ctoVar == null) {
            ctoVar = new cto(ctwVar);
            this.b.put(ctwVar, ctoVar);
        } else {
            ctwVar.a();
        }
        d(ctoVar);
        cto ctoVar2 = this.a;
        ctoVar.d = ctoVar2;
        ctoVar.c = ctoVar2.c;
        e(ctoVar);
        return ctoVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ctw, java.lang.Object] */
    public final Object b() {
        for (cto ctoVar = this.a.d; !ctoVar.equals(this.a); ctoVar = ctoVar.d) {
            Object b = ctoVar.b();
            if (b != null) {
                return b;
            }
            d(ctoVar);
            this.b.remove(ctoVar.a);
            ctoVar.a.a();
        }
        return null;
    }

    public final void c(ctw ctwVar, Object obj) {
        cto ctoVar = (cto) this.b.get(ctwVar);
        if (ctoVar == null) {
            ctoVar = new cto(ctwVar);
            d(ctoVar);
            cto ctoVar2 = this.a;
            ctoVar.d = ctoVar2.d;
            ctoVar.c = ctoVar2;
            e(ctoVar);
            this.b.put(ctwVar, ctoVar);
        } else {
            ctwVar.a();
        }
        if (ctoVar.b == null) {
            ctoVar.b = new ArrayList();
        }
        ctoVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        cto ctoVar = this.a.c;
        boolean z = false;
        while (!ctoVar.equals(this.a)) {
            sb.append('{');
            sb.append(ctoVar.a);
            sb.append(':');
            sb.append(ctoVar.a());
            sb.append("}, ");
            ctoVar = ctoVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
