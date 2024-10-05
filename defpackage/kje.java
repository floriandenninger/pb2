package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import j$.util.Optional;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kje {
    public final Vibrator a;
    public final Optional b;
    public final boolean c;
    public final Handler d;
    public final int e;
    public final Runnable f;

    public kje(Context context, Handler handler, aadw aadwVar) {
        this.a = (Vibrator) context.getSystemService("vibrator");
        this.d = handler;
        asvu asvuVar = aadwVar.b().e;
        this.c = (asvuVar == null ? asvu.a : asvuVar).cJ;
        asvu asvuVar2 = aadwVar.b().e;
        this.e = (asvuVar2 == null ? asvu.a : asvuVar2).bJ;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = Optional.of(VibrationEffect.createOneShot(25L, PrivateKeyType.INVALID));
        } else {
            this.b = Optional.empty();
        }
        this.f = new kjd(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.d.removeCallbacks(this.f);
    }
}
