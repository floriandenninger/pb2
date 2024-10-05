package defpackage;

import android.view.KeyEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nf implements io {
    final /* synthetic */ ng a;

    public nf(ng ngVar) {
        this.a = ngVar;
    }

    @Override // defpackage.io
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.d(keyEvent);
    }
}
