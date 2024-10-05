package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vhm implements SQLiteTransactionListener {
    final /* synthetic */ vhn a;

    public vhm(vhn vhnVar) {
        this.a = vhnVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new vil();
        }
    }
}
