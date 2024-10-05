package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlg implements cvz {
    private final cvz a;

    public ajlg(cvz cvzVar) {
        this.a = cvzVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri C = ahbw.C((avgg) obj, i, i2);
        if (C == null) {
            return null;
        }
        return this.a.a(C, i, i2, cqnVar);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean b(Object obj) {
        return ahbw.L((avgg) obj);
    }
}
