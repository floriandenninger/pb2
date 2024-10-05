package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abwb implements Runnable {
    public final /* synthetic */ abwy a;
    private final /* synthetic */ int b;

    public /* synthetic */ abwb(abwy abwyVar, int i) {
        this.b = i;
        this.a = abwyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abwy abwyVar = this.a;
            zga.b("Kill connection dead man's switch triggered, stopping stream.");
            abvt.b().n(9, 19, null);
            abwyVar.i(11, abwyVar.t.getString(R.string.lc_error_generic), false);
            return;
        }
        if (i == 1) {
            this.a.f();
        } else if (i != 2) {
            this.a.o();
        } else {
            this.a.f();
        }
    }
}
