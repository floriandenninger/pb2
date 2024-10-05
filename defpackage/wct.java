package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wct implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ContentValues b;
    final /* synthetic */ wcu c;

    public wct(wcu wcuVar, String str, ContentValues contentValues) {
        this.c = wcuVar;
        this.a = str;
        this.b = contentValues;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.getWritableDatabase().insertWithOnConflict(this.a, null, this.b, 5);
        this.c.b.open();
    }
}
