package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiaf {
    public static final aiad a = new aiac();
    public final aihs b;
    private final aifk c;
    private final Executor d;
    private final ayqi e;
    private final aaea f;

    public aiaf(aihs aihsVar, Executor executor, ayqi ayqiVar, aifk aifkVar, aaea aaeaVar) {
        aihsVar.getClass();
        this.b = aihsVar;
        executor.getClass();
        this.d = executor;
        ayqiVar.getClass();
        this.e = ayqiVar;
        aifkVar.getClass();
        this.c = aifkVar;
        aaeaVar.getClass();
        this.f = aaeaVar;
    }

    private final boolean c() {
        atys atysVar = this.f.a().j;
        if (atysVar == null) {
            atysVar = atys.a;
        }
        return atysVar.k;
    }

    private static final boolean d(aigh aighVar) {
        if (aighVar != null) {
            return aighVar.b != 1 || aighVar.a > 0;
        }
        return false;
    }

    public final void a(PlaybackStartDescriptor playbackStartDescriptor, aigh aighVar, aiad aiadVar) {
        b(playbackStartDescriptor, aighVar, aiadVar, -1L, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(PlaybackStartDescriptor playbackStartDescriptor, aigh aighVar, final aiad aiadVar, long j, afkm afkmVar) {
        Boolean bool;
        aypy Y;
        aqvj aqvjVar = this.c.e.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45359511L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359511L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359511L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
                aiadVar.a(new IllegalArgumentException("Unexpected empty videoId."));
                aiadVar.c(4);
                return;
            }
            if (!d(aighVar)) {
                aiadVar.a(new IllegalArgumentException("Invalid prefetchPlaybackContextWrapper."));
                aiadVar.c(4);
                return;
            }
            if (c()) {
                aiadVar.a(new IllegalStateException("Prefetch request are disabled."));
                aiadVar.c(5);
                return;
            }
            aihs aihsVar = this.b;
            atww b = aighVar.b();
            if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
                Y = aypy.J(new IllegalArgumentException("Unexpected empty videoId."));
            } else {
                aijr b2 = aihsVar.e.b(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), -1, aihsVar.g, playbackStartDescriptor.h(aihsVar.l), null, true);
                b2.Q = b;
                b2.G = playbackStartDescriptor.s();
                b2.H = playbackStartDescriptor.r();
                b2.f55J = playbackStartDescriptor.u();
                String h = playbackStartDescriptor.h(aihsVar.l);
                aaox h2 = aaox.h(aihsVar.i, playbackStartDescriptor.f(), h, playbackStartDescriptor.c(), afkmVar, playbackStartDescriptor.z());
                if (h2 == null) {
                    Y = aypy.J(new IllegalArgumentException("Unexpected null onesieRequest."));
                } else {
                    h2.i();
                    h2.f(playbackStartDescriptor.l());
                    if (j >= 0) {
                        int i = (int) j;
                        h2.l = i;
                        h2.k = i;
                    }
                    String l = playbackStartDescriptor.l();
                    zhq.m(l);
                    final aihr aihrVar = new aihr(aihsVar, b2, l, null);
                    aiij aiijVar = aihsVar.d;
                    if (aiijVar.c == null) {
                        Y = aypy.J(new IllegalArgumentException("Unexpected null OnesieLoader."));
                    } else {
                        Y = aiijVar.c.b(aiijVar.a.a(b2, aiijVar.g.d(aihrVar, h, aiijVar.b.d())), h2, aiijVar.e, null, false).a().Y(new ayrv() { // from class: aiii
                            @Override // defpackage.ayrv
                            public final Object a(Object obj) {
                                return (PlayerResponseModel) afww.this.get();
                            }
                        });
                    }
                }
            }
            final int i2 = 2;
            aypy H = Y.ai(this.e).H(new ayrs() { // from class: aiab
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i3 = i2;
                    if (i3 == 0) {
                        aiadVar.b((PlayerResponseModel) obj);
                        return;
                    }
                    if (i3 == 1) {
                        aiad aiadVar2 = aiadVar;
                        aiadVar2.a((Throwable) obj);
                        aiadVar2.c(4);
                    } else {
                        aiadVar.c(2);
                    }
                }
            });
            aiadVar.getClass();
            final int i3 = 0;
            aypy D = H.G(new ayrs() { // from class: aiab
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i32 = i3;
                    if (i32 == 0) {
                        aiadVar.b((PlayerResponseModel) obj);
                        return;
                    }
                    if (i32 == 1) {
                        aiad aiadVar2 = aiadVar;
                        aiadVar2.a((Throwable) obj);
                        aiadVar2.c(4);
                    } else {
                        aiadVar.c(2);
                    }
                }
            }).D(new ayrm() { // from class: ahzz
                @Override // defpackage.ayrm
                public final void a() {
                    aiad.this.c(3);
                }
            });
            aiadVar.getClass();
            final int i4 = 1;
            final ayqx ay = D.ay(new ayrs() { // from class: aiab
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i32 = i3;
                    if (i32 == 0) {
                        aiadVar.b((PlayerResponseModel) obj);
                        return;
                    }
                    if (i32 == 1) {
                        aiad aiadVar2 = aiadVar;
                        aiadVar2.a((Throwable) obj);
                        aiadVar2.c(4);
                    } else {
                        aiadVar.c(2);
                    }
                }
            }, new ayrs() { // from class: aiab
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i32 = i4;
                    if (i32 == 0) {
                        aiadVar.b((PlayerResponseModel) obj);
                        return;
                    }
                    if (i32 == 1) {
                        aiad aiadVar2 = aiadVar;
                        aiadVar2.a((Throwable) obj);
                        aiadVar2.c(4);
                    } else {
                        aiadVar.c(2);
                    }
                }
            });
            new ayrr() { // from class: aiaa
                @Override // defpackage.ayrr
                public final void a() {
                    ayrz.c((AtomicReference) ayqx.this);
                }
            };
            return;
        }
        if (TextUtils.isEmpty(playbackStartDescriptor.l()) || !d(aighVar)) {
            aiadVar.c(4);
        } else if (c()) {
            aiadVar.c(5);
        } else {
            this.d.execute(new aiae(this, playbackStartDescriptor, aighVar, aiadVar, j, afkmVar));
        }
    }
}
