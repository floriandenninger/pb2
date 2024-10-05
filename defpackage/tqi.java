package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tqi implements tow {
    public final tme a;
    public final Executor b;
    public final vgz c;
    private final shf d;

    public tqi(shf shfVar, tme tmeVar, vgz vgzVar, Executor executor) {
        this.d = shfVar;
        this.a = tmeVar;
        this.c = vgzVar;
        this.b = executor;
    }

    @Override // defpackage.tow
    public final anhy a(tkv tkvVar) {
        int i = tsx.a;
        tkv aO = rwh.aO(tkvVar, (this.d.c() / 1000) + tkvVar.j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aO);
        return m(arrayList);
    }

    @Override // defpackage.tow
    public final anhy b() {
        return anfq.i(anht.q(k()), new anfz() { // from class: tqg
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tqi tqiVar = tqi.this;
                return tqiVar.c.b(tqf.b, tqiVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.tow
    public final anhy c() {
        ArrayList arrayList = new ArrayList();
        return anfq.h(anht.q(this.c.b(new tni(arrayList, 4), this.b)), new tni(arrayList, 6), this.b);
    }

    @Override // defpackage.tow
    public final anhy d() {
        final ArrayList arrayList = new ArrayList();
        return anfq.h(anht.q(this.c.b(new amml() { // from class: tqe
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                tqi tqiVar = tqi.this;
                List list = arrayList;
                tlb tlbVar = (tlb) obj;
                aone builder = tlbVar.toBuilder();
                for (String str : Collections.unmodifiableMap(tlbVar.b).keySet()) {
                    try {
                        list.add(rwh.aG(str));
                    } catch (ttk e) {
                        String valueOf = String.valueOf(str);
                        tsx.j(e, valueOf.length() != 0 ? "Failed to deserialize groupKey:".concat(valueOf) : new String("Failed to deserialize groupKey:"));
                        tqiVar.a.a(e, "Failed to deserialize groupKey", new Object[0]);
                        builder.y(str);
                    }
                }
                return (tlb) builder.build();
            }
        }, this.b)), new tni(arrayList, 2), this.b);
    }

    @Override // defpackage.tow
    public final anhy e() {
        return anfq.h(this.c.a(), rtp.u, this.b);
    }

    @Override // defpackage.tow
    public final anhy f() {
        return anhv.a;
    }

    @Override // defpackage.tow
    public final anhy g(tld tldVar) {
        return anfq.h(this.c.a(), new fjz(rwh.aI(tldVar), 11), this.b);
    }

    @Override // defpackage.tow
    public final anhy h(tld tldVar) {
        return anfq.h(this.c.a(), new fjz(rwh.aI(tldVar), 12), this.b);
    }

    @Override // defpackage.tow
    public final anhy i(tld tldVar) {
        return aney.h(anfq.h(anht.q(this.c.b(new fjz(rwh.aI(tldVar), 13), this.b)), tqf.g, this.b), IOException.class, tqf.c, this.b);
    }

    @Override // defpackage.tow
    public final anhy j(List list) {
        return aney.h(anfq.h(anht.q(this.c.b(new tni(list, 3), this.b)), tqf.h, this.b), IOException.class, tqf.d, this.b);
    }

    @Override // defpackage.tow
    public final anhy k() {
        return this.c.b(tqf.a, this.b);
    }

    @Override // defpackage.tow
    public final anhy l(tld tldVar, final tkv tkvVar) {
        final String aI = rwh.aI(tldVar);
        return aney.h(anfq.h(anht.q(this.c.b(new amml() { // from class: tqh
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str = aI;
                tkv tkvVar2 = tkvVar;
                aone builder = ((tlb) obj).toBuilder();
                builder.x(str, tkvVar2);
                return (tlb) builder.build();
            }
        }, this.b)), tqf.i, this.b), IOException.class, tqf.e, this.b);
    }

    @Override // defpackage.tow
    public final anhy m(List list) {
        return aney.h(anfq.h(anht.q(this.c.b(new tni(list, 5), this.b)), tqf.j, this.b), IOException.class, tqf.f, this.b);
    }
}
