package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxc {
    static final acsa a = new acqx(acsb.c(96494));
    public static final /* synthetic */ int e = 0;
    public final aypn b;
    public final nvz c;
    public zih d = ahbt.b;

    public nxc(nuo nuoVar, nvz nvzVar) {
        this.c = nvzVar;
        this.b = nuoVar.c.s(niy.p).A(nxb.a);
    }

    public static asht a(nxh nxhVar) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asho.a.createBuilder();
        nxh nxhVar2 = nxh.FULL_BLEED;
        nxu nxuVar = nxu.NO_FLING;
        int ordinal = nxhVar.ordinal();
        int i = 2;
        if (ordinal == 0) {
            i = 5;
        } else if (ordinal != 1) {
            i = ordinal != 2 ? 1 : 4;
        }
        createBuilder2.copyOnWrite();
        asho ashoVar = (asho) createBuilder2.instance;
        ashoVar.c = i - 1;
        ashoVar.b |= 1;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        asho ashoVar2 = (asho) createBuilder2.build();
        ashoVar2.getClass();
        ashtVar.z = ashoVar2;
        ashtVar.c |= 65536;
        return (asht) createBuilder.build();
    }
}
