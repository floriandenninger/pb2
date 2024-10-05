package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlt implements afvq {
    private final ajlu a;
    private final afvq b;

    public ajlt(ajlu ajluVar, afvq afvqVar) {
        this.a = ajluVar;
        this.b = afvqVar;
    }

    @Override // defpackage.afvq
    public final /* bridge */ /* synthetic */ void c(Object obj, ykl yklVar) {
        Uri uri = (Uri) obj;
        String a = this.a.a(uri.toString());
        if (a != null) {
            uri = Uri.fromFile(new File(a));
        }
        this.b.c(uri, yklVar);
    }
}
