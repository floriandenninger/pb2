package defpackage;

import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class okt extends omx {
    private boolean j = false;

    public okt() {
        addOnContextAvailableListener(new oks(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okv
    public final void f() {
        if (this.j) {
            return;
        }
        this.j = true;
        WatchWhileActivity watchWhileActivity = (WatchWhileActivity) this;
        eed eedVar = (eed) lM();
        watchWhileActivity.a = (zbw) eedVar.a.av.get();
        watchWhileActivity.b = (fwo) eedVar.ah.get();
        watchWhileActivity.c = (sus) eedVar.ik.get();
        watchWhileActivity.d = (yxe) eedVar.jU.get();
        watchWhileActivity.e = axqq.a(eedVar.eG);
        watchWhileActivity.f = (ykk) eedVar.gA.get();
        watchWhileActivity.g = axqq.a(eedVar.kK);
        ((oon) watchWhileActivity).h = axqq.a(eedVar.eM);
    }
}
