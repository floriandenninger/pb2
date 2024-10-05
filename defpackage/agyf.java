package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agyf extends DataSetObserver {
    final /* synthetic */ NonScrollableListView a;

    /* JADX INFO: Access modifiers changed from: protected */
    public agyf(NonScrollableListView nonScrollableListView) {
        this.a = nonScrollableListView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        NonScrollableListView nonScrollableListView = this.a;
        if (nonScrollableListView.b != null) {
            nonScrollableListView.a();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
