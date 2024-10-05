package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mk implements aab {
    final /* synthetic */ ml a;

    public mk(ml mlVar) {
        this.a = mlVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        mn delegate = this.a.getDelegate();
        delegate.k();
        this.a.getSavedStateRegistry().a("androidx:appcompat");
        delegate.z();
    }
}
