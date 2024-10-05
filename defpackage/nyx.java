package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nyx {
    public final /* synthetic */ FlexyBehavior a;
    public final /* synthetic */ nzc b;

    public /* synthetic */ nyx(FlexyBehavior flexyBehavior, nzc nzcVar) {
        this.a = flexyBehavior;
        this.b = nzcVar;
    }

    public final void a(int i) {
        FlexyBehavior flexyBehavior = this.a;
        nzc nzcVar = this.b;
        if (i == 0) {
            if (flexyBehavior.a) {
                nzcVar.g(0, true);
            }
            flexyBehavior.b = false;
        }
    }
}
