package defpackage;

import android.support.v7.widget.SearchView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xg implements Runnable {
    final /* synthetic */ SearchView a;
    private final /* synthetic */ int b;

    public xg(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            akf akfVar = this.a.mSuggestionsAdapter;
            if (akfVar instanceof yd) {
                akfVar.d(null);
                return;
            }
            return;
        }
        this.a.updateFocusedState();
    }
}
