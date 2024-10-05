package defpackage;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yhl extends WebView {
    public yhl(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }
}
