package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xud {
    public final Context d;
    public final xsp e;
    public final Executor h;
    public final Executor i;
    public final List f = new ArrayList();
    public final HashMap g = new HashMap();
    public final azrl a = azrl.e();
    public final azrl b = azrl.e();
    public final azrl c = azrl.e();

    public xud(Context context, xsp xspVar, Executor executor, Executor executor2) {
        this.d = context;
        this.e = xspVar;
        this.h = executor2;
        this.i = executor;
    }

    public final ammv a(Uri uri) {
        return !this.f.contains(uri) ? amlr.a : ammv.i((xuh) this.g.get(uri));
    }

    public final amru b() {
        yjk.f();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add((xuh) this.g.get((Uri) it.next()));
        }
        return amru.o(arrayList);
    }

    public final ayqx c(final xty xtyVar) {
        azrl azrlVar = this.c;
        xtyVar.getClass();
        return azrlVar.ax(new ayrs() { // from class: xtp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                xty.this.a((xtx) obj);
            }
        });
    }

    public final ayqx d(final xua xuaVar) {
        azrl azrlVar = this.b;
        xuaVar.getClass();
        return azrlVar.ax(new ayrs() { // from class: xtq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                xua.this.a((xtz) obj);
            }
        });
    }

    public final ayqx e(final xuc xucVar) {
        azrl azrlVar = this.a;
        xucVar.getClass();
        return azrlVar.ax(new ayrs() { // from class: xtr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                xuc.this.a((xub) obj);
            }
        });
    }

    public final void f(Uri uri) {
        xuh xuhVar = (xuh) this.g.get(uri);
        if (xuhVar != null) {
            xug b = xuhVar.b();
            b.a = null;
            this.g.put(uri, b.a());
        }
    }

    public final void g(final xuh xuhVar) {
        yjk.f();
        final int indexOf = this.f.indexOf(xuhVar.a);
        if (indexOf >= 0 && !((xuh) this.g.get(xuhVar.a)).equals(xuhVar)) {
            this.g.put(xuhVar.a, xuhVar);
            this.i.execute(new Runnable() { // from class: xtu
                @Override // java.lang.Runnable
                public final void run() {
                    xud.this.c.c(xtx.c(xuhVar, indexOf));
                }
            });
        }
    }
}
