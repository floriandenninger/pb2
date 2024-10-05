package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgz {
    public final String a;
    public final vha b;
    public final ambx c;
    public final amhy e;
    private final anhy g;
    private final anha h;
    private final ambx i = new ambx(new vgw(this), angq.a);
    public final Object d = new Object();
    public List f = new ArrayList();

    public vgz(vha vhaVar, anhy anhyVar, boolean z, boolean z2) {
        this.b = vhaVar;
        this.g = anhyVar;
        this.a = vhaVar.g();
        this.c = new ambx(vhaVar.a(), angq.a);
        if (z2) {
            this.e = amhy.d();
        } else {
            this.e = amhy.c();
        }
        c(new vgs(this, 0));
        this.h = z ? anha.a() : null;
    }

    public final anhy a() {
        return d(null);
    }

    public final anhy b(amml ammlVar, final Executor executor) {
        anhy b;
        int i = 1;
        final anfz c = amjk.c(new ywo(ammlVar, i));
        amhy amhyVar = this.e;
        String valueOf = String.valueOf(this.a);
        amil b2 = amhyVar.b(valueOf.length() != 0 ? "Update ".concat(valueOf) : new String("Update "));
        try {
            final anhy c2 = this.i.c();
            anha anhaVar = this.h;
            if (anhaVar != null) {
                anhaVar.b(new zdq(c2, 1), angq.a);
                b = this.h.b(amjk.b(new anfy() { // from class: vgr
                    @Override // defpackage.anfy
                    public final anhy a() {
                        return anfq.i(c2, amjk.c(new vgu(vgz.this, c, executor, 0)), angq.a);
                    }
                }), angq.a);
                b.getClass();
                if (!c2.isDone()) {
                    if (b.isDone()) {
                        anaf.Z(b, c2);
                    } else {
                        anhl anhlVar = new anhl(b, c2);
                        b.d(anhlVar, angq.a);
                        c2.d(anhlVar, angq.a);
                    }
                }
            } else {
                b = anfq.i(c2, amjk.c(new vgu(this, c, executor, i)), angq.a);
            }
            anaf.P(this.g);
            b2.a(b);
            b2.close();
            return b;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void c(anfz anfzVar) {
        synchronized (this.d) {
            this.f.add(anfzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy d(final vls vlsVar) {
        anhy i;
        this.e.a();
        if (this.i.e()) {
            i = this.b.k(vlsVar);
        } else {
            amhy amhyVar = this.e;
            String valueOf = String.valueOf(this.a);
            amil b = amhyVar.b(valueOf.length() != 0 ? "Get ".concat(valueOf) : new String("Get "));
            try {
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                i = anfq.i(this.i.c(), amjk.c(new anfz(vlsVar, bArr, bArr2, bArr3) { // from class: vgt
                    public final /* synthetic */ vls b;

                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        vgz vgzVar = vgz.this;
                        return vgzVar.b.k(this.b);
                    }
                }), angq.a);
                b.a(i);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        anaf.P(this.g);
        return anaf.P(i);
    }
}
