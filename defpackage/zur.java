package defpackage;

import android.os.Looper;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zur {
    public final ChooseFilterView a;
    public boolean b;
    public zvb c;
    public hsz d;

    public zur(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    private final void c(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }

    public final void a() {
        c(new zuq(this, 1));
    }

    public final void b() {
        c(new zuq(this, 0));
    }
}
