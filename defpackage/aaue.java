package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaue extends aasw implements aasm {
    public static final /* synthetic */ int b = 0;
    public final Set a;
    private final afsy c;
    private final aaub g;
    private final aaea h;
    private final Set i;
    private final boolean j;
    private final ypa k;
    private final aasp l;
    private final zfm m;

    static {
        Collections.emptySet();
    }

    public aaue(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, aadw aadwVar, aaea aaeaVar, Set set, aaub aaubVar, ypa ypaVar, zfm zfmVar, Set set2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.c = afsyVar;
        this.j = aaec.b(aadwVar);
        this.h = aaeaVar;
        set.getClass();
        this.i = set;
        this.g = aaubVar;
        ypaVar.getClass();
        this.k = ypaVar;
        this.m = zfmVar;
        this.a = set2;
        this.l = c(arjv.a, aarmVar, aatt.f, iom.n);
    }

    private static aart i(aaea aaeaVar, zfm zfmVar) {
        if (zfmVar == null) {
            return null;
        }
        aars a = aart.a(zfmVar);
        a.a = zxq.c;
        atfr atfrVar = aaeaVar.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        final aplz aplzVar = atfrVar.h;
        if (aplzVar == null) {
            aplzVar = aplz.a;
        }
        if (aplzVar.b) {
            a.b = zfmVar.b(new zfn(aplzVar.d, aplzVar.e, aplzVar.f, aplzVar.c, aplzVar.g));
            a.b(new ammy() { // from class: aaua
                @Override // defpackage.ammy
                public final boolean a(Object obj) {
                    aplz aplzVar2 = aplz.this;
                    cnq cnqVar = (cnq) obj;
                    if (yny.c(cnqVar)) {
                        return true;
                    }
                    return aplzVar2.h.contains(Integer.valueOf(cnqVar.b.a));
                }
            });
        }
        return a.a();
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.g.k((aauc) aaruVar, aaslVar, afwxVar, i(this.h, this.m));
    }

    @Override // defpackage.aasm
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aauc a(ajce ajceVar) {
        aauc f = f();
        f.e(ajceVar);
        return f;
    }

    public final aauc e() {
        return g(new yqy(this.k, new aael(), new aaek(), new aaej(), new aaei()));
    }

    public final aauc f() {
        return g(null);
    }

    public final aauc g(yst ystVar) {
        aauc aaucVar = new aauc(this.f, this.c.c(), this.j, null, null, null);
        aaucVar.p = ystVar;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((aaud) it.next()).a(aaucVar);
        }
        return aaucVar;
    }

    public final anhy h(aauc aaucVar, Executor executor) {
        return anfq.h(this.l.c(aaucVar, executor, i(this.h, this.m)), new amml() { // from class: aatz
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                arjv arjvVar = (arjv) obj;
                Iterator it = aaue.this.a.iterator();
                while (it.hasNext()) {
                    ((aapw) it.next()).a(arjvVar);
                }
                return new BrowseResponseModel(arjvVar);
            }
        }, angq.a);
    }
}
