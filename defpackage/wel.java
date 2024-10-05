package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wel implements View.OnClickListener {
    public final /* synthetic */ wed a;
    private final /* synthetic */ int b;

    public /* synthetic */ wel(wed wedVar, int i) {
        this.b = i;
        this.a = wedVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.j(7);
            return;
        }
        if (i == 1) {
            this.a.b();
            return;
        }
        if (i == 2) {
            this.a.b();
            return;
        }
        if (i == 3) {
            this.a.j(7);
        } else if (i != 4) {
            this.a.b();
        } else {
            this.a.j(6);
        }
    }
}
