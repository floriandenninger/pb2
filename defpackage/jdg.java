package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jdg implements jdi {
    final /* synthetic */ apxf a;
    final /* synthetic */ Instant b;
    final /* synthetic */ jdj c;

    public jdg(jdj jdjVar, apxf apxfVar, Instant instant) {
        this.c = jdjVar;
        this.a = apxfVar;
        this.b = instant;
    }

    @Override // defpackage.jdi
    public final void a() {
        if (this.c.e.c() - this.b.toEpochMilli() >= TimeUnit.SECONDS.toMillis(3L)) {
            zga.m(jdj.a, "Timed out searching for devices.");
            this.c.c(this.a.c, false, Optional.empty());
        } else {
            this.c.g.schedule(new Runnable() { // from class: jdf
                @Override // java.lang.Runnable
                public final void run() {
                    jdg jdgVar = jdg.this;
                    jdgVar.c.e(jdgVar);
                }
            }, 300L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.jdi
    public final void b(Optional optional) {
        this.c.c(this.a.c, true, optional);
    }
}
