package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqw implements ajau {
    final /* synthetic */ ahef a;
    final /* synthetic */ ahqx b;

    public ahqw(ahqx ahqxVar, ahef ahefVar) {
        this.b = ahqxVar;
        this.a = ahefVar;
    }

    @Override // defpackage.ajau
    public final void a() {
    }

    @Override // defpackage.ajau
    public final void b(final ajbd ajbdVar) {
        Executor executor = this.b.a;
        final ahef ahefVar = this.a;
        executor.execute(new Runnable() { // from class: ahqv
            @Override // java.lang.Runnable
            public final void run() {
                ahqw ahqwVar = ahqw.this;
                ahef ahefVar2 = ahefVar;
                ajbd ajbdVar2 = ajbdVar;
                ahqx ahqxVar = ahqwVar.b;
                ajbv e = ahefVar2.d().e();
                PlayerResponseModel b = ahefVar2.b();
                aony<asjc> aonyVar = b.a.F;
                long millis = TimeUnit.SECONDS.toMillis(b.a());
                long j = b.c.e;
                boolean z = false;
                boolean z2 = false;
                for (asjc asjcVar : aonyVar) {
                    if (asjcVar.d.size() != 0) {
                        if (!z && ahqx.b(asjcVar)) {
                            e.C(0L, 0L, null, ahqxVar.c(e, asjcVar, j));
                            z = true;
                        } else if (millis > 0 && !z2 && asjcVar != null && (asjcVar.b & 1) != 0) {
                            asjd asjdVar = asjcVar.c;
                            if (asjdVar == null) {
                                asjdVar = asjd.a;
                            }
                            int dk = amkq.dk(asjdVar.b);
                            if (dk != 0 && dk == 3) {
                                e.C(millis, millis, null, ahqxVar.c(e, asjcVar, j));
                                z2 = true;
                            }
                        }
                    }
                }
                ajbdVar2.a();
            }
        });
    }
}
