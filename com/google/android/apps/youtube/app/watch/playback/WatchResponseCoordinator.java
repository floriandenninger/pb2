package com.google.android.apps.youtube.app.watch.playback;

import com.google.android.apps.youtube.app.watch.playback.WatchResponseCoordinator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import defpackage.ahpe;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.aoot;
import defpackage.aqvj;
import defpackage.aqvk;
import defpackage.axzf;
import defpackage.axzg;
import defpackage.aypr;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.ojg;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WatchResponseCoordinator implements any {
    public final ahpe a;
    public final ojg b;
    public final ayqi c;
    public final Set d;
    public final boolean e;
    private final ayqi f;
    private final aioc g;
    private final ayqw h = new ayqw();
    private final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchResponseCoordinator(axzg axzgVar, axzf axzfVar, ahpe ahpeVar, ojg ojgVar, ayqi ayqiVar, ayqi ayqiVar2, aioc aiocVar, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Boolean bool;
        this.a = ahpeVar;
        this.b = ojgVar;
        this.f = ayqiVar;
        this.c = ayqiVar2;
        this.g = aiocVar;
        this.d = set;
        this.i = axzgVar.t().booleanValue();
        aqvj aqvjVar = axzfVar.a.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45359310L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359310L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359310L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.e = bool.booleanValue();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.i) {
            this.h.g(this.g.ao().E(this.f).A(new ayrv() { // from class: ojn
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    ahdv ahdvVar = (ahdv) obj;
                    return ammw.a(ahdvVar, WatchResponseCoordinator.this.a.f(ahdvVar));
                }
            }).h(new aypr() { // from class: ojl
                @Override // defpackage.aypr
                public final banv a(aypn aypnVar) {
                    WatchResponseCoordinator watchResponseCoordinator = WatchResponseCoordinator.this;
                    return watchResponseCoordinator.e ? aypnVar.E(watchResponseCoordinator.c) : aypnVar;
                }
            }).X(new ayrs() { // from class: ojm
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    WatchResponseCoordinator watchResponseCoordinator = WatchResponseCoordinator.this;
                    ammw ammwVar = (ammw) obj;
                    ahdv ahdvVar = (ahdv) ammwVar.a;
                    final acsm acsmVar = (acsm) Optional.ofNullable(((ahqs) ammwVar.b).b).orElse(null);
                    watchResponseCoordinator.b.m(ahdvVar, acsmVar);
                    WatchNextResponseModel a = ahdvVar.a();
                    amxd listIterator = ((amwf) watchResponseCoordinator.d).listIterator();
                    while (listIterator.hasNext()) {
                        ((ojk) listIterator.next()).r(a).ifPresent(new Consumer() { // from class: ojo
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj2) {
                                ((kdj) obj2).a(acsm.this);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            }));
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.h.c();
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
