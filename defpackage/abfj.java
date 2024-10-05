package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfj extends abfi {
    private final azrw a;
    private final Executor b;
    private boolean c;

    public abfj(SharedPreferences sharedPreferences, azrw azrwVar, azrw azrwVar2, Executor executor) {
        super(sharedPreferences, azrwVar2);
        this.a = azrwVar;
        this.b = executor;
    }

    @Override // defpackage.abfi
    protected final synchronized void c() {
        if (this.c) {
            return;
        }
        aaxw aaxwVar = (aaxw) this.a.get();
        aaxv a = aaxwVar.a();
        a.m(aaef.b);
        try {
            try {
                try {
                    b((asem) aaxwVar.b(a, this.b).get(4L, TimeUnit.SECONDS));
                } catch (TimeoutException unused) {
                    d(4);
                }
            } catch (InterruptedException unused2) {
                d(21);
            }
        } catch (ExecutionException unused3) {
            d(22);
        }
        this.c = true;
    }
}
