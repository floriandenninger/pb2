package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scb implements seq, seu, sew, ser {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController");
    public final Context b;
    public final SettableFuture c;
    public final SettableFuture d;
    public sev e;
    public boolean f;
    public boolean g;
    private final Executor h;
    private final Executor i;
    private boolean j;

    public scb(Context context, Executor executor, Executor executor2) {
        SettableFuture f = SettableFuture.f();
        this.c = f;
        SettableFuture f2 = SettableFuture.f();
        this.d = f2;
        this.f = false;
        this.b = context;
        this.h = executor;
        this.i = executor2;
        anaf.Y(scg.b(context, executor), new sca(this, 1), executor2);
        f2.qK(anfq.h(f, rtp.e, executor));
    }

    @Override // defpackage.seq
    public final void a() {
        ansj a2;
        sev sevVar = this.e;
        if (sevVar != null) {
            sevVar.e.c().e();
            sci sciVar = this.e.e.a;
            for (amnp amnpVar : sciVar.f.values()) {
                if (amnpVar.a) {
                    amnpVar.g();
                }
            }
            sev sevVar2 = sciVar.c;
            if (sevVar2 != null) {
                a2 = sevVar2.e.b.a();
            } else {
                a2 = ansk.a();
            }
            sciVar.a(a2);
            this.e.e.b.a.e();
        }
    }

    @Override // defpackage.seu
    public final void b() {
    }

    @Override // defpackage.seu
    public final void c(sev sevVar) {
        this.e = sevVar;
        sevVar.e.a.f(sex.ASSET_DOWNLOAD);
        sdy sdyVar = (sdy) sevVar.e.c();
        anaf.Y(sdyVar.j.b(new sdq(sdyVar, 0)), new sca(this, 0), sevVar.c);
        if (sevVar.a.a()) {
            return;
        }
        this.f = true;
    }

    @Override // defpackage.ser
    public final void d() {
        this.g = false;
        this.j = true;
        f();
    }

    @Override // defpackage.seq
    public final void e() {
        sev sevVar = this.e;
        if (sevVar != null) {
            sci sciVar = sevVar.e.a;
            if (!((amnp) sciVar.f.get(sch.EXPERIENCE)).a) {
                ((amnp) sciVar.f.get(sch.EXPERIENCE)).f();
            }
            if (!this.f || this.g) {
                return;
            }
            f();
        }
    }

    public final void f() {
        sev sevVar;
        if (!this.j) {
            this.g = true;
            this.e.e.b().a();
            return;
        }
        if (!this.f || (sevVar = this.e) == null) {
            return;
        }
        final scu scuVar = ((sdy) sevVar.e.c()).h;
        scuVar.b(new Runnable() { // from class: scp
            @Override // java.lang.Runnable
            public final void run() {
                scu.this.n = true;
            }
        });
        sea seaVar = ((sec) this.e.e.d()).b;
        aone createBuilder = awel.a.createBuilder();
        awen awenVar = awen.a;
        createBuilder.copyOnWrite();
        awel awelVar = (awel) createBuilder.instance;
        awenVar.getClass();
        awelVar.c = awenVar;
        awelVar.b = 12;
        seaVar.a((awel) createBuilder.build());
    }
}
