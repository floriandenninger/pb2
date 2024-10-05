package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gmq {
    public final /* synthetic */ gna a;

    public /* synthetic */ gmq(gna gnaVar) {
        this.a = gnaVar;
    }

    public final void a() {
        gna gnaVar = this.a;
        Iterator it = gnaVar.d.a.iterator();
        while (it.hasNext()) {
            if ((((gmn) it.next()).a & (-2)) != 0) {
                gnaVar.d.s();
                gnaVar.a.post(new gmr(gnaVar, 1));
                gnaVar.a.aF(gnaVar.p);
                gnaVar.a.aD(gnaVar.p);
                return;
            }
        }
        gnaVar.c();
    }
}
