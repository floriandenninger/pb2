package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xup {
    public static final Charset a = Charset.forName("UTF-8");
    public final wco b;
    public final afsy c;
    public final axar d;
    public final axas e;

    public xup(wco wcoVar, afsy afsyVar, axas axasVar) {
        wcoVar.getClass();
        this.b = wcoVar;
        afsyVar.getClass();
        this.c = afsyVar;
        this.e = axasVar;
        axaq a2 = axar.a();
        a2.a = 60L;
        this.d = a2.a();
    }

    public static cnh a(int i, awzx awzxVar, byte[] bArr) {
        adz adzVar = new adz();
        for (String str : awzxVar.c()) {
            adzVar.put(str, awzxVar.a(str));
        }
        return new cnh(i, bArr, adzVar);
    }
}
