package defpackage;

import android.view.ViewStub;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnz {
    ProgressBar a;
    private final ViewStub b;
    private boolean c;

    public gnz(ViewStub viewStub) {
        viewStub.getClass();
        this.b = viewStub;
    }

    public final void a(avft avftVar) {
        if (avftVar == null || avftVar.c <= 0) {
            this.b.setVisibility(8);
            return;
        }
        if (!this.c) {
            ProgressBar progressBar = (ProgressBar) this.b.inflate();
            this.a = progressBar;
            progressBar.setMax(100);
            this.c = true;
        }
        this.b.setVisibility(0);
        this.a.setVisibility(0);
        this.a.setProgress(avftVar.c);
    }
}
