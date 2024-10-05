package defpackage;

import android.os.Parcel;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akru implements ypb {
    public final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public akru(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    private final boolean c() {
        avdj avdjVar = ((aadw) this.b.get()).b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        return avdjVar.o;
    }

    @Override // defpackage.ypb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final aapp aappVar = (aapp) obj;
        if (c()) {
            ((Executor) this.c.get()).execute(new Runnable() { // from class: akrt
                @Override // java.lang.Runnable
                public final void run() {
                    akru akruVar = akru.this;
                    amru a = aappVar.a();
                    if (a.isEmpty()) {
                        return;
                    }
                    qob qobVar = (qob) akruVar.a.get();
                    final int[] aj = anaf.aj(a);
                    qrd b = qre.b();
                    b.a = new qqu() { // from class: rnx
                        @Override // defpackage.qqu
                        public final void a(Object obj2, Object obj3) {
                            int[] iArr = aj;
                            roa roaVar = new roa((rpv) obj3);
                            rob robVar = (rob) ((roc) obj2).D();
                            Parcel pn = robVar.pn();
                            ecr.i(pn, roaVar);
                            pn.writeString("__internal.external_ids#__internal.youtube_phenotype");
                            pn.writeInt(0);
                            pn.writeStringArray(new String[]{"DROP_BOX"});
                            pn.writeIntArray(iArr);
                            pn.writeByteArray(null);
                            robVar.pp(2, pn);
                        }
                    };
                    qobVar.t(b.a());
                }
            });
        }
    }

    public final void b() {
        if (c()) {
            ((ypa) this.d.get()).a(this, aapp.class, this);
        }
    }
}
