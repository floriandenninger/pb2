package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpy implements ate {
    byte[][] a;
    private final ate c;
    private final azrw d;
    private long e;
    private long f;
    private ath g;
    private String h;
    private int i;
    private String j;
    private long k;
    private agsw n;
    private agsj o;
    private agjd p;
    private int l = -1;
    private boolean m = false;
    final ArrayList b = new ArrayList();
    private ahah q = new ahah();
    private ahae r = new ahad(false);
    private final byte[] s = new byte[4096];

    public agpy(ate ateVar, azrw azrwVar) {
        this.c = ateVar;
        this.d = azrwVar;
    }

    private final void c(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (true) {
            int i4 = i3 - i;
            if (i4 <= 0) {
                return;
            }
            int i5 = (int) (this.f % 4096);
            int min = Math.min(i4, 4096 - i5);
            System.arraycopy(bArr, i, this.s, i5, min);
            this.r.c(this.s, i5, min);
            this.f += min;
            if (this.r.a() == 4096) {
                byte[] d = this.r.d();
                ahae ahaeVar = this.r;
                if (ahaeVar instanceof Serializable) {
                    this.r = ahah.a(this.m);
                } else {
                    ahaeVar.b();
                }
                int i6 = (int) ((this.f - 1) / 4096);
                byte[][] bArr2 = this.a;
                int length = bArr2.length;
                bArr2[i6 % length] = d;
                if ((i6 + 1) % length == 0) {
                    d(i6);
                }
            }
            i += min;
        }
    }

    private final void d(int i) {
        this.q.c();
        int length = this.a.length;
        int i2 = i / length;
        int i3 = (i % length) + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            this.q.b(this.a[i4]);
        }
        agnd agndVar = new agnd();
        agndVar.a = this.h;
        agndVar.b = this.i;
        agndVar.c = this.j;
        agndVar.d = this.l;
        agndVar.e = i2;
        agndVar.b(this.q.d());
        this.b.add(agndVar.a());
        if (this.b.size() >= 256) {
            e();
        }
    }

    private final void e() {
        this.o.e(this.b);
        this.b.clear();
    }

    @Override // defpackage.ate
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        this.c.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (this.l == -1) {
            return this.c.g(bArr, i, i2);
        }
        ath athVar = this.g;
        if (athVar != null) {
            long j = athVar.f;
            long j2 = this.e;
            long j3 = j - j2;
            if (j3 > 0) {
                byte[] bArr2 = new byte[4096];
                for (long j4 = 0; j3 > j4; j4 = 0) {
                    int g = this.c.g(bArr2, 0, (int) Math.min(j3, bArr.length));
                    if (g == -1) {
                        return -1;
                    }
                    long j5 = g;
                    this.e += j5;
                    c(bArr2, 0, g);
                    j3 -= j5;
                }
            } else {
                long j6 = this.f;
                if (j2 < j6) {
                    int g2 = this.c.g(bArr, i, Math.min(i2, (int) (j6 - j2)));
                    if (g2 == -1) {
                        return -1;
                    }
                    this.e += g2;
                    return g2;
                }
            }
            int g3 = this.c.g(bArr, i, i2);
            if (g3 == -1) {
                return -1;
            }
            this.e += g3;
            c(bArr, i, g3);
            return g3;
        }
        throw new IOException("Null dataspec on read.");
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        agnm agnmVar;
        aqyb aqybVar;
        int bP;
        this.g = athVar;
        if (athVar == null) {
            throw new IOException("Null dataspec on open.");
        }
        if (athVar.i != null) {
            this.e = athVar.f;
            agsn a = ((agof) this.d.get()).a();
            this.n = a.m();
            this.o = a.h();
            this.p = a.d();
            this.h = adyu.t(athVar.i);
            this.i = ozv.a(adyu.s(athVar.i));
            this.l = -1;
            agnv e = this.n.e(this.h);
            if (e == null) {
                return this.c.h(athVar);
            }
            agnz agnzVar = e.o;
            if (agnzVar == null) {
                return this.c.h(athVar);
            }
            int c = agtw.c(agnzVar.f);
            this.l = c;
            if (c == -1) {
                return this.c.h(athVar);
            }
            agnn c2 = this.p.c(this.h, null);
            if (c2 != null) {
                agnmVar = c2.a;
                if (agnmVar == null || agnmVar.a() != this.i) {
                    agnmVar = null;
                }
                agnm agnmVar2 = c2.b;
                if (agnmVar2 != null && agnmVar2.a() == this.i) {
                    agnmVar = agnmVar2;
                }
            } else {
                agnmVar = null;
            }
            if (agnmVar == null) {
                String str = this.h;
                int i = this.i;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("[Offline] stream to hash not in store: ");
                sb.append(str);
                sb.append(" ");
                sb.append(i);
                zga.b(sb.toString());
                throw new IOException("stream not in OfflineStreamStore");
            }
            aqxz aqxzVar = agnmVar.b.a;
            if ((aqxzVar.c & 1048576) != 0) {
                aqybVar = aqxzVar.x;
                if (aqybVar == null) {
                    aqybVar = aqyb.a;
                }
            } else {
                aqybVar = null;
            }
            if (aqybVar == null || (bP = anaf.bP(aqybVar.b)) == 0 || bP != 3) {
                this.l = -1;
                return this.c.h(athVar);
            }
            this.k = agnmVar.b();
            this.j = agnmVar.l;
            int i2 = this.l;
            this.a = new byte[1 << i2];
            agne b = i2 > 0 ? this.o.b(this.h, this.i, i2) : null;
            agne b2 = this.o.b(this.h, this.i, 0);
            boolean ac = agtw.ac(agnzVar.f);
            this.m = ac;
            if (ac) {
                this.q = new ahah(true);
                this.r = ahah.a(true);
            }
            long j = 0;
            this.f = 0L;
            if (b != null) {
                j = (b.e + 1) * r3 * 4096;
                this.f = j;
            }
            if (b2 != null) {
                this.f = b2.e * 4096;
                byte[] bArr = b2.g;
                if (bArr != null) {
                    try {
                        this.r = (ahae) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
                        j = r0.a() + this.f;
                        this.f = j;
                    } catch (IOException e2) {
                        throw new IOException("Failed to reconstitute offline content verification state.", e2);
                    } catch (ClassNotFoundException e3) {
                        throw new IllegalStateException(e3);
                    }
                } else {
                    this.r.b();
                    j = this.f + 4096;
                    this.f = j;
                }
            }
            int i3 = (int) (j / 4096);
            int length = this.a.length;
            int i4 = (i3 / length) * length;
            for (agne agneVar : this.o.g(this.h, this.i, i4, i3)) {
                this.a[agneVar.e - i4] = agneVar.f;
            }
            long j2 = athVar.f;
            long j3 = this.f;
            if (j2 <= j3) {
                return this.c.h(athVar);
            }
            long j4 = j2 - j3;
            if (athVar.g < j4) {
                zga.b("[Offline] Can't hash offline gap");
                this.f = athVar.f;
                return this.c.h(athVar);
            }
            ath b3 = athVar.b(-j4);
            this.e = b3.f;
            long h = this.c.h(b3);
            if (h == -1) {
                return -1L;
            }
            return h - j4;
        }
        throw new IOException("Null dataspec key on open.");
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.c.i();
    }

    @Override // defpackage.ate
    public final void j() {
        this.c.j();
        this.g = null;
        int i = this.l;
        if (i == -1) {
            return;
        }
        if (i > 0) {
            this.o.f(this.h, this.i);
        }
        long j = this.f;
        if (j != this.k) {
            e();
            int i2 = (int) (this.f / 4096);
            int length = this.a.length;
            int i3 = (i2 / length) * length;
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = i3; i4 < i2; i4++) {
                agnd agndVar = new agnd();
                agndVar.a = this.h;
                agndVar.b = this.i;
                agndVar.c = this.j;
                agndVar.d = 0;
                agndVar.e = i4;
                agndVar.b(this.a[i4 - i3]);
                arrayList.add(agndVar.a());
            }
            this.o.e(arrayList);
            int a = this.r.a();
            if (a > 0) {
                if (!(this.r instanceof Serializable)) {
                    boolean z = this.m;
                    int i5 = ahah.c;
                    ahag ahagVar = new ahag(z);
                    this.r = ahagVar;
                    ahagVar.c(this.s, 0, a);
                }
                ahae ahaeVar = this.r;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(ahaeVar);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                long j2 = this.f;
                agnd agndVar2 = new agnd();
                agndVar2.a = this.h;
                agndVar2.b = this.i;
                agndVar2.c = this.j;
                agndVar2.d = 0;
                agndVar2.e = (int) (j2 / 4096);
                agndVar2.g = Arrays.copyOf(byteArray, byteArray.length);
                this.o.d(agndVar2.a());
                return;
            }
            return;
        }
        int i6 = (int) ((j - 1) / 4096);
        if (this.r.a() != 0) {
            byte[][] bArr = this.a;
            bArr[i6 % bArr.length] = this.r.d();
        }
        if (this.f % (this.a.length * 4096) != 0) {
            d(i6);
        }
        e();
        String.valueOf(this.h).length();
    }
}
