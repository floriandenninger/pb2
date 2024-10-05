package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.ScreenId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adga extends adgb {
    public final adfw a;

    public adga(adfw adfwVar) {
        this.a = adfwVar;
    }

    @Override // defpackage.adgb
    public final ScreenId b() {
        return this.a.f;
    }

    @Override // defpackage.adgb
    public final String c() {
        return this.a.e;
    }

    @Override // defpackage.adgb
    public final String d() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.adgb
    public final int e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adga) {
            return this.a.equals(((adga) obj).a);
        }
        return false;
    }

    public final adfs f() {
        return this.a.g;
    }

    public final String g() {
        return this.a.e;
    }

    @Override // defpackage.adgb
    public final String h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.adgb
    public final boolean j(adgb adgbVar) {
        if (adgbVar instanceof adga) {
            return this.a.j(((adga) adgbVar).a);
        }
        return false;
    }

    @Override // defpackage.adgb
    public final Bundle s() {
        return this.a.s();
    }
}
