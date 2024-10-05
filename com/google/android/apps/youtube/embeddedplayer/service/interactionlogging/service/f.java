package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.afsi;
import defpackage.ahdv;
import defpackage.ahef;
import defpackage.aigk;
import defpackage.apxf;
import defpackage.arpj;
import defpackage.azrw;
import defpackage.ypd;
import defpackage.zgj;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ypd {
    private final azrw c;
    private final zgj d;
    private int f = 0;
    public int b = -1;
    private final Map e = new HashMap();
    final Map a = new HashMap();

    public f(azrw azrwVar, zgj zgjVar) {
        this.c = azrwVar;
        this.d = zgjVar;
    }

    public static void g(int i) {
        StringBuilder sb = new StringBuilder(52);
        sb.append("InteractionLogger with ID ");
        sb.append(i);
        sb.append(" doesn't exist.");
        afsi.c(1, 4, sb.toString(), new Throwable());
    }

    public final synchronized int a(int i) {
        int i2;
        i2 = this.f;
        this.f = i2 + 1;
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        e eVar = (e) map.get(valueOf);
        if (eVar == null) {
            eVar = new e(this.d.a());
            eVar.b = 1;
            this.a.put(valueOf, eVar);
        } else {
            eVar.b++;
        }
        this.e.put(Integer.valueOf(i2), new d(this.c, i, eVar.a));
        return i2;
    }

    public final Optional b() {
        return c(this.b);
    }

    final Optional c(int i) {
        return Optional.ofNullable((d) this.e.get(Integer.valueOf(i)));
    }

    public final synchronized void d(int i, arpj arpjVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        if (dVar.b.a) {
            b bVar = new b(a.ATTACH, arpjVar.e.I());
            if (!dVar.j(bVar)) {
                dVar.b.a(bVar, null);
            }
        }
    }

    final synchronized void e(ahdv ahdvVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        aigk aigkVar = aigk.NEW;
        int ordinal = ahdvVar.c().ordinal();
        if (ordinal == 3) {
            dVar.d(ahdvVar.b(), Optional.ofNullable(ahdvVar.d()));
            return;
        }
        if (ordinal == 4) {
            dVar.d(ahdvVar.b(), Optional.ofNullable(ahdvVar.d()));
            WatchNextResponseModel a = ahdvVar.a();
            if (!dVar.c.a) {
                afsi.b(2, 4, "handleWatchNextResponse called without any EmbedWatchPage logged");
            } else {
                if (a == null) {
                    afsi.b(2, 4, "handleWatchNextResponse called wtih an empty watchNextResponse");
                    return;
                }
                b bVar = new b(a.ATTACH, a.d());
                if (!dVar.j(bVar)) {
                    dVar.i(bVar);
                }
            }
        }
    }

    final synchronized void h(ahef ahefVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        dVar.h = Optional.ofNullable(ahefVar.e());
        if (d.k(dVar.h)) {
            return;
        }
        dVar.c();
    }

    public final synchronized void i(acsc acscVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
        } else {
            ((d) b.get()).i(new b(a.CLICK, acscVar));
        }
    }

    public final synchronized void j(byte[] bArr) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
        } else {
            ((d) b.get()).i(new b(a.CLICK, bArr));
        }
    }

    public final synchronized void k(int i, acsc acscVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).e(new b(a.CLICK, acscVar));
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class};
        }
        if (i == 0) {
            e((ahdv) obj);
            return null;
        }
        if (i == 1) {
            h((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final synchronized void l(int i, byte[] bArr) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).e(new b(a.CLICK, bArr));
        }
    }

    public final synchronized void m(int i, Optional optional, boolean z) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        if (!dVar.a.a) {
            afsi.b(2, 4, "logNewApiVideoLoad before logNewEmbedPage");
            return;
        }
        dVar.g = Optional.empty();
        dVar.c();
        dVar.b.c();
        dVar.c.c();
        dVar.i = null;
        if (z) {
            dVar.f(optional);
            return;
        }
        c cVar = dVar.a;
        if (!cVar.a) {
            afsi.b(2, 4, "logNewEmbedPreviewPage called before logNewEmbedPage");
            return;
        }
        dVar.i = dVar.b;
        cVar.d(optional);
        dVar.b();
        dVar.b.b(acsb.b(32594), optional, dVar.a(null));
        dVar.h = Optional.empty();
        b bVar = new b(a.ATTACH, acsb.c(28572));
        if (!dVar.j(bVar)) {
            dVar.e(bVar);
        }
        dVar.h(acsb.c(28572));
    }

    public final synchronized void n(int i) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        c cVar = dVar.a;
        if (cVar.a) {
            afsi.b(2, 4, "logNewEmbedPage called more than once");
        } else {
            dVar.i = cVar;
            cVar.b(acsb.b(16623), Optional.empty(), dVar.a(null));
        }
    }

    public final synchronized void o(int i, Optional optional) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).g(optional, null);
        }
    }

    public final synchronized void p(acsc acscVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        b bVar = new b(a.VISIBILITY_UPDATE, acscVar);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.i(bVar);
    }

    public final synchronized void q(byte[] bArr) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        b bVar = new b(a.VISIBILITY_UPDATE, bArr);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.i(bVar);
    }

    public final synchronized void r(int i, acsc acscVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).h(acscVar);
        }
    }

    public final synchronized void s(int i, byte[] bArr) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        b bVar = new b(a.VISIBILITY_UPDATE, bArr);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.e(bVar);
    }

    public final synchronized void t(int i) {
        Optional c = c(i);
        if (c.isPresent()) {
            d dVar = (d) c.get();
            this.e.remove(Integer.valueOf(i));
            e eVar = (e) this.a.get(Integer.valueOf(dVar.d));
            if (eVar != null) {
                int i2 = eVar.b - 1;
                eVar.b = i2;
                if (i2 == 0) {
                    this.a.remove(Integer.valueOf(dVar.d));
                    return;
                }
                return;
            }
            int i3 = dVar.d;
            StringBuilder sb = new StringBuilder(85);
            sb.append("Activity identifier ");
            sb.append(i3);
            sb.append(" doesn't have associated embedded playback host nonce.");
            afsi.b(2, 4, sb.toString());
        }
    }

    public final synchronized void u(int i, apxf apxfVar) {
        m(i, Optional.of(apxfVar), true);
    }
}
