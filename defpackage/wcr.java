package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wcr implements Runnable {
    final /* synthetic */ ContentValues a;
    final /* synthetic */ String[] b;
    final /* synthetic */ wcu c;

    public wcr(wcu wcuVar, ContentValues contentValues, String[] strArr) {
        this.c = wcuVar;
        this.a = contentValues;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.getWritableDatabase().update("identity", this.a, "account = ?", this.b);
        this.c.b.open();
    }
}
