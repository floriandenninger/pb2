package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class xqc implements xpa {
    private final ajvc a;
    public apzx b;
    protected final yaq c;
    private final yap d;
    private final aadw e;
    private final yaq f;

    public xqc(yaq yaqVar, ajvc ajvcVar, apzx apzxVar, yaq yaqVar2, yap yapVar, aadw aadwVar, byte[] bArr, byte[] bArr2) {
        this.f = yaqVar;
        this.a = ajvcVar;
        this.b = apzxVar;
        this.c = yaqVar2;
        this.d = yapVar;
        this.e = aadwVar;
    }

    private static final boolean i(apyv apyvVar, apyv apyvVar2) {
        return (apyvVar == null || apyvVar2 == null || (apyvVar.b & 1) == 0 || !apyvVar.i.equals(apyvVar2.i)) ? false : true;
    }

    @Override // defpackage.xpa
    public final apzx a() {
        return this.b;
    }

    @Override // defpackage.xpa
    public final void b(apyv apyvVar) {
        if (h()) {
            ajvz ajvzVar = this.a;
            if ((ajvzVar instanceof ajtz) && ((ajtz) ajvzVar).ai(ajcd.NEXT)) {
                return;
            }
        }
        j(apyvVar);
    }

    @Override // defpackage.xpa
    public void c(apyv apyvVar) {
        apyv apyvVar2;
        if (apyvVar == null) {
            return;
        }
        apzp apzpVar = this.b.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        if ((apzpVar.b & 1) != 0) {
            apzp apzpVar2 = this.b.f;
            if (apzpVar2 == null) {
                apzpVar2 = apzp.a;
            }
            apzn apznVar = apzpVar2.c;
            if (apznVar == null) {
                apznVar = apzn.a;
            }
            List b = this.c.b(apznVar);
            int i = 0;
            while (true) {
                if (i >= b.size()) {
                    break;
                }
                apyx apyxVar = (apyx) b.get(i);
                if (apyxVar.b == 62285947) {
                    apyvVar2 = (apyv) apyxVar.c;
                } else {
                    apyvVar2 = apyv.a;
                }
                if (i(apyvVar, apyvVar2)) {
                    amrp amrpVar = new amrp();
                    amrpVar.j(b.subList(0, i));
                    if (i < b.size() - 1) {
                        amrpVar.j(b.subList(i + 1, b.size()));
                    }
                    this.c.c(apznVar, amrpVar.g());
                    apyvVar = apyvVar2;
                } else {
                    i++;
                }
            }
        }
        ArrayList arrayList = new ArrayList(yjj.v(this.f.b, this.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((xpd) arrayList.get(i2)).l(apyvVar);
        }
    }

    @Override // defpackage.xpa
    public void d() {
        yaq yaqVar = this.f;
        ArrayList arrayList = new ArrayList(yjj.v(yaqVar.b, this.b));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xpd) arrayList.get(i)).m();
        }
    }

    @Override // defpackage.xpa
    public void e(apyv apyvVar) {
        if (apyvVar == null) {
            return;
        }
        aone createBuilder = apyx.a.createBuilder();
        createBuilder.copyOnWrite();
        apyx apyxVar = (apyx) createBuilder.instance;
        apyxVar.c = apyvVar;
        apyxVar.b = 62285947;
        apyx apyxVar2 = (apyx) createBuilder.build();
        aone builder = this.b.toBuilder();
        builder.copyOnWrite();
        apzx apzxVar = (apzx) builder.instance;
        apyxVar2.getClass();
        apzxVar.c = apyxVar2;
        apzxVar.b |= 1;
        k((apzx) builder.build());
    }

    @Override // defpackage.xpa
    public void f(apyv apyvVar, apyv apyvVar2) {
        apyv apyvVar3;
        apzp apzpVar = this.b.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        if ((apzpVar.b & 1) != 0) {
            apzp apzpVar2 = this.b.f;
            if (apzpVar2 == null) {
                apzpVar2 = apzp.a;
            }
            apzn apznVar = apzpVar2.c;
            if (apznVar == null) {
                apznVar = apzn.a;
            }
            if (!this.c.b(apznVar).isEmpty()) {
                List b = this.c.b(apznVar);
                int i = 0;
                while (true) {
                    if (i >= b.size()) {
                        break;
                    }
                    apyx apyxVar = (apyx) b.get(i);
                    if (apyxVar.b == 62285947) {
                        apyvVar3 = (apyv) apyxVar.c;
                    } else {
                        apyvVar3 = apyv.a;
                    }
                    if (i(apyvVar3, apyvVar)) {
                        yap yapVar = this.d;
                        yapVar.c(apyvVar2, yapVar.a(apyvVar3));
                        aone createBuilder = apyx.a.createBuilder();
                        createBuilder.copyOnWrite();
                        apyx apyxVar2 = (apyx) createBuilder.instance;
                        apyvVar2.getClass();
                        apyxVar2.c = apyvVar2;
                        apyxVar2.b = 62285947;
                        apyx apyxVar3 = (apyx) createBuilder.build();
                        amrp amrpVar = new amrp();
                        amrpVar.j(b.subList(0, i));
                        amrpVar.h(apyxVar3);
                        if (i < b.size() - 1) {
                            amrpVar.j(b.subList(i + 1, b.size()));
                        }
                        this.c.c(apznVar, amrpVar.g());
                        apyvVar = apyvVar3;
                    } else {
                        i++;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(yjj.v(this.f.b, this.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((xpd) arrayList.get(i2)).o(apyvVar, apyvVar2);
        }
    }

    @Override // defpackage.xpa
    public final void g(apyv apyvVar, apyv apyvVar2) {
        this.d.c(apyvVar2, apyvVar);
        ArrayList arrayList = new ArrayList(yjj.v(this.f.a, apyvVar2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xpc) arrayList.get(i)).d(apyvVar2);
        }
    }

    @Override // defpackage.xpa
    public final boolean h() {
        return this.a instanceof xoy;
    }

    public final void j(apyv apyvVar) {
        aone createBuilder = apyx.a.createBuilder();
        if (apyvVar != null) {
            createBuilder.copyOnWrite();
            apyx apyxVar = (apyx) createBuilder.instance;
            apyxVar.c = apyvVar;
            apyxVar.b = 62285947;
        }
        apzp apzpVar = this.b.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        if ((apzpVar.b & 1) == 0) {
            aone createBuilder2 = apzp.a.createBuilder();
            aone createBuilder3 = apzn.a.createBuilder();
            String uuid = UUID.randomUUID().toString();
            createBuilder3.copyOnWrite();
            apzn apznVar = (apzn) createBuilder3.instance;
            uuid.getClass();
            apznVar.c |= 4096;
            apznVar.i = uuid;
            apzn apznVar2 = (apzn) createBuilder3.build();
            createBuilder2.copyOnWrite();
            apzp apzpVar2 = (apzp) createBuilder2.instance;
            apznVar2.getClass();
            apzpVar2.c = apznVar2;
            apzpVar2.b |= 1;
            apzp apzpVar3 = (apzp) createBuilder2.build();
            aone builder = this.b.toBuilder();
            builder.copyOnWrite();
            apzx apzxVar = (apzx) builder.instance;
            apzpVar3.getClass();
            apzxVar.f = apzpVar3;
            apzxVar.b |= 32;
            k((apzx) builder.build());
        }
        apzp apzpVar4 = this.b.f;
        if (apzpVar4 == null) {
            apzpVar4 = apzp.a;
        }
        apzn apznVar3 = apzpVar4.c;
        if (apznVar3 == null) {
            apznVar3 = apzn.a;
        }
        amrp amrpVar = new amrp();
        amrpVar.j(this.c.b(apznVar3));
        amrpVar.h((apyx) createBuilder.build());
        this.c.c(apznVar3, amrpVar.g());
        ArrayList arrayList = new ArrayList(yjj.v(this.f.b, this.b));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xpd) arrayList.get(i)).k(apyvVar);
        }
    }

    public final void k(apzx apzxVar) {
        apyv apyvVar;
        apyv apyvVar2;
        yaq yaqVar = this.f;
        apzx apzxVar2 = this.b;
        ArrayList arrayList = new ArrayList(yjj.v(yaqVar.b, apzxVar2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xpd xpdVar = (xpd) arrayList.get(i);
            yjj.w(yaqVar.b, apzxVar, xpdVar);
            yaqVar.e(apzxVar2, xpdVar);
        }
        apyx apyxVar = this.b.c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyx apyxVar2 = this.b.c;
            if (apyxVar2 == null) {
                apyxVar2 = apyx.a;
            }
            if (apyxVar2.b == 62285947) {
                apyvVar = (apyv) apyxVar2.c;
            } else {
                apyvVar = apyv.a;
            }
        } else {
            apyvVar = null;
        }
        ajvc ajvcVar = this.a;
        if (ajvcVar instanceof ajwm) {
            ((ajwm) ajvcVar).O(this.b, apzxVar);
        }
        this.b = apzxVar;
        apxs apxsVar = this.e.b().z;
        if (apxsVar == null) {
            apxsVar = apxs.a;
        }
        if (apxsVar.b) {
            apyx apyxVar3 = apzxVar.c;
            if (apyxVar3 == null) {
                apyxVar3 = apyx.a;
            }
            if (apyxVar3.b == 62285947) {
                apyvVar2 = (apyv) apyxVar3.c;
            } else {
                apyvVar2 = apyv.a;
            }
            yaq yaqVar2 = this.f;
            ArrayList arrayList2 = new ArrayList(yjj.v(yaqVar2.b, this.b));
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((xpd) arrayList2.get(i2)).n(apyvVar, apyvVar2);
            }
        }
    }
}
