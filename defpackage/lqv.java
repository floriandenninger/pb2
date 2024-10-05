package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lqv {
    public static final String[] a = {fav.PIP_POLICY};

    public static lqu a() {
        aone createBuilder = lqt.a.createBuilder();
        createBuilder.copyOnWrite();
        lqt lqtVar = (lqt) createBuilder.instance;
        lqtVar.b |= 1;
        lqtVar.c = true;
        lqt lqtVar2 = (lqt) createBuilder.build();
        aone createBuilder2 = lqu.a.createBuilder();
        createBuilder2.copyOnWrite();
        lqu lquVar = (lqu) createBuilder2.instance;
        lqtVar2.getClass();
        lquVar.c = lqtVar2;
        lquVar.b |= 1;
        return (lqu) createBuilder2.build();
    }
}
