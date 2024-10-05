package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptm implements psf {
    @Override // defpackage.psf
    public final pso a(Looper looper, Handler.Callback callback) {
        return new pto(new Handler(looper, callback));
    }
}
