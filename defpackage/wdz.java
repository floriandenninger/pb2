package defpackage;

import android.content.Context;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdz {
    public static final Charset a = Charset.forName("UTF-8");
    public final Context b;
    public final wco c;
    public final afsy d;
    public final axas e;

    public wdz(Context context, wco wcoVar, afsy afsyVar, axas axasVar) {
        this.b = context;
        wcoVar.getClass();
        this.c = wcoVar;
        afsyVar.getClass();
        this.d = afsyVar;
        this.e = axasVar;
    }

    public static cnh a(int i, awzx awzxVar, byte[] bArr) {
        adz adzVar = new adz();
        for (String str : awzxVar.c()) {
            adzVar.put(str, awzxVar.a(str));
        }
        return new cnh(i, bArr, adzVar);
    }
}
