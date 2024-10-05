package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adiy implements ypd {
    final /* synthetic */ adiz a;

    public adiy(adiz adizVar) {
        this.a = adizVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adlc.class, adlu.class, aftm.class};
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a.e = true;
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            adlu adluVar = (adlu) obj;
            ainy f = this.a.f();
            f.getClass();
            adlm a = adluVar.a();
            if (a == null) {
                this.a.b.b();
                this.a.d(adluVar.b());
                return null;
            }
            int a2 = a.a();
            if (a2 == 0) {
                f.a();
                return null;
            }
            if (a2 != 1) {
                this.a.b.b();
                this.a.d(adluVar.b());
                return null;
            }
            this.a.b.b();
            this.a.b();
            return null;
        }
        adlc adlcVar = (adlc) obj;
        this.a.f().getClass();
        adlm g = this.a.c.g();
        if (g == null) {
            return null;
        }
        adiz adizVar = this.a;
        if (adizVar.e) {
            adizVar.e = false;
            return null;
        }
        adle b = adlcVar.b();
        if (b.f()) {
            int a3 = adlcVar.a();
            if (a3 == 1) {
                this.a.c(b);
                return null;
            }
            if (a3 != 2) {
                return null;
            }
            this.a.a(b);
            return null;
        }
        if (!b.h(g.x()) || TextUtils.isEmpty(g.w())) {
            if (!g.ab() || !g.aa()) {
                adiz adizVar2 = this.a;
                ainy f2 = adizVar2.f();
                f2.getClass();
                f2.s();
                adizVar2.a.d(adjb.CONNECTED_ONLY);
                return null;
            }
            String.valueOf(String.valueOf(adlcVar)).length();
            return null;
        }
        this.a.a(b);
        return null;
    }
}
