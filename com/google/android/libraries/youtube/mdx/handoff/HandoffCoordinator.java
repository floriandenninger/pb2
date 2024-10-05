package com.google.android.libraries.youtube.mdx.handoff;

import com.google.android.libraries.youtube.mdx.handoff.HandoffCoordinator;
import defpackage.acue;
import defpackage.acyp;
import defpackage.aczr;
import defpackage.aczz;
import defpackage.adae;
import defpackage.adaf;
import defpackage.adlt;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.zga;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HandoffCoordinator implements any {
    public final aczz a;
    public final adae b;
    public final adlt c;
    public final adaf d;
    public final aczr e;
    public ayqw f;
    public ayqx g;
    private final acue h;

    static {
        zga.a("HandoffCoordinator");
    }

    public HandoffCoordinator(aczz aczzVar, adae adaeVar, adlt adltVar, acue acueVar, adaf adafVar, aczr aczrVar) {
        this.a = aczzVar;
        this.b = adaeVar;
        this.c = adltVar;
        this.h = acueVar;
        this.d = adafVar;
        this.e = aczrVar;
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.f.qc();
        this.f.c();
        adae adaeVar = this.b;
        acyp acypVar = adaeVar.f;
        if (acypVar == null) {
            return;
        }
        adaeVar.b.f(acypVar);
        adaeVar.f = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        ayqw ayqwVar = new ayqw();
        this.f = ayqwVar;
        ayqwVar.d(this.h.h().B().ax(new ayrs() { // from class: aczx
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final HandoffCoordinator handoffCoordinator = HandoffCoordinator.this;
                final adah adahVar = (adah) obj;
                int i = 1;
                String.format("Received autoconnect enabled update=%s", adahVar);
                if (adahVar.a) {
                    if (handoffCoordinator.c.g() != null || handoffCoordinator.e.d()) {
                        return;
                    }
                    ayqx ayqxVar = handoffCoordinator.g;
                    if (ayqxVar == null || ayqxVar.e()) {
                        handoffCoordinator.g = handoffCoordinator.d.a.ax(new ayrs() { // from class: aczy
                            @Override // defpackage.ayrs
                            public final void a(Object obj2) {
                                String str;
                                HandoffCoordinator handoffCoordinator2 = HandoffCoordinator.this;
                                adah adahVar2 = adahVar;
                                adaj adajVar = (adaj) obj2;
                                Object[] objArr = new Object[3];
                                int i2 = adajVar.c;
                                switch (i2) {
                                    case 1:
                                        str = "HANDOFF_FEATURE_TYPE_UNKNOWN";
                                        break;
                                    case 2:
                                        str = "HANDOFF_FEATURE_TYPE_YTV_LR_PURCHASE";
                                        break;
                                    case 3:
                                        str = "HANDOFF_FEATURE_TYPE_YTC_LR_PURCHASE";
                                        break;
                                    case 4:
                                        str = "HANDOFF_FEATURE_TYPE_ALC_TWO_FACTOR_LOCATION";
                                        break;
                                    case 5:
                                        str = "HANDOFF_FEATURE_TYPE_CALL_TO_ACTION";
                                        break;
                                    case 6:
                                        str = "HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                                if (i2 == 0) {
                                    throw null;
                                }
                                int i3 = 0;
                                objArr[0] = str;
                                objArr[1] = adajVar.a;
                                int i4 = adajVar.b;
                                String dW = amkq.dW(i4);
                                if (i4 == 0) {
                                    throw null;
                                }
                                objArr[2] = dW;
                                String.format("Marking handoff action[feature=%s][id=%s] as [%s]", objArr);
                                aczz aczzVar = handoffCoordinator2.a;
                                aone createBuilder = ardq.a.createBuilder();
                                createBuilder.copyOnWrite();
                                ardq ardqVar = (ardq) createBuilder.instance;
                                ardqVar.d = 7;
                                ardqVar.b = 2 | ardqVar.b;
                                String str2 = adajVar.a;
                                createBuilder.copyOnWrite();
                                ardq ardqVar2 = (ardq) createBuilder.instance;
                                str2.getClass();
                                ardqVar2.b = 1 | ardqVar2.b;
                                ardqVar2.c = str2;
                                int i5 = adajVar.c;
                                createBuilder.copyOnWrite();
                                ardq ardqVar3 = (ardq) createBuilder.instance;
                                int i6 = i5 - 1;
                                if (i5 == 0) {
                                    throw null;
                                }
                                ardqVar3.e = i6;
                                ardqVar3.b |= 4;
                                int i7 = adajVar.b;
                                createBuilder.copyOnWrite();
                                ardq ardqVar4 = (ardq) createBuilder.instance;
                                int i8 = i7 - 1;
                                if (i7 == 0) {
                                    throw null;
                                }
                                ardqVar4.f = i8;
                                ardqVar4.b |= 16;
                                ynm.i(aczzVar.a((ardq) createBuilder.build()), new aczw(handoffCoordinator2, adahVar2, i3));
                            }
                        });
                        handoffCoordinator.f.d(handoffCoordinator.g);
                    }
                    aczz aczzVar = handoffCoordinator.a;
                    aone createBuilder = ardq.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ardq ardqVar = (ardq) createBuilder.instance;
                    ardqVar.d = 5;
                    ardqVar.b |= 2;
                    createBuilder.copyOnWrite();
                    ardq ardqVar2 = (ardq) createBuilder.instance;
                    ardqVar2.e = 5;
                    ardqVar2.b |= 4;
                    createBuilder.copyOnWrite();
                    ardq ardqVar3 = (ardq) createBuilder.instance;
                    ardqVar3.f = 1;
                    ardqVar3.b |= 16;
                    ynm.i(aczzVar.a((ardq) createBuilder.build()), new aczw(handoffCoordinator, adahVar, i));
                    return;
                }
                ayqx ayqxVar2 = handoffCoordinator.g;
                if (ayqxVar2 == null || ayqxVar2.e()) {
                    return;
                }
                ayrz.c((AtomicReference) handoffCoordinator.g);
            }
        }));
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
