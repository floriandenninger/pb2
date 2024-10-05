package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqa implements ajjs {
    protected final Executor a;
    protected final yrw b;
    public final shf c;
    protected final String d;
    protected final afrj e;
    public final ylz f;
    public final ajjn g;
    public final apdb h;
    private final afvq i;
    private final afvq j;
    private final afvq k;
    private final azrw l;
    private final amnv m;

    public afqa(Executor executor, Context context, yrw yrwVar, azrw azrwVar, File file, shf shfVar, apdb apdbVar, ajjn ajjnVar, final azrw azrwVar2, final azrw azrwVar3, ammv ammvVar) {
        afvq c;
        afvq ajkgVar;
        afvq c2;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        executor.getClass();
        this.a = executor;
        yrwVar.getClass();
        this.b = yrwVar;
        shfVar.getClass();
        this.c = shfVar;
        this.d = absolutePath;
        afrj afrjVar = new afrj();
        this.e = afrjVar;
        this.l = azrwVar;
        this.h = apdbVar;
        amnv x = amkq.x(new amnv() { // from class: ajjk
            @Override // defpackage.amnv
            public final Object get() {
                afqa afqaVar = afqa.this;
                return (afqaVar.h.f && ((akto) azrwVar3.get()).b(afqaVar.h.h, aksi.STREAMZ_DEFAULT_IMAGE_CLIENT_SAMPLING)) ? ammv.j((aksl) azrwVar2.get()) : amlr.a;
            }
        });
        this.m = x;
        if (absolutePath != null) {
            ymk j = ymk.j(absolutePath, yml.a);
            j.n(executor);
            this.f = j;
        } else {
            this.f = null;
        }
        this.g = ajjnVar;
        ylz ylzVar = this.f;
        ylz a = ajjnVar.a();
        azrw azrwVar4 = (azrw) ammvVar.f();
        if (ylzVar == null) {
            if (apdbVar.g) {
                c = new afvf((ysl) azrwVar.get(), new afqz(new afrf()));
            } else {
                c = c(afrjVar, new afrb());
            }
            ajkgVar = new ajkg(c, x);
        } else {
            if (apdbVar.g) {
                c2 = new afvf((ysl) azrwVar.get(), new afqz(new afrg(shfVar, new afrf())));
            } else {
                c2 = c(afrjVar, new afrc(shfVar, new afrb()));
            }
            ajkgVar = new ajkf(ylzVar, new ajkg(c2, x), shfVar, x);
        }
        afvq afvaVar = new afva(new afus(context.getContentResolver(), new afuo(context.getContentResolver(), ajkgVar)));
        if (apdbVar.l && azrwVar4 != null) {
            afvaVar = new ajlt((ajlu) azrwVar4.get(), afvaVar);
        }
        afvq ajkdVar = new ajkd(a, afvaVar, shfVar, x);
        this.i = ajkdVar;
        this.j = b(ajkdVar);
        afvq ajkdVar2 = new ajkd(ajjnVar.b(), b(new afuu(ajkdVar, new ajji(), executor)), shfVar, x);
        this.k = apdbVar.i ? new afuw(ajkdVar2) : ajkdVar2;
    }

    @Override // defpackage.ajjs, defpackage.zaf
    public final void a(Uri uri, ykl yklVar) {
        this.k.c(uri, yklVar);
    }

    protected final afuq b(afvq afvqVar) {
        return afuq.a(this.a, afvqVar);
    }

    protected final afvg c(afrh afrhVar, afra afraVar) {
        return new afvg(this.b, afrhVar, afraVar);
    }

    @Override // defpackage.ajjs
    public final void d() {
        this.g.c();
    }

    public final void e(Uri uri) {
        this.f.b(uri);
        this.g.d(uri);
    }

    @Override // defpackage.ajjs
    public final void f(Uri uri, Uri uri2) {
        e(uri);
        e(uri2);
        g(uri2, new ajjl(this, uri));
    }

    @Override // defpackage.ajjs
    public final void g(Uri uri, ykl yklVar) {
        this.j.c(uri, yklVar);
    }

    @Override // defpackage.ajjs
    public final boolean h(Uri uri) {
        return this.f.e(uri);
    }
}
