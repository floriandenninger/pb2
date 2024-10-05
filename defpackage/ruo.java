package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ruo extends ruv {
    private final Map C;
    private String E;
    private String F;
    public final Map a;
    public String b;
    public final boolean c;
    public final sag d;

    public ruo(Context context) {
        super(context);
        HashMap t = rwh.t();
        this.C = t;
        HashMap t2 = rwh.t();
        this.a = t2;
        this.c = true;
        sag sagVar = new sag(context);
        this.d = sagVar;
        Context context2 = getContext();
        boolean z = !true;
        rxn rxnVar = new rxn(context2);
        rxo rxoVar = new rxo();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, rum.a, 0, 0);
        rxoVar.a(Integer.valueOf(obtainStyledAttributes.getInt(7, 4)));
        rxoVar.a = obtainStyledAttributes.getBoolean(8, true);
        obtainStyledAttributes.recycle();
        rxnVar.b = rxoVar;
        rxnVar.j();
        rxnVar.k(new rxz());
        if (z) {
            rzm.b(rxnVar);
        } else {
            rzm.c(rxnVar);
        }
        t.put("DEFAULT", rxnVar);
        t2.put("DEFAULT", f());
        p("__DEFAULT__", new saf(getContext(), sagVar));
    }

    private final rxn F(String str) {
        rxn rxnVar = (rxn) this.C.get(str);
        sbt.d(rxnVar != null, "No measure axis was set with name \"%s\"", str);
        return rxnVar;
    }

    private final void G(rxk rxkVar, boolean z) {
        int i = rxkVar.e;
        rwk rwkVar = (rwk) rxkVar.getLayoutParams();
        byte b = rwkVar.a;
        int i2 = 3;
        if (z) {
            if (i == 2) {
                b = 1;
            }
            if (i == 2) {
                i = 4;
            }
            if (i == 1) {
                b = 16;
            }
            i2 = i;
        } else {
            if (i == 4) {
                b = 4;
            }
            if (i == 4) {
                i = 2;
            }
            if (i == 3) {
                b = 8;
                i2 = 1;
            }
            i2 = i;
        }
        int i3 = rxkVar.e;
        rxkVar.e = i2;
        rwkVar.a = b;
        if (i3 != i2) {
            forceLayout();
        }
    }

    public final rxk a() {
        return b("DEFAULT");
    }

    public final rxk b(String str) {
        return (rxk) this.a.get(str);
    }

    public final rxn c() {
        return F("DEFAULT");
    }

    @Override // defpackage.rwe
    protected final void d() {
        List emptyList;
        String str = this.E;
        if (str != null) {
            F(str).f();
        }
        String str2 = this.F;
        if (str2 != null) {
            F(str2).f();
        }
        String str3 = this.b;
        if (str3 != null) {
            b(str3).f();
        }
        String str4 = this.E;
        if (str4 == null) {
            str4 = this.F;
        }
        if (str4 != null) {
            ryv f = F(str4).a.f();
            for (String str5 : this.C.keySet()) {
                if (!str5.equals(this.E) && !str5.equals(this.F)) {
                    rxn rxnVar = (rxn) this.C.get(str5);
                    rxnVar.a.l(f);
                    rxnVar.f();
                }
            }
        }
        if (this.b == null || this.E == null || !this.w) {
            return;
        }
        this.w = false;
        Map x = ruv.x(this.v);
        for (String str6 : this.h) {
            if (x.containsKey(str6)) {
                emptyList = (List) x.get(str6);
            } else {
                emptyList = Collections.emptyList();
            }
            ((rwo) ((ruv) this).g.get(str6)).c(emptyList, this.x);
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((rwh) it.next()).d(x, this.x);
        }
        rwb rwbVar = this.A;
        if (rwbVar != null) {
            rwbVar.b.cancel();
        }
        this.A.b.setDuration(((ruv) this).f ? ((ruv) this).e : 0L);
        rwb rwbVar2 = this.A;
        if (rwbVar2.b.getDuration() > 0) {
            rwbVar2.b.start();
        } else {
            rwbVar2.a.setAnimationPercent(1.0f);
        }
        ((ruv) this).f = ((ruv) this).e > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ruv
    public final void e() {
        Map map;
        Iterator it;
        Double d;
        List emptyList;
        ruo ruoVar = this;
        Map map2 = ruoVar.v;
        for (String str : map2.keySet()) {
            if (ruoVar.i(str).g()) {
                for (rvg rvgVar : (List) map2.get(str)) {
                    sba sbaVar = rvgVar.a;
                    rxn F = ruoVar.F((String) sbaVar.e(sbb.a, "DEFAULT"));
                    rvgVar.c = F.a;
                    rxr rxrVar = F.d;
                    rxk b = ruoVar.b((String) sbaVar.e(sbb.b, "DEFAULT"));
                    rvgVar.d = b.a;
                    rvgVar.e = b.d;
                }
            }
        }
        Map x = ruv.x(ruoVar.v);
        for (String str2 : ruoVar.h) {
            if (x.containsKey(str2)) {
                emptyList = (List) x.get(str2);
            } else {
                emptyList = Collections.emptyList();
            }
            ((rwo) ((ruv) ruoVar).g.get(str2)).d(ruoVar, emptyList, ruoVar.x);
        }
        for (rwh rwhVar : ruoVar.t) {
        }
        Iterator it2 = ruoVar.C.values().iterator();
        while (it2.hasNext()) {
            ((rxn) it2.next()).e();
        }
        Iterator it3 = ruoVar.a.values().iterator();
        while (it3.hasNext()) {
            ((rxk) it3.next()).e();
        }
        Iterator it4 = map2.keySet().iterator();
        while (it4.hasNext()) {
            String str3 = (String) it4.next();
            if (ruoVar.i(str3).g()) {
                for (rvg rvgVar2 : (List) map2.get(str3)) {
                    sba sbaVar2 = rvgVar2.a;
                    String str4 = (String) sbaVar2.e(sbb.a, "DEFAULT");
                    String str5 = (String) sbaVar2.e(sbb.b, "DEFAULT");
                    saw c = sbaVar2.c(sax.a);
                    saw d2 = sbaVar2.d(sax.b, Double.valueOf(0.0d));
                    saw c2 = rvgVar2.c();
                    rxk b2 = ruoVar.b(str5);
                    Iterator it5 = sbaVar2.a.iterator();
                    int i = -1;
                    while (it5.hasNext()) {
                        int i2 = i + 1;
                        b2.c(c2.a(it5.next(), i2, sbaVar2));
                        i = i2;
                    }
                    Iterator it6 = rvgVar2.g.iterator();
                    while (it6.hasNext()) {
                        b2.a.j(it6.next());
                    }
                    rxn F2 = ruoVar.F(str4);
                    Iterator it7 = sbaVar2.a.iterator();
                    boolean z = false;
                    Double d3 = null;
                    int i3 = -1;
                    while (true) {
                        if (!it7.hasNext()) {
                            map = map2;
                            it = it4;
                            d = null;
                            break;
                        }
                        Object next = it7.next();
                        i3++;
                        map = map2;
                        Object a = c2.a(next, i3, sbaVar2);
                        Double d4 = (Double) c.a(next, i3, sbaVar2);
                        Double d5 = (Double) d2.a(next, i3, sbaVar2);
                        if (d4 != null) {
                            double doubleValue = d5.doubleValue();
                            double doubleValue2 = d4.doubleValue();
                            if (doubleValue != 0.0d) {
                                doubleValue2 += d5.doubleValue();
                            }
                            d = Double.valueOf(doubleValue2);
                            it = it4;
                            int d6 = b2.a.d(a);
                            if (d6 < 0) {
                                d3 = d;
                            } else {
                                if (d6 > 0) {
                                    break;
                                }
                                F2.c(d);
                                z = true;
                            }
                        } else {
                            it = it4;
                        }
                        map2 = map;
                        it4 = it;
                    }
                    Iterator it8 = rvgVar2.f.iterator();
                    while (it8.hasNext()) {
                        F2.a.j((Double) it8.next());
                    }
                    if (!z) {
                        if (d3 != null) {
                            F2.c(d3);
                        }
                        if (d != null) {
                            F2.c(d);
                        }
                    }
                    ruoVar = this;
                    map2 = map;
                    it4 = it;
                }
            }
            ruoVar = this;
        }
    }

    protected abstract rxk f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
    
        if (r1 == null) goto L58;
     */
    @Override // defpackage.ruv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ruo.g(java.util.List):void");
    }
}
