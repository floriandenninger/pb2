package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvd implements fhw {
    public final View a;
    public ftw b;
    public fve c;
    public fvl d;
    protected int e = 0;
    private final fhx f;
    private final fvf g;
    private final fvf h;
    private final nmc i;

    public fvd(fhx fhxVar, fvf fvfVar, fvf fvfVar2, nmc nmcVar, View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = fhxVar;
        this.h = fvfVar;
        this.g = fvfVar2;
        this.i = nmcVar;
        this.a = view;
    }

    public static apmp c(auzj auzjVar) {
        if (auzjVar == null) {
            return null;
        }
        apmh apmhVar = auzjVar.o;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) == 0) {
            return null;
        }
        apmh apmhVar2 = auzjVar.o;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmp apmpVar = apmhVar2.d;
        return apmpVar == null ? apmp.a : apmpVar;
    }

    public static avaa d(auzj auzjVar) {
        if (auzjVar == null) {
            return null;
        }
        auzh auzhVar = auzjVar.p;
        if (auzhVar == null) {
            auzhVar = auzh.a;
        }
        if (auzhVar.b != 136076983) {
            return null;
        }
        auzh auzhVar2 = auzjVar.p;
        if (auzhVar2 == null) {
            auzhVar2 = auzh.a;
        }
        if (auzhVar2.b == 136076983) {
            return (avaa) auzhVar2.c;
        }
        return avaa.a;
    }

    public static avae e(auzj auzjVar) {
        if (auzjVar == null) {
            return null;
        }
        auzh auzhVar = auzjVar.p;
        if (auzhVar == null) {
            auzhVar = auzh.a;
        }
        if (auzhVar.b != 119226798) {
            return null;
        }
        auzh auzhVar2 = auzjVar.p;
        if (auzhVar2 == null) {
            auzhVar2 = auzh.a;
        }
        if (auzhVar2.b == 119226798) {
            return (avae) auzhVar2.c;
        }
        return avae.a;
    }

    private final void h() {
        ftw ftwVar = this.b;
        if (ftwVar != null) {
            ftwVar.b(null);
        }
        fve fveVar = this.c;
        if (fveVar != null) {
            fveVar.b(null, null);
        }
        fvl fvlVar = this.d;
        if (fvlVar != null) {
            fvlVar.h(null, null);
        }
        this.f.a.remove(this);
        this.e = 0;
    }

    public final View a() {
        int i = this.e;
        if (i == 1) {
            return this.b.a;
        }
        if (i == 2) {
            return this.c.a;
        }
        if (i != 3) {
            return null;
        }
        return this.d.b;
    }

    @Override // defpackage.fhw
    public final void b(afys afysVar) {
        if (this.e == 3) {
            this.d.b(afysVar);
        }
    }

    public final void f() {
        ftw ftwVar = this.b;
        if (ftwVar != null) {
            ftwVar.a();
        }
        fve fveVar = this.c;
        if (fveVar != null) {
            fveVar.a();
        }
        fvl fvlVar = this.d;
        if (fvlVar != null) {
            fvlVar.f();
        }
        this.a.setVisibility(8);
    }

    public final void g(auzj auzjVar, acra acraVar) {
        if (auzjVar == null) {
            h();
            return;
        }
        apmp c = c(auzjVar);
        int i = 0;
        if (c == null) {
            ftw ftwVar = this.b;
            if (ftwVar != null) {
                ftwVar.b(null);
            }
        } else {
            if (this.b == null) {
                this.b = this.h.c(((ViewStub) this.a.findViewById(R.id.toggle_button_view_stub)).inflate());
            }
            this.b.b(c);
            if (acraVar != null) {
                acraVar.u(new acqx(c.v), null);
            }
            this.e = 1;
            i = 1;
        }
        avae e = e(auzjVar);
        if (e == null) {
            fve fveVar = this.c;
            if (fveVar != null) {
                fveVar.b(null, acraVar);
            }
        } else {
            if (this.c == null) {
                this.c = this.g.a((ImageView) ((ViewStub) this.a.findViewById(R.id.notification_options_view_stub)).inflate());
            }
            this.c.b(e, acraVar);
            this.e = 2;
            i++;
        }
        avaa d = d(auzjVar);
        if (d == null) {
            fvl fvlVar = this.d;
            if (fvlVar != null) {
                fvlVar.h(null, acraVar);
            }
        } else {
            if (this.d == null) {
                this.d = this.i.c((TextView) ((ViewStub) this.a.findViewById(R.id.notification_toggle_view_stub)).inflate());
            }
            this.d.h(d, acraVar);
            this.e = 3;
            i++;
        }
        if (i > 1) {
            zga.b("More than 1 notification renderers were given");
            h();
        } else {
            this.f.a.add(this);
        }
    }
}
