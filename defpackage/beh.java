package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class beh implements Comparable {
    public final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;

    public beh(pms pmsVar, bee beeVar, int i, String str) {
        amru amruVar;
        int i2;
        boolean z = false;
        this.b = bej.e(i, false);
        int i3 = pmsVar.f;
        int i4 = beeVar.y;
        this.c = 1 == (i3 & 1);
        this.d = (i3 & 2) != 0;
        if (beeVar.r.isEmpty()) {
            amruVar = amru.r("");
        } else {
            amruVar = beeVar.r;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= ((amvj) amruVar).c) {
                i5 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            String str2 = (String) amruVar.get(i5);
            boolean z2 = beeVar.t;
            i2 = bej.a(pmsVar, str2, false);
            if (i2 > 0) {
                break;
            } else {
                i5++;
            }
        }
        this.e = i5;
        this.f = i2;
        int bitCount = Integer.bitCount(pmsVar.g & beeVar.s);
        this.g = bitCount;
        this.i = (pmsVar.g & 1088) != 0;
        int a = bej.a(pmsVar, str, bej.b(str) == null);
        this.h = a;
        if (i2 > 0 || ((beeVar.r.isEmpty() && bitCount > 0) || this.c || (this.d && a > 0))) {
            z = true;
        }
        this.a = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(beh behVar) {
        amqd b = amqd.b.e(this.b, behVar.b).d(Integer.valueOf(this.e), Integer.valueOf(behVar.e), amvu.a).b(this.f, behVar.f).b(this.g, behVar.g).e(this.c, behVar.c).d(Boolean.valueOf(this.d), Boolean.valueOf(behVar.d), this.f == 0 ? amvb.a : amvu.a).b(this.h, behVar.h);
        if (this.g == 0) {
            b = b.f(this.i, behVar.i);
        }
        return b.a();
    }
}
