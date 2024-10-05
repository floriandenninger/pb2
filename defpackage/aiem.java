package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aiem implements View.OnClickListener {
    public final /* synthetic */ aieu a;
    public final /* synthetic */ awfl b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiem(aieu aieuVar, awfl awflVar, int i) {
        this.c = i;
        this.a = aieuVar;
        this.b = awflVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            this.a.d(this.b);
        } else {
            this.a.d(this.b);
        }
    }
}
