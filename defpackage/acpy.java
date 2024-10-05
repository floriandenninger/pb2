package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpy implements acpz {
    private final acpl a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private boolean c;
    private final ajkn d;

    public acpy(acpl acplVar, ajkn ajknVar, aadw aadwVar, byte[] bArr) {
        this.c = false;
        this.a = acplVar;
        this.d = ajknVar;
        apwy b = aadwVar.b();
        if (b != null) {
            asuf asufVar = b.r;
            aqxb aqxbVar = (asufVar == null ? asuf.a : asufVar).c;
            this.c = (aqxbVar == null ? aqxb.a : aqxbVar).b;
        }
    }

    private static arpp f(acpx acpxVar, aqxl aqxlVar, String str) {
        arpn a = arpp.a();
        aqwv a2 = aqww.a();
        aone createBuilder = aqwy.a.createBuilder();
        int i = acpxVar.c;
        createBuilder.copyOnWrite();
        aqwy aqwyVar = (aqwy) createBuilder.instance;
        aqwyVar.b |= 2;
        aqwyVar.d = i;
        int i2 = acpxVar.d;
        createBuilder.copyOnWrite();
        aqwy aqwyVar2 = (aqwy) createBuilder.instance;
        aqwyVar2.c = i2 - 1;
        aqwyVar2.b |= 1;
        a2.copyOnWrite();
        aqww.f((aqww) a2.instance, (aqwy) createBuilder.build());
        int i3 = acpxVar.b;
        a2.copyOnWrite();
        aqww.e((aqww) a2.instance, i3);
        aqwx aqwxVar = acpxVar.a;
        if (aqwxVar != null) {
            a2.copyOnWrite();
            aqww.g((aqww) a2.instance, aqwxVar);
        }
        a2.copyOnWrite();
        aqww.c((aqww) a2.instance, str);
        a2.copyOnWrite();
        aqww.d((aqww) a2.instance, aqxlVar);
        a.copyOnWrite();
        ((arpp) a.instance).cz((aqww) a2.build());
        return (arpp) a.build();
    }

    private final boolean g(aqxl aqxlVar) {
        return this.c && aqxlVar != null;
    }

    @Override // defpackage.acpz
    public final String a() {
        return this.d.b(16);
    }

    @Override // defpackage.acpz
    public final void b(acpx acpxVar, aqxl aqxlVar) {
        if (g(aqxlVar)) {
            String str = (String) this.b.get(aqxlVar);
            if (str == null) {
                str = a();
                String str2 = (String) this.b.putIfAbsent(aqxlVar, str);
                if (str2 != null) {
                    str = str2;
                }
            }
            c(acpxVar, aqxlVar, str);
        }
    }

    @Override // defpackage.acpz
    public final void c(acpx acpxVar, aqxl aqxlVar, String str) {
        if (g(aqxlVar) && !TextUtils.isEmpty(str)) {
            this.a.c(f(acpxVar, aqxlVar, str));
        }
    }

    @Override // defpackage.acpz
    public final void d(acpx acpxVar, aqxl aqxlVar, String str, long j) {
        if (g(aqxlVar) && !TextUtils.isEmpty(str)) {
            this.a.f(f(acpxVar, aqxlVar, str), j);
        }
    }

    @Override // defpackage.acpz
    public final void e(acpx acpxVar, aqxl aqxlVar) {
        if (g(aqxlVar)) {
            String a = a();
            this.b.put(aqxlVar, a);
            c(acpxVar, aqxlVar, a);
        }
    }
}
