package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ahsg implements ykl {
    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Couldn't retrieve annotation image from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zga.l(sb.toString());
    }
}
