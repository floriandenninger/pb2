package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqn implements swv {
    private final mhq a;
    private final InlinePlaybackLifecycleController b;
    private final gfy c;

    public fqn(mhq mhqVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, gfy gfyVar) {
        this.a = mhqVar;
        this.b = inlinePlaybackLifecycleController;
        this.c = gfyVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awtt.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        awtt awttVar = (awtt) obj;
        if (this.c.f()) {
            String str = swuVar.g;
            if (str == null || !"InlinePlaybackCommandEventData".equals(str)) {
                return ayph.f();
            }
            Object obj2 = swuVar.d;
            if (obj2 != null) {
                Pair pair = (Pair) obj2;
                boolean booleanValue = ((Boolean) pair.first).booleanValue();
                fpx fpxVar = (fpx) pair.second;
                int q = awxr.q(awttVar.d);
                if (q == 0 || q != 2) {
                    gof a = this.a.a(fpxVar);
                    if (a != null) {
                        return this.b.i(a).E(ayqr.a());
                    }
                    return ayph.f();
                }
                awnw awnwVar = awttVar.e;
                if (awnwVar == null) {
                    awnwVar = awnw.a;
                }
                apxf apxfVar = (apxf) awnwVar.pX(arli.a);
                awnw awnwVar2 = awttVar.j;
                if (awnwVar2 == null) {
                    awnwVar2 = awnw.a;
                }
                apxf apxfVar2 = (apxf) awnwVar2.pX(arli.a);
                if (apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
                    boolean z = awttVar.g;
                    boolean z2 = awttVar.h;
                    aone createBuilder = avfv.a.createBuilder();
                    aqyg aqygVar = null;
                    if ((awttVar.c & 4096) != 0) {
                        avfx avfxVar = awttVar.p;
                        if (avfxVar == null) {
                            avfxVar = avfx.a;
                        }
                        createBuilder.copyOnWrite();
                        avfv avfvVar = (avfv) createBuilder.instance;
                        avfxVar.getClass();
                        avfvVar.k = avfxVar;
                        avfvVar.b |= 16384;
                    } else {
                        if (z2) {
                            apkb apkbVar = apkb.a;
                            createBuilder.copyOnWrite();
                            avfv avfvVar2 = (avfv) createBuilder.instance;
                            apkbVar.getClass();
                            avfvVar2.j = apkbVar;
                            avfvVar2.b |= 4096;
                        } else if (z) {
                            apjw apjwVar = apjw.a;
                            createBuilder.copyOnWrite();
                            avfv avfvVar3 = (avfv) createBuilder.instance;
                            apjwVar.getClass();
                            avfvVar3.i = apjwVar;
                            avfvVar3.b |= 2048;
                        }
                        if (!z && !z2) {
                            aong aongVar = (aong) aqyg.a.createBuilder();
                            awnd awndVar = awttVar.i;
                            if (awndVar == null) {
                                awndVar = awnd.a;
                            }
                            String str2 = awndVar.c;
                            aongVar.copyOnWrite();
                            aqyg aqygVar2 = (aqyg) aongVar.instance;
                            str2.getClass();
                            aqygVar2.b |= 1;
                            aqygVar2.d = str2;
                            aqygVar = (aqyg) aongVar.build();
                        }
                    }
                    gof a2 = this.a.a(fpxVar);
                    if (a2 == null) {
                        mhq mhqVar = this.a;
                        awpf awpfVar = awttVar.f;
                        if (awpfVar == null) {
                            awpfVar = awpf.a;
                        }
                        int y = awxr.y(awttVar.o);
                        if (y == 0) {
                            y = 1;
                        }
                        boolean z3 = y == 4;
                        avfv avfvVar4 = (avfv) createBuilder.build();
                        goj a3 = gok.a();
                        arhn b = arhn.b(awttVar.l);
                        if (b == null) {
                            b = arhn.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
                        }
                        a3.b(b);
                        aric b2 = aric.b(awttVar.k);
                        if (b2 == null) {
                            b2 = aric.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
                        }
                        a3.e(b2);
                        arhr b3 = arhr.b(awttVar.m);
                        if (b3 == null) {
                            b3 = arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
                        }
                        a3.c(b3);
                        arib b4 = arib.b(awttVar.n);
                        if (b4 == null) {
                            b4 = arib.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
                        }
                        a3.d(b4);
                        gok a4 = a3.a();
                        apxfVar.getClass();
                        amkq.N(apxfVar.pY(WatchEndpointOuterClass.watchEndpoint));
                        awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
                        gow n = gox.n();
                        n.i = 4;
                        n.d = apxfVar2;
                        n.c = apxfVar;
                        n.b = awdpVar.d;
                        n.e = aqygVar;
                        n.f = new avfv[]{avfvVar4};
                        n.a = ahbn.n(awpfVar);
                        n.g = z3;
                        n.h = a4;
                        gox a5 = n.a();
                        mhqVar.a.put(fpxVar, a5);
                        a2 = a5;
                    }
                    String f = a2.f();
                    ggr ggrVar = (ggr) this.a.b.get(fpxVar);
                    if (ggrVar == null) {
                        mhq mhqVar2 = this.a;
                        awpf awpfVar2 = awttVar.f;
                        if (awpfVar2 == null) {
                            awpfVar2 = awpf.a;
                        }
                        awpf awpfVar3 = awpfVar2;
                        c cVar = mhqVar2.c;
                        WeakReference weakReference = new WeakReference(fpxVar);
                        mgu mguVar = (mgu) cVar.b.get();
                        mguVar.getClass();
                        ajjz ajjzVar = (ajjz) cVar.a.get();
                        ajjzVar.getClass();
                        f.getClass();
                        awpfVar3.getClass();
                        mhp mhpVar = new mhp(mguVar, ajjzVar, f, awpfVar3, weakReference);
                        mhqVar2.b.put(fpxVar, mhpVar);
                        ggrVar = mhpVar;
                    }
                    return this.b.j(a2, ggrVar, true != booleanValue ? 0 : 2).E(ayqr.a());
                }
                return ayph.s(new NullPointerException());
            }
            return ayph.s(new Throwable("InlineMutedCommand dispatched without eventData."));
        }
        return ayph.f();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
