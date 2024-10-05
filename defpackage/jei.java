package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxAssistedTvSignInDialogFragmentController;
import com.google.android.youtube.R;
import j$.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jei implements ypd {
    public final axpg a;
    public final axpg b;
    public final axpg c;
    public final axpg d;
    public final axpg e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final azrw g;
    public final axpg h;
    public final Executor i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final axpg m;
    private final axpg n;

    public jei(axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, axpg axpgVar5, axpg axpgVar6, axpg axpgVar7, azrw azrwVar, axpg axpgVar8, Executor executor, acue acueVar) {
        this.a = axpgVar;
        this.c = axpgVar2;
        this.m = axpgVar3;
        this.n = axpgVar4;
        this.b = axpgVar5;
        this.d = axpgVar6;
        this.e = axpgVar7;
        this.g = azrwVar;
        this.h = axpgVar8;
        this.i = executor;
        acueVar.m().aE(new jeh(this, 1));
        acueVar.n().aE(new jeh(this, 0));
        acueVar.g().aE(new jeh(this, 2));
    }

    public final boolean b(String str, boolean z) {
        return ((adru) this.m.get()).a((ml) this.n.get(), ((ml) this.n.get()).getString(R.string.mdx_seamless_tv_sign_in_drawer_fragment_title, new Object[]{str}), ammv.j(((ml) this.n.get()).getString(R.string.mdx_seamless_tv_sign_in_drawer_fragment_subtitle)), z);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adsu.class};
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        final adsu adsuVar = (adsu) obj;
        if (!adsuVar.e()) {
            return null;
        }
        fhg g = ((fgq) this.c.get()).g();
        if (adsuVar.a() == 0 || adsuVar.a() == 1) {
            final boolean z = (g == fhg.NONE && (((adlt) this.b.get()).g() == null || ((adlt) this.b.get()).g().y() == null)) ? false : true;
            if (adsuVar.a() == 1 && this.j) {
                this.f.postDelayed(new Runnable() { // from class: jef
                    @Override // java.lang.Runnable
                    public final void run() {
                        final jei jeiVar = jei.this;
                        final adsu adsuVar2 = adsuVar;
                        final boolean z2 = z;
                        if (((gbh) jeiVar.e.get()).b() != null) {
                            return;
                        }
                        final anhy anhyVar = ((amce) jeiVar.d.get()).a;
                        final anhy anhyVar2 = ((amce) jeiVar.d.get()).a;
                        final anhy a = ((vgz) jeiVar.g.get()).a();
                        anaf.I(anhyVar, anhyVar2, a).a(new Callable() { // from class: jeg
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                boolean z3;
                                aoqa aoqaVar;
                                final jei jeiVar2 = jei.this;
                                adsu adsuVar3 = adsuVar2;
                                anhy anhyVar3 = anhyVar;
                                anhy anhyVar4 = anhyVar2;
                                anhy anhyVar5 = a;
                                boolean z4 = z2;
                                adfs b = adsuVar3.b();
                                boolean booleanValue = ((Boolean) ((anhv) anhyVar3).b).booleanValue();
                                boolean booleanValue2 = ((Boolean) ((anhv) anhyVar4).b).booleanValue();
                                aoqa aoqaVar2 = ((awke) anhyVar5.get()).c;
                                if (aoqaVar2 == null) {
                                    aoqaVar2 = aoqa.a;
                                }
                                Map unmodifiableMap = Collections.unmodifiableMap(((awke) anhyVar5.get()).d);
                                if (!booleanValue2 && unmodifiableMap.containsKey(b.c) && (aoqaVar = (aoqa) unmodifiableMap.get(b.c)) != null && aoqaVar.b != 0) {
                                    if (((anev) jeiVar2.h.get()).a().compareTo(Instant.ofEpochMilli(TimeUnit.SECONDS.toMillis(aoqaVar.b) + TimeUnit.DAYS.toMillis(30L))) <= 0) {
                                        z3 = true;
                                        boolean z5 = booleanValue && aoqaVar2.b != 0 && ((anev) jeiVar2.h.get()).a().compareTo(Instant.ofEpochMilli(TimeUnit.SECONDS.toMillis(aoqaVar2.b) + TimeUnit.DAYS.toMillis(1L))) <= 0;
                                        if (!z3 || z5) {
                                            return anhv.a;
                                        }
                                        if (jeiVar2.b(adsuVar3.d(), z4)) {
                                            final adfs b2 = adsuVar3.b();
                                            ynm.m(((vgz) jeiVar2.g.get()).b(new amml() { // from class: jee
                                                @Override // defpackage.amml
                                                public final Object apply(Object obj2) {
                                                    jei jeiVar3 = jei.this;
                                                    adfs adfsVar = b2;
                                                    aone builder = ((awke) obj2).toBuilder();
                                                    aoqa cf = amkq.cf((anev) jeiVar3.h.get());
                                                    builder.copyOnWrite();
                                                    awke awkeVar = (awke) builder.instance;
                                                    cf.getClass();
                                                    awkeVar.c = cf;
                                                    awkeVar.b |= 1;
                                                    String str = adfsVar.c;
                                                    builder.copyOnWrite();
                                                    ((awke) builder.instance).a().remove(str);
                                                    String str2 = adfsVar.c;
                                                    aoqa cf2 = amkq.cf((anev) jeiVar3.h.get());
                                                    cf2.getClass();
                                                    builder.copyOnWrite();
                                                    ((awke) builder.instance).a().put(str2, cf2);
                                                    return (awke) builder.build();
                                                }
                                            }, jeiVar2.i), gwr.l);
                                        }
                                        return anhv.a;
                                    }
                                }
                                z3 = false;
                                if (booleanValue) {
                                }
                                if (!z3) {
                                }
                                return anhv.a;
                            }
                        }, jeiVar.i);
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return null;
            }
            if (adsuVar.a() == 0 && this.k) {
                ((gbh) this.e.get()).c(true);
                b(adsuVar.d(), z);
            }
        }
        if ((g.i() || g == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || g == fhg.WATCH_WHILE_FULLSCREEN) && adsuVar.a() == 2) {
            ((MdxAssistedTvSignInDialogFragmentController) this.a.get()).g();
            return null;
        }
        if (adsuVar.a() != 2 || !this.l) {
            return null;
        }
        MdxAssistedTvSignInDialogFragmentController mdxAssistedTvSignInDialogFragmentController = (MdxAssistedTvSignInDialogFragmentController) this.a.get();
        if (!mdxAssistedTvSignInDialogFragmentController.b.getBoolean("MdxDisableMdxAssistedSignInTvDenylist", false)) {
            String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(adsuVar.c().c);
            long millis = TimeUnit.DAYS.toMillis(mdxAssistedTvSignInDialogFragmentController.d);
            if (mdxAssistedTvSignInDialogFragmentController.b.contains(concat)) {
                long j = mdxAssistedTvSignInDialogFragmentController.b.getLong(concat, 0L);
                if (j != 0 && mdxAssistedTvSignInDialogFragmentController.c.c() - j < millis) {
                    mdxAssistedTvSignInDialogFragmentController.g();
                    return null;
                }
            }
            mdxAssistedTvSignInDialogFragmentController.b.edit().putLong(concat, mdxAssistedTvSignInDialogFragmentController.c.c()).apply();
        }
        mdxAssistedTvSignInDialogFragmentController.k();
        if (mdxAssistedTvSignInDialogFragmentController.i() != null) {
            return null;
        }
        adsq adsqVar = mdxAssistedTvSignInDialogFragmentController.a;
        jed jedVar = new jed();
        jedVar.ag = adsqVar;
        mdxAssistedTvSignInDialogFragmentController.j(jedVar);
        return null;
    }
}
