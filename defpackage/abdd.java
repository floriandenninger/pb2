package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdd extends aasw {
    private final afsy a;
    private final aasp b;
    private final aasp c;
    private final abdc g;

    protected abdd() {
        this.b = null;
        this.c = null;
        this.g = null;
        afsy afsyVar = afta.a;
        throw null;
    }

    public final abda a() {
        return new abda(this.f, this.a.c(), null, null, null);
    }

    public final abdf b() {
        return new abdf(this.f, this.a.c(), null, null, null);
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.a(((asus) it.next()).c);
        }
    }

    public final void e(abda abdaVar, afwx afwxVar) {
        this.b.e(abdaVar, new abdb(this, afwxVar, 1));
    }

    public final void f(abdf abdfVar, afwx afwxVar) {
        this.c.e(abdfVar, new abdb(this, afwxVar, 0));
    }

    public abdd(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, abdc abdcVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        aarmVar.getClass();
        this.b = c(asbp.a, aarmVar, abce.g, abax.o);
        this.c = c(asbr.a, aarmVar, abce.h, abax.p);
        abdcVar.getClass();
        this.g = abdcVar;
    }
}
