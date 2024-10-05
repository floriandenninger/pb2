package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xhq implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ xhr b;

    public xhq(xhr xhrVar, Uri uri) {
        this.b = xhrVar;
        this.a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
