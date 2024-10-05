package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agqf implements anhh {
    private final agmu a;
    private final String b;
    private final int c;

    public agqf(agmu agmuVar, String str, int i) {
        this.b = str;
        this.a = agmuVar;
        this.c = i;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        this.a.e(TextUtils.isEmpty(this.b) ? amlr.a : ammv.j(this.b), this.c, 2);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
