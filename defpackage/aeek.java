package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.security.Key;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeek {
    public final adyc a;
    public aeej b;
    private final amnv d;
    private final phg e;
    private final Key f;
    private final Key g;
    private final afhf h;
    private final Object i;
    private final ptk j;
    private final ammv k;
    private final adyl l;
    private final Object m;
    private final shf o;
    private long p;
    private long q;
    private final aeeg r;
    private final afhs s;
    public volatile boolean c = false;
    private volatile boolean n = false;

    public aeek(amnv amnvVar, phg phgVar, Key key, Key key2, afhf afhfVar, aeeg aeegVar, shf shfVar, Object obj, adyc adycVar, ptk ptkVar, ammv ammvVar, adyl adylVar, afhs afhsVar) {
        this.d = amnvVar;
        this.e = phgVar;
        this.f = key;
        this.g = key2;
        afhfVar.getClass();
        this.h = afhfVar;
        this.r = aeegVar;
        this.o = shfVar;
        this.i = obj;
        this.a = adycVar;
        this.j = ptkVar;
        ammvVar.getClass();
        this.k = ammvVar;
        this.m = new Object();
        this.l = adylVar;
        this.s = afhsVar;
        this.p = -1L;
    }

    private final ate c() {
        pht phtVar = new pht("Downloader");
        Key key = this.f;
        return key != null ? new bgm(key.getEncoded(), phtVar) : phtVar;
    }

    public final void a(boolean z) {
        synchronized (this.m) {
            this.c = true;
            this.n = z;
        }
    }

    public final void b(FormatStreamModel formatStreamModel, long j, long j2, String str, afhd afhdVar, afhd afhdVar2) {
        bfe bfeVar;
        String str2;
        int g;
        bfe bglVar;
        phg phgVar;
        synchronized (this.i) {
            ath athVar = new ath(TextUtils.isEmpty(str) ? formatStreamModel.d : formatStreamModel.l(str), j, j2, adyu.r(formatStreamModel.b, formatStreamModel.e(), formatStreamModel.w(), formatStreamModel.k()), null);
            ate a = this.h.a();
            amnv amnvVar = this.d;
            if (amnvVar != null && (phgVar = (phg) amnvVar.get()) != null) {
                a = new phj(phgVar, a, c(), null, 5, afhdVar);
            }
            if (this.k.h()) {
                a = ((afhe) this.k.c()).a(a);
            }
            ate ateVar = a;
            bfe phiVar = new phi(this.r.a, 20480);
            int i = 4096;
            if (this.g != null) {
                if (this.s.C()) {
                    bglVar = new adyn(this.g.getEncoded(), phiVar, new byte[4096], this.l, true);
                } else {
                    bglVar = new bgl(this.g.getEncoded(), phiVar, new byte[4096]);
                }
                bfeVar = bglVar;
            } else {
                bfeVar = phiVar;
            }
            int i2 = -10;
            bga bgaVar = new bga(new phj(this.e, ateVar, c(), bfeVar, 5, afhdVar2), this.j, -10);
            byte[] bArr = new byte[4096];
            int i3 = 0;
            ath athVar2 = athVar;
            boolean z = false;
            while (!z) {
                this.j.a(i2);
                try {
                    this.j.d();
                    long j3 = 0;
                    try {
                        try {
                            bgaVar.h(athVar2);
                            while (!this.c && (g = bgaVar.g(bArr, i3, i)) >= 0) {
                                j3 += g;
                                long j4 = athVar2.g + j3;
                                if (j4 == this.p) {
                                    if (this.o.d() - this.q >= TimeUnit.MILLISECONDS.convert(30L, TimeUnit.SECONDS)) {
                                        throw new aeep();
                                        break;
                                    }
                                } else {
                                    this.p = j4;
                                    this.q = this.o.d();
                                    aeej aeejVar = this.b;
                                    if (aeejVar != null) {
                                        aeejVar.g(formatStreamModel, j4);
                                    }
                                }
                                i = 4096;
                                i3 = 0;
                            }
                            z = true;
                        } catch (ptj unused) {
                            z = j3 == athVar2.h;
                            if (!z) {
                                athVar2 = athVar2.b(j3);
                            }
                        }
                        i = 4096;
                        i3 = 0;
                        i2 = -10;
                    } finally {
                        bgaVar.j();
                    }
                } finally {
                    this.j.c(-10);
                }
            }
            if (this.c) {
                if (this.n && (str2 = athVar.i) != null) {
                    for (phl phlVar : this.e.f(str2)) {
                        long j5 = phlVar.b;
                        long j6 = athVar.g;
                        if (j5 >= j6 && j5 + phlVar.c <= j6 + athVar.h) {
                            this.e.k(phlVar);
                        }
                    }
                }
            }
        }
    }
}
