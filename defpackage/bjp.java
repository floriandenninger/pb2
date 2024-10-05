package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjp extends bjo {
    private final pth a;
    private final pth b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public bjp(bjc bjcVar) {
        super(bjcVar);
        this.a = new pth(ptb.a);
        this.b = new pth(4);
    }

    @Override // defpackage.bjo
    protected final boolean a(pth pthVar) {
        int i = pthVar.i();
        int i2 = i >> 4;
        int i3 = i & 15;
        if (i3 == 7) {
            this.g = i2;
            return i2 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new bjn(sb.toString());
    }

    @Override // defpackage.bjo
    protected final boolean b(pth pthVar, long j) {
        int i = pthVar.i();
        byte[] bArr = pthVar.a;
        int i2 = pthVar.b;
        int i3 = i2 + 1;
        pthVar.b = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        pthVar.b = i4;
        byte b2 = bArr[i3];
        pthVar.b = i4 + 1;
        long j2 = j + (((bArr[i4] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8)) * 1000);
        if (i == 0) {
            if (!this.e) {
                pth pthVar2 = new pth(new byte[pthVar.a()]);
                pthVar.B(pthVar2.a, 0, pthVar.a());
                bht a = bht.a(pthVar2);
                this.c = a.b;
                pmr pmrVar = new pmr();
                pmrVar.k = "video/avc";
                pmrVar.h = a.f;
                pmrVar.p = a.c;
                pmrVar.q = a.d;
                pmrVar.t = a.e;
                pmrVar.m = a.a;
                this.d.rp(pmrVar.a());
                this.e = true;
                return false;
            }
        } else if (i == 1 && this.e) {
            int i5 = this.g == 1 ? 1 : 0;
            if (!this.f && i5 == 0) {
                return false;
            }
            byte[] bArr2 = this.b.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.c;
            int i7 = 0;
            while (pthVar.a() > 0) {
                pthVar.B(this.b.a, i6, this.c);
                this.b.G(0);
                int l = this.b.l();
                this.a.G(0);
                this.d.t(this.a, 4);
                this.d.t(pthVar, l);
                i7 = i7 + 4 + l;
            }
            this.d.v(j2, i5, i7, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
