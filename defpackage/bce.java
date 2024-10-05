package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bce extends bbc {
    private final bbr[] d;
    private final pou[] e;
    private final ArrayList f;
    private int g = -1;
    private long[][] h = new long[0];
    private bcd i;

    static {
        pmx pmxVar = new pmx();
        pmxVar.b("MergingMediaSource");
        pmxVar.a();
    }

    public bce(bbr... bbrVarArr) {
        this.d = bbrVarArr;
        this.f = new ArrayList(Arrays.asList(bbrVarArr));
        this.e = new pou[bbrVarArr.length];
        new HashMap();
        amkq.t(8, "expectedKeys");
        new amuq().b().b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc, defpackage.bar
    public final void k() {
        super.k();
        Arrays.fill(this.e, (Object) null);
        this.g = -1;
        this.i = null;
        this.f.clear();
        Collections.addAll(this.f, this.d);
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.d[0].r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc, defpackage.bar
    public final void rq(att attVar) {
        super.rq(attVar);
        for (int i = 0; i < this.d.length; i++) {
            x(Integer.valueOf(i), this.d[i]);
        }
    }

    @Override // defpackage.bbc, defpackage.bbr
    public final void s() {
        bcd bcdVar = this.i;
        if (bcdVar != null) {
            throw bcdVar;
        }
        super.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ void t(Object obj, bbr bbrVar, pou pouVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.i != null) {
            return;
        }
        if (this.g == -1) {
            i = pouVar.g();
            this.g = i;
        } else {
            int g = pouVar.g();
            int i2 = this.g;
            if (g != i2) {
                this.i = new bcd();
                return;
            }
            i = i2;
        }
        if (this.h.length == 0) {
            this.h = (long[][]) Array.newInstance((Class<?>) long.class, i, this.e.length);
        }
        this.f.remove(bbrVar);
        this.e[num.intValue()] = pouVar;
        if (this.f.isEmpty()) {
            pos posVar = new pos();
            for (int i3 = 0; i3 < this.g; i3++) {
                long j = -this.e[0].x(i3, posVar).e;
                int i4 = 1;
                while (true) {
                    pou[] pouVarArr = this.e;
                    if (i4 < pouVarArr.length) {
                        this.h[i3][1] = j - (-pouVarArr[1].x(i3, posVar).e);
                        i4 = 2;
                    }
                }
            }
            rw(this.e[0]);
        }
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        bcc bccVar = (bcc) bbpVar;
        int i = 0;
        while (true) {
            bbr[] bbrVarArr = this.d;
            if (i >= bbrVarArr.length) {
                return;
            }
            bbr bbrVar = bbrVarArr[i];
            bbp bbpVar2 = bccVar.a[i];
            if (bbpVar2 instanceof bca) {
                bbpVar2 = ((bca) bbpVar2).a;
            }
            bbrVar.u(bbpVar2);
            i++;
        }
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        int length = this.d.length;
        bbp[] bbpVarArr = new bbp[length];
        int d = this.e[0].d(ashVar.a);
        for (int i = 0; i < length; i++) {
            bbpVarArr[i] = this.d[i].v(ashVar.b(this.e[i].i(d)), bfgVar, j - this.h[d][i]);
        }
        return new bcc(this.h[d], bbpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ ash z(Object obj, ash ashVar) {
        if (((Integer) obj).intValue() == 0) {
            return ashVar;
        }
        return null;
    }
}
