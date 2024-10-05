package defpackage;

import android.os.ConditionVariable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zfx implements Runnable {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ zfy b;

    public zfx(zfy zfyVar, ConditionVariable conditionVariable) {
        this.b = zfyVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.block();
        this.b.d();
    }
}
