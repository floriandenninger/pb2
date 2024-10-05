package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicw implements kgd {
    public final ajng a;
    protected final ajox b;
    public final Context c;
    public final acra d;
    public final aidb e;
    public final ajwf f;
    protected RecyclerView g;
    public int h;
    public int i;
    public int j;
    public final kge k;
    private final kgg l;

    public aicw(Context context, ajoy ajoyVar, kga kgaVar, kga kgaVar2, kga kgaVar3, sqq sqqVar, ajgq ajgqVar, sxw sxwVar, azrw azrwVar, acra acraVar, aidb aidbVar, kge kgeVar, ypa ypaVar, ajvq ajvqVar, byte[] bArr) {
        ajoc ajocVar = new ajoc();
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(aqsz.class, kgaVar);
        ajnqVar.f(aqsy.class, kgaVar2);
        ajnqVar.f(ajvo.class, kgaVar3);
        ajox a = ajoyVar.a(ajnqVar);
        ajzt ajztVar = new ajzt(sqqVar, acraVar, ajgqVar, ajgqVar.a().a(ajhb.WATCH), sxwVar, azrwVar);
        this.c = context;
        this.a = ajocVar;
        this.b = a;
        this.d = acraVar;
        this.f = ajztVar;
        this.e = aidbVar;
        this.k = kgeVar;
        kgg kggVar = new kgg(this, ypaVar, ajvqVar);
        this.l = kggVar;
        kggVar.a.m(kggVar);
        kggVar.a.i(kggVar, kggVar.d.k.v);
        a.g(kggVar);
    }

    public final void a(Rect rect) {
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setPadding(rect.left + this.h, this.g.getPaddingTop(), rect.right + this.i, rect.bottom + this.j);
        this.g.aa(0);
    }

    public final void b(atzx atzxVar) {
        ajpd ajpdVar = new ajpd();
        for (atzz atzzVar : atzxVar.d) {
            int i = atzzVar.b;
            if ((i & 2) != 0) {
                aqsy aqsyVar = atzzVar.d;
                if (aqsyVar == null) {
                    aqsyVar = aqsy.a;
                }
                ajpdVar.add(aqsyVar);
            } else if ((i & 1) != 0) {
                aqsz aqszVar = atzzVar.c;
                if (aqszVar == null) {
                    aqszVar = aqsz.a;
                }
                ajpdVar.add(aqszVar);
            } else if ((i & 8) != 0) {
                aqrf aqrfVar = atzzVar.e;
                if (aqrfVar == null) {
                    aqrfVar = aqrf.a;
                }
                ajpdVar.add(ajds.a(aqrfVar));
            }
        }
        ajoc ajocVar = (ajoc) this.a;
        int i2 = ajocVar.i(this.l.b);
        if (i2 == -1) {
            i2 = ((ajoc) this.a).h() - 1;
        }
        ajocVar.n(i2, ajpdVar);
        kge kgeVar = this.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = atzxVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            atzy atzyVar = (atzy) it.next();
            if ((1 & atzyVar.b) != 0) {
                atmt atmtVar = atzyVar.c;
                if (atmtVar == null) {
                    atmtVar = atmt.a;
                }
                ajce o = ahbj.o(atmtVar);
                if (o != null) {
                    arrayList.add(o);
                }
            }
        }
        kgeVar.lu(arrayList);
        kgg kggVar = this.l;
        boolean z = kggVar.c != null || kggVar.d.k.ai(ajcd.NEXT);
        if (z != (((ajoc) kggVar.d.a).i(kggVar.b) != -1)) {
            if (z) {
                ajoc ajocVar2 = (ajoc) kggVar.d.a;
                ajocVar2.n(ajocVar2.h(), kggVar.b);
                if (kggVar.d.k.ai(ajcd.NEXT)) {
                    if (kggVar.c == null) {
                        kggVar.c = kggVar.a(ajtw.a());
                    }
                    kggVar.b(kggVar.c.a);
                    return;
                }
                return;
            }
            ((ajoc) kggVar.d.a).q(kggVar.b);
        }
    }
}
