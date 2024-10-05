package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adul implements adlr {
    public static final String a = zga.a("MDX.WatchStateAggregator");
    public boolean b;
    public boolean c;
    public ykn d;
    public final aihs h;
    public adub i;
    private boolean k;
    private final ypa l;
    private final aioc m;
    private final adui p;
    private adlm q;
    private adud r;
    final aduk j = new aduk(this, 1);
    final aduk e = new aduk(this, 0);
    final aduh f = new aduh(this);
    final aduf g = new aduf(this);
    private final ayqw n = new ayqw();
    private final Set o = new CopyOnWriteArraySet();

    public adul(ypa ypaVar, aihs aihsVar, aioc aiocVar, adui aduiVar) {
        this.l = ypaVar;
        this.m = aiocVar;
        this.h = aihsVar;
        this.p = aduiVar;
        adua a2 = adub.a();
        a2.c = o();
        this.i = a2.a();
    }

    private static adtx o() {
        adtw a2 = adtx.a();
        a2.a = null;
        a2.b = null;
        a2.c(2);
        a2.b(-1);
        a2.c = null;
        return a2.a();
    }

    private static String p(adlm adlmVar) {
        return adlmVar.k().c();
    }

    private static String q(adlm adlmVar) {
        String str;
        if (adlmVar == null) {
            return "session is null";
        }
        if (adlmVar.k() != null) {
            int e = adlmVar.k().e();
            str = e != 2 ? e != 3 ? "MDX_SESSION_TYPE_MANUALLY_PAIRED" : "MDX_SESSION_TYPE_DIAL" : "MDX_SESSION_TYPE_CAST";
        } else {
            str = "n/a because MdxScreen is null";
        }
        int a2 = adlmVar.a();
        boolean aj = adlmVar.aj();
        StringBuilder sb = new StringBuilder(str.length() + 72);
        sb.append("session type: ");
        sb.append(str);
        sb.append(", session state: ");
        sb.append(a2);
        sb.append(", was session restarted: ");
        sb.append(aj);
        return sb.toString();
    }

    public final void a(adue adueVar) {
        this.o.add(adueVar);
    }

    public final void b(int i) {
        adlm adlmVar;
        yjk.f();
        if (this.o.isEmpty()) {
            return;
        }
        if (i == 2 || ((adlmVar = this.q) != null && adlmVar.a() != 2)) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((adue) it.next()).oZ(i, this.i);
            }
        } else {
            String str = a;
            StringBuilder sb = new StringBuilder(64);
            sb.append("session disconnected, not notifying property change: ");
            sb.append(i);
            zga.m(str, sb.toString());
        }
    }

    public final void c(adue adueVar) {
        this.o.remove(adueVar);
    }

    public final void e(String str) {
        if (TextUtils.equals(str, this.i.l)) {
            return;
        }
        adua b = this.i.b();
        b.b(str);
        m(b);
    }

    public final void f(int i) {
        adub adubVar = this.i;
        int i2 = adubVar.a;
        if (i != i2) {
            adua b = adubVar.b();
            if (i2 == 2) {
                b.c = o();
                this.b = false;
            }
            b.e(i);
            m(b);
            b(0);
        }
    }

    public final void g(String str) {
        if (TextUtils.equals(str, this.i.b)) {
            return;
        }
        adua b = this.i.b();
        b.a = str;
        m(b);
        b(1);
    }

    public final void h(int i, int i2) {
        adub adubVar = this.i;
        if (i == adubVar.e && i2 == adubVar.d) {
            return;
        }
        adua b = adubVar.b();
        b.c(i);
        b.g(i2);
        m(b);
        b(3);
    }

    public final void i(adtw adtwVar) {
        adua b = this.i.b();
        b.c = adtwVar.a();
        m(b);
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        adlm adlmVar2 = this.q;
        if (adlmVar2 != adlmVar) {
            int i = this.i.j;
            String q = q(adlmVar2);
            String q2 = q(adlmVar);
            StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 266 + String.valueOf(q2).length());
            sb.append("The previously stored mdxSession did not match the session passed in as connected.Previous connection state: ");
            sb.append(i);
            sb.append(" | Previous session info - ");
            sb.append(q);
            sb.append(" | Current session info - ");
            sb.append(q2);
            sb.append(" | Ignoring previous session, since the current session is now what the user is connected to.");
            afsi.b(1, 21, sb.toString());
            this.q = adlmVar;
        }
        adua b = this.i.b();
        b.d(adlmVar.a());
        b.b = p(adlmVar);
        m(b);
        b(2);
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        adua a2 = adub.a();
        a2.d(adlmVar.a());
        a2.c = o();
        m(a2);
        adlm adlmVar2 = this.q;
        if (adlmVar2 != null) {
            adlmVar2.O(this.r);
            this.q = null;
        }
        ykn yknVar = this.d;
        if (yknVar != null) {
            yknVar.d();
            this.d = null;
        }
        b(2);
        if (this.k) {
            this.n.c();
            this.l.m(this.g);
            this.p.b(this.f);
            this.k = false;
        }
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        if (!this.k) {
            this.n.g(this.j.kI(this.m));
            this.n.g(this.e.kI(this.m));
            this.l.g(this.g);
            this.p.a(this.f);
            this.k = true;
        }
        adua b = this.i.b();
        b.d(adlmVar.a());
        b.b = p(adlmVar);
        m(b);
        this.q = adlmVar;
        if (this.r == null) {
            this.r = new adud(this);
        }
        this.q.A(this.r);
        b(2);
    }

    public final void m(adua aduaVar) {
        this.i = aduaVar.a();
    }

    public final void d(CharSequence charSequence, avgg avggVar) {
        boolean equals;
        avgg avggVar2 = this.i.f.e;
        if (avggVar2 == null) {
            equals = avggVar == null;
        } else {
            equals = avggVar2.equals(avggVar);
        }
        if (TextUtils.equals(charSequence, this.i.f.a) && equals) {
            return;
        }
        adtw b = this.i.f.b();
        b.a = charSequence;
        b.c = avggVar;
        i(b);
        b(1);
    }
}
