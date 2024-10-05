package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guk implements akkw {
    final /* synthetic */ aums a;
    final /* synthetic */ Map b;
    final /* synthetic */ gul c;

    public guk(gul gulVar, aums aumsVar, Map map) {
        this.c = gulVar;
        this.a = aumsVar;
        this.b = map;
    }

    @Override // defpackage.akkw
    public final void a() {
    }

    @Override // defpackage.akkw
    public final void b() {
        gul gulVar = this.c;
        aums aumsVar = this.a;
        boolean z = (aumsVar.b & 64) != 0;
        apxf apxfVar = aumsVar.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        gulVar.b(z, apxfVar, this.b);
    }

    @Override // defpackage.akkw
    public final void c() {
        Executor executor = this.c.b;
        final aums aumsVar = this.a;
        final Map map = this.b;
        executor.execute(new Runnable() { // from class: guj
            @Override // java.lang.Runnable
            public final void run() {
                guk gukVar = guk.this;
                gukVar.c.c(aumsVar, map);
            }
        });
    }
}
