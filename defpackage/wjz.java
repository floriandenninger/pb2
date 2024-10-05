package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wjz {
    public final afsy a;
    public final wcx b;
    public final Executor c;
    private final acpk d;

    public wjz(acpk acpkVar, afsy afsyVar, wcx wcxVar, Executor executor) {
        this.d = acpkVar;
        this.a = afsyVar;
        this.b = wcxVar;
        this.c = executor;
    }

    public final void a(aouq aouqVar, aoun aounVar, aoup aoupVar) {
        aour a = aous.a();
        a.copyOnWrite();
        aous.c((aous) a.instance, aouqVar);
        a.copyOnWrite();
        aous.d((aous) a.instance, aounVar);
        a.copyOnWrite();
        aous.e((aous) a.instance, aoupVar);
        aous aousVar = (aous) a.build();
        acpk acpkVar = this.d;
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).bV(aousVar);
        acpkVar.a((arpp) a2.build());
    }

    public final void b(int i, int i2, int i3) {
        aone createBuilder = aoux.a.createBuilder();
        createBuilder.copyOnWrite();
        aoux aouxVar = (aoux) createBuilder.instance;
        aouxVar.c = i - 1;
        aouxVar.b |= 1;
        createBuilder.copyOnWrite();
        aoux aouxVar2 = (aoux) createBuilder.instance;
        aouxVar2.d = i2 - 1;
        aouxVar2.b |= 2;
        createBuilder.copyOnWrite();
        aoux aouxVar3 = (aoux) createBuilder.instance;
        aouxVar3.e = i3 - 1;
        aouxVar3.b |= 4;
        aoux aouxVar4 = (aoux) createBuilder.build();
        acpk acpkVar = this.d;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).bY(aouxVar4);
        acpkVar.a((arpp) a.build());
    }

    public final void c(int i, Throwable th) {
        int i2;
        if (th instanceof alww) {
            i2 = 7;
        } else if (th instanceof alwx) {
            i2 = 4;
        } else if (th instanceof alwz) {
            i2 = 3;
        } else if (th instanceof alxa) {
            i2 = 5;
        } else {
            i2 = th instanceof alwy ? 6 : 1;
        }
        b(i, 3, i2);
    }
}
