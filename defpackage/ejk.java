package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejk implements ejl, ypd {
    public final ci a;
    public final wiz b;
    public final HatsController c;
    public final ysy d;
    ejg e;
    private final afsy f;
    private final aatg g;
    private final wkk h;
    private final ypa i;
    private final Executor j;
    private Object k;
    private final gjr l;
    private final axzg m;
    private final aaxn n;

    public ejk(afsy afsyVar, ci ciVar, aatg aatgVar, wkk wkkVar, wiz wizVar, ypa ypaVar, aaxn aaxnVar, HatsController hatsController, Executor executor, gjr gjrVar, ysy ysyVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.j = executor;
        this.c = hatsController;
        this.n = aaxnVar;
        this.f = afsyVar;
        this.a = ciVar;
        this.h = wkkVar;
        this.g = aatgVar;
        this.b = wizVar;
        this.i = ypaVar;
        this.l = gjrVar;
        this.d = ysyVar;
        this.m = axzgVar;
    }

    private final void g() {
        this.i.d(new wjc(wjb.CANCELLED, true));
    }

    private final void h(boolean z) {
        View findViewById = this.a.findViewById(R.id.accessibility_layer_container);
        if (findViewById instanceof AccessibilityLayerLayout) {
            AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) findViewById;
            accessibilityLayerLayout.c(z);
            accessibilityLayerLayout.b(z);
        }
    }

    @Override // defpackage.ejl
    public final void a() {
        b();
        g();
    }

    public final void b() {
        h(true);
        if (this.a.getSupportFragmentManager().f("require_signin_fragment") == null) {
            return;
        }
        Object obj = this.k;
        if (obj != null) {
            this.l.d(obj);
            this.k = null;
        }
        ejg ejgVar = (ejg) this.a.getSupportFragmentManager().f("require_signin_fragment");
        this.e = ejgVar;
        if (ejgVar == null) {
            return;
        }
        dn k = this.a.getSupportFragmentManager().k();
        k.m(this.e);
        if (((Boolean) this.m.v().x(false).aJ().e(0).aB()).booleanValue()) {
            k.d();
        } else {
            k.a();
        }
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.interstitials_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        if (this.e.am) {
            abdg p = this.n.p();
            p.k();
            aone createBuilder = asce.a.createBuilder();
            aone createBuilder2 = asbv.a.createBuilder();
            createBuilder2.copyOnWrite();
            asbv asbvVar = (asbv) createBuilder2.instance;
            asbvVar.b |= 1;
            asbvVar.c = true;
            asbv asbvVar2 = (asbv) createBuilder2.build();
            createBuilder.copyOnWrite();
            asce asceVar = (asce) createBuilder.instance;
            asbvVar2.getClass();
            asceVar.c = asbvVar2;
            asceVar.b = 6;
            p.a = (asce) createBuilder.build();
            ynm.k(this.n.q(p), this.j, egw.f, new ynl() { // from class: ejh
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj2) {
                    aulq aulqVar;
                    ejk ejkVar = ejk.this;
                    ascg ascgVar = (ascg) obj2;
                    if ((ascgVar.b & 2) != 0) {
                        aulqVar = ascgVar.d;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                    } else {
                        aulqVar = null;
                    }
                    avco avcoVar = (avco) ahbj.n(aulqVar, SurveyRenderer.surveyTriggerRenderer);
                    if (avcoVar == null || (avcoVar.b & 16) == 0) {
                        return;
                    }
                    HatsController hatsController = ejkVar.c;
                    avcn avcnVar = avcoVar.c;
                    if (avcnVar == null) {
                        avcnVar = avcn.a;
                    }
                    hatsController.j(avcnVar);
                }
            });
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            r0 = 0
            wkk r1 = r5.h     // Catch: java.lang.Exception -> L10
            android.accounts.Account[] r1 = r1.h()     // Catch: java.lang.Exception -> L10
            if (r1 == 0) goto L19
            int r2 = r1.length     // Catch: java.lang.Exception -> L10
            if (r2 <= 0) goto L19
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L10
            goto L1a
        L10:
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "Get exception when fetching device account."
            defpackage.zga.c(r1, r2)
        L19:
            r1 = r0
        L1a:
            ejg r2 = r5.e
            r2.aG()
            ejj r2 = new ejj
            r2.<init>(r5)
            r3 = 9
            if (r1 == 0) goto L36
            aatg r0 = r5.g
            java.lang.String r4 = r1.name
            com.google.android.libraries.youtube.account.identity.AccountIdentity r4 = com.google.android.libraries.youtube.account.identity.AccountIdentity.t(r4)
            java.lang.String r1 = r1.name
            r0.a(r4, r2, r1, r3)
            return
        L36:
            aatg r1 = r5.g
            afsx r4 = defpackage.afsw.a
            r1.a(r4, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejk.c():void");
    }

    @Override // defpackage.ejl
    public final void e() {
        this.i.g(this);
        afsx c = this.f.c();
        if (c.g()) {
            g();
            return;
        }
        if (c.z()) {
            if (this.k == null) {
                this.k = this.l.c(1);
            }
            if (this.a.getSupportFragmentManager().f("require_signin_fragment") == null) {
                this.e = new ejg();
                dn k = this.a.getSupportFragmentManager().k();
                k.q(R.id.interstitials_container, this.e, "require_signin_fragment");
                if (((Boolean) this.m.v().x(false).aJ().e(0).aB()).booleanValue()) {
                    k.d();
                } else {
                    k.a();
                }
            } else {
                this.e = (ejg) this.a.getSupportFragmentManager().f("require_signin_fragment");
            }
            h(false);
            ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.interstitials_container);
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            c();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
