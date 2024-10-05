package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thb {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    private final Map h = new HashMap();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final Map e = new HashMap();
    public Collection f = null;
    public final boolean g = true;

    public thb() {
        amvs amvsVar = amvs.a;
    }

    private final tha e(tgb tgbVar) {
        tha thaVar = new tha(this.c.size(), this.a.size());
        tgf b = thaVar.b(tgbVar, -1);
        ArrayList arrayList = new ArrayList(1);
        sgf.O(tgbVar, arrayList);
        ando andoVar = b.d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        thaVar.e(new thh(1, arrayList, andoVar.c));
        this.c.add(thaVar);
        this.h.put(b, thaVar);
        return thaVar;
    }

    public final tha a(List list, int i) {
        tgf tgfVar = (tgf) amkq.bj(list);
        tha thaVar = (tha) this.h.get(tgfVar);
        if (thaVar != null) {
            return thaVar;
        }
        tha thaVar2 = new tha(this.c.size(), i);
        this.c.add(thaVar2);
        this.h.put(tgfVar, thaVar2);
        return thaVar2;
    }

    public final tha b(tgb tgbVar) {
        int i = tgbVar.b;
        if (i != -1) {
            if (i == -2) {
                return null;
            }
            return (tha) this.c.get(i);
        }
        amkq.N(tgbVar.c());
        this.d.add(tgbVar);
        tgt tgtVar = tgbVar.a;
        if (tgtVar.n()) {
            return e(tgbVar);
        }
        Object c = tgtVar.c();
        if (c != null) {
            tgb tgbVar2 = (tgb) c;
            if (tgbVar2.b != -1 || !tgbVar2.d()) {
                tha b = b(tgbVar2);
                if (b == null) {
                    return null;
                }
                ando andoVar = ((tgf) tgbVar2.c.instance).d;
                if (andoVar == null) {
                    andoVar = ando.a;
                }
                b.b(tgbVar, andoVar.c);
                return b;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            sgf.O(tgbVar2, arrayList);
            amkq.N(arrayList.size() > 1);
            tha a = a(arrayList, this.a.size());
            tgf b2 = a.b(tgbVar, -1);
            arrayList.set(0, b2);
            ando andoVar2 = b2.d;
            if (andoVar2 == null) {
                andoVar2 = ando.a;
            }
            a.e(new thh(1, arrayList, andoVar2.c));
            return a;
        }
        if (!tgbVar.a().pY(tin.a)) {
            int i2 = tgj.f;
            tgt tgtVar2 = tgbVar.a;
            View view = tgtVar2 instanceof tgj ? ((tgj) tgtVar2).a : null;
            while (true) {
                if (view != null) {
                    if (!tgj.o(view)) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        String valueOf = String.valueOf(tgbVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 180);
                        sb.append("Unexpected visual element (");
                        sb.append(valueOf);
                        sb.append(") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/impressions#requirements.");
                        Log.e("GIL", sb.toString());
                        break;
                    }
                } else {
                    break;
                }
            }
            tgbVar.b = -2;
            return null;
        }
        return e(tgbVar);
    }

    public final List c() {
        amil l = amjw.l("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.c.size());
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                arrayList.add(((tha) it.next()).c());
            }
            this.c.clear();
            this.h.clear();
            l.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean d(tgb tgbVar, int i) {
        if (this.a.contains(tgbVar)) {
            return false;
        }
        int r = anaf.r(((tgf) tgbVar.c.instance).e);
        if (r == 0) {
            r = 1;
        }
        if (r == i) {
            this.b.remove(tgbVar);
            return false;
        }
        this.b.add(tgbVar);
        return true;
    }
}
