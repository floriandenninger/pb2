package defpackage;

import android.database.DataSetObserver;
import android.widget.HorizontalScrollView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvh extends DataSetObserver {
    final /* synthetic */ HorizontalScrollView a;
    final /* synthetic */ zvk b;

    public zvh(zvk zvkVar, HorizontalScrollView horizontalScrollView) {
        this.b = zvkVar;
        this.a = horizontalScrollView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.post(new zvg(this.b, 2));
    }
}
