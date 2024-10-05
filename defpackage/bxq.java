package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bxq extends lp {
    protected fp[] m;
    String n;
    int o;
    int p;

    public bxq() {
        this.m = null;
        this.o = 0;
    }

    public bxq(bxq bxqVar) {
        this.m = null;
        this.o = 0;
        this.n = bxqVar.n;
        int i = bxqVar.p;
        this.p = 0;
        this.m = gl.n(bxqVar.m);
    }

    public fp[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean i() {
        return false;
    }

    public void setPathData(fp[] fpVarArr) {
        if (!gl.l(this.m, fpVarArr)) {
            this.m = gl.n(fpVarArr);
            return;
        }
        fp[] fpVarArr2 = this.m;
        for (int i = 0; i < fpVarArr.length; i++) {
            fpVarArr2[i].a = fpVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = fpVarArr[i].b;
                if (i2 < fArr.length) {
                    fpVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
