package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vhz extends SQLiteException {
    public vhz(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
