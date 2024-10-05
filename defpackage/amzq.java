package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amzq extends amyp {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public amzq(String str) {
        this.a = str;
    }

    @Override // defpackage.amyp
    public String a() {
        return this.a;
    }

    @Override // defpackage.amyp
    public void b(RuntimeException runtimeException, amyo amyoVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
