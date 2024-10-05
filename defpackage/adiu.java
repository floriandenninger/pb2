package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adiu implements aiwj {
    private final Context a;
    private final shf b;
    private final Executor c;
    private final ypa d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final aypn h;
    private final azrw i;
    private final azrw j;
    private final aivu k;
    private final aiwl l;
    private final zgj m;
    private final ajbk n;
    private final aioc o;
    private final aigv p;
    private final aadw q;
    private final wpl r;
    private final ajoy s;

    public adiu(Context context, shf shfVar, Executor executor, ypa ypaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, aypn aypnVar, azrw azrwVar4, aigv aigvVar, azrw azrwVar5, banw banwVar, banw banwVar2, banw banwVar3, banw banwVar4, aivu aivuVar, ajoy ajoyVar, zgj zgjVar, ajbk ajbkVar, aadw aadwVar, wpl wplVar, aioc aiocVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = shfVar;
        this.c = executor;
        this.d = ypaVar;
        this.e = azrwVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.h = aypnVar;
        this.i = azrwVar4;
        this.p = aigvVar;
        this.j = azrwVar5;
        this.q = aadwVar;
        this.r = wplVar;
        this.o = aiocVar;
        this.l = new aiwl(ypaVar, new HashSet(), banwVar, banwVar2, banwVar3, banwVar4);
        this.k = aivuVar;
        this.s = ajoyVar;
        this.m = zgjVar;
        this.n = ajbkVar;
    }

    @Override // defpackage.aiwj
    public final aiwk a(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        Context context = this.a;
        shf shfVar = this.b;
        Executor executor = this.c;
        ypa ypaVar = this.d;
        wno wnoVar = (wno) this.e.get();
        adit aditVar = new adit(context, shfVar, executor, ypaVar, wnoVar, (wyn) this.g.get(), this.h, ((adlt) this.i.get()).g(), this.p, (aapf) this.j.get(), this.l, this.k, this.s, this.m, this.n, this.q, this.r, this.o, null, null, null, null);
        ayqw ayqwVar = aditVar.d;
        final adis adisVar = aditVar.c;
        aypn c = ahbw.c(aditVar.b, aczu.n);
        final adis adisVar2 = adisVar.a.c;
        adisVar2.getClass();
        final int i = 1;
        ayqx X = c.X(new ayrs() { // from class: adip
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    adisVar2.a.s = (aheg) obj;
                    return;
                }
                if (i2 == 1) {
                    adis adisVar3 = adisVar2;
                    ahdy ahdyVar = (ahdy) obj;
                    if (adisVar3.a.aa()) {
                        adisVar3.a.g.V(ahdyVar.a());
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    adis adisVar4 = adisVar2;
                    adisVar4.a.h.b(new adir(adisVar4, ((Boolean) obj).booleanValue()));
                } else {
                    adis adisVar5 = adisVar2;
                    adisVar5.a.h.c(new adiq(adisVar5, ((Boolean) obj).booleanValue()));
                }
            }
        });
        final int i2 = 0;
        aypy ab = adisVar.a.g.n().b().ab(ayqr.a());
        final adis adisVar3 = adisVar.a.c;
        adisVar3.getClass();
        final int i3 = 3;
        aypy ab2 = adisVar.a.g.n().a().ab(ayqr.a());
        final adis adisVar4 = adisVar.a.c;
        adisVar4.getClass();
        final int i4 = 2;
        ayqwVar.g(X, ab.ax(new ayrs() { // from class: adip
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    adisVar3.a.s = (aheg) obj;
                    return;
                }
                if (i22 == 1) {
                    adis adisVar32 = adisVar3;
                    ahdy ahdyVar = (ahdy) obj;
                    if (adisVar32.a.aa()) {
                        adisVar32.a.g.V(ahdyVar.a());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    adis adisVar42 = adisVar3;
                    adisVar42.a.h.b(new adir(adisVar42, ((Boolean) obj).booleanValue()));
                } else {
                    adis adisVar5 = adisVar3;
                    adisVar5.a.h.c(new adiq(adisVar5, ((Boolean) obj).booleanValue()));
                }
            }
        }), ab2.ax(new ayrs() { // from class: adip
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i4;
                if (i22 == 0) {
                    adisVar4.a.s = (aheg) obj;
                    return;
                }
                if (i22 == 1) {
                    adis adisVar32 = adisVar4;
                    ahdy ahdyVar = (ahdy) obj;
                    if (adisVar32.a.aa()) {
                        adisVar32.a.g.V(ahdyVar.a());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    adis adisVar42 = adisVar4;
                    adisVar42.a.h.b(new adir(adisVar42, ((Boolean) obj).booleanValue()));
                } else {
                    adis adisVar5 = adisVar4;
                    adisVar5.a.h.c(new adiq(adisVar5, ((Boolean) obj).booleanValue()));
                }
            }
        }), adisVar.a.q.G().d.Y(new ayrs() { // from class: adip
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    adisVar.a.s = (aheg) obj;
                    return;
                }
                if (i22 == 1) {
                    adis adisVar32 = adisVar;
                    ahdy ahdyVar = (ahdy) obj;
                    if (adisVar32.a.aa()) {
                        adisVar32.a.g.V(ahdyVar.a());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    adis adisVar42 = adisVar;
                    adisVar42.a.h.b(new adir(adisVar42, ((Boolean) obj).booleanValue()));
                } else {
                    adis adisVar5 = adisVar;
                    adisVar5.a.h.c(new adiq(adisVar5, ((Boolean) obj).booleanValue()));
                }
            }
        }, zxi.g));
        aditVar.a.g(aditVar);
        return aditVar;
    }

    @Override // defpackage.aiwj
    public final aiwk b(DirectorSavedState directorSavedState, aigd aigdVar) {
        return a(null, null);
    }
}
