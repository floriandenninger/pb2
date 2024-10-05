package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class enp {
    public final azrw a;
    public final Executor b;
    public final ayqi c;
    public final azrw d;
    public volatile boolean e;
    public ayqj f;
    public final aadw g;
    private final azrw h;

    public enp(azrw azrwVar, aadw aadwVar, azrw azrwVar2, Executor executor, ayqi ayqiVar, azrw azrwVar3) {
        this.a = azrwVar;
        this.g = aadwVar;
        this.h = azrwVar2;
        this.b = executor;
        this.c = ayqiVar;
        this.d = azrwVar3;
    }

    public final void a(arbx arbxVar) {
        arby a = arbz.a();
        a.copyOnWrite();
        arbz.c((arbz) a.instance, arbxVar);
        arbz arbzVar = (arbz) a.build();
        acpl acplVar = (acpl) this.h.get();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).cE(arbzVar);
        acplVar.c((arpp) a2.build());
    }
}
