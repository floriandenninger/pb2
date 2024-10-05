package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwb implements ajom {
    private final frg a;

    public mwb(jgp jgpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = jgpVar.e(null, null, R.layout.swipe_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        mwa mwaVar = (mwa) obj;
        aong aongVar = (aong) mwaVar.a.toBuilder();
        if (!aongVar.pY(apme.b)) {
            aongVar.e(apme.b, apme.a);
        }
        aone builder = ((apme) aongVar.pX(apme.b)).toBuilder();
        builder.copyOnWrite();
        apme apmeVar = (apme) builder.instance;
        apmeVar.d = 1;
        apmeVar.c = 1 | apmeVar.c;
        aongVar.e(apme.b, (apme) builder.build());
        mwaVar.a = (apmg) aongVar.build();
        this.a.oB(ajokVar, mwaVar.a);
    }
}
