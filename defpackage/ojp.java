package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ojp implements amnv {
    public final /* synthetic */ ojr a;
    public final /* synthetic */ int b;

    public /* synthetic */ ojp(ojr ojrVar, int i) {
        this.a = ojrVar;
        this.b = i;
    }

    @Override // defpackage.amnv
    public final Object get() {
        ojr ojrVar = this.a;
        return new Rect(ojrVar.d.getLeft(), ojrVar.d.getTop(), ojrVar.d.getWidth(), ojrVar.d.getHeight() - this.b);
    }
}
