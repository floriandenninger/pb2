package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adko implements ypd {
    public final Context b;
    public final ainy c;
    public final adch d;
    public final azrw e;
    public final bph f;
    public final addy g;
    public final adkj h;
    public final shf i;
    public adtp j;
    public adge k;
    final azrh l;
    boolean m;
    public final adkn n = new adkn(this, 1);
    public final adkn a = new adkn(this, 0);

    public adko(Context context, ainy ainyVar, adch adchVar, azrw azrwVar, bph bphVar, addy addyVar, adtp adtpVar, shf shfVar) {
        final int i = 1;
        final int i2 = 0;
        azrh e = azrh.e();
        this.l = e;
        this.b = context;
        this.c = ainyVar;
        this.d = adchVar;
        this.e = azrwVar;
        this.f = bphVar;
        this.g = addyVar;
        this.j = adtpVar;
        this.h = new adkj(this);
        this.i = shfVar;
        adgc a = adge.a();
        ynm.i(this.j.a(a), new adkh(this, a, 1));
        e.ax(new ayrs(this) { // from class: adki
            public final /* synthetic */ adko a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.k = (adge) obj;
                    return;
                }
                adko adkoVar = this.a;
                adtp adtpVar2 = (adtp) obj;
                adkoVar.j = adtpVar2;
                adgc b = adkoVar.k.b();
                ynm.i(adtpVar2.a(b), new adkh(adkoVar, b, 0));
            }
        });
        adtpVar.f.ax(new ayrs(this) { // from class: adki
            public final /* synthetic */ adko a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.k = (adge) obj;
                    return;
                }
                adko adkoVar = this.a;
                adtp adtpVar2 = (adtp) obj;
                adkoVar.j = adtpVar2;
                adgc b = adkoVar.k.b();
                ynm.i(adtpVar2.a(b), new adkh(adkoVar, b, 0));
            }
        });
    }

    public final void a() {
        adgc b = this.k.b();
        b.p(0);
        b.f(this.i.c());
        this.l.c(b.a());
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adek.class, ahee.class};
        }
        if (i == 0) {
            adek adekVar = (adek) obj;
            if (!adekVar.a() || !adekVar.b()) {
                return null;
            }
            adtp adtpVar = this.j;
            ynm.i(adtpVar.b, new adtn(adtpVar, 0));
            return null;
        }
        if (i == 1) {
            adgc b = this.k.b();
            b.q(((ahee) obj).a);
            b.f(this.i.c());
            this.l.c(b.a());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
