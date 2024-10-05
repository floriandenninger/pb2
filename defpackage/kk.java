package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class kk extends kj {
    public kk(ko koVar, WindowInsets windowInsets) {
        super(koVar, windowInsets);
    }

    @Override // defpackage.ki, defpackage.kn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        return Objects.equals(this.a, kkVar.a) && Objects.equals(this.b, kkVar.b);
    }

    @Override // defpackage.kn
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kn
    public final il o() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new il(displayCutout);
    }

    @Override // defpackage.kn
    public final ko p() {
        return ko.q(this.a.consumeDisplayCutout());
    }
}
