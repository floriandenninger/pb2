package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpj {
    public final ajpi a = new ajpi();
    public final ajpi b = new ajpi();
    public final ajpi c = new ajpi();
    public final ajpi d = new ajpi();

    public static ajph a(ajpi ajpiVar, wv wvVar) {
        Class b = b(wvVar);
        if (b != null) {
            return ajpiVar.a(b);
        }
        return null;
    }

    public static Class b(wv wvVar) {
        ajom q;
        if (wvVar == null) {
            q = null;
        } else if (wvVar instanceof ajor) {
            q = ((ajor) wvVar).t;
        } else {
            q = ahbw.q(wvVar.a);
        }
        if (q != null) {
            return q.getClass();
        }
        return null;
    }
}
