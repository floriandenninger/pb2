package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aly extends ContentObserver {
    final /* synthetic */ ama a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aly(ama amaVar, Handler handler) {
        super(handler);
        this.a = amaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
