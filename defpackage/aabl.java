package defpackage;

import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aabl implements ypd {
    private final zaz a;
    public final aabi b;
    public final aabq c;
    public final aabn d;
    public aigf e;
    public InfoCardCollection f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final xjl j;
    private final ahsl k;

    public aabl(aabi aabiVar, zaz zazVar, aabq aabqVar, aabn aabnVar, xjl xjlVar, ahsl ahslVar) {
        aabiVar.getClass();
        this.b = aabiVar;
        zazVar.getClass();
        this.a = zazVar;
        aabqVar.getClass();
        this.c = aabqVar;
        aabnVar.getClass();
        this.d = aabnVar;
        this.j = xjlVar;
        this.k = ahslVar;
        aabiVar.m(new aabk(this));
        aabiVar.j(new Runnable() { // from class: aabj
            @Override // java.lang.Runnable
            public final void run() {
                aabl.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(boolean z) {
        if (this.h) {
            this.h = false;
            this.b.d(z);
            i();
        }
    }

    public final void i() {
        zaz zazVar = this.a;
        boolean z = true;
        if (!this.g && !this.h) {
            z = false;
        }
        zazVar.j(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        this.b.h(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f = null;
        this.g = false;
        this.b.g();
        i();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahee.class, ahef.class};
        }
        if (i == 0) {
            this.e = ((ahcx) obj).c();
            m();
            return null;
        }
        if (i == 1) {
            this.b.k(!r6.a);
            this.b.f(((ahee) obj).a);
            return null;
        }
        if (i == 2) {
            if (((ahef) obj).c() != aign.NEW) {
                return null;
            }
            h(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        this.i = false;
        m();
    }

    public final boolean m() {
        boolean z = this.i && this.e == aigf.FULLSCREEN;
        if (z != this.g) {
            this.g = z;
            if (z) {
                i();
                h(true);
                this.b.l();
            } else {
                this.b.e(this.e == aigf.FULLSCREEN);
            }
            xjl xjlVar = this.j;
            if (xjlVar != null) {
                xjlVar.o(this.g);
                this.j.n(this.g);
            }
        }
        ahsl ahslVar = this.k;
        if (ahslVar != null) {
            ahslVar.t = this.g;
            ahslVar.i();
        }
        return this.g;
    }
}
