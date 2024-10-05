package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class urr implements uoh {
    final /* synthetic */ anic a;
    final /* synthetic */ urt b;

    public urr(urt urtVar, anic anicVar) {
        this.b = urtVar;
        this.a = anicVar;
    }

    @Override // defpackage.uoh
    public final void c(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(4, simpleName);
        this.b.a();
        this.b.b = this.a.schedule(new Runnable() { // from class: urq
            @Override // java.lang.Runnable
            public final void run() {
                urr urrVar = urr.this;
                urrVar.b.a.a(6, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
