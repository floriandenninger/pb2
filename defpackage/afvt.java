package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvt implements afvq {
    public final afvq a;
    public volatile boolean b;
    private final afvq c;

    public afvt(afvq afvqVar, afvq afvqVar2) {
        this.c = afvqVar;
        this.a = afvqVar2;
    }

    @Override // defpackage.afvq
    public final /* bridge */ /* synthetic */ void c(Object obj, ykl yklVar) {
        Uri uri = (Uri) obj;
        if (!this.b) {
            this.c.c(uri, new afvs(this, yklVar, true));
        } else {
            this.a.c(uri, new afvs(this, yklVar, false));
        }
    }
}
