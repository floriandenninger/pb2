package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class weh {
    public final wdd a;
    private final wgv b;
    private final Executor c;

    public weh(wgv wgvVar, wdd wddVar, Executor executor) {
        this.b = wgvVar;
        this.a = wddVar;
        this.c = executor;
    }

    public final anhy a(int i) {
        if (i - 1 != 1) {
            return null;
        }
        return anfq.h(this.b.d(), new amml() { // from class: weg
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return (AccountIdentity) weh.this.a.d((String) obj);
            }
        }, this.c);
    }
}
