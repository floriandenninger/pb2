package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hup implements Runnable {
    public final /* synthetic */ hur a;
    private final /* synthetic */ int b;

    public /* synthetic */ hup(hur hurVar, int i) {
        this.b = i;
        this.a = hurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ((hvc) this.a.o).af.aZ();
            return;
        }
        hur hurVar = this.a;
        int i = huq.a;
        hurVar.v.setEnabled(true);
        hurVar.v.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.quantum_ic_get_app_white_24, 0, 0);
    }
}
