package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfr extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ wfs b;

    public wfr(wfs wfsVar, int i) {
        this.b = wfsVar;
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.c.j(4);
        } else if (i == R.string.use_fingerprint_suffix) {
            this.b.c.j(6);
        }
    }
}
