package defpackage;

import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxb implements qgx {
    final /* synthetic */ acxc b;
    boolean a = false;
    private final qen c = new qen() { // from class: acxa
        @Override // defpackage.qen
        public final void a(String str, String str2) {
            acxb acxbVar = acxb.this;
            String str3 = acxc.a;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            acwt acwtVar = acxbVar.b.j;
            if (acwtVar == null) {
                zga.m(acxc.a, "No handler set, dropped message.");
            } else {
                acwtVar.d(str2);
            }
        }
    };

    public acxb(acxc acxcVar) {
        this.b = acxcVar;
    }

    private final void k(qfy qfyVar) {
        acxc acxcVar = this.b;
        acwt acwtVar = acxcVar.j;
        if (acwtVar != null) {
            try {
                String str = acxcVar.d;
                qen qenVar = this.c;
                qip.as("Must be called from the main thread.");
                qep qepVar = qfyVar.c;
                if (qepVar != null) {
                    qepVar.d(str, qenVar);
                }
                acwtVar.b(qfyVar);
                return;
            } catch (IOException e) {
                afsi.c(2, 21, "setMessageReceivedCallbacks failed", e);
                zga.f(acxc.a, "setMessageReceivedCallbacks failed", e);
                acwtVar.c(0);
                return;
            }
        }
        zga.c(acxc.a, "notifySdkClientConsumerOfNewSession, castSdkClientConsumer is null");
        this.b.f();
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void a(qgv qgvVar, int i) {
        qfy qfyVar = (qfy) qgvVar;
        String str = acxc.a;
        acwt acwtVar = this.b.j;
        if (acwtVar == null) {
            zga.c(acxc.a, "onSessionEnded, consumer is null, attempt to stop session with device id");
            this.b.c.c(qfyVar.b() != null ? qfyVar.b().b() : "", Optional.of(Integer.valueOf(i)));
        } else {
            acwtVar.a(i);
        }
        this.b.f();
    }

    @Override // defpackage.qgx
    public final /* synthetic */ void b(qgv qgvVar) {
        String str = acxc.a;
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void c(qgv qgvVar, int i) {
        String str = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_FAILED, Integer.valueOf(i), this.a);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void d(qgv qgvVar, boolean z) {
        qfy qfyVar = (qfy) qgvVar;
        String str = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECTED, null, this.a);
        if (qfyVar != null && qfyVar.b() != null && z) {
            acxc acxcVar = this.b;
            if (acxcVar.l == 2310) {
                acxcVar.l = -1;
                adlb adlbVar = (adlb) acxcVar.g.get();
                CastDevice b = qfyVar.b();
                b.getClass();
                adlbVar.c(adfu.a(b));
            }
        }
        Optional a = this.b.c.a(qfyVar);
        if (a.isPresent()) {
            this.b.j = (acwt) a.get();
            acxc acxcVar2 = this.b;
            acxcVar2.h = true;
            ((adln) acxcVar2.f.get()).e(8);
            k(qfyVar);
        }
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void e(qgv qgvVar, String str) {
        String str2 = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECTING, null, this.a);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void f(qgv qgvVar, int i) {
        j(i);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void g(qgv qgvVar, String str) {
        qfy qfyVar = (qfy) qgvVar;
        String str2 = acxc.a;
        ((adln) this.b.f.get()).e(8);
        acxc acxcVar = this.b;
        if (!acxcVar.h) {
            acxcVar.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_SCREEN_APP_LAUNCHED, null, this.a);
            this.b.h = true;
        }
        k(qfyVar);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void h(qgv qgvVar) {
        String str = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_CAST_STARTING, null, this.a);
        acxc acxcVar = this.b;
        acxcVar.h = false;
        acxcVar.l = -1;
        Optional b = acxcVar.c.b(((qfy) qgvVar).b());
        if (!b.isPresent()) {
            j(0);
        } else {
            this.b.j = (acwt) b.get();
        }
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void i(qgv qgvVar, int i) {
        qfy qfyVar = (qfy) qgvVar;
        String str = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_SUSPENDED, Integer.valueOf(i), this.a);
        acxc acxcVar = this.b;
        acxcVar.l = i;
        if (i == 2310) {
            ((adlb) acxcVar.g.get()).d();
            if (qfyVar != null) {
                try {
                    String str2 = this.b.d;
                    qip.as("Must be called from the main thread.");
                    qep qepVar = qfyVar.c;
                    if (qepVar != null) {
                        qepVar.c(str2);
                    }
                } catch (IOException e) {
                    zga.o(acxc.a, "Failed to remove message received callbacks.", e);
                }
            }
            this.b.f();
        }
    }

    public final void j(int i) {
        String str = acxc.a;
        this.b.e.b(atbh.MDX_SESSION_CAST_EVENT_TYPE_CAST_START_FAILED, Integer.valueOf(i), this.a);
        acwt acwtVar = this.b.j;
        if (acwtVar == null) {
            zga.c(acxc.a, "onSessionStartFailed, castSdkClientConsumer is null");
        } else {
            acwtVar.c(i);
        }
        this.b.f();
    }
}
