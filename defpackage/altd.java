package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class altd extends ContentObserver {
    public altd() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        alte.i();
    }
}
