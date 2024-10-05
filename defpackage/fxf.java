package defpackage;

import android.text.Spanned;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxf extends fks {
    public final RentalActivationOverlay a;
    public boolean b;
    private final aioc c;
    private final ayqw d;

    public fxf(fln flnVar, RentalActivationOverlay rentalActivationOverlay, aioc aiocVar) {
        super(flnVar);
        rentalActivationOverlay.getClass();
        this.a = rentalActivationOverlay;
        this.c = aiocVar;
        this.d = new ayqw();
    }

    @Override // defpackage.flm
    public final void kG() {
        this.d.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        ayqw ayqwVar = this.d;
        aioc aiocVar = this.c;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        ayqwVar.g(aiocVar.al().Y(new ayrs(this) { // from class: fxe
            public final /* synthetic */ fxf a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awhf awhfVar;
                awhf awhfVar2;
                int i4 = i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.a.g();
                        return;
                    }
                    fxf fxfVar = this.a;
                    boolean z = ((ahej) obj).a() == 2;
                    fxfVar.b = z;
                    if (z) {
                        fxfVar.a.g();
                        return;
                    }
                    return;
                }
                fxf fxfVar2 = this.a;
                PlayerResponseModel b = ((ahdv) obj).b();
                if (b == null) {
                    return;
                }
                aryi aryiVar = b.a.f;
                if (aryiVar == null) {
                    aryiVar = aryi.a;
                }
                aryz aryzVar = aryiVar.m;
                if (aryzVar == null) {
                    aryzVar = aryz.a;
                }
                if (aryzVar.b == 86428467) {
                    awhfVar = (awhf) aryzVar.c;
                } else {
                    awhfVar = awhf.a;
                }
                if ((awhfVar.b & 4) == 0 || fxfVar2.b) {
                    return;
                }
                RentalActivationOverlay rentalActivationOverlay = fxfVar2.a;
                aryz aryzVar2 = aryiVar.m;
                if (aryzVar2 == null) {
                    aryzVar2 = aryz.a;
                }
                if (aryzVar2.b == 86428467) {
                    awhfVar2 = (awhf) aryzVar2.c;
                } else {
                    awhfVar2 = awhf.a;
                }
                aqyg aqygVar = awhfVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                Spanned b2 = ajcq.b(aqygVar);
                if (rentalActivationOverlay.a == null) {
                    rentalActivationOverlay.a = (YouTubeTextView) LayoutInflater.from(rentalActivationOverlay.getContext()).inflate(R.layout.rental_activation_overlay, rentalActivationOverlay).findViewById(R.id.rental_activation_message);
                    rentalActivationOverlay.h();
                }
                rentalActivationOverlay.a.setText(b2);
                rentalActivationOverlay.h();
            }
        }, eoo.p), aiocVar.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: fxe
            public final /* synthetic */ fxf a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awhf awhfVar;
                awhf awhfVar2;
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.a.g();
                        return;
                    }
                    fxf fxfVar = this.a;
                    boolean z = ((ahej) obj).a() == 2;
                    fxfVar.b = z;
                    if (z) {
                        fxfVar.a.g();
                        return;
                    }
                    return;
                }
                fxf fxfVar2 = this.a;
                PlayerResponseModel b = ((ahdv) obj).b();
                if (b == null) {
                    return;
                }
                aryi aryiVar = b.a.f;
                if (aryiVar == null) {
                    aryiVar = aryi.a;
                }
                aryz aryzVar = aryiVar.m;
                if (aryzVar == null) {
                    aryzVar = aryz.a;
                }
                if (aryzVar.b == 86428467) {
                    awhfVar = (awhf) aryzVar.c;
                } else {
                    awhfVar = awhf.a;
                }
                if ((awhfVar.b & 4) == 0 || fxfVar2.b) {
                    return;
                }
                RentalActivationOverlay rentalActivationOverlay = fxfVar2.a;
                aryz aryzVar2 = aryiVar.m;
                if (aryzVar2 == null) {
                    aryzVar2 = aryz.a;
                }
                if (aryzVar2.b == 86428467) {
                    awhfVar2 = (awhf) aryzVar2.c;
                } else {
                    awhfVar2 = awhf.a;
                }
                aqyg aqygVar = awhfVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                Spanned b2 = ajcq.b(aqygVar);
                if (rentalActivationOverlay.a == null) {
                    rentalActivationOverlay.a = (YouTubeTextView) LayoutInflater.from(rentalActivationOverlay.getContext()).inflate(R.layout.rental_activation_overlay, rentalActivationOverlay).findViewById(R.id.rental_activation_message);
                    rentalActivationOverlay.h();
                }
                rentalActivationOverlay.a.setText(b2);
                rentalActivationOverlay.h();
            }
        }, eoo.p), aiocVar.G().j.Y(new ayrs(this) { // from class: fxe
            public final /* synthetic */ fxf a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awhf awhfVar;
                awhf awhfVar2;
                int i4 = i3;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.a.g();
                        return;
                    }
                    fxf fxfVar = this.a;
                    boolean z = ((ahej) obj).a() == 2;
                    fxfVar.b = z;
                    if (z) {
                        fxfVar.a.g();
                        return;
                    }
                    return;
                }
                fxf fxfVar2 = this.a;
                PlayerResponseModel b = ((ahdv) obj).b();
                if (b == null) {
                    return;
                }
                aryi aryiVar = b.a.f;
                if (aryiVar == null) {
                    aryiVar = aryi.a;
                }
                aryz aryzVar = aryiVar.m;
                if (aryzVar == null) {
                    aryzVar = aryz.a;
                }
                if (aryzVar.b == 86428467) {
                    awhfVar = (awhf) aryzVar.c;
                } else {
                    awhfVar = awhf.a;
                }
                if ((awhfVar.b & 4) == 0 || fxfVar2.b) {
                    return;
                }
                RentalActivationOverlay rentalActivationOverlay = fxfVar2.a;
                aryz aryzVar2 = aryiVar.m;
                if (aryzVar2 == null) {
                    aryzVar2 = aryz.a;
                }
                if (aryzVar2.b == 86428467) {
                    awhfVar2 = (awhf) aryzVar2.c;
                } else {
                    awhfVar2 = awhf.a;
                }
                aqyg aqygVar = awhfVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                Spanned b2 = ajcq.b(aqygVar);
                if (rentalActivationOverlay.a == null) {
                    rentalActivationOverlay.a = (YouTubeTextView) LayoutInflater.from(rentalActivationOverlay.getContext()).inflate(R.layout.rental_activation_overlay, rentalActivationOverlay).findViewById(R.id.rental_activation_message);
                    rentalActivationOverlay.h();
                }
                rentalActivationOverlay.a.setText(b2);
                rentalActivationOverlay.h();
            }
        }, eoo.p));
    }
}
