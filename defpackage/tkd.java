package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkd {
    public static final ammv a;

    static {
        aone createBuilder = tkg.a.createBuilder();
        createBuilder.copyOnWrite();
        tkg tkgVar = (tkg) createBuilder.instance;
        tkgVar.d = 1;
        tkgVar.b |= 2;
        createBuilder.copyOnWrite();
        tkg tkgVar2 = (tkg) createBuilder.instance;
        tkgVar2.c = 1;
        tkgVar2.b = 1 | tkgVar2.b;
        a = ammv.j((tkg) createBuilder.build());
    }
}
