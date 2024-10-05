package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajku implements ajjs {
    public static volatile cnv a;
    private static final Object b = new Object();
    private final Context c;
    private final Executor d;
    private final amnv e;
    private final amnv f;

    public ajku(Context context, Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.c = context;
        this.d = executor;
        this.e = amkq.x(new ajkv(azrwVar2, azrwVar3, azrwVar, 1));
        this.f = amkq.x(new uqa(azrwVar2, 7));
    }

    private static void b(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = cnv.b(context);
                }
            }
        }
    }

    @Override // defpackage.ajjs, defpackage.zaf
    public final void a(final Uri uri, final ykl yklVar) {
        b(this.c);
        yklVar.getClass();
        final con f = cnv.c(this.c).b().d((dbw) this.e.get()).f(uri);
        ahbw.y(((Integer) this.f.get()).intValue(), f);
        if (ddn.o()) {
            f.q(new ajks(yklVar, uri));
        } else {
            this.d.execute(new Runnable() { // from class: ajkq
                @Override // java.lang.Runnable
                public final void run() {
                    con conVar = con.this;
                    ykl yklVar2 = yklVar;
                    Uri uri2 = uri;
                    try {
                        yklVar2.b(uri2, (Bitmap) conVar.n().get());
                    } catch (Exception e) {
                        yklVar2.a(uri2, e);
                    }
                }
            });
        }
    }

    @Override // defpackage.ajjs
    public final void d() {
        if (a != null) {
            synchronized (b) {
                if (a != null) {
                    Executor executor = ynm.a;
                    ynm.q(ajfg.b);
                }
            }
        }
    }

    @Override // defpackage.ajjs
    public final void f(Uri uri, Uri uri2) {
    }

    @Override // defpackage.ajjs
    public final void g(final Uri uri, final ykl yklVar) {
        yklVar.getClass();
        b(this.c);
        con f = cnv.c(this.c).a(byte[].class).f(uri);
        ahbw.y(((Integer) this.f.get()).intValue(), f);
        if (!ddn.o()) {
            ynm.k(anfq.h(aci.c(new cpi(f)), new hom(1), ddh.b), this.d, new ynk() { // from class: ajko
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    ykl.this.a(uri, th instanceof Exception ? (Exception) th : new Exception(th));
                }
            }, new ynl() { // from class: ajkp
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    ykl.this.b(uri, (byte[]) obj);
                }
            });
        } else {
            f.q(new ajkr(yklVar, uri));
        }
    }

    @Override // defpackage.ajjs
    public final boolean h(Uri uri) {
        throw new RuntimeException("Should not be called in GlideImageClient");
    }
}
