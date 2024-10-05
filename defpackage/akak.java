package defpackage;

import android.app.Activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akak extends akal {
    final /* synthetic */ ci a;

    public akak(ci ciVar) {
        this.a = ciVar;
    }

    @Override // defpackage.akal
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.akal
    public final dd b() {
        return this.a.getSupportFragmentManager();
    }

    @Override // defpackage.akal
    public final void c(String[] strArr, int i) {
        this.a.requestPermissions(strArr, i);
    }
}
