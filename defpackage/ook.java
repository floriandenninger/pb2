package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ook implements aftf, fxi, ypd {
    public final WatchWhileActivity a;
    public final ony b;
    public final aftn c;
    public final afsy d;
    public final wdj e;
    public final afte f;
    public final fxj g;
    public final aaea h;
    public final azrw i;
    public final wiu j;
    public final azrw k;
    public int l;
    public String m;
    public ProgressDialog n;
    public final aadw o;
    private final omy p;
    private final aahd q;
    private final fgj r;
    private final azrw s;
    private final gcl t;
    private final wdm u;

    public ook(WatchWhileActivity watchWhileActivity, ony onyVar, omy omyVar, aftn aftnVar, afsy afsyVar, wdj wdjVar, aahd aahdVar, fgj fgjVar, gcl gclVar, azrw azrwVar, afte afteVar, wdm wdmVar, fxj fxjVar, aaea aaeaVar, aadw aadwVar, azrw azrwVar2, wiu wiuVar, azrw azrwVar3) {
        this.a = watchWhileActivity;
        this.b = onyVar;
        this.p = omyVar;
        this.c = aftnVar;
        this.d = afsyVar;
        this.e = wdjVar;
        this.q = aahdVar;
        this.r = fgjVar;
        this.s = azrwVar;
        this.t = gclVar;
        this.f = afteVar;
        this.u = wdmVar;
        this.g = fxjVar;
        this.h = aaeaVar;
        this.o = aadwVar;
        this.i = azrwVar2;
        this.j = wiuVar;
        this.k = azrwVar3;
    }

    @Override // defpackage.fxi
    public final void a() {
        if (this.d.c().g()) {
            this.f.h();
        }
    }

    @Override // defpackage.fxi
    public final void b() {
        if (this.d.c().g()) {
            this.f.c();
        }
    }

    public final void c(Bundle bundle) {
        this.l = bundle != null ? bundle.getInt("recreate_signed_in_state", 0) : 0;
        this.f.i(this);
        this.g.g(this);
    }

    public final boolean d(final boolean z, final apxf apxfVar) {
        Runnable runnable = new Runnable() { // from class: ooj
            @Override // java.lang.Runnable
            public final void run() {
                ook.this.e(z, apxfVar);
            }
        };
        oor oorVar = (oor) this.s.get();
        if (!z) {
            return e(false, apxfVar);
        }
        oorVar.n(runnable);
        this.a.p().y = true;
        return true;
    }

    public final boolean e(boolean z, apxf apxfVar) {
        if (!this.d.t()) {
            if (!z) {
                return false;
            }
            if (!this.a.p().E()) {
                boolean z2 = this.l == 1;
                ProgressDialog progressDialog = this.n;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismissDialog(1032);
                }
                this.l = 2;
                ((fzb) this.k.get()).j();
                if (!this.r.l()) {
                    this.b.w(z2);
                }
                this.b.b = null;
                this.p.a();
            }
            return true;
        }
        if (!this.a.p().E()) {
            ProgressDialog progressDialog2 = this.n;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.a.dismissDialog(1032);
            }
            int i = this.l;
            this.l = 1;
            ((fzb) this.k.get()).j();
            this.b.w(z || i != 1);
            if (apxfVar != null) {
                if (this.r.l()) {
                    this.r.j();
                }
                if (!fkc.g(apxfVar)) {
                    this.q.c(apxfVar, null);
                }
            }
            this.p.a();
        }
        return true;
    }

    @Override // defpackage.aftf
    public final void j() {
    }

    @Override // defpackage.aftf
    public final void k() {
        wdk a;
        if (!this.d.t() || (a = this.u.a()) == null) {
            return;
        }
        gcm d = gcq.d();
        d.k(this.a.getString(R.string.sign_in_as, new Object[]{a.d, a.b}));
        this.t.j(d.b());
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class};
        }
        if (i == 0) {
            wjc wjcVar = (wjc) obj;
            if (wjcVar.a() == wjb.FINISHED && wjcVar.c()) {
                String d = this.d.c().d();
                if (!TextUtils.equals(d, this.m)) {
                    this.m = d;
                    this.b.t(8);
                    d(true, wjcVar.b());
                    return null;
                }
            }
            e(wjcVar.c(), wjcVar.b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftf
    public final void l() {
        String string = this.a.getString(R.string.incognito_auto_terminated);
        String string2 = this.a.getString(R.string.ok);
        amkq.E(!TextUtils.isEmpty(string));
        amkq.E(!TextUtils.isEmpty(string2));
        new AlertDialog.Builder(this.a).setMessage(string).setPositiveButton(string2, (DialogInterface.OnClickListener) null).show();
    }
}
