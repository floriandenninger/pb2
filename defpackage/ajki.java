package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajki implements View.OnLayoutChangeListener {
    public boolean a;
    final /* synthetic */ ajkj b;
    private zae c;
    private final int d;

    public ajki(ajkj ajkjVar, boolean z, int i) {
        this.b = ajkjVar;
        c(z);
        this.d = i;
    }

    public final void a(zae zaeVar) {
        this.c = zaeVar;
        this.b.a.addOnLayoutChangeListener(this);
    }

    public final void b() {
        if (!this.a) {
            this.b.a.removeOnLayoutChangeListener(this);
        }
        this.c = null;
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (z) {
            a(null);
        } else if (this.c == null) {
            this.b.a.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ajkj ajkjVar = this.b;
        ajkjVar.d(this.c, this.a ? null : ajkjVar.d, this.d);
    }
}
