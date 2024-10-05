package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfk implements ate {
    private final Context a;
    private final List b = new ArrayList();
    private final ate c;
    private ate d;
    private ate e;
    private ate f;
    private ate g;
    private ate h;
    private ate i;
    private ate j;
    private ate k;

    public bfk(Context context, ate ateVar) {
        this.a = context.getApplicationContext();
        this.c = ateVar;
    }

    private final ate c() {
        if (this.e == null) {
            bet betVar = new bet(this.a);
            this.e = betVar;
            d(betVar);
        }
        return this.e;
    }

    private final void d(ate ateVar) {
        for (int i = 0; i < this.b.size(); i++) {
            ateVar.b((att) this.b.get(i));
        }
    }

    private static final void e(ate ateVar, att attVar) {
        if (ateVar != null) {
            ateVar.b(attVar);
        }
    }

    @Override // defpackage.ate
    public final Map a() {
        ate ateVar = this.k;
        return ateVar == null ? Collections.emptyMap() : ateVar.a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        pse.c(attVar);
        this.c.b(attVar);
        this.b.add(attVar);
        e(this.d, attVar);
        e(this.e, attVar);
        e(this.f, attVar);
        e(this.g, attVar);
        e(this.h, attVar);
        e(this.i, attVar);
        e(this.j, attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        ate ateVar = this.k;
        pse.c(ateVar);
        return ateVar.g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        ate ateVar;
        pse.g(this.k == null);
        String scheme = athVar.a.getScheme();
        if (pts.W(athVar.a)) {
            String path = athVar.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = c();
            } else {
                if (this.d == null) {
                    bfp bfpVar = new bfp();
                    this.d = bfpVar;
                    d(bfpVar);
                }
                this.k = this.d;
            }
        } else if ("asset".equals(scheme)) {
            this.k = c();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                bfc bfcVar = new bfc(this.a);
                this.f = bfcVar;
                d(bfcVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    ate ateVar2 = (ate) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = ateVar2;
                    d(ateVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                bgk bgkVar = new bgk();
                this.h = bgkVar;
                d(bgkVar);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                bfd bfdVar = new bfd();
                this.i = bfdVar;
                d(bfdVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    bgc bgcVar = new bgc(this.a);
                    this.j = bgcVar;
                    d(bgcVar);
                }
                ateVar = this.j;
            } else {
                ateVar = this.c;
            }
            this.k = ateVar;
        }
        return this.k.h(athVar);
    }

    @Override // defpackage.ate
    public final Uri i() {
        ate ateVar = this.k;
        if (ateVar == null) {
            return null;
        }
        return ateVar.i();
    }

    @Override // defpackage.ate
    public final void j() {
        ate ateVar = this.k;
        if (ateVar != null) {
            try {
                ateVar.j();
            } finally {
                this.k = null;
            }
        }
    }
}
