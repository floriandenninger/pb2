package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class oac {
    public final TextView a;
    public final Runnable b;
    public boolean c = false;
    public CharSequence d;

    public oac(final TextView textView) {
        this.a = textView;
        textView.addOnAttachStateChangeListener(new oab(this));
        this.b = new Runnable() { // from class: oaa
            @Override // java.lang.Runnable
            public final void run() {
                oac oacVar = oac.this;
                textView.setText(oacVar.d);
                oacVar.c = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.removeCallbacks(this.b);
        this.a.setText(this.d);
        this.c = false;
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        if (this.c) {
            return;
        }
        this.a.setText(charSequence);
    }
}
