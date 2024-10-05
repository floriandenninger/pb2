package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmp {
    public final ajox a;
    public final List b;
    public final List c;
    public int d;
    private final ajpd e;

    public akmp(Context context, aahd aahdVar, acra acraVar, bv bvVar, int i, ypa ypaVar) {
        context.getClass();
        aahdVar.getClass();
        acraVar.getClass();
        amkq.E(i > 0);
        jgc jgcVar = new jgc(3);
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(akml.class, new akmm(aahdVar, acraVar, bvVar, ypaVar));
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        ajnqVar.f(ajni.class, new ajnt(context, jgcVar, ajnqVar));
        ajnqVar.f(akmq.class, new whk(context, 5, (boolean[]) null));
        ajox ajoxVar = new ajox(ajnqVar);
        this.a = ajoxVar;
        ajoxVar.h(ajpdVar);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = i;
    }

    public final void a() {
        this.e.clear();
        Iterator it = new akmo(this.b, this.d).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ajpd ajpdVar = this.e;
            ajnh a = ajni.a();
            a.a = this.d;
            a.b = list;
            ajpdVar.add(a.a());
        }
        if (!this.b.isEmpty() && !this.c.isEmpty()) {
            this.e.add(new akmq());
        }
        Iterator it2 = new akmo(this.c, this.d).iterator();
        while (it2.hasNext()) {
            List list2 = (List) it2.next();
            ajpd ajpdVar2 = this.e;
            ajnh a2 = ajni.a();
            a2.a = this.d;
            a2.b = list2;
            ajpdVar2.add(a2.a());
        }
    }
}
