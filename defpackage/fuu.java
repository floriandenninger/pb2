package defpackage;

import java.security.InvalidParameterException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fuu {
    public final aknq a;
    public final afsy b;
    public final abcp c;
    public final agcm d;

    public fuu(aknq aknqVar, afsy afsyVar, abcp abcpVar, agcm agcmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = aknqVar;
        this.b = afsyVar;
        this.c = abcpVar;
        this.d = agcmVar;
    }

    public static final auqe c(abci abciVar) {
        aupv aupvVar;
        if (abciVar != null) {
            for (Object obj : abciVar.a()) {
                if (obj instanceof aupv) {
                    aupvVar = (aupv) obj;
                    int bz = aobq.bz(aupvVar.e);
                    if (bz != 0 && bz == 10050) {
                        break;
                    }
                }
            }
        }
        aupvVar = null;
        if (aupvVar == null) {
            return null;
        }
        Iterator it = aupvVar.d.iterator();
        while (it.hasNext()) {
            auqe auqeVar = ((aupw) it.next()).i;
            if (auqeVar == null) {
                auqeVar = auqe.a;
            }
            int bx = aobq.bx(auqeVar.c);
            if (bx != 0 && bx == 344) {
                return auqeVar;
            }
        }
        return null;
    }

    public final anhy a(abci abciVar) {
        akne b;
        auqe c = c(abciVar);
        if (c != null) {
            if (this.b.t()) {
                b = akne.a(this.b.c().d(), "search_namespace", "voice_language");
            } else {
                b = akne.b("search_namespace", "voice_language");
            }
            return this.a.b(b, c, aeok.b);
        }
        return anaf.N(new InvalidParameterException());
    }

    public final void b() {
        anfq.i(anfq.h(this.d.a.a(), fjw.p, angq.a), new fut(this, 0), angq.a).d(bqc.a, angq.a);
    }
}
