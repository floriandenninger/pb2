package defpackage;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugj implements anhh {
    final /* synthetic */ uiy a;

    public ugj(uiy uiyVar) {
        this.a = uiyVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a((Bitmap) obj);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Log.w("AvatarRetriever", "Failed to load avatar.", th);
        this.a.a(null);
    }
}
