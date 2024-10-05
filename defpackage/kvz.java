package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kvz implements ajwv {
    final /* synthetic */ kwa a;

    public kvz(kwa kwaVar) {
        this.a = kwaVar;
    }

    @Override // defpackage.ajwv
    public final /* bridge */ /* synthetic */ void b(Object obj, ajwu ajwuVar) {
        askg askgVar = (askg) obj;
        if ((askgVar.d & 32) != 0) {
            auca aucaVar = askgVar.X;
            if (aucaVar == null) {
                aucaVar = auca.a;
            }
            ajwuVar.a(aucaVar);
            if (!aucaVar.c) {
                aulq aulqVar = aucaVar.b;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                Iterator it = ((audc) aulqVar.pX(audf.a)).d.iterator();
                while (it.hasNext()) {
                    Object obj2 = ((aude) it.next()).c;
                    if (obj2 == null) {
                        obj2 = audj.a;
                    }
                    ajwuVar.a(obj2);
                }
                return;
            }
            this.a.a.add(aucaVar);
        }
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        return juz.f;
    }
}
