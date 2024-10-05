package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamb {
    private final abep a;

    public aamb(abep abepVar) {
        this.a = abepVar;
    }

    public final boolean a() {
        try {
            return ((Boolean) this.a.f().get(1L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e) {
            e = e;
            zga.d("Failed to read safemode", e);
            return false;
        } catch (TimeoutException e2) {
            e = e2;
            zga.d("Failed to read safemode", e);
            return false;
        }
    }
}
