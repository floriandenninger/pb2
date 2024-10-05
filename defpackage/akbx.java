package defpackage;

import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbx implements akbm {
    public Boolean a;
    public Boolean b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public View.OnClickListener f;
    public apmg g;
    public View.OnClickListener h;
    public apmg i;
    public avgg j;
    public Optional k;
    public acsc l;
    public akbl m;
    private Boolean n;
    private Integer o;
    private CharSequence p;
    private Integer q;

    public akbx(byte[] bArr) {
        this.k = Optional.empty();
    }

    public final akbx a(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.e = charSequence;
        this.f = onClickListener;
        this.g = null;
        return this;
    }

    public final akbx b(CharSequence charSequence, View.OnClickListener onClickListener, apmg apmgVar) {
        akbx a = a(charSequence, onClickListener);
        a.g = apmgVar;
        return a;
    }

    public final akbx c(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.p = charSequence;
        this.h = onClickListener;
        this.i = null;
        return this;
    }

    @Override // defpackage.akbm
    public final /* bridge */ /* synthetic */ void d(int i) {
        throw null;
    }

    public final akbx e(int i) {
        k();
        h(i);
        this.k = Optional.empty();
        return this;
    }

    public final akby f() {
        Boolean bool = this.n;
        if (bool == null || this.a == null || this.b == null || this.o == null || this.q == null) {
            StringBuilder sb = new StringBuilder();
            if (this.n == null) {
                sb.append(" rateLimited");
            }
            if (this.a == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.b == null) {
                sb.append(" counterfactual");
            }
            if (this.o == null) {
                sb.append(" duration");
            }
            if (this.q == null) {
                sb.append(" icon");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akby(bool.booleanValue(), this.a.booleanValue(), this.b.booleanValue(), this.o.intValue(), this.c, this.d, this.e, this.f, this.g, this.p, this.h, this.i, this.j, this.q.intValue(), this.k, this.l, this.m);
    }

    public final void g(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void h(int i) {
        this.q = Integer.valueOf(i);
    }

    public final void i(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void j() {
        this.o = -2;
    }

    public final /* synthetic */ void k() {
        this.j = null;
    }

    public akbx() {
    }
}
