package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xh implements View.OnFocusChangeListener {
    final /* synthetic */ SearchView a;

    public xh(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
