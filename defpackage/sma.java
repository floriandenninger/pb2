package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sma implements swv {
    public final Context a;

    public sma(Context context) {
        this.a = context;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awrk.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, final swu swuVar) {
        return ayph.w(new Runnable() { // from class: slz
            @Override // java.lang.Runnable
            public final void run() {
                ((InputMethodManager) sma.this.a.getSystemService("input_method")).hideSoftInputFromWindow(swuVar.a.getWindowToken(), 0);
            }
        }).E(ayqr.a());
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
