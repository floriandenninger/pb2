package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akcy a;

    public akcx(akcy akcyVar) {
        this.a = akcyVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        akcj akcjVar = this.a.d;
        if (akcjVar == null || (view = akcjVar.c) == null || view.isShown()) {
            return;
        }
        akcy akcyVar = this.a;
        akcyVar.b(akcyVar.d);
    }
}
