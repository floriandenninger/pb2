package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uux extends ContentObserver {
    final /* synthetic */ uuy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uux(uuy uuyVar) {
        super(null);
        this.a = uuyVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
