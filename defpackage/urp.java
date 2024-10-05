package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class urp implements uog {
    final /* synthetic */ anic a;
    final /* synthetic */ urt b;

    public urp(urt urtVar, anic anicVar) {
        this.b = urtVar;
        this.a = anicVar;
    }

    @Override // defpackage.uog
    public final void d(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(3, simpleName);
        this.b.a();
        this.b.c = this.a.schedule(new Runnable() { // from class: uro
            @Override // java.lang.Runnable
            public final void run() {
                urp urpVar = urp.this;
                urpVar.b.a.a(5, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
