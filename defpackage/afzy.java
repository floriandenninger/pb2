package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzy {
    public boolean a;
    private final acpl b;
    private final acpz c;
    private final boolean d;

    public afzy(acpl acplVar, acpz acpzVar, aaea aaeaVar, aadw aadwVar) {
        this.b = acplVar;
        this.c = acpzVar;
        boolean z = false;
        if (aadwVar.b() != null) {
            asuf asufVar = aadwVar.b().r;
            aqxb aqxbVar = (asufVar == null ? asuf.a : asufVar).c;
            if ((aqxbVar == null ? aqxb.a : aqxbVar).c) {
                z = true;
            }
        }
        this.d = z;
        aaeaVar.a.ax(new ayrs() { // from class: afzx
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                afzy afzyVar = afzy.this;
                arfd arfdVar = (arfd) obj;
                atog atogVar = arfdVar.p;
                if (atogVar == null) {
                    atogVar = atog.a;
                }
                boolean z2 = false;
                if ((atogVar.b & 16384) != 0) {
                    atog atogVar2 = arfdVar.p;
                    if (atogVar2 == null) {
                        atogVar2 = atog.a;
                    }
                    atoe atoeVar = atogVar2.m;
                    if (atoeVar == null) {
                        atoeVar = atoe.a;
                    }
                    if (atoeVar.b) {
                        z2 = true;
                    }
                }
                afzyVar.a = z2;
            }
        });
    }

    public final void a(atna atnaVar, apeo apeoVar) {
        if (apeoVar == null || (apeoVar.b & 16384) == 0) {
            return;
        }
        atnb atnbVar = apeoVar.t;
        if (atnbVar == null) {
            atnbVar = atnb.a;
        }
        b(atnaVar, atnbVar);
    }

    public final void b(atna atnaVar, atnb atnbVar) {
        if (atnbVar == null) {
            return;
        }
        if (this.a || atnbVar.c) {
            acpl acplVar = this.b;
            arpn a = arpp.a();
            atmx a2 = atmy.a();
            a2.copyOnWrite();
            atmy.c((atmy) a2.instance, atnbVar);
            a2.copyOnWrite();
            atmy.d((atmy) a2.instance, atnaVar);
            atmy atmyVar = (atmy) a2.build();
            a.copyOnWrite();
            ((arpp) a.instance).dm(atmyVar);
            acplVar.c((arpp) a.build());
            if (this.d) {
                acpz acpzVar = this.c;
                acpx acpxVar = new acpx(atnaVar.r, 2);
                aone createBuilder = aqwx.a.createBuilder();
                aone createBuilder2 = atmz.a.createBuilder();
                createBuilder2.copyOnWrite();
                atmz atmzVar = (atmz) createBuilder2.instance;
                atmzVar.c = atnbVar;
                atmzVar.b |= 1;
                createBuilder.copyOnWrite();
                aqwx aqwxVar = (aqwx) createBuilder.instance;
                atmz atmzVar2 = (atmz) createBuilder2.build();
                atmzVar2.getClass();
                aqwxVar.c = atmzVar2;
                aqwxVar.b |= 1;
                acpxVar.a = (aqwx) createBuilder.build();
                acpzVar.c(acpxVar, aqxl.FLOW_TYPE_NOTAIRE, atnbVar.b);
            }
        }
    }

    public final void c(atna atnaVar, aone aoneVar) {
        if (aoneVar != null) {
            apeo apeoVar = (apeo) aoneVar.instance;
            if ((apeoVar.b & 16384) != 0) {
                atnb atnbVar = apeoVar.t;
                if (atnbVar == null) {
                    atnbVar = atnb.a;
                }
                b(atnaVar, atnbVar);
            }
        }
    }
}
