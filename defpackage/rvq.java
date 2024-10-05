package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvq implements rvj {
    private final View a;

    public rvq(View view) {
        this.a = view;
    }

    @Override // defpackage.rvj
    public final int a() {
        if (this.a.getLayoutParams() instanceof rwk) {
        }
        return 0;
    }

    @Override // defpackage.rvj
    public final String b() {
        return this.a.getContentDescription().toString();
    }
}
