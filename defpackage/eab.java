package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eab implements Runnable {
    final /* synthetic */ eac a;

    public eab(eac eacVar) {
        this.a = eacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.a.e == null) {
            synchronized (eac.a) {
                if (this.a.e != null) {
                    return;
                }
                boolean z2 = false;
                try {
                    z = ((Boolean) pyi.z.a()).booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        eac.b = new qxz(this.a.d.a, "ADSHIELD");
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.a.e = Boolean.valueOf(z2);
                eac.a.open();
            }
        }
    }
}
