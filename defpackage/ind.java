package defpackage;

import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ind implements afwx {
    static final long a = TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS);
    public static final /* synthetic */ int k = 0;
    public final iol b;
    public final LruCache d;
    public final ayqj e;
    public final ayqj f;
    public final ayqi h;
    public boolean i;
    public boolean j;
    private final String m;
    private final long n;
    private final ion o;
    private final shf p;
    private final aapf q;
    private boolean r;
    private final boolean s;
    private final boolean t;
    private final ArrayList l = new ArrayList();
    public final List c = new ArrayList();
    public final azrj g = azrj.W();

    public ind(ayqj ayqjVar, ayqj ayqjVar2, iol iolVar, String str, long j, LruCache lruCache, ion ionVar, Executor executor, ayqi ayqiVar, shf shfVar, aapf aapfVar, boolean z, boolean z2, boolean z3) {
        this.b = iolVar;
        this.m = str;
        this.n = j;
        this.d = lruCache;
        this.o = ionVar;
        this.p = shfVar;
        this.q = aapfVar;
        this.h = ayqiVar;
        ayqi b = azre.b(executor);
        this.e = ayqjVar.M(b);
        this.f = ayqjVar2.M(b);
        this.j = z;
        this.s = z2;
        this.t = z3;
    }

    private final inf g(String str, arsd arsdVar) {
        long min;
        if (this.i) {
            return null;
        }
        arnd arndVar = arsdVar.c;
        if (arndVar == null) {
            arndVar = arnd.a;
        }
        VideoStreamingData h = h(arsdVar);
        if (h == null && !this.t) {
            return null;
        }
        int i = arndVar.e;
        if (i <= 0) {
            i = 300;
        }
        if (this.t) {
            min = this.p.d() + TimeUnit.SECONDS.toMillis(i);
        } else {
            min = Math.min(this.p.d() + TimeUnit.SECONDS.toMillis(i), h.e - a);
        }
        synchronized (this.d) {
            if (this.i) {
                return null;
            }
            inf infVar = new inf();
            infVar.b = arsdVar;
            infVar.d = min;
            infVar.e = h;
            this.d.put(str, infVar);
            return infVar;
        }
    }

    private final VideoStreamingData h(arsd arsdVar) {
        if (arsdVar == null || (arsdVar.b & 4) == 0 || this.t) {
            return null;
        }
        aapf aapfVar = this.q;
        aryr aryrVar = arsdVar.e;
        if (aryrVar == null) {
            aryrVar = aryr.a;
        }
        return PlayerResponseModel.e(aapfVar, aryrVar, this.n, this.m);
    }

    private final void i() {
        synchronized (this.d) {
            if (!this.i) {
                this.d.remove(this.b.b());
            }
        }
    }

    private final boolean j() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        iol iolVar = this.b;
        iolVar.j = false;
        iolVar.b = false;
        this.o.b(iolVar, this);
        return true;
    }

    public final void d(afwx afwxVar, boolean z) {
        this.l.add(afwxVar);
        if (z || !this.b.j) {
            return;
        }
        this.r = true;
    }

    public final void e(afwx afwxVar, boolean z) {
        this.c.add(afwxVar);
        if (z || !this.b.j) {
            return;
        }
        this.r = true;
    }

    @Override // defpackage.cnl
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void kZ(arsd arsdVar) {
        int bg;
        VideoStreamingData h;
        int bg2 = anaf.bg(arsdVar.h);
        VideoStreamingData videoStreamingData = null;
        if (bg2 == 0 || bg2 != 5) {
            int bg3 = anaf.bg(arsdVar.h);
            if ((bg3 == 0 || bg3 != 3) && ((bg = anaf.bg(arsdVar.h)) == 0 || bg != 4)) {
                inf g = g(this.b.b(), arsdVar);
                if (g == null || (h = g.e) == null) {
                    h = h(arsdVar);
                }
                if ((arsdVar.b & 4096) != 0) {
                    apxf apxfVar = arsdVar.k;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    iol a2 = ing.a(apxfVar, this.o);
                    aone builder = arsdVar.toBuilder();
                    builder.copyOnWrite();
                    arsd arsdVar2 = (arsd) builder.instance;
                    arsdVar2.k = null;
                    arsdVar2.b &= -4097;
                    builder.copyOnWrite();
                    arsd arsdVar3 = (arsd) builder.instance;
                    arsdVar3.b &= -8193;
                    arsdVar3.l = arsd.a.l;
                    g(a2.b(), (arsd) builder.build());
                }
                videoStreamingData = h;
            } else if (j()) {
                return;
            } else {
                i();
            }
        } else {
            if (j()) {
                return;
            }
            ing.c(this.d);
            videoStreamingData = h(arsdVar);
        }
        if (!this.t && (videoStreamingData == null || (arsdVar.b & 4) == 0)) {
            if (j()) {
                return;
            }
            i();
            aone builder2 = arsdVar.toBuilder();
            builder2.copyOnWrite();
            arsd arsdVar4 = (arsd) builder2.instance;
            arsdVar4.h = 2;
            arsdVar4.b |= 32;
            arsdVar = (arsd) builder2.build();
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afwx) arrayList.get(i)).kZ(new ine(arsdVar, videoStreamingData, false));
        }
        if (this.t) {
            return;
        }
        if ((arsdVar.b & 4) == 0 || (videoStreamingData == null && !this.s)) {
            cnq cnqVar = new cnq("Reel with no PlayerResponse.");
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((afwx) it.next()).kY(cnqVar);
            }
            return;
        }
        aryr aryrVar = arsdVar.e;
        if (aryrVar == null) {
            aryrVar = aryr.a;
        }
        PlayerResponseModel playerResponseModel = new PlayerResponseModel(aryrVar, this.n, videoStreamingData);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((afwx) it2.next()).kZ(playerResponseModel);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (j()) {
            return;
        }
        i();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afwx) arrayList.get(i)).kY(cnqVar);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((afwx) it.next()).kY(cnqVar);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
