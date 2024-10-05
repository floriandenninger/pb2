package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adfz extends adgb {
    public abstract adgn f();

    @Override // defpackage.adgb
    public final String h() {
        return f().c;
    }

    @Override // defpackage.adgb
    public boolean j(adgb adgbVar) {
        if (adgbVar instanceof adfz) {
            return f().equals(f());
        }
        return false;
    }

    @Override // defpackage.adgb
    public Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", f().c);
        bundle.putInt("mdx_session_type", e() - 1);
        return bundle;
    }
}
