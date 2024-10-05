package com.google.android.apps.youtube.app.player.autonav;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AutoplaySwitchButtonRendererOuterClass;
import defpackage.aahd;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsm;
import defpackage.ahfc;
import defpackage.aico;
import defpackage.aioc;
import defpackage.ajut;
import defpackage.any;
import defpackage.aok;
import defpackage.aoot;
import defpackage.aots;
import defpackage.aott;
import defpackage.aphi;
import defpackage.apxf;
import defpackage.aqvj;
import defpackage.aqvk;
import defpackage.arfr;
import defpackage.arfs;
import defpackage.atzr;
import defpackage.aulq;
import defpackage.axzf;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fnx;
import defpackage.fnz;
import defpackage.fxk;
import defpackage.izw;
import defpackage.jun;
import defpackage.kdm;
import defpackage.kdn;
import defpackage.keg;
import defpackage.nz;
import defpackage.ojk;
import defpackage.wbs;
import defpackage.ynm;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AutonavToggleController extends fxk implements ahfc, any, ojk {
    public final aahd d;
    public final Handler e;
    public final Runnable f;
    public SwitchCompat g;
    public boolean h = true;
    private final keg i;
    private final aioc j;
    private final ayqw k;
    private final acra l;
    private final ajut m;
    private final boolean n;
    private final int o;
    private final ColorStateList p;
    private aico q;

    /* JADX WARN: Multi-variable type inference failed */
    public AutonavToggleController(Context context, acra acraVar, ajut ajutVar, aahd aahdVar, aioc aiocVar, keg kegVar, axzf axzfVar, Handler handler, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        this.l = acraVar;
        this.j = aiocVar;
        this.m = ajutVar;
        this.d = aahdVar;
        this.i = kegVar;
        aqvj aqvjVar = axzfVar.a.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45359498L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359498L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359498L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.n = bool.booleanValue();
        this.e = handler;
        this.f = new kdn(this);
        this.k = new ayqw();
        this.o = context.getResources().getDimensionPixelSize(R.dimen.autonav_toggle_tap_bloom_size);
        this.p = wbs.S(context, R.attr.ytOverlayButtonPrimary);
    }

    @Override // defpackage.fxk
    protected final void i() {
        SwitchCompat switchCompat = (SwitchCompat) g().findViewById(R.id.autonav_toggle_button);
        this.g = switchCompat;
        switchCompat.a = this.p;
        switchCompat.b = true;
        switchCompat.a();
        this.g.setChecked(this.i.g());
        this.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kdi
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AutonavToggleController autonavToggleController = AutonavToggleController.this;
                autonavToggleController.s();
                kdm kdmVar = (kdm) autonavToggleController.b;
                if (kdmVar == null) {
                    return;
                }
                autonavToggleController.n();
                if (autonavToggleController.h) {
                    autonavToggleController.q(kdmVar).I(3, new acqx(kdmVar.b.j), null);
                    autonavToggleController.e.removeCallbacks(autonavToggleController.f);
                    autonavToggleController.e.postDelayed(autonavToggleController.f, 300L);
                    autonavToggleController.u(kdmVar.b);
                }
            }
        });
        this.i.d(this);
    }

    @Override // defpackage.fxk, defpackage.fya
    public final void l(boolean z, boolean z2) {
        SwitchCompat switchCompat;
        boolean o = o();
        super.l(z, z2);
        if (z && (switchCompat = this.g) != null) {
            switchCompat.setChecked(this.i.g());
        }
        kdm kdmVar = (kdm) this.b;
        if (o || !o() || kdmVar == null) {
            if (o()) {
                return;
            }
            s();
            return;
        }
        q(kdmVar).u(new acqx(kdmVar.b.j), null);
        fnx fnxVar = (fnx) this.i.b.c();
        int i = (fnxVar.b & 1) != 0 ? fnxVar.c : 1;
        if (i > 0) {
            aphi aphiVar = kdmVar.b;
            if (this.q == null) {
                this.q = new aico((TapBloomView) g().findViewById(R.id.autonav_tap_bloom_view), 1000, 4);
            }
            aico aicoVar = this.q;
            int i2 = this.o / 2;
            aicoVar.b(i2, i2);
            u(aphiVar);
            ynm.m(this.i.b.b(new fnz(i - 1, 3)), jun.m);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.i.f(this);
    }

    @Override // defpackage.fxk
    public final void n() {
        SwitchCompat switchCompat;
        arfr b;
        String str;
        kdm kdmVar = (kdm) this.b;
        if (kdmVar == null || (switchCompat = this.g) == null) {
            return;
        }
        ajut ajutVar = this.m;
        if (switchCompat.isChecked()) {
            arfs arfsVar = kdmVar.b.b;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
        } else {
            arfs arfsVar2 = kdmVar.b.c;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            b = arfr.b(arfsVar2.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
        }
        int a = ajutVar.a(b);
        if (a != 0) {
            SwitchCompat switchCompat2 = this.g;
            switchCompat2.e(nz.b(switchCompat2.getContext(), a));
        } else {
            this.g.e(null);
        }
        SwitchCompat switchCompat3 = this.g;
        if (switchCompat3.isChecked()) {
            aott aottVar = kdmVar.b.h;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar = aottVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        } else {
            aott aottVar2 = kdmVar.b.i;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar2 = aottVar2.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            str = aotsVar2.c;
        }
        switchCompat3.setContentDescription(str);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.k.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.k.c();
        if (this.n) {
            return;
        }
        this.k.d(this.j.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: kdk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                AutonavToggleController.this.r(((ahdv) obj).a()).ifPresent(iwu.c);
            }
        }, izw.r));
    }

    @Override // defpackage.fxk
    protected final void p() {
    }

    public final acsm q(kdm kdmVar) {
        acsm acsmVar;
        return (!this.n || (acsmVar = kdmVar.a) == null) ? this.l : acsmVar;
    }

    public final void s() {
        ValueAnimator valueAnimator;
        aico aicoVar = this.q;
        if (aicoVar == null || (valueAnimator = aicoVar.b) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // defpackage.ahfc
    public final void t(boolean z) {
        this.h = false;
        SwitchCompat switchCompat = this.g;
        if (switchCompat != null) {
            switchCompat.setChecked(this.i.g());
        }
        this.h = true;
    }

    public final void u(aphi aphiVar) {
        apxf apxfVar;
        SwitchCompat switchCompat = this.g;
        if (switchCompat == null) {
            return;
        }
        aahd aahdVar = this.d;
        if (switchCompat.isChecked()) {
            apxfVar = aphiVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = aphiVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        aahdVar.a(apxfVar);
    }

    @Override // defpackage.ojk
    public final Optional r(WatchNextResponseModel watchNextResponseModel) {
        aphi aphiVar = null;
        atzr atzrVar = watchNextResponseModel == null ? null : watchNextResponseModel.i;
        if (atzrVar != null && (atzrVar.b & 32768) != 0) {
            aulq aulqVar = atzrVar.j;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer)) {
                aulq aulqVar2 = atzrVar.j;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aphiVar = (aphi) aulqVar2.pX(AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer);
            }
        }
        return Optional.ofNullable(aphiVar).map(new Function() { // from class: kdl
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return new kdj(AutonavToggleController.this, (aphi) obj);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        });
    }
}
