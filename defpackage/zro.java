package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zro extends DataSetObserver {
    final /* synthetic */ zrs a;

    public zro(zrs zrsVar) {
        this.a = zrsVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.B();
    }
}
