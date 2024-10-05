package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfm implements aaqy, ajfc {
    public static final aomw a;
    public static final int b;
    public final axpg c;
    public final syd d;
    public final aaea e;
    public final Set f = Collections.synchronizedSet(new HashSet());
    public final AtomicReference g = new AtomicReference();
    final AtomicBoolean h = new AtomicBoolean(false);
    private final axpg i;

    static {
        aomw c = aomw.c();
        c.e(aqrp.b);
        c.e(aveu.b);
        c.e(askl.b);
        c.e(aumh.b);
        a = c;
        b = (aqrp.b.a() << 3) | 2;
    }

    public ajfm(axpg axpgVar, aaea aaeaVar, syd sydVar, aoae aoaeVar, axpg axpgVar2, byte[] bArr, byte[] bArr2) {
        this.c = axpgVar;
        this.e = aaeaVar;
        this.d = sydVar;
        synchronized (aoaeVar.b) {
            aoaeVar.b.add(this);
        }
        this.i = axpgVar2;
    }

    @Override // defpackage.ajfc
    public final void a() {
        this.g.set(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r0 = (defpackage.aqrp) r0.y(defpackage.aqrp.a.getParserForType(), defpackage.ajfm.a);
     */
    @Override // defpackage.aaqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(defpackage.afsx r17, defpackage.aqzg r18, defpackage.arnd r19) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfm.b(afsx, aqzg, arnd):void");
    }

    public final ResourceLoader c() {
        return ((syq) this.i.get()).a();
    }

    public final boolean d() {
        return ((syq) this.i.get()).b();
    }

    public final boolean e() {
        return ((syq) this.i.get()).c();
    }
}
