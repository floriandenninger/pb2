package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ake extends DataSetObserver {
    final /* synthetic */ akf a;

    public ake(akf akfVar) {
        this.a = akfVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        akf akfVar = this.a;
        akfVar.b = true;
        akfVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        akf akfVar = this.a;
        akfVar.b = false;
        akfVar.notifyDataSetInvalidated();
    }
}
