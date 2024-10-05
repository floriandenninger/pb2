package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class afun implements afvq {
    private final afvq a;

    public afun(afvq afvqVar) {
        this.a = afvqVar;
    }

    public abstract String a();

    public abstract void b(Uri uri, ykl yklVar);

    @Override // defpackage.afvq
    public final /* bridge */ /* synthetic */ void c(Object obj, ykl yklVar) {
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals(a())) {
            this.a.c(uri, yklVar);
        } else {
            b(uri, yklVar);
        }
    }
}
