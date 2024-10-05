package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adfa extends boh {
    public final Handler b;

    public adfa() {
    }

    public static bnq c(bph bphVar, jdb jdbVar) {
        adew adewVar = new adew();
        adewVar.aF(bphVar);
        if (jdbVar != null) {
            adewVar.av = jdbVar;
        }
        return adewVar;
    }

    @Override // defpackage.boh
    public final bnq a() {
        return new adew();
    }

    @Override // defpackage.boh
    public bog b() {
        return new adez();
    }

    public adfa(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper());
    }
}
