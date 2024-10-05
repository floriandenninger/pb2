package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpa implements dps {
    public static final boolean a = doa.a;
    public final dps b;
    public final String d;
    public final aoae h;
    public final SparseArray c = new SparseArray();
    public int e = Integer.MAX_VALUE;
    public int f = -1;
    public int g = -1;

    public dpa(dps dpsVar, aoae aoaeVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = dpsVar;
        this.h = aoaeVar;
        this.d = str;
    }

    private static List b(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            dte dteVar = (dte) sparseArray.get(i3);
            if (dteVar == null) {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
            arrayList.add(dteVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.e;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = 0;
        if (i == 1) {
            List b = b(this.f, this.g, this.c);
            if (this.g > 1) {
                dps dpsVar = this.b;
                int i3 = this.f;
                dql dqlVar = (dql) dpsVar;
                if (dqlVar.b) {
                    dsx dsxVar = dqlVar.a;
                    dsxVar.u();
                    if (dth.a) {
                        String[] strArr = new String[b.size()];
                        for (int i4 = 0; i4 < b.size(); i4++) {
                            strArr[i4] = ((dte) b.get(i4)).r();
                        }
                        dsxVar.hashCode();
                        b.size();
                        String.valueOf(Arrays.toString(strArr)).length();
                    }
                    synchronized (dsxVar) {
                        dsxVar.z = true;
                        int size = b.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            dte dteVar = (dte) b.get(i5);
                            dsx.t(dteVar);
                            int i6 = i3 + i5;
                            dsl q = dsxVar.q(i6, dteVar);
                            dsxVar.c.add(i6, q.b);
                            dsxVar.F(q);
                        }
                    }
                } else {
                    dqlVar.a.w(i3, b);
                }
                if (a) {
                    int i7 = this.f;
                    while (i2 < b.size()) {
                        this.h.Q(this.d, i7 + i2, (dte) b.get(i2), Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dps dpsVar2 = this.b;
                int i8 = this.f;
                dte dteVar2 = (dte) this.c.get(i8);
                dql dqlVar2 = (dql) dpsVar2;
                if (dqlVar2.b) {
                    dsx dsxVar2 = dqlVar2.a;
                    dsxVar2.u();
                    if (dth.a) {
                        dsxVar2.hashCode();
                        String.valueOf(dteVar2.r()).length();
                    }
                    dsx.t(dteVar2);
                    dsl q2 = dsxVar2.q(i8, dteVar2);
                    synchronized (dsxVar2) {
                        dsxVar2.z = true;
                        dsxVar2.c.add(i8, q2.b);
                        dsxVar2.F(q2);
                    }
                } else {
                    dsx dsxVar3 = dqlVar2.a;
                    if (dth.a) {
                        dsxVar3.hashCode();
                        String.valueOf(dteVar2.r()).length();
                    }
                    dsx.t(dteVar2);
                    dqx p = dsxVar3.p(dteVar2);
                    synchronized (dsxVar3) {
                        if (dsxVar3.z) {
                            throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                        }
                        dsxVar3.b.add(i8, p);
                        dsxVar3.F.a(dteVar2);
                    }
                    dsxVar3.e.od(i8);
                    duj dujVar = dsxVar3.D;
                    dujVar.c(dujVar.f(i8, dsxVar3.w));
                }
                if (a) {
                    aoae aoaeVar = this.h;
                    String str = this.d;
                    int i9 = this.f;
                    aoaeVar.Q(str, i9, (dte) this.c.get(i9), Thread.currentThread().getName());
                }
            }
        } else if (i == 2) {
            List b2 = b(this.f, this.g, this.c);
            if (this.g > 1) {
                dps dpsVar3 = this.b;
                int i10 = this.f;
                dql dqlVar3 = (dql) dpsVar3;
                if (dqlVar3.b) {
                    dsx dsxVar4 = dqlVar3.a;
                    dsxVar4.u();
                    if (dth.a) {
                        dsxVar4.hashCode();
                        b2.size();
                    }
                    synchronized (dsxVar4) {
                        dsxVar4.r(new dsq(i10, b2));
                    }
                } else {
                    dqlVar3.a.M(i10, b2);
                }
                if (a) {
                    int i11 = this.f;
                    while (i2 < b2.size()) {
                        this.h.T(this.d, i11 + i2, (dte) b2.get(i2), Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dps dpsVar4 = this.b;
                int i12 = this.f;
                dte dteVar3 = (dte) this.c.get(i12);
                dql dqlVar4 = (dql) dpsVar4;
                if (dqlVar4.b) {
                    dsx dsxVar5 = dqlVar4.a;
                    dsxVar5.u();
                    if (dth.a) {
                        dsxVar5.hashCode();
                    }
                    synchronized (dsxVar5) {
                        dsxVar5.r(new dsp(i12, dteVar3));
                    }
                } else {
                    dqlVar4.a.L(i12, dteVar3);
                }
                if (a) {
                    aoae aoaeVar2 = this.h;
                    String str2 = this.d;
                    int i13 = this.f;
                    aoaeVar2.T(str2, i13, (dte) this.c.get(i13), Thread.currentThread().getName());
                }
            }
        } else if (i == 3) {
            int i14 = this.g;
            if (i14 > 1) {
                dps dpsVar5 = this.b;
                int i15 = this.f;
                dql dqlVar5 = (dql) dpsVar5;
                if (dqlVar5.b) {
                    dsx dsxVar6 = dqlVar5.a;
                    dsxVar6.u();
                    if (dth.a) {
                        dsxVar6.hashCode();
                    }
                    dso dsoVar = new dso(i15, i14);
                    synchronized (dsxVar6) {
                        dsxVar6.z = true;
                        for (int i16 = 0; i16 < i14; i16++) {
                            dsxVar6.c.remove(i15);
                        }
                        dsxVar6.r(dsoVar);
                    }
                } else {
                    dqlVar5.a.I(i15, i14);
                }
                if (a) {
                    int i17 = this.f;
                    int i18 = this.g;
                    while (i2 < i18) {
                        this.h.P(this.d, i17 + i2, Thread.currentThread().getName());
                        i2++;
                    }
                }
            } else {
                dps dpsVar6 = this.b;
                int i19 = this.f;
                dql dqlVar6 = (dql) dpsVar6;
                if (dqlVar6.b) {
                    dsx dsxVar7 = dqlVar6.a;
                    dsxVar7.u();
                    if (dth.a) {
                        dsxVar7.hashCode();
                    }
                    dsn dsnVar = new dsn(i19);
                    synchronized (dsxVar7) {
                        dsxVar7.z = true;
                        dsxVar7.c.remove(i19);
                        dsxVar7.r(dsnVar);
                    }
                } else {
                    dqlVar6.a.H(i19);
                }
                if (a) {
                    this.h.P(this.d, this.f, Thread.currentThread().getName());
                }
            }
        }
        this.e = Integer.MAX_VALUE;
        this.c.clear();
    }
}
