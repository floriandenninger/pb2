package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkx extends uu {
    final /* synthetic */ GridLayoutManager c;
    final /* synthetic */ vkz d;

    public vkx(vkz vkzVar, GridLayoutManager gridLayoutManager) {
        this.d = vkzVar;
        this.c = gridLayoutManager;
    }

    @Override // defpackage.uu
    public final int b(int i) {
        if (this.d.a.x(i)) {
            return this.c.b;
        }
        return 1;
    }
}
