package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijp {
    private final aarm a;
    private final afsy b;
    private final String c;
    private final zfm d;
    private final boolean e;
    private final ypa f;
    private final aaea g;
    private final ajyw h;
    private final ajoy i;

    public aijp(aarm aarmVar, ajoy ajoyVar, ajyw ajywVar, afsy afsyVar, String str, ypa ypaVar, aadw aadwVar, aaea aaeaVar, zfm zfmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.h = ajywVar;
        ajoyVar.getClass();
        this.i = ajoyVar;
        afsyVar.getClass();
        this.b = afsyVar;
        zhq.m(str);
        this.c = str;
        aarmVar.getClass();
        this.a = aarmVar;
        apwy b = aadwVar.b();
        boolean z = true;
        if (b != null) {
            atej atejVar = b.k;
            if (((atejVar == null ? atej.a : atejVar).c & 8) != 0) {
                atej atejVar2 = b.k;
                aper aperVar = (atejVar2 == null ? atej.a : atejVar2).v;
                z = (aperVar == null ? aper.a : aperVar).d;
            }
        }
        this.e = z;
        ypaVar.getClass();
        this.f = ypaVar;
        this.g = aaeaVar;
        this.d = zfmVar;
    }

    public final aarn a(aijr aijrVar, afwx afwxVar) {
        ammv j;
        aaea aaeaVar = this.g;
        zfm zfmVar = this.d;
        arfd a = aaeaVar.a();
        if (a == null) {
            j = amlr.a;
        } else {
            atys atysVar = a.j;
            if (atysVar == null) {
                atysVar = atys.a;
            }
            auai auaiVar = atysVar.r;
            if (auaiVar == null) {
                auaiVar = auai.a;
            }
            if (auaiVar.b == 0) {
                j = amlr.a;
            } else {
                aars a2 = aart.a(zfmVar);
                a2.b = zfmVar.b(new zfn(auaiVar.c * 1000, auaiVar.d * 1000, Long.MAX_VALUE, auaiVar.b * 1000, 2.0d));
                j = ammv.j(a2.a());
            }
        }
        if (j.h()) {
            return this.a.b(aijrVar, aryr.a, afwxVar, afrl.m, abxm.k, (aart) j.c());
        }
        return this.a.a(aijrVar, aryr.a, afwxVar, afrl.m, abxm.k);
    }

    public final aijr b(String str, byte[] bArr, String str2, String str3, int i, int i2, Set set, String str4, acsx acsxVar, boolean z) {
        aijr e = e(new aijn(this.f, acsxVar));
        e.s(1);
        e.m(bArr);
        e.b = str;
        e.d = str3;
        e.s = i;
        e.P = i2;
        e.c = str2;
        e.j = z;
        e.K = str4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((aijo) it.next()).qZ(e);
        }
        return e;
    }

    public final aijr c(PlaybackStartDescriptor playbackStartDescriptor, int i, Set set, acsx acsxVar, String str) {
        aijr b = b(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), i, set, str, acsxVar, false);
        if (playbackStartDescriptor.s()) {
            b.G = true;
        }
        if (playbackStartDescriptor.r()) {
            b.H = true;
        }
        if (!playbackStartDescriptor.n().isEmpty()) {
            for (Map.Entry entry : playbackStartDescriptor.n().entrySet()) {
                b.j().put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        b.f55J = playbackStartDescriptor.u();
        return b;
    }

    public final aijr d() {
        return e(new yqy(this.f, new aaep(), new aaeo(), new aaen(), new aaem()));
    }

    public final aijr e(yst ystVar) {
        ajyw ajywVar = this.h;
        ajoy ajoyVar = this.i;
        afsx c = this.b.c();
        c.getClass();
        ajkn ajknVar = (ajkn) ajywVar.b.get();
        ajknVar.getClass();
        Set set = (Set) ajywVar.c.get();
        set.getClass();
        aifk aifkVar = (aifk) ajywVar.a.get();
        aifkVar.getClass();
        aijr aijrVar = new aijr(ajoyVar, c, ajknVar, set, aifkVar, null, null, null, null);
        aijrVar.k = this.c;
        aijrVar.i = this.e;
        aijrVar.p = ystVar;
        return aijrVar;
    }
}
