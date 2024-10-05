package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhx implements View.OnClickListener {
    final /* synthetic */ akce a;
    private final /* synthetic */ int b;

    public akhx(akce akceVar, int i) {
        this.b = i;
        this.a = akceVar;
    }

    public /* synthetic */ akhx(akce akceVar, int i, byte[] bArr) {
        this.b = i;
        this.a = akceVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
