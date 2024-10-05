package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrc implements agrd {
    public final anic a;
    public final aijg b;
    public final ysy c;
    public final jqu d;
    public final fif e;
    private final agqz f;

    public jrc(anic anicVar, agqz agqzVar, aijg aijgVar, ysy ysyVar, jqu jquVar, fif fifVar) {
        this.a = anicVar;
        this.f = agqzVar;
        this.b = aijgVar;
        this.c = ysyVar;
        this.d = jquVar;
        this.e = fifVar;
    }

    public final WatchNextResponseModel a(PlaybackStartDescriptor playbackStartDescriptor, amru amruVar) {
        yjk.e();
        return this.d.a(playbackStartDescriptor, amruVar);
    }

    @Override // defpackage.agrd
    public final anhy b(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z) {
        if (!TextUtils.equals("PPSV", playbackStartDescriptor.k())) {
            return this.f.b(playbackStartDescriptor, z);
        }
        return anaf.T(new anfy() { // from class: jqz
            @Override // defpackage.anfy
            public final anhy a() {
                final jrc jrcVar = jrc.this;
                final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                final boolean z2 = z;
                yjk.e();
                fif fifVar = jrcVar.e;
                fib a = fid.a();
                a.b(aqnf.FILTER_TYPE_VIDEOS_ONLY);
                fid a2 = a.a();
                final aqnf aqnfVar = (aqnf) a2.a.e(aqnf.FILTER_TYPE_NONE);
                final int intValue = ((Integer) a2.b.e(-1)).intValue();
                final fjd fjdVar = (fjd) fifVar;
                fif fifVar2 = fjdVar.a;
                fib a3 = fid.a();
                a3.b(aqnfVar);
                a3.c(intValue);
                a3.d(fic.TIME_DESCENDING);
                return anfq.i(anht.q(wbs.I(fifVar2.b(a3.a()).B(new ayrv() { // from class: fjb
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        fjd fjdVar2 = fjd.this;
                        int i = intValue;
                        aqnf aqnfVar2 = aqnfVar;
                        final fie fieVar = (fie) obj;
                        int size = i != -1 ? i - fieVar.b.size() : -1;
                        fif fifVar3 = fjdVar2.b;
                        fib a4 = fid.a();
                        a4.b(aqnfVar2);
                        a4.c(size);
                        a4.d(fic.NONE);
                        return fifVar3.b(a4.a()).B(new ayrv() { // from class: fjc
                            @Override // defpackage.ayrv
                            public final Object a(Object obj2) {
                                fie fieVar2 = fie.this;
                                fie fieVar3 = (fie) obj2;
                                amrp amrpVar = new amrp();
                                amrpVar.j(fieVar2.b);
                                amrpVar.j(fieVar3.b);
                                return ayqj.F(fie.a(fieVar2.a + fieVar3.a, amrpVar.g()));
                            }
                        });
                    }
                }))), new anfz() { // from class: jra
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final jrc jrcVar2 = jrc.this;
                        final PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                        boolean z3 = z2;
                        final amru amruVar = ((fie) obj).b;
                        try {
                            String l = playbackStartDescriptor3.l();
                            if (amruVar.isEmpty()) {
                                throw null;
                            }
                            if (TextUtils.isEmpty(l)) {
                                throw new IllegalArgumentException();
                            }
                            if (!TextUtils.equals(l, aalt.g(((aakt) amruVar.get(playbackStartDescriptor3.a())).d()))) {
                                for (int i = 0; i < amruVar.size(); i++) {
                                    if (l.equals(aalt.g(((aakt) amruVar.get(i)).d()))) {
                                        apxf A = aedn.A(!TextUtils.isEmpty(playbackStartDescriptor3.k()) ? playbackStartDescriptor3.k() : "PPSV", l, i, playbackStartDescriptor3.i(), aomf.x(playbackStartDescriptor3.y()));
                                        aifz d = PlaybackStartDescriptor.d();
                                        d.a = A;
                                        playbackStartDescriptor3 = d.a();
                                    }
                                }
                                throw new IllegalArgumentException();
                            }
                            if (!z3 || !jrcVar2.c.p()) {
                                return anaf.O(jrcVar2.a(playbackStartDescriptor3, amruVar));
                            }
                            return anfq.h(aney.h(anfq.h(anht.q(jrcVar2.b.a(playbackStartDescriptor3)).r(3L, TimeUnit.SECONDS, jrcVar2.a), jpt.g, jrcVar2.a), TimeoutException.class, jpt.h, jrcVar2.a), new amml() { // from class: jqy
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    jrc jrcVar3 = jrc.this;
                                    PlaybackStartDescriptor playbackStartDescriptor4 = playbackStartDescriptor3;
                                    amru amruVar2 = amruVar;
                                    Optional optional = (Optional) obj2;
                                    yjk.e();
                                    if (optional.isPresent()) {
                                        return jrcVar3.d.b((WatchNextResponseModel) optional.get(), playbackStartDescriptor4, amruVar2);
                                    }
                                    return jrcVar3.a(playbackStartDescriptor4, amruVar2);
                                }
                            }, jrcVar2.a);
                        } catch (IllegalArgumentException | NullPointerException unused) {
                            if (playbackStartDescriptor3.l().isEmpty()) {
                                return anaf.S(new Callable() { // from class: jrb
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return jrc.this.d.e();
                                    }
                                }, jrcVar2.a);
                            }
                            return anfq.h(anht.q(wbs.I(jrcVar2.e.a(playbackStartDescriptor3.l()).x(jif.u).S(Optional.empty()))), new amml() { // from class: jqx
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    jrc jrcVar3 = jrc.this;
                                    PlaybackStartDescriptor playbackStartDescriptor4 = playbackStartDescriptor3;
                                    Optional optional = (Optional) obj2;
                                    yjk.e();
                                    if (optional.isPresent()) {
                                        return jrcVar3.d.c(playbackStartDescriptor4, (aakt) optional.get());
                                    }
                                    return jrcVar3.d.e();
                                }
                            }, jrcVar2.a);
                        }
                    }
                }, jrcVar.a);
            }
        }, this.a);
    }
}
