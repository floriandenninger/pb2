package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class but implements bul {
    public final SQLiteProgram a;

    public but(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.bul
    public final void c(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bul
    public final void d(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.bul
    public final void e(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.bul
    public final void f(int i, String str) {
        this.a.bindString(i, str);
    }
}
