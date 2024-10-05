package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.video.media.VideoMetaData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyj extends ce {
    public final vyi a = new vyi();

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.a.c = activity;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.a.b();
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.a.c();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.a.d();
    }

    public final vyf a(VideoMetaData videoMetaData) {
        vyi vyiVar = this.a;
        vyg vygVar = vyiVar.f;
        if (vygVar != null && videoMetaData.equals(vygVar.a)) {
            return vyiVar.f;
        }
        vyg vygVar2 = vyiVar.f;
        if (vygVar2 != null) {
            vygVar2.f();
        }
        vyiVar.f = new vyg(vyiVar, videoMetaData);
        return vyiVar.f;
    }

    public final void d(boolean z) {
        this.a.h = z;
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        this.a.c = null;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        this.a.e(bundle);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        al(true);
        this.a.a(bundle);
    }

    public final void n(vuq vuqVar) {
        vyi vyiVar = this.a;
        if (vyiVar.g != vuqVar) {
            vyg vygVar = vyiVar.f;
            if (vygVar != null) {
                vygVar.g();
            }
            vyiVar.g = vuqVar;
            vyg vygVar2 = vyiVar.f;
            if (vygVar2 != null) {
                vygVar2.e();
            }
        }
    }
}
