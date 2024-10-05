package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aafl implements aafq {
    public final Context a;
    public final azrw b;
    public final azrw c;
    public final azrw d;
    public final anib e;
    public final String f = "embedded_filegroups_embedded_datapush_proto.dat";
    public final Map g = new ConcurrentHashMap();
    public final azrh h = azrh.e();
    public final anhy i;
    private final anhy j;

    public aafl(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, anib anibVar) {
        this.a = context;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = anibVar;
        anhy submit = anibVar.submit(new Callable() { // from class: aafe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aafl aaflVar = aafl.this;
                try {
                    awmo awmoVar = (awmo) aonm.parseFrom(awmo.a, aaflVar.a.getAssets().open(aaflVar.f), aomw.b());
                    HashMap hashMap = new HashMap();
                    for (tjx tjxVar : awmoVar.b) {
                        hashMap.put(tjxVar.c, new aafw(aaflVar.a, tjxVar, aaflVar.e, aaflVar.d));
                    }
                    return amrz.j(hashMap);
                } catch (Exception unused) {
                    zga.l("Failed to initialize embedded FileGroups");
                    aafr aafrVar = (aafr) aaflVar.d.get();
                    aqib aqibVar = aqib.DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_FILE_GROUP_INIT_FAILED;
                    arpn a = arpp.a();
                    aqic a2 = aqid.a();
                    a2.copyOnWrite();
                    ((aqid) a2.instance).j(aqibVar);
                    a.copyOnWrite();
                    ((arpp) a.instance).co((aqid) a2.build());
                    aafrVar.a.a((arpp) a.build());
                    return amvo.b;
                }
            }
        });
        this.i = submit;
        tlk tlkVar = (tlk) azrwVar.get();
        tkp a = tkq.a();
        final int i = 1;
        a.b(true);
        final anhy h = anfq.h(anht.q(tlkVar.b(a.a())), new amml(this) { // from class: aafg
            public final /* synthetic */ aafl a;

            {
                this.a = this;
            }

            @Override // defpackage.amml
            public final Object apply(Object obj) {
                if (i == 0) {
                    aafl aaflVar = this.a;
                    amrz amrzVar = (amrz) obj;
                    aaflVar.g.putAll(amrzVar);
                    aaflVar.h.c(amrzVar);
                    return null;
                }
                aafl aaflVar2 = this.a;
                amru amruVar = (amru) obj;
                HashMap hashMap = new HashMap();
                int size = amruVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tjx tjxVar = (tjx) amruVar.get(i2);
                    int bt = rwh.bt(tjxVar.g);
                    if (bt != 0 && bt == 2) {
                        hashMap.put(tjxVar.c, new aaft(tjxVar, aaflVar2.e, aaflVar2.c, aaflVar2.d));
                    }
                }
                return hashMap;
            }
        }, anibVar);
        final int i2 = 0;
        anhy i3 = aney.i(anht.q(anaf.K(h, submit).a(new Callable() { // from class: aaff
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aafl aaflVar = aafl.this;
                Map map = (Map) h.get();
                for (aafx aafxVar : ((Map) aaflVar.i.get()).values()) {
                    if (!map.containsKey(aafxVar.c())) {
                        map.put(aafxVar.c(), aafxVar);
                    }
                }
                return amrz.j(map);
            }
        }, anibVar)), Exception.class, new anfz() { // from class: aafi
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return aafl.this.i;
            }
        }, anibVar);
        this.j = i3;
        anfq.h(anht.q(i3), new amml(this) { // from class: aafg
            public final /* synthetic */ aafl a;

            {
                this.a = this;
            }

            @Override // defpackage.amml
            public final Object apply(Object obj) {
                if (i2 == 0) {
                    aafl aaflVar = this.a;
                    amrz amrzVar = (amrz) obj;
                    aaflVar.g.putAll(amrzVar);
                    aaflVar.h.c(amrzVar);
                    return null;
                }
                aafl aaflVar2 = this.a;
                amru amruVar = (amru) obj;
                HashMap hashMap = new HashMap();
                int size = amruVar.size();
                for (int i22 = 0; i22 < size; i22++) {
                    tjx tjxVar = (tjx) amruVar.get(i22);
                    int bt = rwh.bt(tjxVar.g);
                    if (bt != 0 && bt == 2) {
                        hashMap.put(tjxVar.c, new aaft(tjxVar, aaflVar2.e, aaflVar2.c, aaflVar2.d));
                    }
                }
                return hashMap;
            }
        }, anibVar);
        ((tlk) azrwVar.get()).e();
    }

    private final anhy e(final tkf tkfVar) {
        tlk tlkVar = (tlk) this.b.get();
        tkp a = tkq.a();
        a.b = ammv.j(tkfVar.c);
        return anfq.i(anfq.i(anfq.i(anht.q(tlkVar.b(a.a())), new anfz() { // from class: aafh
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tkf tkfVar2 = tkf.this;
                amru amruVar = (amru) obj;
                int size = amruVar.size();
                for (int i = 0; i < size; i++) {
                    tjx tjxVar = (tjx) amruVar.get(i);
                    if (tjxVar.c.equals(tkfVar2.c)) {
                        int bt = rwh.bt(tjxVar.g);
                        if (bt == 0) {
                            bt = 1;
                        }
                        if (bt == 3) {
                            return anaf.M();
                        }
                        if (tjxVar.f == tkfVar2.e && bt == 2) {
                            return anaf.M();
                        }
                    }
                }
                return anhv.a;
            }
        }, this.e), new aafj(this, tkfVar, 0), this.e), new aafj(this, tkfVar, 1), this.e);
    }

    @Override // defpackage.aafc
    public final aypy a() {
        return this.h.s(zcz.k).L(new oht(17)).B();
    }

    @Override // defpackage.aafo
    public final anhy b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((tki) it.next()).b.iterator();
            while (it2.hasNext()) {
                tkf tkfVar = ((tkh) it2.next()).b;
                if (tkfVar == null) {
                    tkfVar = tkf.a;
                }
                arrayList.add(e(tkfVar));
            }
        }
        return new amkb(anaf.J(arrayList)).a(gip.s, this.e);
    }

    @Override // defpackage.aafo
    public final anhy c(tkf tkfVar) {
        return anfq.i(anht.q(e(tkfVar)), new aafj(this, tkfVar, 2), this.e);
    }

    @Override // defpackage.aafq
    public final aypy d(final aonk aonkVar) {
        return this.h.s(zcz.k).L(new ayrw() { // from class: aafd
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                return ((aafx) obj).e(aonk.this);
            }
        }).A(aysu.a, ayso.a);
    }
}
