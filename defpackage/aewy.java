package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aewy implements bbp, bcz {
    protected final PlayerConfigModel a;
    protected final VideoStreamingData b;
    protected final String c;
    protected final aewj d;
    protected final afhf e;
    protected final ayr f;
    protected final att g;
    protected bbo h;
    protected final pnd i;
    protected bdq[] j;
    protected final bbx k;
    private final asj l;
    private final aezx[] m;
    private final bbx n;
    private final aezm o;
    private bbd p;
    private final bfg q;

    /* JADX INFO: Access modifiers changed from: protected */
    public aewy(afhf afhfVar, ayr ayrVar, bbx bbxVar, att attVar, bbx bbxVar2, bfg bfgVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aewj aewjVar, String str, pnd pndVar, aezm aezmVar, byte[] bArr) {
        afki.b(!videoStreamingData.p.isEmpty());
        this.a = playerConfigModel;
        this.b = videoStreamingData;
        this.c = str;
        this.d = aewjVar;
        this.e = afhfVar;
        this.f = ayrVar;
        this.k = bbxVar;
        this.g = attVar;
        Pair r = aear.r(ayrVar, videoStreamingData.p, true);
        if (((asj) r.first).b == 0 || ((aezx[]) r.second).length == 0) {
            afid.d(afic.MFL, "ManifestlessMediaPeriod has no playable tracks");
        }
        this.l = (asj) r.first;
        this.m = (aezx[]) r.second;
        this.n = bbxVar2;
        this.q = bfgVar;
        this.i = pndVar;
        this.j = new bdq[0];
        this.p = new bbd(this.j);
        this.o = aezmVar;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        return j;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        return this.p.c();
    }

    @Override // defpackage.bbp
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        for (bdq bdqVar : this.j) {
            bdqVar.f(j);
        }
        return j;
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        int i;
        bel[] belVarArr2 = belVarArr;
        SparseArray sparseArray = new SparseArray();
        final int i2 = 0;
        int i3 = 0;
        while (i3 < belVarArr2.length) {
            bel belVar = belVarArr2[i3];
            bcy bcyVar = bcyVarArr[i3];
            if (bcyVar instanceof bdq) {
                bdq bdqVar = (bdq) bcyVar;
                if (belVar == null || !zArr[i3]) {
                    afic aficVar = afic.ABR;
                    int i4 = bdqVar.a;
                    q(bdqVar.b);
                    bdqVar.h();
                    bcyVarArr[i3] = null;
                } else {
                    sparseArray.put(this.l.a(belVar.e()), bdqVar);
                }
            }
            if (bcyVarArr[i3] != null || belVar == null) {
                i = i3;
            } else {
                int a = this.l.a(belVar.e());
                aezx aezxVar = this.m[a];
                afic aficVar2 = afic.ABR;
                int i5 = aezxVar.a;
                final int i6 = 1;
                i = i3;
                bdq bdqVar2 = new bdq(aezxVar.a, k(aezxVar, belVar), this, this.q, j, this.f, this.k, this.o.a(new amnv(this) { // from class: aewx
                    public final /* synthetic */ aewy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.amnv
                    public final Object get() {
                        return i6 != 0 ? this.a.a : this.a.b;
                    }
                }, new amnv(this) { // from class: aewx
                    public final /* synthetic */ aewy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.amnv
                    public final Object get() {
                        return i2 != 0 ? this.a.a : this.a.b;
                    }
                }), this.n, null);
                sparseArray.put(a, bdqVar2);
                bcyVarArr[i] = bdqVar2;
                zArr2[i] = true;
            }
            i3 = i + 1;
            belVarArr2 = belVarArr;
            i2 = 0;
        }
        this.j = new bdq[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            this.j[i7] = (bdq) sparseArray.valueAt(i7);
        }
        this.p = new bbd(this.j);
        return j;
    }

    @Override // defpackage.bbp
    public final asj g() {
        return this.l;
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        for (bdq bdqVar : this.j) {
            bdqVar.e(j, z);
        }
    }

    @Override // defpackage.bbp
    public final void i() {
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        r();
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        return this.p.jJ();
    }

    protected abstract bdr k(aezx aezxVar, bel belVar);

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.h = bboVar;
        bboVar.k(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        this.p.m(j);
    }

    public final void n() {
        for (bdq bdqVar : this.j) {
            bdqVar.h();
        }
    }

    @Override // defpackage.bbp, defpackage.bda
    public boolean o(long j) {
        return this.p.o(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.p.p();
    }

    protected abstract void q(bdr bdrVar);

    public final void r() {
        bbo bboVar = this.h;
        if (bboVar != null) {
            bboVar.j(this);
        }
    }
}
