package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bec implements Comparable {
    public final boolean a;
    private final String b;
    private final bee c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;

    public bec(pms pmsVar, bee beeVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.c = beeVar;
        this.b = bej.b(pmsVar.e);
        int i6 = 0;
        this.d = bej.e(i, false);
        int i7 = 0;
        while (true) {
            amru amruVar = beeVar.m;
            i2 = Integer.MAX_VALUE;
            if (i7 >= ((amvj) amruVar).c) {
                i7 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            } else {
                i3 = bej.a(pmsVar, (String) amruVar.get(i7), false);
                if (i3 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f = i7;
        this.e = i3;
        int i8 = pmsVar.g;
        int i9 = beeVar.n;
        this.g = Integer.bitCount(0);
        boolean z = true;
        this.j = 1 == (pmsVar.f & 1);
        this.k = pmsVar.A;
        this.l = pmsVar.B;
        this.m = pmsVar.j;
        int i10 = pmsVar.j;
        if ((i10 != -1 && i10 > beeVar.p) || ((i4 = pmsVar.A) != -1 && i4 > beeVar.o)) {
            z = false;
        }
        this.a = z;
        String[] ae = pts.ae();
        int i11 = 0;
        while (true) {
            if (i11 >= ae.length) {
                i11 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            } else {
                i5 = bej.a(pmsVar, ae[i11], false);
                if (i5 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.h = i11;
        this.i = i5;
        while (true) {
            amru amruVar2 = beeVar.q;
            if (i6 < ((amvj) amruVar2).c) {
                String str = pmsVar.n;
                if (str != null && str.equals(amruVar2.get(i6))) {
                    i2 = i6;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        this.n = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bec becVar) {
        amvd a = (this.a && this.d) ? bej.a : bej.a.a();
        amqd d = amqd.b.e(this.d, becVar.d).d(Integer.valueOf(this.f), Integer.valueOf(becVar.f), amvu.a).b(this.e, becVar.e).b(this.g, becVar.g).e(this.a, becVar.a).d(Integer.valueOf(this.n), Integer.valueOf(becVar.n), amvu.a);
        Integer valueOf = Integer.valueOf(this.m);
        Integer valueOf2 = Integer.valueOf(becVar.m);
        boolean z = this.c.u;
        amqd d2 = d.d(valueOf, valueOf2, bej.b).e(this.j, becVar.j).d(Integer.valueOf(this.h), Integer.valueOf(becVar.h), amvu.a).b(this.i, becVar.i).d(Integer.valueOf(this.k), Integer.valueOf(becVar.k), a).d(Integer.valueOf(this.l), Integer.valueOf(becVar.l), a);
        Integer valueOf3 = Integer.valueOf(this.m);
        Integer valueOf4 = Integer.valueOf(becVar.m);
        if (!pts.R(this.b, becVar.b)) {
            a = bej.b;
        }
        return d2.d(valueOf3, valueOf4, a).a();
    }
}
