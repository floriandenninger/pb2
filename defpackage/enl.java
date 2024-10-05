package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class enl {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final azrw b;
    private final azrw c;
    private final Executor d;
    private final azrw e;
    private final aadw f;

    public enl(azrw azrwVar, aadw aadwVar, azrw azrwVar2, Executor executor, azrw azrwVar3) {
        this.b = azrwVar;
        this.f = aadwVar;
        this.c = azrwVar2;
        this.d = executor;
        this.e = azrwVar3;
    }

    public final void a() {
        if (((zfy) this.e.get()).e("failsafe_enable_gms_device_compliance_check", true)) {
            avdj avdjVar = this.f.b().u;
            if (avdjVar == null) {
                avdjVar = avdj.a;
            }
            if (avdjVar.p) {
                rpt b = ((qyk) this.b.get()).b();
                b.o(this.d, new rpl() { // from class: enj
                    @Override // defpackage.rpl
                    public final void c(Exception exc) {
                        enl enlVar = enl.this;
                        afsi.c(2, 27, "Failed GmsDeviceCompliance check", exc);
                        enlVar.b(arbx.GMS_DEVICE_CHECK_TYPE_FAILED);
                    }
                });
                b.p(this.d, new rpo() { // from class: enk
                    @Override // defpackage.rpo
                    public final void d(Object obj) {
                        enl enlVar = enl.this;
                        qyf qyfVar = (qyf) obj;
                        enlVar.a.set(qyfVar.a());
                        if (qyfVar.a()) {
                            enlVar.b(arbx.GMS_DEVICE_CHECK_TYPE_SUCCESS);
                        }
                    }
                });
            }
        }
    }

    public final void b(arbx arbxVar) {
        arby a = arbz.a();
        a.copyOnWrite();
        arbz.c((arbz) a.instance, arbxVar);
        arbz arbzVar = (arbz) a.build();
        acpl acplVar = (acpl) this.c.get();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).cE(arbzVar);
        acplVar.c((arpp) a2.build());
    }
}
