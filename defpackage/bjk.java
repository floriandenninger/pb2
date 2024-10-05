package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjk extends bjo {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public bjk(bjc bjcVar) {
        super(bjcVar);
    }

    @Override // defpackage.bjo
    protected final boolean a(pth pthVar) {
        if (!this.b) {
            int i = pthVar.i();
            int i2 = i >> 4;
            this.e = i2;
            if (i2 == 2) {
                int i3 = a[(i >> 2) & 3];
                pmr pmrVar = new pmr();
                pmrVar.k = "audio/mpeg";
                pmrVar.x = 1;
                pmrVar.y = i3;
                this.d.rp(pmrVar.a());
                this.c = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                pmr pmrVar2 = new pmr();
                pmrVar2.k = str;
                pmrVar2.x = 1;
                pmrVar2.y = 8000;
                this.d.rp(pmrVar2.a());
                this.c = true;
            } else if (i2 != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i2);
                throw new bjn(sb.toString());
            }
            this.b = true;
        } else {
            pthVar.H(1);
        }
        return true;
    }

    @Override // defpackage.bjo
    protected final boolean b(pth pthVar, long j) {
        if (this.e == 2) {
            int a2 = pthVar.a();
            this.d.t(pthVar, a2);
            this.d.v(j, 1, a2, 0, null);
            return true;
        }
        int i = pthVar.i();
        if (i != 0 || this.c) {
            if (this.e == 10 && i != 1) {
                return false;
            }
            int a3 = pthVar.a();
            this.d.t(pthVar, a3);
            this.d.v(j, 1, a3, 0, null);
            return true;
        }
        int a4 = pthVar.a();
        byte[] bArr = new byte[a4];
        pthVar.B(bArr, 0, a4);
        bagd a5 = bhq.a(bArr);
        pmr pmrVar = new pmr();
        pmrVar.k = "audio/mp4a-latm";
        pmrVar.h = a5.a;
        pmrVar.x = a5.c;
        pmrVar.y = a5.b;
        pmrVar.m = Collections.singletonList(bArr);
        this.d.rp(pmrVar.a());
        this.c = true;
        return false;
    }
}
