package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiee implements aioa {
    public final Set a;
    public final LruCache b;
    public long c;
    public Bitmap d;
    public long e;
    public Bitmap f;
    public final Object i;
    public boolean j;
    public acsx l;
    public int m;
    private final ajjz o;
    private final Executor p;
    private final Executor q;
    private final ykl r;
    private int s;
    private final aifs t;
    private final aioc u;
    private final aaea v;
    private boolean w;
    private final acsy x;
    private boolean y;
    private vak z;
    public boolean g = false;
    public boolean h = false;
    public boolean k = false;
    public final ayqw n = new ayqw();

    public aiee(ajjz ajjzVar, Executor executor, ScheduledExecutorService scheduledExecutorService, aifs aifsVar, aioc aiocVar, aaea aaeaVar, acsy acsyVar) {
        ajjzVar.getClass();
        this.o = ajjzVar;
        this.p = executor;
        this.q = scheduledExecutorService;
        this.i = new Object();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.t = aifsVar;
        this.u = aiocVar;
        this.v = aaeaVar;
        this.m = 0;
        this.x = acsyVar;
        this.b = new LruCache(3);
        this.c = -1L;
        this.e = -1L;
        this.r = new aiec(this);
        g();
    }

    public static long a(aieg aiegVar, long j) {
        return (j << 32) | aiegVar.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Uri m(aieg aiegVar, int i) {
        int floor = (int) Math.floor(i / aiegVar.c());
        String str = null;
        if (floor >= aiegVar.d()) {
            return null;
        }
        if (floor >= 0 && floor < aiegVar.d() && (str = (String) aiegVar.i.get(floor)) == null) {
            String replace = aiegVar.g.replace("$N", aiegVar.e);
            int i2 = aiegVar.h;
            StringBuilder sb = new StringBuilder(11);
            sb.append(i2);
            String replace2 = replace.replace("$L", sb.toString());
            StringBuilder sb2 = new StringBuilder(11);
            sb2.append(floor);
            zhy b = zhy.b(Uri.parse(replace2.replace("$M", sb2.toString())));
            b.h("sigh", aiegVar.f);
            str = b.a().toString();
            aiegVar.i.put(floor, str);
        }
        return Uri.parse(str);
    }

    public final synchronized void b(aied aiedVar) {
        this.a.add(aiedVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r19) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiee.c(com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):void");
    }

    public final synchronized void d(final int i, final int i2) {
        this.p.execute(new Runnable() { // from class: aiea
            @Override // java.lang.Runnable
            public final void run() {
                aiee aieeVar = aiee.this;
                int i3 = i;
                int i4 = i2;
                synchronized (aieeVar) {
                    Iterator it = aieeVar.a.iterator();
                    while (it.hasNext()) {
                        ((aied) it.next()).x(i3, i4);
                    }
                }
            }
        });
    }

    public final synchronized void f(Bitmap bitmap, final int i) {
        final aief a;
        if (bitmap != null) {
            try {
                a = aief.a(bitmap);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            a = null;
        }
        this.p.execute(new Runnable() { // from class: aieb
            @Override // java.lang.Runnable
            public final void run() {
                aiee aieeVar = aiee.this;
                aief aiefVar = a;
                int i2 = i;
                synchronized (aieeVar) {
                    Iterator it = aieeVar.a.iterator();
                    while (it.hasNext()) {
                        ((aied) it.next()).y(aiefVar, i2);
                    }
                    acsx acsxVar = aieeVar.l;
                    if (acsxVar != null) {
                        acsxVar.c("thsb0_fr");
                        aieeVar.l = null;
                    }
                }
            }
        });
    }

    public final void g() {
        this.n.g(kI(this.u));
    }

    public final synchronized void h(aied aiedVar) {
        this.a.remove(aiedVar);
    }

    public final void i(aieg aiegVar, int i) {
        Uri m;
        if (((!this.g || this.h) && !this.t.m) || (m = m(aiegVar, i)) == null) {
            return;
        }
        atys e = aifk.e(this.v);
        if (e != null && e.I && !this.y) {
            this.y = true;
            acsx d = this.x.d(asmn.LATENCY_ACTION_STORYBOARD_THUMBNAILS);
            this.l = d;
            d.e();
        }
        acsx acsxVar = this.l;
        if (acsxVar != null) {
            acsxVar.c("thsb0_ns");
        }
        this.o.m(m, this.r);
    }

    public final void j() {
        if (this.c == -1 && this.e == -1) {
            return;
        }
        synchronized (this.i) {
            this.z = null;
            this.g = false;
            this.h = false;
            this.b.evictAll();
            this.d = null;
            this.f = null;
            this.c = -1L;
            this.e = -1L;
            this.j = false;
            this.k = false;
            this.w = false;
            this.l = null;
            this.y = false;
            f(null, -1);
        }
    }

    public final void k(long j, final int i) {
        if (!l() || this.j) {
            d(i, 0);
            return;
        }
        final aieg f = this.z.f(this.s);
        if (f == null) {
            d(i, 1);
            return;
        }
        final int a = f.a(j);
        if (a < 0) {
            d(i, 2);
        } else if (!this.k) {
            this.k = true;
            this.q.execute(new Runnable() { // from class: aidy
                @Override // java.lang.Runnable
                public final void run() {
                    aiee aieeVar = aiee.this;
                    aieg aiegVar = f;
                    int i2 = a;
                    int i3 = i;
                    long j2 = i2;
                    Long valueOf = Long.valueOf(aiee.a(aiegVar, j2));
                    synchronized (aieeVar.i) {
                        if (valueOf.longValue() == aieeVar.e || valueOf.longValue() == aieeVar.c) {
                            aieeVar.d(i3, 5);
                        } else {
                            Uri m = aiee.m(aiegVar, i2);
                            Bitmap bitmap = null;
                            if ((m != null ? (BitmapRegionDecoder) aieeVar.b.get(m) : null) == null) {
                                aieeVar.i(aiegVar, i2);
                                aieeVar.d(i3, 4);
                            } else {
                                long a2 = aiee.a(aiegVar, j2);
                                Bitmap bitmap2 = aieeVar.d;
                                if (bitmap2 != null) {
                                    amkq.E(bitmap2 != aieeVar.f);
                                }
                                Bitmap bitmap3 = aieeVar.d;
                                BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder) aieeVar.b.get(aiee.m(aiegVar, i2));
                                if (bitmapRegionDecoder == null) {
                                    aieeVar.i(aiegVar, i2);
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inBitmap = bitmap3;
                                    options.inMutable = true;
                                    try {
                                        int c = i2 % aiegVar.c();
                                        int i4 = aiegVar.d;
                                        int i5 = c / i4;
                                        Rect rect = new Rect((i2 % i4) * aiegVar.a, i5 * aiegVar.b, (r13 + r2) - 1, (r1 + r6) - 1);
                                        int i6 = aieeVar.m;
                                        if (i6 == 1) {
                                            rect.set(rect.left, rect.top, rect.centerX(), rect.bottom);
                                        } else if (i6 == 3) {
                                            rect.set(rect.left, rect.top, rect.right, rect.centerY());
                                        }
                                        if (bitmapRegionDecoder.getWidth() >= rect.right && bitmapRegionDecoder.getHeight() >= rect.bottom && rect.width() > 0 && rect.height() > 0) {
                                            bitmap = bitmapRegionDecoder.decodeRegion(rect, options);
                                        }
                                    } catch (Exception e) {
                                        String valueOf2 = String.valueOf(e.getClass().getName());
                                        afsi.b(2, 10, valueOf2.length() != 0 ? "Storyboard regionDecoder.decodeRegion exception - ".concat(valueOf2) : new String("Storyboard regionDecoder.decodeRegion exception - "));
                                        aieeVar.j = true;
                                    }
                                }
                                if (bitmap != null) {
                                    aieeVar.d = aieeVar.f;
                                    aieeVar.c = aieeVar.e;
                                    aieeVar.f = bitmap;
                                    aieeVar.e = a2;
                                    aieeVar.f(aieeVar.f, i3);
                                } else {
                                    aieeVar.d(i3, 6);
                                }
                            }
                        }
                        aieeVar.k = false;
                    }
                }
            });
        } else {
            d(i, 3);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        aypn h = aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 268435456L));
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        final int i4 = 4;
        ayqx Y = aiocVar.ae(aidf.g, aidf.h).G().h(ahbw.e(1)).Y(new ayrs(this) { // from class: aidz
            public final /* synthetic */ aiee a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i5 = i;
                if (i5 == 0) {
                    aiee aieeVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (aieeVar.l()) {
                        aieeVar.g = ahegVar.a() - ahegVar.e() > 5000;
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    this.a.c(((ahdp) obj).a());
                    return;
                }
                if (i5 == 2) {
                    aiee aieeVar2 = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (aieeVar2.l()) {
                        boolean c = ahejVar.c();
                        aieeVar2.h = c;
                        if (!c && aieeVar2.g) {
                            r1 = true;
                        }
                        aieeVar2.g = r1;
                        return;
                    }
                    return;
                }
                if (i5 == 3) {
                    aiee aieeVar3 = this.a;
                    ahel ahelVar = (ahel) obj;
                    PlayerResponseModel c2 = ahelVar.a().c();
                    if (ahelVar.a().a() != 3 || c2 == null) {
                        return;
                    }
                    aieeVar3.c(c2);
                    return;
                }
                this.a.j();
            }
        }, ahwx.p);
        final int i5 = 3;
        return new ayqx[]{h.h(ahbw.e(1)).Y(new ayrs(this) { // from class: aidz
            public final /* synthetic */ aiee a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i52 = i2;
                if (i52 == 0) {
                    aiee aieeVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (aieeVar.l()) {
                        aieeVar.g = ahegVar.a() - ahegVar.e() > 5000;
                        return;
                    }
                    return;
                }
                if (i52 == 1) {
                    this.a.c(((ahdp) obj).a());
                    return;
                }
                if (i52 == 2) {
                    aiee aieeVar2 = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (aieeVar2.l()) {
                        boolean c = ahejVar.c();
                        aieeVar2.h = c;
                        if (!c && aieeVar2.g) {
                            r1 = true;
                        }
                        aieeVar2.g = r1;
                        return;
                    }
                    return;
                }
                if (i52 == 3) {
                    aiee aieeVar3 = this.a;
                    ahel ahelVar = (ahel) obj;
                    PlayerResponseModel c2 = ahelVar.a().c();
                    if (ahelVar.a().a() != 3 || c2 == null) {
                        return;
                    }
                    aieeVar3.c(c2);
                    return;
                }
                this.a.j();
            }
        }, ahwx.p), aiocVar.G().i.h(ahbw.g(aiocVar.aC(), 268435456L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aidz
            public final /* synthetic */ aiee a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i52 = i3;
                if (i52 == 0) {
                    aiee aieeVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (aieeVar.l()) {
                        aieeVar.g = ahegVar.a() - ahegVar.e() > 5000;
                        return;
                    }
                    return;
                }
                if (i52 == 1) {
                    this.a.c(((ahdp) obj).a());
                    return;
                }
                if (i52 == 2) {
                    aiee aieeVar2 = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (aieeVar2.l()) {
                        boolean c = ahejVar.c();
                        aieeVar2.h = c;
                        if (!c && aieeVar2.g) {
                            r1 = true;
                        }
                        aieeVar2.g = r1;
                        return;
                    }
                    return;
                }
                if (i52 == 3) {
                    aiee aieeVar3 = this.a;
                    ahel ahelVar = (ahel) obj;
                    PlayerResponseModel c2 = ahelVar.a().c();
                    if (ahelVar.a().a() != 3 || c2 == null) {
                        return;
                    }
                    aieeVar3.c(c2);
                    return;
                }
                this.a.j();
            }
        }, ahwx.p), aiocVar.ab().Y(new ayrs(this) { // from class: aidz
            public final /* synthetic */ aiee a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i52 = i4;
                if (i52 == 0) {
                    aiee aieeVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (aieeVar.l()) {
                        aieeVar.g = ahegVar.a() - ahegVar.e() > 5000;
                        return;
                    }
                    return;
                }
                if (i52 == 1) {
                    this.a.c(((ahdp) obj).a());
                    return;
                }
                if (i52 == 2) {
                    aiee aieeVar2 = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (aieeVar2.l()) {
                        boolean c = ahejVar.c();
                        aieeVar2.h = c;
                        if (!c && aieeVar2.g) {
                            r1 = true;
                        }
                        aieeVar2.g = r1;
                        return;
                    }
                    return;
                }
                if (i52 == 3) {
                    aiee aieeVar3 = this.a;
                    ahel ahelVar = (ahel) obj;
                    PlayerResponseModel c2 = ahelVar.a().c();
                    if (ahelVar.a().a() != 3 || c2 == null) {
                        return;
                    }
                    aieeVar3.c(c2);
                    return;
                }
                this.a.j();
            }
        }, ahwx.p), Y, aiocVar.V().Y(new ayrs(this) { // from class: aidz
            public final /* synthetic */ aiee a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i52 = i5;
                if (i52 == 0) {
                    aiee aieeVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (aieeVar.l()) {
                        aieeVar.g = ahegVar.a() - ahegVar.e() > 5000;
                        return;
                    }
                    return;
                }
                if (i52 == 1) {
                    this.a.c(((ahdp) obj).a());
                    return;
                }
                if (i52 == 2) {
                    aiee aieeVar2 = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (aieeVar2.l()) {
                        boolean c = ahejVar.c();
                        aieeVar2.h = c;
                        if (!c && aieeVar2.g) {
                            r1 = true;
                        }
                        aieeVar2.g = r1;
                        return;
                    }
                    return;
                }
                if (i52 == 3) {
                    aiee aieeVar3 = this.a;
                    ahel ahelVar = (ahel) obj;
                    PlayerResponseModel c2 = ahelVar.a().c();
                    if (ahelVar.a().a() != 3 || c2 == null) {
                        return;
                    }
                    aieeVar3.c(c2);
                    return;
                }
                this.a.j();
            }
        }, ahwx.p)};
    }

    public final boolean l() {
        vak vakVar = this.z;
        if (vakVar != null && this.w) {
            aieg f = vakVar.f(0);
            if (!(f instanceof aieh) || f.b() > 0) {
                return true;
            }
        }
        return false;
    }
}
