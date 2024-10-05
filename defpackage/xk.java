package defpackage;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xk implements View.OnKeyListener {
    final /* synthetic */ SearchView a;

    public xk(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.mSearchable == null) {
            return false;
        }
        if (!searchView.mSearchSrcTextView.isPopupShowing() || this.a.mSearchSrcTextView.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(this.a.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = this.a;
            searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
            return true;
        }
        return this.a.onSuggestionsKey(view, i, keyEvent);
    }
}
