package defpackage;

import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xl implements TextView.OnEditorActionListener {
    final /* synthetic */ SearchView a;

    public xl(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
