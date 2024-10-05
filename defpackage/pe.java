package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pe implements Runnable {
    final /* synthetic */ pf a;

    public pe(pf pfVar) {
        this.a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pj a = this.a.a.a();
        while (a != null) {
            int i = a.b;
            int i2 = 0;
            pm pmVar = null;
            if (i == 1) {
                pl plVar = this.a.b;
                int i3 = a.c;
                int i4 = a.d;
                os osVar = (os) plVar;
                if (osVar.a(i3)) {
                    ow owVar = osVar.a;
                    owVar.l = i4;
                    owVar.d.a.mw();
                    ow owVar2 = osVar.a;
                    owVar2.m = owVar2.n;
                    int i5 = 0;
                    while (i5 < osVar.a.e.b.size()) {
                        ow owVar3 = osVar.a;
                        pk pkVar = owVar3.g;
                        pn pnVar = owVar3.e;
                        pkVar.b((i5 < 0 || i5 >= pnVar.b.size()) ? null : (pm) pnVar.b.valueAt(i5));
                        i5++;
                    }
                    osVar.a.e.b.clear();
                    ow owVar4 = osVar.a;
                    owVar4.k = false;
                    owVar4.b();
                }
            } else if (i == 2) {
                Object obj = a.h;
                os osVar2 = (os) this.a.b;
                if (!osVar2.a(a.c)) {
                    osVar2.a.g.b((pm) obj);
                } else {
                    pn pnVar2 = osVar2.a.e;
                    pm pmVar2 = (pm) obj;
                    int indexOfKey = pnVar2.b.indexOfKey(pmVar2.b);
                    if (indexOfKey < 0) {
                        pnVar2.b.put(pmVar2.b, obj);
                    } else {
                        pmVar = (pm) pnVar2.b.valueAt(indexOfKey);
                        pnVar2.b.setValueAt(indexOfKey, obj);
                        if (pnVar2.c == pmVar) {
                            pnVar2.c = pmVar2;
                        }
                    }
                    if (pmVar != null) {
                        Log.e("AsyncListUtil", "duplicate tile @" + pmVar.b);
                        osVar2.a.g.b(pmVar);
                    }
                    int i6 = pmVar2.b + pmVar2.c;
                    while (i2 < osVar2.a.o.size()) {
                        int keyAt = osVar2.a.o.keyAt(i2);
                        if (pmVar2.b > keyAt || keyAt >= i6) {
                            i2++;
                        } else {
                            osVar2.a.o.removeAt(i2);
                            osVar2.a.d.a.oc(keyAt);
                        }
                    }
                }
            } else if (i != 3) {
                Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
            } else {
                pl plVar2 = this.a.b;
                int i7 = a.c;
                int i8 = a.d;
                os osVar3 = (os) plVar2;
                if (osVar3.a(i7)) {
                    pn pnVar3 = osVar3.a.e;
                    pm pmVar3 = (pm) pnVar3.b.get(i8);
                    if (pnVar3.c == pmVar3) {
                        pnVar3.c = null;
                    }
                    pnVar3.b.delete(i8);
                    if (pmVar3 == null) {
                        Log.e("AsyncListUtil", "tile not found @" + i8);
                    } else {
                        osVar3.a.g.b(pmVar3);
                    }
                }
            }
            a = this.a.a.a();
        }
    }
}
