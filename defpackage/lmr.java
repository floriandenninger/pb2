package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lmr extends vw {
    public final vw d;
    final /* synthetic */ lms e;

    public lmr(lms lmsVar, vw vwVar) {
        this.e = lmsVar;
        this.d = vwVar;
    }

    private final void w(wv wvVar) {
        View view = wvVar.a;
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView == null || this.e.am == null) {
            return;
        }
        if (textView.getText().toString().equals(this.e.am.toString())) {
            Context qR = this.e.qR();
            qR.getClass();
            view.setBackgroundColor(wbs.Q(qR, com.google.android.youtube.R.attr.yt10PercentLayer));
            return;
        }
        textView.setTextColor(true != this.e.ai.a().equals(gng.DARK) ? -16777216 : -1);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return this.d.c(i);
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        return ((bsp) this.d).f(viewGroup, i);
    }

    @Override // defpackage.vw
    public final int jW(vw vwVar, wv wvVar, int i) {
        return this.d.jW(vwVar, wvVar, i);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        return this.d.mu(i);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        this.d.o(wvVar, i);
        w(wvVar);
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
    }

    @Override // defpackage.vw
    public final void r() {
    }

    @Override // defpackage.vw
    public final void s(wv wvVar, int i) {
        this.d.o(wvVar, i);
        w(wvVar);
    }

    @Override // defpackage.vw
    public final void t() {
    }

    @Override // defpackage.vw
    public final void u(js jsVar) {
        this.d.u(jsVar);
    }

    @Override // defpackage.vw
    public final void v(js jsVar) {
        this.d.v(jsVar);
    }
}
