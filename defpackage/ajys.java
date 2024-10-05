package defpackage;

import android.view.KeyEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajys implements Runnable {
    final /* synthetic */ ajyv a;

    public ajys(ajyv ajyvVar) {
        this.a = ajyvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e.dispatchKeyEvent(new KeyEvent(0, 67));
        this.a.a.postDelayed(this, 100L);
    }
}
