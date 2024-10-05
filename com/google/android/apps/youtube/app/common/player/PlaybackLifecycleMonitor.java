package com.google.android.apps.youtube.app.common.player;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.ahef;
import defpackage.aign;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.eoo;
import defpackage.fgk;
import defpackage.fhf;
import defpackage.fle;
import defpackage.flm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaybackLifecycleMonitor implements fgk, any, flm, aioa {
    public int b;
    private final ainy c;
    private final aioc d;
    private String f;
    private String g;
    private final ayqw e = new ayqw();
    public final Set a = new HashSet();

    public PlaybackLifecycleMonitor(ainy ainyVar, aioc aiocVar) {
        this.c = ainyVar;
        this.d = aiocVar;
        this.b = 0;
        String q = ainyVar.q();
        this.f = q;
        if (TextUtils.isEmpty(q)) {
            return;
        }
        this.b = true == ainyVar.d() ? 2 : 1;
    }

    @Override // defpackage.fgk
    public final synchronized void g(fhf fhfVar) {
        boolean z = false;
        if (fhfVar == null) {
            this.f = null;
            this.g = null;
            j(0);
            return;
        }
        String c = fhfVar.c();
        String b = fhfVar.b();
        if (TextUtils.equals(c, this.f)) {
            return;
        }
        boolean z2 = !TextUtils.isEmpty(b) && TextUtils.equals(b, this.g);
        if (!TextUtils.isEmpty(this.f) && TextUtils.isEmpty(c)) {
            z = true;
        }
        if (z2 && z) {
            return;
        }
        j(1);
        this.g = fhfVar.b();
    }

    public final void h(fle fleVar) {
        this.a.add(fleVar);
    }

    public final synchronized void i(ahef ahefVar) {
        PlayerResponseModel b;
        if (ahefVar.c().a(aign.NEW)) {
            this.f = null;
        } else {
            if (!ahefVar.c().a(aign.PLAYBACK_LOADED) || (b = ahefVar.b()) == null) {
                return;
            }
            this.f = b.y();
        }
    }

    public final void j(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fle) it.next()).d(i);
        }
    }

    @Override // defpackage.flm
    public final void kG() {
    }

    @Override // defpackage.flm
    public final synchronized void kH() {
        if (this.c.d()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f)) {
            j(5);
        } else {
            j(0);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        return new ayqx[]{aiocVar.G().j.Y(new ayrs(this) { // from class: fld
            public final /* synthetic */ PlaybackLifecycleMonitor a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    PlaybackLifecycleMonitor playbackLifecycleMonitor = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (ahejVar.a() == 2) {
                        playbackLifecycleMonitor.j(2);
                        return;
                    }
                    if (ahejVar.a() == 8) {
                        playbackLifecycleMonitor.j(4);
                        return;
                    }
                    if (ahejVar.a() == 4) {
                        playbackLifecycleMonitor.j(5);
                        return;
                    } else {
                        if (ahejVar.f() || playbackLifecycleMonitor.b == 1) {
                            return;
                        }
                        playbackLifecycleMonitor.j(3);
                        return;
                    }
                }
                this.a.i((ahef) obj);
            }
        }, eoo.j), aiocVar.G().b.Y(new ayrs(this) { // from class: fld
            public final /* synthetic */ PlaybackLifecycleMonitor a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    PlaybackLifecycleMonitor playbackLifecycleMonitor = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (ahejVar.a() == 2) {
                        playbackLifecycleMonitor.j(2);
                        return;
                    }
                    if (ahejVar.a() == 8) {
                        playbackLifecycleMonitor.j(4);
                        return;
                    }
                    if (ahejVar.a() == 4) {
                        playbackLifecycleMonitor.j(5);
                        return;
                    } else {
                        if (ahejVar.f() || playbackLifecycleMonitor.b == 1) {
                            return;
                        }
                        playbackLifecycleMonitor.j(3);
                        return;
                    }
                }
                this.a.i((ahef) obj);
            }
        }, eoo.j)};
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.e.g(kI(this.d));
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.e.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
