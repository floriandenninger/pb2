package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class drk extends LinearLayoutManager {
    public drk(int i) {
        super(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final we f() {
        return this.i == 1 ? new we(-1, -2) : new we(-2, -1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean pS() {
        if (this.i == 0) {
            return false;
        }
        return super.pS();
    }
}
