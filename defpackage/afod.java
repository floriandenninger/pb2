package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afod implements afot {
    qob a;
    private final Context b;
    private final aaea c;

    public afod(Context context, aaea aaeaVar) {
        this.b = context;
        this.c = aaeaVar;
    }

    @Override // defpackage.afot
    public final anhy a() {
        final SettableFuture f = SettableFuture.f();
        b(new afos() { // from class: afoc
            @Override // defpackage.afos
            public final void a(astx astxVar) {
                SettableFuture settableFuture = SettableFuture.this;
                if (astxVar == null) {
                    settableFuture.e(new IllegalArgumentException("LocationMetadata was null"));
                } else {
                    settableFuture.o(astxVar);
                }
            }
        });
        return f;
    }

    @Override // defpackage.afot
    public final synchronized void b(final afos afosVar) {
        astj astjVar = this.c.a().c;
        if (astjVar == null) {
            astjVar = astj.a;
        }
        if (astjVar.k && akai.g(this.b)) {
            if (this.a == null) {
                this.a = rbf.a(this.b);
            }
            rpt B = this.a.B();
            B.q(new rpi() { // from class: afoa
                @Override // defpackage.rpi
                public final void a(rpt rptVar) {
                    astx astxVar;
                    afos afosVar2 = afos.this;
                    Location location = (Location) rptVar.g();
                    if (location == null) {
                        astxVar = null;
                    } else {
                        aone createBuilder = astx.a.createBuilder();
                        double longitude = location.getLongitude();
                        createBuilder.copyOnWrite();
                        astx astxVar2 = (astx) createBuilder.instance;
                        astxVar2.b |= 2;
                        astxVar2.d = longitude;
                        double latitude = location.getLatitude();
                        createBuilder.copyOnWrite();
                        astx astxVar3 = (astx) createBuilder.instance;
                        astxVar3.b |= 1;
                        astxVar3.c = latitude;
                        float accuracy = location.getAccuracy();
                        createBuilder.copyOnWrite();
                        astx astxVar4 = (astx) createBuilder.instance;
                        astxVar4.b |= 4;
                        astxVar4.e = accuracy;
                        astxVar = (astx) createBuilder.build();
                    }
                    afosVar2.a(astxVar);
                }
            });
            B.n(new rpl() { // from class: afob
                @Override // defpackage.rpl
                public final void c(Exception exc) {
                    afos.this.a(null);
                }
            });
            return;
        }
        afosVar.a(null);
    }
}
