package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adun implements adui, aioa {
    public final ayqw a = new ayqw();
    public final Set b = new CopyOnWriteArraySet();

    static {
        zga.a("MDX.SequencerStageQueueStatusMonitor");
    }

    @Override // defpackage.adui
    public final void a(aduh aduhVar) {
        this.b.add(aduhVar);
    }

    @Override // defpackage.adui
    public final void b(aduh aduhVar) {
        this.b.remove(aduhVar);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ao().X(new ayrs() { // from class: adum
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aubs aubsVar;
                adun adunVar = adun.this;
                ahdv ahdvVar = (ahdv) obj;
                if (!ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED) || ahdvVar.a() == null || (aubsVar = ahdvVar.a().g) == null) {
                    return;
                }
                int i = aubsVar.j;
                int i2 = aubsVar.m;
                Iterator it = adunVar.b.iterator();
                while (it.hasNext()) {
                    adul adulVar = ((aduh) it.next()).a;
                    String.format(Locale.getDefault(), "currentIndex:%d totalVideos:%d", Integer.valueOf(i), Integer.valueOf(i2));
                    adulVar.h(i, i2);
                }
            }
        })};
    }
}
