package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjq implements bih {
    private bik b;
    private int c;
    private int d;
    private int e;
    private MotionPhotoMetadata g;
    private bii h;
    private bjs i;
    private bkw j;
    private final pth a = new pth(6);
    private long f = -1;

    private final int a(bii biiVar) {
        this.a.C(2);
        biiVar.j(this.a.a, 0, 2);
        return this.a.m();
    }

    private final void b() {
        c(new Metadata.Entry[0]);
        bik bikVar = this.b;
        pse.c(bikVar);
        bikVar.q();
        this.b.w(new biy(-9223372036854775807L));
        this.c = 6;
    }

    private final void c(Metadata.Entry... entryArr) {
        bik bikVar = this.b;
        pse.c(bikVar);
        bjc n = bikVar.n(1024, 4);
        pmr pmrVar = new pmr();
        pmrVar.j = "image/jpeg";
        pmrVar.i = new Metadata(entryArr);
        n.rp(pmrVar.a());
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.b = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            bkw bkwVar = this.j;
            pse.c(bkwVar);
            bkwVar.f(j, j2);
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        if (a(biiVar) != 65496) {
            return false;
        }
        int a = a(biiVar);
        this.d = a;
        if (a == 65504) {
            this.a.C(2);
            biiVar.j(this.a.a, 0, 2);
            biiVar.f(this.a.m() - 2);
            a = a(biiVar);
            this.d = a;
        }
        if (a != 65505) {
            return false;
        }
        biiVar.f(2);
        this.a.C(6);
        biiVar.j(this.a.a, 0, 6);
        return this.a.p() == 1165519206 && this.a.m() == 0;
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        String t;
        par a;
        int i;
        long j;
        int i2 = this.c;
        if (i2 == 0) {
            this.a.C(2);
            biiVar.k(this.a.a, 0, 2);
            int m = this.a.m();
            this.d = m;
            if (m == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    b();
                }
            } else if ((m < 65488 || m > 65497) && m != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.a.C(2);
            biiVar.k(this.a.a, 0, 2);
            this.e = this.a.m() - 2;
            this.c = 2;
            return 0;
        }
        MotionPhotoMetadata motionPhotoMetadata = null;
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || biiVar != this.h) {
                    this.h = biiVar;
                    this.i = new bjs(biiVar, this.f);
                }
                bkw bkwVar = this.j;
                pse.c(bkwVar);
                int h = bkwVar.h(this.i, tfqVar);
                if (h == 1) {
                    tfqVar.a += this.f;
                }
                return h;
            }
            long j2 = ((bid) biiVar).c;
            long j3 = this.f;
            if (j2 != j3) {
                tfqVar.a = j3;
                return 1;
            }
            if (!biiVar.o(this.a.a, 0, 1, true)) {
                b();
            } else {
                biiVar.l();
                if (this.j == null) {
                    this.j = new bkw(null);
                }
                bjs bjsVar = new bjs(biiVar, this.f);
                this.i = bjsVar;
                if (this.j.g(bjsVar)) {
                    bkw bkwVar2 = this.j;
                    long j4 = this.f;
                    bik bikVar = this.b;
                    pse.c(bikVar);
                    bkwVar2.a = new bju(j4, bikVar);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.g;
                    pse.c(motionPhotoMetadata2);
                    c(motionPhotoMetadata2);
                    this.c = 5;
                } else {
                    b();
                }
            }
            return 0;
        }
        if (this.d == 65505) {
            pth pthVar = new pth(this.e);
            biiVar.k(pthVar.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(pthVar.t()) && (t = pthVar.t()) != null) {
                long j5 = ((bid) biiVar).b;
                if (j5 != -1 && (a = bjv.a(t)) != null && (i = ((amvj) a.b).c) >= 2) {
                    long j6 = -1;
                    long j7 = -1;
                    long j8 = -1;
                    long j9 = -1;
                    boolean z = false;
                    for (int i3 = i - 1; i3 >= 0; i3--) {
                        bjr bjrVar = (bjr) a.b.get(i3);
                        z |= "video/mp4".equals(bjrVar.a);
                        if (i3 == 0) {
                            j5 -= bjrVar.c;
                            j = 0;
                        } else {
                            j = j5 - bjrVar.b;
                        }
                        long j10 = j5;
                        j5 = j;
                        if (z && j5 != j10) {
                            j9 = j10 - j5;
                            j8 = j5;
                            z = false;
                        }
                        if (i3 == 0) {
                            j7 = j10;
                        }
                        if (i3 == 0) {
                            j6 = j5;
                        }
                    }
                    motionPhotoMetadata = (j8 == -1 || j9 == -1 || j6 == -1 || j7 == -1) ? null : new MotionPhotoMetadata(j6, j7, a.a, j8, j9);
                }
                this.g = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f = motionPhotoMetadata.d;
                }
            }
        } else {
            biiVar.m(this.e);
        }
        this.c = 0;
        return 0;
    }
}
