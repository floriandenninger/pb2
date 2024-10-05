package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class altl implements Runnable {
    final /* synthetic */ altm a;

    public altl(altm altmVar) {
        this.a = altmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View peekDecorView = this.a.b.peekDecorView();
        if (peekDecorView != null) {
            altn.a(peekDecorView);
            return;
        }
        altm altmVar = this.a;
        int i = altmVar.c - 1;
        altmVar.c = i;
        if (i >= 0) {
            altmVar.a.post(altmVar.d);
            return;
        }
        ammr ammrVar = altn.a;
        String valueOf = String.valueOf(this.a.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Cannot get decor view of window: ");
        sb.append(valueOf);
        ammrVar.h(sb.toString());
    }
}
