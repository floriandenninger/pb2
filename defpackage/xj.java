package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xj implements View.OnClickListener {
    final /* synthetic */ SearchView a;

    public xj(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        if (view == searchView.mSearchButton) {
            searchView.onSearchClicked();
            return;
        }
        if (view == searchView.mCloseButton) {
            searchView.onCloseClicked();
            return;
        }
        if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
        } else if (view == searchView.mVoiceButton) {
            searchView.onVoiceClicked();
        } else if (view == searchView.mSearchSrcTextView) {
            searchView.forceSuggestionQuery();
        }
    }
}
