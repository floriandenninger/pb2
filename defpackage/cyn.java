package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyn implements cqp {
    private final czg a;
    private final ctm b;

    public cyn(czg czgVar, ctm ctmVar) {
        this.a = czgVar;
        this.b = ctmVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        ctd c = this.a.c((Uri) obj);
        if (c == null) {
            return null;
        }
        return cxz.a(this.b, ((cze) c).c(), i, i2);
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
