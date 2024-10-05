package defpackage;

import android.database.Cursor;
import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yod implements Iterator, yok {
    final /* synthetic */ Cursor a;
    final /* synthetic */ yoh b;

    public yod(yoh yohVar, Cursor cursor) {
        this.b = yohVar;
        this.a = cursor;
    }

    @Override // defpackage.yok
    public final void a() {
        Cursor cursor = this.a;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        this.a.close();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        Cursor cursor = this.a;
        if (cursor != null && !cursor.isClosed() && this.a.getCount() > 0 && !this.a.isLast()) {
            return true;
        }
        a();
        return false;
    }

    @Override // j$.util.Iterator
    public final Object next() {
        this.a.moveToNext();
        return this.b.c(this.a.getBlob(0));
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
