package defpackage;

import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vr implements qo {
    final /* synthetic */ vu a;

    public vr(vu vuVar) {
        this.a = vuVar;
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        vt vtVar = this.a.d;
        if (vtVar != null) {
            return vtVar.a(menuItem);
        }
        return false;
    }
}
