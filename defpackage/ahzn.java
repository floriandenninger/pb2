package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzn extends yns implements aioa {
    public final aioc d;
    public final ayqw e = new ayqw();
    public aama f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final apxf j;
    private final WillAutonavInformer k;

    public ahzn(apxf apxfVar, WillAutonavInformer willAutonavInformer, aioc aiocVar) {
        apxfVar.getClass();
        this.j = apxfVar;
        this.k = willAutonavInformer;
        this.d = aiocVar;
    }

    private static final boolean f(apxf apxfVar, apxf apxfVar2) {
        if (apxfVar != null) {
            String str = ((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).d;
            String str2 = ((awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint)).d;
            if (apxfVar.c.equals(apxfVar2.c) && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yns
    public final void b() {
        this.e.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r0.g((defpackage.awwk) r0.a.c()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            aama r0 = r5.f
            r1 = 0
            if (r0 != 0) goto L8
            r5.c = r1
            return
        L8:
            boolean r2 = r5.g
            boolean r3 = r5.h
            boolean r4 = r5.i
            aalx r0 = r0.a(r2, r3, r4, r1)
            if (r0 != 0) goto L17
            r5.c = r1
            return
        L17:
            apxf r2 = r0.b()
            apxf r3 = r5.j
            boolean r2 = f(r2, r3)
            if (r2 != 0) goto L43
            apxf r0 = r0.a()
            apxf r2 = r5.j
            boolean r0 = f(r0, r2)
            if (r0 == 0) goto L40
            com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r5.k
            ywr r2 = r0.a
            aooy r2 = r2.c()
            awwk r2 = (defpackage.awwk) r2
            boolean r0 = r0.g(r2)
            if (r0 == 0) goto L40
            goto L43
        L40:
            r5.c = r1
            return
        L43:
            r0 = 1
            r5.c = r0
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzn.d():void");
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.am().h(ahbw.g(aiocVar.aC(), 16777216L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahzm
            public final /* synthetic */ ahzn a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    ahzn ahznVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED)) {
                        ahznVar.f = ahdvVar.a() != null ? ahdvVar.a().h : null;
                        ahznVar.d();
                        return;
                    }
                    return;
                }
                ahzn ahznVar2 = this.a;
                ahdu ahduVar = (ahdu) obj;
                ahznVar2.g = ahduVar.a() == 1;
                ahznVar2.i = ahduVar.d();
                ahznVar2.h = ahduVar.a() == 2;
                ahznVar2.d();
            }
        }, ahwx.k), aiocVar.ao().h(ahbw.g(aiocVar.aC(), 16777216L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahzm
            public final /* synthetic */ ahzn a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    ahzn ahznVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED)) {
                        ahznVar.f = ahdvVar.a() != null ? ahdvVar.a().h : null;
                        ahznVar.d();
                        return;
                    }
                    return;
                }
                ahzn ahznVar2 = this.a;
                ahdu ahduVar = (ahdu) obj;
                ahznVar2.g = ahduVar.a() == 1;
                ahznVar2.i = ahduVar.d();
                ahznVar2.h = ahduVar.a() == 2;
                ahznVar2.d();
            }
        }, ahwx.k)};
    }
}
