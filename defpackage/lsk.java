package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lsk implements fxi {
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ lsn b;

    public lsk(lsn lsnVar, ContentResolver contentResolver) {
        this.b = lsnVar;
        this.a = contentResolver;
    }

    @Override // defpackage.fxi
    public final void a() {
        this.a.unregisterContentObserver(this.b);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.a.registerContentObserver(Settings.System.CONTENT_URI, true, this.b);
        this.b.d();
    }
}
