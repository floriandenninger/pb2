package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sav {
    static final sbg a;
    public static final /* synthetic */ int b = 0;

    static {
        try {
        } catch (Exception unused) {
        }
        a = new sbg("aplos.analytics");
    }

    public static void a(ruv ruvVar) {
        tfq b2 = b(ruvVar);
        long currentTimeMillis = System.currentTimeMillis();
        long j = b2.a;
        b2.a = currentTimeMillis;
    }

    public static tfq b(ruv ruvVar) {
        sbg sbgVar = a;
        tfq tfqVar = (tfq) ruvVar.s(sbgVar);
        if (tfqVar != null) {
            return tfqVar;
        }
        tfq tfqVar2 = new tfq(null);
        ruvVar.z.put(sbgVar, tfqVar2);
        return tfqVar2;
    }
}
