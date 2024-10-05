package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acd extends apm {
    public Executor a;
    public abz b;
    public abx c;
    public DialogInterface.OnClickListener d;
    public CharSequence e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public aow l;
    public aow m;
    public aow n;
    public aow o;
    public aow p;
    public aow r;
    public aow t;
    public aow u;
    public abe v;
    private abg y;
    private acf z;
    public int f = 0;
    public boolean q = true;
    public int s = 0;

    public static void p(aow aowVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aowVar.l(obj);
        } else {
            aowVar.j(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        abz abzVar = this.b;
        if (abzVar != null) {
            return abd.c(abzVar, this.c);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final abg b() {
        if (this.y == null) {
            this.y = new abg(new acb(this));
        }
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acf c() {
        if (this.z == null) {
            this.z = new acf();
        }
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence e() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        abz abzVar = this.b;
        if (abzVar == null) {
            return null;
        }
        CharSequence charSequence2 = abzVar.c;
        return charSequence2 != null ? charSequence2 : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence f() {
        abz abzVar = this.b;
        if (abzVar != null) {
            return abzVar.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence g() {
        abz abzVar = this.b;
        if (abzVar != null) {
            return abzVar.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Executor h() {
        Executor executor = this.a;
        return executor != null ? executor : new ruj(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(abh abhVar) {
        if (this.m == null) {
            this.m = new aow();
        }
        p(this.m, abhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        if (this.o == null) {
            this.o = new aow();
        }
        p(this.o, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(abw abwVar) {
        if (this.l == null) {
            this.l = new aow();
        }
        p(this.l, abwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z) {
        if (this.r == null) {
            this.r = new aow();
        }
        p(this.r, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(CharSequence charSequence) {
        if (this.u == null) {
            this.u = new aow();
        }
        p(this.u, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i) {
        if (this.t == null) {
            this.t = new aow();
        }
        p(this.t, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z) {
        if (this.p == null) {
            this.p = new aow();
        }
        p(this.p, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final abe r() {
        if (this.v == null) {
            this.v = new abe();
        }
        return this.v;
    }
}
