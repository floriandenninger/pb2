package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iqc implements View.OnClickListener {
    public final /* synthetic */ iqd a;
    private final /* synthetic */ int b;

    public /* synthetic */ iqc(iqd iqdVar, int i) {
        this.b = i;
        this.a = iqdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
