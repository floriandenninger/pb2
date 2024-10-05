package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdw implements aker {
    public final akdn a;
    public final akdx b;
    public final akds c;
    public final ScheduledExecutorService d;

    public akdw(akdn akdnVar, akdx akdxVar, akds akdsVar, ScheduledExecutorService scheduledExecutorService) {
        akdnVar.getClass();
        this.a = akdnVar;
        this.b = akdxVar;
        this.c = akdsVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.aker
    public final akdy a(final akel akelVar) {
        anhy T;
        final int i = 0;
        anhy T2 = anaf.T(new anfy(this) { // from class: akdt
            public final /* synthetic */ akdw a;

            {
                this.a = this;
            }

            @Override // defpackage.anfy
            public final anhy a() {
                if (i != 0) {
                    akdw akdwVar = this.a;
                    return anaf.O(akdwVar.c.a(akelVar));
                }
                akdw akdwVar2 = this.a;
                return anaf.O(akdwVar2.b.a(akelVar));
            }
        }, this.d);
        final int i2 = 1;
        if ((!this.a.k() && !this.a.l()) || akelVar.d.isEmpty()) {
            T = anaf.O(akdy.a);
        } else {
            T = anaf.T(new anfy(this) { // from class: akdt
                public final /* synthetic */ akdw a;

                {
                    this.a = this;
                }

                @Override // defpackage.anfy
                public final anhy a() {
                    if (i2 != 0) {
                        akdw akdwVar = this.a;
                        return anaf.O(akdwVar.c.a(akelVar));
                    }
                    akdw akdwVar2 = this.a;
                    return anaf.O(akdwVar2.b.a(akelVar));
                }
            }, this.d);
        }
        anhy V = anaf.V(anaf.P(T2), this.a.c(), TimeUnit.MILLISECONDS, this.d);
        try {
            return (akdy) anaf.I(V, T).b(new akdv(this, V, T, T2), this.d).get();
        } catch (InterruptedException | ExecutionException unused) {
            return akdy.a;
        }
    }
}
