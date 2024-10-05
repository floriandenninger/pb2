package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwg implements aivp {
    private static final SparseIntArray e;
    public final azqv a;
    public hn b;
    public hq c;
    public anyx d;
    private final Context f;
    private final Handler g;
    private final azrw h;
    private final aivq i;
    private final azrw j;
    private final azrw k;
    private final aiwh l;
    private final int m;
    private final Runnable n;
    private final Runnable o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(2, 3);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(5, 6);
        sparseIntArray.put(6, 6);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(8, 7);
        sparseIntArray.put(9, 3);
        sparseIntArray.put(10, 2);
    }

    public aiwg(Context context, Handler handler, azrw azrwVar, aivq aivqVar, azrw azrwVar2, aiwh aiwhVar) {
        aiwe aiweVar = new aiwe(context, r1);
        final int i = 1;
        this.n = new Runnable(this) { // from class: aiwd
            public final /* synthetic */ aiwg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hq hqVar;
                anyx anyxVar;
                if (i != 0) {
                    aiwg aiwgVar = this.a;
                    hn hnVar = aiwgVar.b;
                    if (hnVar != null && (anyxVar = aiwgVar.d) != null) {
                        hnVar.h(anyxVar.o());
                    }
                    aiwgVar.d = null;
                    return;
                }
                aiwg aiwgVar2 = this.a;
                hn hnVar2 = aiwgVar2.b;
                if (hnVar2 != null && hnVar2.k() && (hqVar = aiwgVar2.c) != null) {
                    aiwgVar2.b.i(hqVar.a());
                }
                aiwgVar2.c = null;
            }
        };
        this.o = new Runnable(this) { // from class: aiwd
            public final /* synthetic */ aiwg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hq hqVar;
                anyx anyxVar;
                if (r2 != 0) {
                    aiwg aiwgVar = this.a;
                    hn hnVar = aiwgVar.b;
                    if (hnVar != null && (anyxVar = aiwgVar.d) != null) {
                        hnVar.h(anyxVar.o());
                    }
                    aiwgVar.d = null;
                    return;
                }
                aiwg aiwgVar2 = this.a;
                hn hnVar2 = aiwgVar2.b;
                if (hnVar2 != null && hnVar2.k() && (hqVar = aiwgVar2.c) != null) {
                    aiwgVar2.b.i(hqVar.a());
                }
                aiwgVar2.c = null;
            }
        };
        this.f = context;
        handler.getClass();
        this.g = handler;
        azrwVar.getClass();
        this.h = azrwVar;
        aivqVar.getClass();
        this.i = aivqVar;
        this.k = aiweVar;
        this.j = azrwVar2;
        aiwhVar.getClass();
        this.l = aiwhVar;
        this.a = azqv.aq(aiwf.STOPPED);
        this.m = Build.VERSION.SDK_INT < 30 ? 8 : 0;
    }

    public static void b(hn hnVar) {
        hnVar.h(null);
    }

    private final hn g() {
        hn hnVar = this.b;
        if (hnVar != null) {
            return hnVar;
        }
        aifo.a(aifn.MEDIASESSION, "MediaSession created", new Object[0]);
        hn hnVar2 = (hn) this.k.get();
        this.b = hnVar2;
        hnVar2.b.q();
        hnVar2.f((hg) this.h.get());
        hq h = h();
        h.c(0, 0L, 1.0f);
        h.b = this.l.b();
        hnVar2.i(h.a());
        hnVar2.l();
        return hnVar2;
    }

    private final hq h() {
        hq hqVar = new hq();
        amxe it = ((amru) this.l.a()).iterator();
        while (it.hasNext()) {
            aiwc aiwcVar = (aiwc) it.next();
            if (aiwcVar.e()) {
                hr hrVar = new hr(aiwcVar.d(), this.f.getString(aiwcVar.b()), aiwcVar.a());
                Bundle c = aiwcVar.c();
                if (c != null) {
                    hrVar.d = c;
                }
                hqVar.a.add(new PlaybackStateCompat.CustomAction(hrVar.a, hrVar.b, hrVar.c, hrVar.d));
            }
        }
        Bundle f = this.l.f();
        f.putInt("android.media.session.extra.LEGACY_STREAM_TYPE", this.i.q == owg.AUDIO_ROUTE_ALARM ? 4 : 3);
        hqVar.f = f;
        return hqVar;
    }

    private final anyx i() {
        String charSequence = this.i.m.toString();
        anyx anyxVar = new anyx((byte[]) null);
        anyxVar.r("android.media.metadata.ARTIST", charSequence);
        anyxVar.r("android.media.metadata.ALBUM_ARTIST", charSequence);
        anyxVar.r("android.media.metadata.TITLE", this.i.l.toString());
        anyxVar.q("android.media.metadata.DURATION", this.i.g);
        anyxVar.q("com.google.android.youtube.MEDIA_METADATA_VIDEO_HEIGHT_PX", this.i.i);
        anyxVar.q("com.google.android.youtube.MEDIA_METADATA_VIDEO_WIDTH_PX", this.i.j);
        if (this.i.n.length() != 0) {
            anyxVar.r("android.media.metadata.ALBUM", this.i.n.toString());
        }
        Bitmap bitmap = this.i.o;
        if (bitmap != null) {
            anyxVar.p("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.l.g();
        return anyxVar;
    }

    public final hn a() {
        yjk.f();
        return g();
    }

    public final void c() {
        this.i.c(this);
        amxe it = ((amru) this.l.a()).iterator();
        while (it.hasNext()) {
            ((aiwc) it.next()).f();
        }
    }

    public final void e() {
        hn hnVar = this.b;
        if (hnVar == null) {
            hnVar = g();
        }
        if (hnVar.k()) {
            return;
        }
        aifo.a(aifn.MEDIASESSION, "MediaSession setActive(true)", new Object[0]);
        hnVar.j((PendingIntent) this.j.get());
        hnVar.e(true);
        hnVar.h(i().o());
        this.a.c(aiwf.STARTED);
    }

    public final void f(boolean z) {
        hn hnVar = this.b;
        if (hnVar == null) {
            return;
        }
        aifo.a(aifn.MEDIASESSION, "MediaSession setActive(false)", new Object[0]);
        this.d = null;
        this.c = null;
        hnVar.e(false);
        hq h = h();
        h.c(1, 0L, 1.0f);
        h.b = this.l.d();
        hnVar.i(h.a());
        if (z) {
            b(hnVar);
        }
        this.a.c(aiwf.STOPPED);
    }

    @Override // defpackage.aivp
    public final void d(int i) {
        hn hnVar = this.b;
        long j = 0;
        if (hnVar != null && (64791 & i) != 0) {
            if (i == 16) {
                aivq aivqVar = this.i;
                if (hnVar.c.c() == null || Math.abs(aivqVar.h - hnVar.c.c().b) > 2000) {
                    i = 16;
                } else {
                    i = 16;
                }
            }
            aivq aivqVar2 = this.i;
            long j2 = true != aivqVar2.e ? 0L : 6L;
            if (aivqVar2.c) {
                j2 |= 16;
            }
            if (aivqVar2.d) {
                j2 |= 32;
            }
            if (aivqVar2.f) {
                j2 |= 256;
            }
            int i2 = e.get(this.i.b, this.m);
            hq h = h();
            aivq aivqVar3 = this.i;
            h.c(i2, aivqVar3.h, aivqVar3.k);
            h.b = this.l.c(j2);
            this.l.e();
            h.e = -1L;
            this.c = h;
            if (h != null) {
                this.g.removeCallbacks(this.o);
                this.o.run();
            }
        }
        if (this.b == null || (66280 & i) == 0) {
            return;
        }
        if (this.i.o == null && (i & 64) != 0) {
            j = 500;
        }
        this.g.removeCallbacks(this.n);
        this.d = i();
        this.g.postDelayed(this.n, j);
    }
}
