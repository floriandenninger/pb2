package defpackage;

import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bha implements bgz {
    private final WindowManager a;

    public bha(WindowManager windowManager) {
        this.a = windowManager;
    }

    @Override // defpackage.bgz
    public final void a() {
    }

    @Override // defpackage.bgz
    public final void b(bgx bgxVar) {
        bgxVar.a(this.a.getDefaultDisplay());
    }
}
