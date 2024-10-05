package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ve extends DataSetObserver {
    final /* synthetic */ vh a;

    public ve(vh vhVar) {
        this.a = vhVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
