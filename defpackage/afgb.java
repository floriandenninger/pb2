package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgb {
    public final amnv a;
    public final acsy b;
    public final acpl c;
    public final afsy d;
    public afft e;
    public final afhs f;
    private final anic g;
    private afft h;
    private anhy i;
    private ania j;

    public afgb(amnv amnvVar, anic anicVar, afhs afhsVar, acsy acsyVar, acpl acplVar, afsy afsyVar) {
        this.a = amnvVar;
        this.g = anicVar;
        this.f = afhsVar;
        this.b = acsyVar;
        this.c = acplVar;
        this.d = afsyVar;
    }

    private final synchronized void g(final amnv amnvVar, final amnv amnvVar2) {
        anhy anhyVar = this.i;
        if (anhyVar == null || anhyVar.isDone()) {
            anhy S = anaf.S(new Callable() { // from class: afga
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    afgb afgbVar = afgb.this;
                    amnv amnvVar3 = amnvVar;
                    amnv amnvVar4 = amnvVar2;
                    acsx d = afgbVar.b.d(asmn.LATENCY_ACTION_PROOF_OF_ORIGIN_TOKEN_CREATE);
                    byte[] bytes = ((String) amnvVar3.get()).getBytes("UTF-8");
                    int intValue = ((Integer) amnvVar4.get()).intValue();
                    affu affuVar = (affu) afgbVar.a.get();
                    auic s = afgbVar.f.s();
                    d.e();
                    afft a = affuVar.a(bytes, intValue, s);
                    d.c("potpe");
                    return a;
                }
            }, this.g);
            this.i = S;
            ynm.k(S, angq.a, new ynk() { // from class: affv
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    int i;
                    acpl acplVar = afgb.this.c;
                    if (th instanceof TimeoutException) {
                        i = 3;
                    } else {
                        i = ((th instanceof ExecutionException) && (th.getCause() instanceof qny)) ? 2 : 1;
                    }
                    int bo = anaf.bo(1) != 0 ? anaf.bo(1) : 1;
                    aone createBuilder = auid.a.createBuilder();
                    createBuilder.copyOnWrite();
                    auid auidVar = (auid) createBuilder.instance;
                    auidVar.d = i - 1;
                    auidVar.b |= 4;
                    createBuilder.copyOnWrite();
                    auid auidVar2 = (auid) createBuilder.instance;
                    int i2 = bo - 1;
                    if (bo == 0) {
                        throw null;
                    }
                    auidVar2.c = i2;
                    auidVar2.b = 2 | auidVar2.b;
                    auid auidVar3 = (auid) createBuilder.build();
                    arpn a = arpp.a();
                    a.copyOnWrite();
                    ((arpp) a.instance).dA(auidVar3);
                    acplVar.c((arpp) a.build());
                }
            }, new ynl() { // from class: affw
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    afgb afgbVar = afgb.this;
                    afft afftVar = (afft) obj;
                    synchronized (afgbVar) {
                        afgbVar.e = afftVar;
                    }
                }
            });
            return;
        }
        afid.a(afic.PO, "Token creation already in progress.");
    }

    public final synchronized afft a() {
        if (this.f.s().c && !this.f.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS)) {
            return this.h;
        }
        return null;
    }

    public final synchronized afft b() {
        if (this.f.s().b && !this.f.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS)) {
            return this.e;
        }
        return null;
    }

    public final synchronized void c() {
        this.h = null;
    }

    public final synchronized void d() {
        anhy anhyVar = this.i;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            this.i = null;
        }
        e();
    }

    public final void e() {
        final auic s = this.f.s();
        if (s.b) {
            g(new amnv() { // from class: affx
                @Override // defpackage.amnv
                public final Object get() {
                    String g;
                    afgb afgbVar = afgb.this;
                    int bq = anaf.bq(s.e);
                    if (bq == 0) {
                        bq = 1;
                    }
                    if (bq == 2) {
                        g = afgbVar.d.g();
                        if (g == null) {
                            return "fake_session_content_binding";
                        }
                    } else {
                        if (bq != 3) {
                            return "fake_session_content_binding";
                        }
                        if (!afgbVar.d.t() || afgbVar.d.c() == null) {
                            g = afgbVar.d.g();
                        } else {
                            g = afgbVar.d.c().b();
                        }
                        if (g == null) {
                            return "fake_session_content_binding";
                        }
                    }
                    return g;
                }
            }, new amnv() { // from class: affy
                @Override // defpackage.amnv
                public final Object get() {
                    int bp = anaf.bp(auic.this.h);
                    if (bp == 0) {
                        bp = 1;
                    }
                    return Integer.valueOf(bp == 3 ? 2 : 1);
                }
            });
            int i = s.d;
            if (i > 0) {
                synchronized (this) {
                    ania aniaVar = this.j;
                    if (aniaVar != null) {
                        aniaVar.cancel(true);
                    }
                    this.j = this.g.schedule(new Runnable() { // from class: affz
                        @Override // java.lang.Runnable
                        public final void run() {
                            afgb.this.e();
                        }
                    }, i, TimeUnit.SECONDS);
                }
            }
        }
    }

    public final synchronized void f(afft afftVar) {
        this.h = afftVar;
    }
}
