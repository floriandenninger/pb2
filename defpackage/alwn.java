package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwn implements alwq {
    final /* synthetic */ ames a;

    public alwn(ames amesVar) {
        this.a = amesVar;
    }

    @Override // defpackage.alwq
    public final Intent a() {
        return new Intent();
    }

    @Override // defpackage.alwq
    public final aae b() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.alwq
    public final aae c() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.alwq
    public final void d(aac aacVar, aac aacVar2) {
    }

    @Override // defpackage.alwq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.alwq
    public final boolean f() {
        return false;
    }

    @Override // defpackage.alwq
    public final boolean g() {
        return this.a.b().Y();
    }
}
