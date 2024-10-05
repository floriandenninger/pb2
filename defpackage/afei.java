package defpackage;

import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afei extends pag implements aetf {
    public final afea c;
    public final Handler d;
    private final afel e;
    private final boolean f;
    private final Boolean g;
    private final Map h;
    private final afhs i;

    public afei(paj pajVar, pfq pfqVar, ozx ozxVar, long j, int i, pau[] pauVarArr, afel afelVar, boolean z, Handler handler, afea afeaVar, boolean z2, afhs afhsVar) {
        super(null, new pao(-1L, j, false, -1L, -1L, null, Collections.singletonList(new par(0L, Collections.singletonList(new pal(i, Arrays.asList(pauVarArr), null))))), pajVar, pfqVar, ozxVar, 0L, false, null, null, 0);
        this.e = afelVar;
        this.f = z;
        this.d = handler;
        this.c = afeaVar;
        this.g = Boolean.valueOf(z2);
        this.i = afhsVar;
        this.h = new LinkedHashMap();
    }

    @Override // defpackage.pag, defpackage.ozt
    public final void h(ozk ozkVar) {
        ozv ozvVar;
        if (ozkVar instanceof ozy) {
            pcm pcmVar = ((ozy) ozkVar).i;
            if ((pcmVar instanceof pbv) && (ozvVar = ozkVar.c) != null) {
                this.h.put(ozvVar.a, (pbv) pcmVar);
            }
        }
        super.h(ozkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pag
    public final ozk k(pae paeVar, paf pafVar, pfq pfqVar, MediaFormat mediaFormat, pad padVar, int i, int i2, boolean z) {
        long c;
        int i3;
        int i4;
        pav pavVar = pafVar.c;
        ozv ozvVar = pavVar.e;
        long c2 = pafVar.c(i);
        int a = pafVar.a();
        afel afelVar = this.e;
        pbv pbvVar = (pbv) this.h.get(ozvVar.a);
        int a2 = afelVar.a(i, pbvVar != null ? new bib(pbvVar.b, pbvVar.c, pbvVar.d, pbvVar.e) : null);
        int i5 = (i + a2) - 1;
        if (i5 == a) {
            c = pafVar.b(i5);
        } else {
            c = pafVar.c(i5 + 1);
        }
        long j = c;
        pas d = pafVar.d(i);
        long j2 = d.b;
        for (int i6 = 1; i6 < a2; i6++) {
            j2 += pafVar.d(i + i6).b;
        }
        pfs pfsVar = new pfs(d.a(pavVar.g), d.a, j2, pavVar.h);
        long j3 = paeVar.b - pavVar.f;
        if (pafVar.a) {
            return new paa(pfqVar, pfsVar, ozvVar, c2, j, i, padVar.a, paeVar.a);
        }
        if (this.f) {
            i4 = -1;
            i3 = -1;
        } else {
            int i7 = padVar.b;
            i3 = padVar.c;
            i4 = i7;
        }
        return new afeh(pfqVar, pfsVar, i2, ozvVar, c2, j, i, j3, pafVar.b, mediaFormat, i4, i3, paeVar.d, z, paeVar.a, a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pag
    public final pbz l(String str) {
        int i = true == this.i.L() ? 3 : 1;
        if (p(str)) {
            return this.g.booleanValue() ? new aetg(i, this) : new pfj(i);
        }
        return new pdk();
    }
}
