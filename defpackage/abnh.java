package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abnh implements View.OnClickListener {
    public final /* synthetic */ abns a;
    private final /* synthetic */ int b;

    public /* synthetic */ abnh(abns abnsVar, int i) {
        this.b = i;
        this.a = abnsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.C();
                return;
            } else {
                this.a.I();
                return;
            }
        }
        abjl abjlVar = this.a.k;
        if (abjlVar != null) {
            abjlVar.d();
        }
    }
}
