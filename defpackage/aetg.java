package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetg extends pfj {
    private final aetf w;
    private byte[] x;
    private int y;
    private int z;

    public aetg(int i, aetf aetfVar) {
        super(i);
        this.w = aetfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pfj
    public final int b(int i) {
        if (i == 165) {
            return 4;
        }
        if (i == 166) {
            return 1;
        }
        if (i == 238) {
            return 2;
        }
        if (i != 30113) {
            return super.b(i);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pfj
    public final void h(int i, long j) {
        if (i != 238) {
            super.h(i, j);
        } else {
            if (this.z != 3) {
                return;
            }
            this.y = (int) j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pfj
    public final void i(int i, long j, long j2) {
        if (i == 166) {
            if (this.z == 2) {
                this.z = 3;
            }
            this.y = -1;
        } else if (i != 30113) {
            super.i(i, j, j2);
        } else {
            this.z = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pfj
    public final void j(int i, int i2, pbw pbwVar) {
        if (i == 165) {
            if (this.z == 3 && this.y == 4) {
                byte[] bArr = new byte[i2 + 1];
                this.x = bArr;
                bArr[0] = 0;
                pbwVar.h(bArr, 1, i2);
                aetf aetfVar = this.w;
                afei afeiVar = (afei) aetfVar;
                afeiVar.d.post(new afeg(afeiVar, this.x, this.r));
                return;
            }
            return;
        }
        super.j(i, i2, pbwVar);
    }
}
