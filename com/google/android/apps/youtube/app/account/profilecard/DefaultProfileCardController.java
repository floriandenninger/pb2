package com.google.android.apps.youtube.app.account.profilecard;

import com.google.android.apps.youtube.app.account.profilecard.DefaultProfileCardController;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import defpackage.aahd;
import defpackage.aatk;
import defpackage.aayb;
import defpackage.acra;
import defpackage.acsb;
import defpackage.afsy;
import defpackage.ajoy;
import defpackage.ajvp;
import defpackage.anhy;
import defpackage.apxf;
import defpackage.ci;
import defpackage.eiv;
import defpackage.eiw;
import defpackage.eix;
import defpackage.fyb;
import defpackage.slr;
import defpackage.ynk;
import defpackage.ynl;
import defpackage.ynm;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultProfileCardController extends DialogFragmentController implements eiv {
    public Executor a;
    public afsy b;
    public fyb c;
    public acra d;
    public final slr e;
    public final aahd f;
    public aayb g;
    public ajoy h;

    public DefaultProfileCardController(ci ciVar, slr slrVar, aahd aahdVar) {
        super(ciVar, "DefaultProfileCardController");
        this.e = slrVar;
        this.f = aahdVar;
    }

    public final void g(String str, String str2, final String str3, boolean z, byte[] bArr, final eix eixVar) {
        aatk aatkVar = new aatk(this.h, this.b.c(), str, str2, str3, null, null, null);
        if (bArr == null || bArr.length <= 0) {
            aatkVar.k();
        } else {
            aatkVar.m(bArr);
        }
        if (z) {
            anhy d = this.g.d(aatkVar, this.a);
            Executor executor = this.a;
            ynk ynkVar = new ynk() { // from class: eiq
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                    eix eixVar2 = eixVar;
                    ajtv ajtvVar = new ajtv(defaultProfileCardController.c.a(th), true, null, null);
                    eixVar2.aH();
                    eixVar2.ao.add(eix.aL(ajtvVar, eixVar2.ap));
                }
            };
            eixVar.getClass();
            ynm.k(d, executor, ynkVar, new eiw(eixVar, 1));
            return;
        }
        ynm.k(this.g.d(aatkVar, this.a), this.a, new ynk() { // from class: eir
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                defaultProfileCardController.e.c(str3);
            }
        }, new ynl() { // from class: eis
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                arrz arrzVar = (arrz) obj;
                defaultProfileCardController.e.b(arrzVar.f.I(), str3);
                aahd aahdVar = defaultProfileCardController.f;
                apxf apxfVar = arrzVar.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
    }

    @Override // defpackage.eiv
    public final void h(final String str, final String str2, final String str3, boolean z, apxf apxfVar) {
        eix eixVar;
        final byte[] I = apxfVar.c.I();
        if (z) {
            k();
            eix eixVar2 = (eix) i();
            if (eixVar2 == null) {
                final eix eixVar3 = new eix();
                eixVar3.ap = new ajvp() { // from class: eit
                    @Override // defpackage.ajvp
                    public final void ln() {
                        DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                        eix eixVar4 = eixVar3;
                        String str4 = str;
                        String str5 = str2;
                        String str6 = str3;
                        byte[] bArr = I;
                        eixVar4.aH();
                        eixVar4.ao.add(eix.aL(ajtw.a(), null));
                        defaultProfileCardController.g(str4, str5, str6, true, bArr, eixVar4);
                    }
                };
                j(eixVar3);
                eixVar2 = eixVar3;
            }
            this.d.d(acsb.b(66557), apxfVar, null);
            eixVar2.aq = this.d;
            eixVar = eixVar2;
        } else {
            eixVar = null;
        }
        g(str, str2, str3, z, I, eixVar);
    }
}
