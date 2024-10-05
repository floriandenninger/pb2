package defpackage;

import android.os.Build;
import android.os.VibrationEffect;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kjd implements Runnable {
    final /* synthetic */ kje a;

    public kjd(kje kjeVar) {
        this.a = kjeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kje kjeVar = this.a;
        try {
            if (kjeVar.a == null) {
                return;
            }
            if (!kjeVar.b.isPresent() || Build.VERSION.SDK_INT <= 26) {
                kjeVar.a.vibrate(25L);
            } else {
                kjeVar.a.vibrate((VibrationEffect) kjeVar.b.get());
            }
        } catch (RuntimeException e) {
            zga.d("Failed to easy seek haptics vibrate.", e);
        }
    }
}
