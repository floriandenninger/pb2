package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nuk implements ayrs {
    public final /* synthetic */ nul a;
    private final /* synthetic */ int b;

    public /* synthetic */ nuk(nul nulVar, int i) {
        this.b = i;
        this.a = nulVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            nul nulVar = this.a;
            avjk avjkVar = (avjk) obj;
            aalc c = nulVar.d.c();
            nulVar.c(c);
            nulVar.e = ammv.j(avjkVar);
            Iterator it = avjkVar.getSegmentsData().iterator();
            while (it.hasNext()) {
                avjd d = avje.d(((avjl) it.next()).b);
                d.b(false);
                c.d(d.c());
            }
            c.b().T();
            return;
        }
        nul nulVar2 = this.a;
        aheg ahegVar = (aheg) obj;
        if (nulVar2.e.h()) {
            aalc c2 = nulVar2.d.c();
            long g = ahegVar.g();
            boolean z = false;
            for (avjl avjlVar : ((avjk) nulVar2.e.c()).getSegmentsData()) {
                avjf avjfVar = (avjf) nulVar2.d.f(avjlVar.b).g(avjf.class).X();
                boolean z2 = avjlVar.c <= g && avjlVar.d > g;
                if (avjfVar == null || z2 != avjfVar.getHighlighted().booleanValue()) {
                    avjd d2 = avje.d(avjlVar.b);
                    d2.b(Boolean.valueOf(z2));
                    c2.d(d2.c());
                    z = true;
                }
            }
            if (z) {
                c2.b().T();
            }
        }
    }
}
