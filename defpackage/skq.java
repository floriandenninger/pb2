package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class skq extends ContentObserver {
    final /* synthetic */ skr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skq(skr skrVar, Handler handler) {
        super(handler);
        this.a = skrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b();
    }
}
