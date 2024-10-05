package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzt implements Runnable {
    View a;
    CharSequence b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(View view, CharSequence charSequence) {
        amkq.F(view != null, "Invalid view reference");
        this.a = view;
        this.b = charSequence;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        View view = this.a;
        if (view == null) {
            return;
        }
        uzu.a(view, this.b);
        this.a = null;
    }
}
