package defpackage;

import android.content.Context;
import defpackage.acd;
import defpackage.aok;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca {
    public dd a;

    public aca(ce ceVar, Executor executor, abe abeVar, byte[] bArr) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        dd mN = ceVar.mN();
        final acd b = b(a(ceVar));
        if (b != null) {
            ceVar.X.b(new any(b) { // from class: androidx.biometric.BiometricPrompt$ResetCallbackObserver
                private final WeakReference a;

                {
                    this.a = new WeakReference(b);
                }

                @Override // defpackage.aoa
                public final /* synthetic */ void lc(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void lg(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final void lh(aok aokVar) {
                    if (this.a.get() != null) {
                        ((acd) this.a.get()).v = null;
                    }
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void nu(aok aokVar) {
                }

                @Override // defpackage.aoa
                public final /* synthetic */ void nv(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void ot(aok aokVar) {
                }
            });
        }
        this.a = mN;
        if (b != null) {
            b.a = executor;
            b.v = abeVar;
        }
    }

    public static Context a(ce ceVar) {
        ci C = ceVar.C();
        return C != null ? C : ceVar.qR();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static acd b(Context context) {
        if (context instanceof apu) {
            return (acd) new aps((apu) context).a(acd.class);
        }
        return null;
    }
}
