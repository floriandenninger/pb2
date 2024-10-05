package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addn extends Observable implements ypd {
    public static final String a = zga.a("MDX.MediaRouteButtonController");
    public final ypa b;
    public final azrw c;
    public final azrw d;
    public final addm e;
    public acqz f;
    public List g;
    public boolean h;
    public ayqx i;
    public final Map j;
    private final adfa k;
    private final Set l;
    private final adlt m;
    private final azrw n;
    private final acwr o;
    private final acwv p;
    private final boolean q;
    private final acue r;
    private boolean s;
    private final adfc t;
    private final addk u = new addk(this);
    private final c v;

    public addn(ypa ypaVar, azrw azrwVar, azrw azrwVar2, adfa adfaVar, adfc adfcVar, adlt adltVar, azrw azrwVar3, acwr acwrVar, acwv acwvVar, acun acunVar, acue acueVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ypaVar.getClass();
        this.b = ypaVar;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.k = adfaVar;
        this.t = adfcVar;
        this.m = adltVar;
        this.n = azrwVar3;
        this.e = new addm(this);
        this.l = Collections.newSetFromMap(new WeakHashMap());
        this.o = acwrVar;
        this.q = acunVar.q;
        HashMap hashMap = new HashMap();
        this.j = hashMap;
        hashMap.put(acsb.c(11208), false);
        this.p = acwvVar;
        this.r = acueVar;
        this.v = cVar;
        e();
    }

    public static final void i(acra acraVar, acsc acscVar) {
        if (acscVar == null) {
            return;
        }
        acraVar.D(new acqx(acscVar));
    }

    private final void j(boolean z) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((MediaRouteButton) it.next()).c(z);
        }
    }

    private final void k() {
        for (MediaRouteButton mediaRouteButton : this.l) {
            mediaRouteButton.setVisibility(true != this.s ? 8 : 0);
            mediaRouteButton.setEnabled(this.s);
        }
        d(a(), acsb.c(11208));
    }

    public final acra a() {
        acqz acqzVar = this.f;
        if (acqzVar == null || acqzVar.mM() == null) {
            return acra.l;
        }
        return this.f.mM();
    }

    public final void b(MediaRouteButton mediaRouteButton) {
        if (!this.h) {
            this.s = false;
            mediaRouteButton.c(false);
        } else if (this.q) {
            mediaRouteButton.c(true);
            this.s = true;
        }
        mediaRouteButton.g((bph) this.c.get());
        mediaRouteButton.d(this.k);
        this.l.add(mediaRouteButton);
        if (mediaRouteButton instanceof MdxMediaRouteButton) {
            MdxMediaRouteButton mdxMediaRouteButton = (MdxMediaRouteButton) mediaRouteButton;
            addk addkVar = this.u;
            adfc adfcVar = this.t;
            adlt adltVar = this.m;
            azrw azrwVar = this.d;
            azrw azrwVar2 = this.n;
            acwr acwrVar = this.o;
            acwv acwvVar = this.p;
            mdxMediaRouteButton.m = this.v;
            mdxMediaRouteButton.l = addkVar;
            mdxMediaRouteButton.k = adfcVar;
            mdxMediaRouteButton.f = adltVar;
            mdxMediaRouteButton.e = azrwVar;
            mdxMediaRouteButton.g = azrwVar2;
            mdxMediaRouteButton.h = acwrVar;
            mdxMediaRouteButton.i = acwvVar;
            mdxMediaRouteButton.j = true;
            mdxMediaRouteButton.d.sh();
        }
        i(a(), acsb.c(11208));
        k();
    }

    public final void c() {
        boolean z = false;
        if (!this.h) {
            j(false);
        } else if (this.q) {
            j(true);
            z = true;
        } else {
            z = bpw.k((bph) this.c.get(), 1);
        }
        if (this.s == z) {
            return;
        }
        this.s = z;
        String str = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Media route button available: ");
        sb.append(z);
        zga.h(str, sb.toString());
        if (this.s) {
            this.b.g(this);
        } else {
            this.b.m(this);
        }
        k();
        setChanged();
        notifyObservers();
    }

    public final void d(acra acraVar, acsc acscVar) {
        List list;
        if (acscVar == null) {
            return;
        }
        acsc b = (acraVar.c() == null || acraVar.c().f == 0) ? null : acsb.b(acraVar.c().f);
        if (h() && this.j.containsKey(acscVar) && !((Boolean) this.j.get(acscVar)).booleanValue() && (list = this.g) != null && list.contains(b)) {
            acraVar.u(new acqx(acscVar), null);
            this.j.put(acscVar, true);
        }
    }

    public final void e() {
        this.r.i().ab(ayqr.a()).aE(new addl(this));
    }

    public final void g(MediaRouteButton mediaRouteButton) {
        this.l.remove(mediaRouteButton);
    }

    public final boolean h() {
        return this.s && this.l.size() > 0;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{acrn.class};
        }
        if (i == 0) {
            acrn acrnVar = (acrn) obj;
            for (Map.Entry entry : this.j.entrySet()) {
                entry.setValue(false);
                i(acrnVar.a(), (acsc) entry.getKey());
                d(acrnVar.a(), (acsc) entry.getKey());
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
