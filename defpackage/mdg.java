package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdg implements View.OnLongClickListener {
    public final /* synthetic */ mdm a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdg(mdm mdmVar, int i) {
        this.b = i;
        this.a = mdmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.b != 0) {
            lij lijVar = this.a.w;
            if (lijVar != null) {
                lijVar.c(null);
            }
            return false;
        }
        mdm mdmVar = this.a;
        view.setHapticFeedbackEnabled(true);
        view.performHapticFeedback(0);
        lij lijVar2 = mdmVar.w;
        if (lijVar2 != null) {
            lijVar2.c(null);
        }
        return false;
    }
}
