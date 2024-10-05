package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnu implements Runnable {
    final /* synthetic */ TextInputLayout a;
    private final /* synthetic */ int b;

    public alnu(TextInputLayout textInputLayout, int i) {
        this.b = i;
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.requestLayout();
        } else {
            this.a.l.performClick();
            this.a.l.jumpDrawablesToCurrentState();
        }
    }
}
