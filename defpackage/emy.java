package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class emy implements Runnable {
    final /* synthetic */ Executor a;
    final /* synthetic */ emz b;

    public emy(emz emzVar, Executor executor) {
        this.b = emzVar;
        this.a = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsx c = ((afsy) this.b.k.get()).c();
        if (c instanceof AccountIdentity) {
            ((wco) this.b.l.get()).j(this.a, (AccountIdentity) c);
        }
    }
}
