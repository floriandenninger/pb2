package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drx implements Runnable {
    final /* synthetic */ List a;

    public drx(List list) {
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dsx.G(this.a);
    }
}
