package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigv implements ypd {
    public FormatStreamModel a;
    private final ypa b;
    private Throwable c;
    private aigu d;

    public aigv(ypa ypaVar) {
        this.b = ypaVar;
    }

    public final synchronized int a() {
        return b().b.get();
    }

    public final synchronized aigu b() {
        aigu aiguVar;
        aiguVar = this.d;
        if (aiguVar == null) {
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence", this.c);
        }
        return aiguVar;
    }

    public final String c() {
        return b().a;
    }

    public final synchronized void d() {
        aigu aiguVar = this.d;
        if (aiguVar != null) {
            this.b.m(aiguVar);
            this.d = null;
            this.c = new Throwable("currentPlaybackSequenceMonitor became null here");
        }
    }

    public final void e(boolean z) {
        b().g = z;
    }

    public final synchronized void g() {
        d();
        this.c = null;
        aigu aiguVar = new aigu();
        this.d = aiguVar;
        this.b.g(aiguVar);
    }

    public final boolean h() {
        aigu aiguVar = this.d;
        return aiguVar != null && aiguVar.g;
    }

    public final synchronized boolean i() {
        boolean z;
        aigu b = b();
        if (!b.e) {
            z = b.a();
        }
        return z;
    }

    public final synchronized boolean j() {
        return this.d != null;
    }

    public final synchronized boolean k() {
        return b().a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class};
        }
        if (i == 0) {
            this.a = ((aeqq) obj).f();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
