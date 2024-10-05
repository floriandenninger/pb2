package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rsa extends ContentObserver {
    public rsa() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        rsb.e.set(true);
    }
}
