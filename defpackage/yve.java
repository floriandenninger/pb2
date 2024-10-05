package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yve implements yuf {
    private final Executor a;
    private final yvo b;
    private final aace c;

    public yve(Executor executor, aace aaceVar, yvo yvoVar) {
        this.a = executor;
        this.c = aaceVar;
        yvoVar.getClass();
        this.b = yvoVar;
    }

    @Override // defpackage.yuf
    public final void a(yvo yvoVar, cnm cnmVar) {
        if (yvoVar.q()) {
            return;
        }
        this.a.execute(new yvd(yvoVar, cnmVar));
        aace aaceVar = this.c;
        if (aaceVar != null) {
            aaceVar.a(yvoVar, cnmVar);
        }
    }

    @Override // defpackage.yuf
    public final /* synthetic */ void b(UrlRequest urlRequest) {
    }

    @Override // defpackage.yuf
    public final boolean c() {
        return this.b.q();
    }

    @Override // defpackage.yuf
    public final void d() {
        this.b.n();
    }
}
