package defpackage;

import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xs implements Runnable {
    final /* synthetic */ SearchView.SearchAutoComplete a;

    public xs(SearchView.SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (searchAutoComplete.b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.b = false;
        }
    }
}
