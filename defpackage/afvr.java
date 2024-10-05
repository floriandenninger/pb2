package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvr extends afqv {
    @Override // defpackage.afqv
    /* renamed from: a */
    public final ysk c(Uri uri) {
        return super.c(uri.buildUpon().appendQueryParameter("pseudo_head", "1").build());
    }

    @Override // defpackage.afqv, defpackage.afrh
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return c((Uri) obj);
    }
}
