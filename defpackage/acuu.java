package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acuu implements acva {
    public static final String a = zga.a("MDX.BackgroundPlaybackStarter");
    public final Context b;
    public final addy c;
    public final adch d;
    public final shf f;
    public final acvh g;
    public final adlt h;
    public final Intent i;
    public final azrw j;
    public final acvb k;
    public final Executor l;
    public final acun m;
    public acvd n;
    public long o;
    public boolean p;
    public adlm q;
    public boolean r;
    private final acuq t = new acuq(this);
    public final adlr s = new acur(this);
    public final Handler e = new Handler(Looper.getMainLooper());

    public acuu(Context context, addy addyVar, adch adchVar, shf shfVar, acvh acvhVar, adlt adltVar, Intent intent, azrw azrwVar, acvb acvbVar, Executor executor, acun acunVar) {
        this.b = context;
        this.c = addyVar;
        this.d = adchVar;
        this.f = shfVar;
        this.g = acvhVar;
        this.h = adltVar;
        this.i = intent;
        this.j = azrwVar;
        this.k = acvbVar;
        this.l = executor;
        this.m = acunVar;
    }

    public final void a() {
        this.e.removeCallbacksAndMessages(null);
        this.h.k(this.s);
        this.c.B(this);
        this.n = null;
        this.r = false;
        this.q = null;
    }

    public final void b() {
        adlm adlmVar = this.q;
        if (adlmVar != null) {
            this.r = true;
            adlmVar.D();
            acvb acvbVar = this.k;
            acvd acvdVar = this.n;
            acvbVar.a(7, acvdVar.e, this.p, acvdVar.d.e);
        }
        a();
    }

    public final void c(int i) {
        d(i, null);
    }

    public final void d(int i, adlm adlmVar) {
        acvd acvdVar = this.n;
        acvdVar.getClass();
        this.g.b(acvdVar);
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 5;
            } else if (i != 2) {
                adlmVar.getClass();
                i2 = 4;
            } else {
                i2 = 6;
            }
        }
        acvb acvbVar = this.k;
        acvd acvdVar2 = this.n;
        acvbVar.a(i2, acvdVar2.e, this.p, acvdVar2.d.e);
        a();
    }

    @Override // defpackage.acva
    public final void e(acvd acvdVar) {
        f(acvdVar, false);
    }

    public final void f(acvd acvdVar, boolean z) {
        this.p = z;
        this.g.f(this.t);
        this.g.c(acvdVar);
        if (acvdVar.c <= 0) {
            acvc acvcVar = new acvc(acvdVar);
            acvcVar.d(10);
            acvdVar = acvcVar.a();
        }
        this.o = this.f.c();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.H(this);
        } else {
            this.e.post(new Runnable() { // from class: acup
                @Override // java.lang.Runnable
                public final void run() {
                    acuu acuuVar = acuu.this;
                    acuuVar.c.H(acuuVar);
                }
            });
        }
        this.n = acvdVar;
        this.e.removeCallbacksAndMessages(null);
        this.e.post(new acut(this));
    }
}
