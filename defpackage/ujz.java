package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujz extends tyo {
    final /* synthetic */ View b;
    final /* synthetic */ uka c;

    public ujz(uka ukaVar, View view) {
        this.c = ukaVar;
        this.b = view;
    }

    @Override // defpackage.tyo
    public final void af(final Object obj) {
        this.b.post(new Runnable() { // from class: ujy
            @Override // java.lang.Runnable
            public final void run() {
                ujz ujzVar = ujz.this;
                ujzVar.c.a(obj);
            }
        });
    }
}
