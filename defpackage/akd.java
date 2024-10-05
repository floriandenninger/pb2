package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akd extends ContentObserver {
    final /* synthetic */ akf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akd(akf akfVar) {
        super(new Handler());
        this.a = akfVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        akf akfVar = this.a;
        if (!akfVar.c || (cursor = akfVar.d) == null || cursor.isClosed()) {
            return;
        }
        akfVar.b = akfVar.d.requery();
    }
}
