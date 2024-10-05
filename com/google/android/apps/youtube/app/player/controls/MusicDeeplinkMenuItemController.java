package com.google.android.apps.youtube.app.player.controls;

import android.app.Activity;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import defpackage.aahd;
import defpackage.adyu;
import defpackage.ahdv;
import defpackage.aioc;
import defpackage.ajut;
import defpackage.any;
import defpackage.aok;
import defpackage.arfr;
import defpackage.arfs;
import defpackage.atda;
import defpackage.atdc;
import defpackage.atzq;
import defpackage.atzr;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.kem;
import defpackage.kfe;
import defpackage.whu;
import defpackage.ypd;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MusicDeeplinkMenuItemController implements any, ypd {
    public final aahd a;
    public kem b;
    public atda c;
    private final Activity d;
    private final aioc e;
    private final ajut f;
    private ayqx g;
    private boolean h;

    public MusicDeeplinkMenuItemController(Activity activity, aioc aiocVar, aahd aahdVar, ajut ajutVar) {
        this.d = activity;
        aiocVar.getClass();
        this.e = aiocVar;
        aahdVar.getClass();
        this.a = aahdVar;
        ajutVar.getClass();
        this.f = ajutVar;
    }

    private final void i(arfr arfrVar, boolean z) {
        kem kemVar;
        int a = this.f.a(arfrVar);
        if (a == 0 || (kemVar = this.b) == null) {
            return;
        }
        if (z) {
            kemVar.e = whu.y(this.d, a, R.attr.ytTextPrimary);
        } else {
            kemVar.f = whu.y(this.d, a, R.attr.ytTextPrimary);
        }
    }

    public final void g(ahdv ahdvVar) {
        atzr atzrVar;
        arfs dm;
        WatchNextResponseModel a = ahdvVar.a();
        boolean z = true;
        if (a != null && (atzrVar = a.i) != null && (atzrVar.b & 1) != 0) {
            atzq atzqVar = atzrVar.d;
            if (atzqVar == null) {
                atzqVar = atzq.a;
            }
            if ((atzqVar.b & 1) != 0) {
                atzq atzqVar2 = atzrVar.d;
                if (atzqVar2 == null) {
                    atzqVar2 = atzq.a;
                }
                atdc atdcVar = atzqVar2.c;
                if (atdcVar == null) {
                    atdcVar = atdc.a;
                }
                for (atda atdaVar : atdcVar.c) {
                    if ((atdaVar.b & 1) != 0 && (dm = adyu.dm(atdaVar)) != null) {
                        arfr b = arfr.b(dm.c);
                        if (b == null) {
                            b = arfr.UNKNOWN;
                        }
                        if (b == arfr.OUTLINE_YOUTUBE_MUSIC) {
                            this.c = atdaVar;
                            break;
                        }
                    }
                }
            }
        }
        z = false;
        this.h = z;
        if (this.b != null) {
            h();
        }
    }

    public final void h() {
        atda atdaVar = this.c;
        if (atdaVar != null) {
            CharSequence m0do = adyu.m0do(atdaVar);
            kem kemVar = this.b;
            if (kemVar != null && m0do != null) {
                kemVar.c = m0do.toString();
            }
            arfs dm = adyu.dm(atdaVar);
            if (dm != null) {
                arfr b = arfr.b(dm.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                i(b, true);
            }
            arfs dn = adyu.dn(atdaVar);
            if (dn != null) {
                arfr b2 = arfr.b(dn.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                i(b2, false);
            }
        }
        kem kemVar2 = this.b;
        if (kemVar2 != null) {
            kemVar2.g(this.h);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            g((ahdv) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        Object obj = this.g;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.g = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.g = this.e.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: ket
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                MusicDeeplinkMenuItemController.this.g((ahdv) obj);
            }
        }, kfe.b);
    }
}
