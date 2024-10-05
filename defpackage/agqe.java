package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqe implements anhh {
    final /* synthetic */ ammy a;
    final /* synthetic */ agmu b;
    final /* synthetic */ String c;
    final /* synthetic */ anhy d;
    final /* synthetic */ Executor e;
    final /* synthetic */ int f;

    public agqe(ammy ammyVar, agmu agmuVar, String str, int i, anhy anhyVar, Executor executor) {
        this.a = ammyVar;
        this.b = agmuVar;
        this.c = str;
        this.f = i;
        this.d = anhyVar;
        this.e = executor;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        anjr anjrVar = (anjr) obj;
        if (this.a.a(anjrVar.a)) {
            int i = anjrVar.b;
            int i2 = i != 1 ? i != 2 ? 1 : 4 : 3;
            if (i2 == 1) {
                zga.b("[Offline] Encountered unknown fallback reason. Likely bug in fallback strategy.");
            }
            this.b.e(TextUtils.isEmpty(this.c) ? amlr.a : ammv.j(this.c), this.f, i2);
            return;
        }
        anaf.Y(this.d, new agqf(this.b, this.c, this.f), this.e);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
