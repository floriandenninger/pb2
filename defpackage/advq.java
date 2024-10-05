package defpackage;

import android.widget.TextView;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advq {
    public final azrw a;
    public final azrw b;

    public advq(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public advq(azrw azrwVar, azrw azrwVar2, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public final CronetEngine a(boolean z) {
        return (CronetEngine) (z ? this.b : this.a).get();
    }

    public final abhb b(TextView textView) {
        ajyg ajygVar = (ajyg) this.b.get();
        ajygVar.getClass();
        textView.getClass();
        return new abhb(ajygVar, textView);
    }

    public advq(azrw azrwVar, azrw azrwVar2, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public advq(azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public advq(azrw azrwVar, azrw azrwVar2, byte[] bArr) {
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }
}
