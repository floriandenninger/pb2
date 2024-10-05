package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ecj implements Runnable {
    final /* synthetic */ eck a;

    public ecj(eck eckVar) {
        this.a = eckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        Class loadClass;
        eck eckVar = this.a;
        try {
            try {
                ebe ebeVar = eckVar.a;
                loadClass = ebeVar.c.loadClass(eck.a(ebeVar.d, eckVar.b));
            } catch (eap | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (loadClass == null) {
                countDownLatch = eckVar.f;
            } else {
                eckVar.d = loadClass.getMethod(eck.a(eckVar.a.d, eckVar.c), eckVar.e);
                if (eckVar.d == null) {
                    countDownLatch = eckVar.f;
                }
                countDownLatch = eckVar.f;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = eckVar.f;
        } catch (Throwable th) {
            eckVar.f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
