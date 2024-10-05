package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akof extends akoj {
    public axpg a;
    slj b;
    private awos c;
    private syg d;

    public static akof a(awos awosVar, syg sygVar) {
        akof akofVar = new akof();
        Bundle bundle = new Bundle();
        p(bundle, awosVar);
        akofVar.af(bundle);
        akofVar.d = sygVar;
        return akofVar;
    }

    private static void p(Bundle bundle, awos awosVar) {
        bundle.putParcelable("element", new ParcelableMessageLite(awosVar));
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        slj sljVar = this.b;
        if (sljVar != null) {
            sljVar.onDetachedFromWindow();
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        p(bundle, this.c);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("element");
        awos awosVar = parcelableMessageLite == null ? null : (awos) parcelableMessageLite.a(awos.a);
        if (awosVar != null) {
            this.c = awosVar;
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.elements_fragment, viewGroup, false);
        slj sljVar = this.b;
        if (sljVar == null) {
            sya a = syb.a(((sqq) this.a.get()).a);
            a.b = "StudioElements";
            a.b(false);
            a.d = this.d;
            slj sljVar2 = new slj(qR(), a.a());
            this.b = sljVar2;
            sljVar2.a(this.c.toByteArray());
        } else if (sljVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
        frameLayout.addView(this.b);
        return frameLayout;
    }
}
