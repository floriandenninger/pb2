package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hii implements zqj, hik {
    public zry a;
    public hih b;
    public File c;
    private final Context d;
    private final Executor e;
    private final anib f;
    private final azrs g = azrh.aN(true).aT();

    public hii(Context context, Executor executor, anib anibVar) {
        this.d = context;
        this.e = executor;
        this.f = anibVar;
    }

    private final void q(final zfi zfiVar) {
        this.e.execute(new Runnable() { // from class: hif
            @Override // java.lang.Runnable
            public final void run() {
                hii hiiVar = hii.this;
                zfi zfiVar2 = zfiVar;
                hih hihVar = hiiVar.b;
                if (hihVar != null) {
                    zfiVar2.a(hihVar);
                }
            }
        });
    }

    public final zrx a() {
        zry zryVar = this.a;
        if (zryVar != null) {
            return zryVar.r();
        }
        return null;
    }

    @Override // defpackage.hik
    public final aypy b() {
        return this.g.U();
    }

    @Override // defpackage.hik
    public final void c(axdk axdkVar) {
        axdi i = axdkVar.i();
        if (i.c == 1) {
            axbp axbpVar = ((axdy) i.d).g;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
            zrx a = a();
            if (a != null) {
                long e = axdkVar.e();
                zqc zqcVar = a.b;
                axcc a2 = axcd.a();
                a2.copyOnWrite();
                axcd.c((axcd) a2.instance, e);
                axcd axcdVar = (axcd) a2.build();
                axcl a3 = axcq.a();
                a3.copyOnWrite();
                ((axcq) a3.instance).s(axcdVar);
                zqcVar.a.add((axcq) a3.build());
                zqb zqbVar = zqcVar.c;
                if (zqbVar != null) {
                    zqbVar.b();
                }
                if ((axbpVar.b == 1 ? (String) axbpVar.c : "").isEmpty()) {
                    return;
                }
                String str = axbpVar.b == 1 ? (String) axbpVar.c : "";
                final File file = new File(new File(this.d.getFilesDir(), zoz.a), str);
                ynm.k(this.f.submit(new Callable() { // from class: hig
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file2 = file;
                        boolean z = false;
                        if (file2.exists() && file2.delete()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }), this.f, new hro(str, 1), new afrn(str, 1));
                return;
            }
            return;
        }
        zga.b("SVideoEffectsController: Unknown asset content");
    }

    @Override // defpackage.zqj
    public final void d(axcg axcgVar) {
        zga.b("SVideoEffectsController: Received unexpected EditedPositionableLayerEvent");
        afsi.b(2, 6, "[ShortsCreation][Android][Edit]Received unexpected EditedPositionableLayerEvent");
    }

    @Override // defpackage.zqj
    public final void e(final axdb axdbVar) {
        q(new zfi() { // from class: hib
            @Override // defpackage.zfi
            public final void a(Object obj) {
                axdb axdbVar2 = axdb.this;
                hih hihVar = (hih) obj;
                if (hihVar != null) {
                    hihVar.s(axdbVar2.a());
                }
            }
        });
    }

    @Override // defpackage.zqj
    public final void f(final axdk axdkVar) {
        if (axdkVar.i().c != 1) {
            zga.b("SVideoEffectsController: Unknown asset content");
        } else {
            q(new zfi() { // from class: hic
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    axdk axdkVar2 = axdk.this;
                    hih hihVar = (hih) obj;
                    if (hihVar != null) {
                        hihVar.aF(axdkVar2);
                    }
                }
            });
        }
    }

    @Override // defpackage.zqj
    public final void g(boolean z) {
        q(new accl(z, 1));
    }

    @Override // defpackage.zqj
    public final void h(final boolean z, final boolean z2) {
        q(new zfi() { // from class: hid
            @Override // defpackage.zfi
            public final void a(Object obj) {
                boolean z3 = z;
                boolean z4 = z2;
                hih hihVar = (hih) obj;
                if (hihVar != null) {
                    hihVar.aL(z3, z4);
                }
            }
        });
    }

    @Override // defpackage.hik
    public final void i(zrz zrzVar) {
        zrx a = a();
        if (a != null) {
            a.e(false, zrzVar);
        }
    }

    @Override // defpackage.hik
    public final void j(boolean z) {
        zrx a = a();
        if (a != null) {
            zqc zqcVar = a.b;
            axco b = axco.b();
            axcl a2 = axcq.a();
            a2.copyOnWrite();
            ((axcq) a2.instance).w(b);
            zqcVar.a.add((axcq) a2.build());
            zqb zqbVar = zqcVar.c;
            if (zqbVar == null || !z) {
                return;
            }
            zqbVar.b();
        }
    }

    @Override // defpackage.hik
    public final void k(long j, long j2) {
        zrx a = a();
        if (a != null) {
            a.b.c(j, TimeUnit.MILLISECONDS.toMicros(j2), 0.0d, axdq.KEYFRAME_LABEL_END);
        }
    }

    @Override // defpackage.hik
    public final void l(long j, long j2) {
        zrx a = a();
        if (a != null) {
            a.b.c(j, TimeUnit.MILLISECONDS.toMicros(j2), 1.0d, axdq.KEYFRAME_LABEL_START);
        }
    }

    @Override // defpackage.zqj
    public final void m(boolean z) {
    }

    @Override // defpackage.zqj
    public final void n(boolean z) {
        this.g.c(Boolean.valueOf(z));
    }

    @Override // defpackage.hik
    public final void o(long j, int i) {
        zrx a = a();
        if (a != null) {
            zqc zqcVar = a.b;
            axcl a2 = axcq.a();
            axds a3 = axdt.a();
            a3.copyOnWrite();
            axdt.c((axdt) a3.instance, j);
            a3.copyOnWrite();
            axdt.d((axdt) a3.instance, i);
            a2.copyOnWrite();
            ((axcq) a2.instance).z((axdt) a3.build());
            zqcVar.a.add((axcq) a2.build());
            zqb zqbVar = zqcVar.c;
            if (zqbVar != null) {
                zqbVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        final zrx a = a();
        if (a == null) {
            return false;
        }
        try {
            axdu axduVar = (axdu) aci.c(new aeu() { // from class: hia
                @Override // defpackage.aeu
                public final Object a(final aes aesVar) {
                    zrx zrxVar = zrx.this;
                    zrxVar.e(false, new zrz() { // from class: hie
                        @Override // defpackage.zrz
                        public final void a(File file, axdu axduVar2) {
                            aes aesVar2 = aes.this;
                            if (axduVar2 != null) {
                                aesVar2.c(axduVar2);
                            }
                        }
                    });
                    return zrxVar;
                }
            }).get(250L, TimeUnit.MILLISECONDS);
            return axduVar != null && axduVar.a() > 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zga.b(valueOf.length() != 0 ? "hasTextEdit() Exception: ".concat(valueOf) : new String("hasTextEdit() Exception: "));
            return false;
        }
    }
}
