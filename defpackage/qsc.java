package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsc extends qsd {
    final /* synthetic */ Intent a;
    final /* synthetic */ qqf b;

    public qsc(Intent intent, qqf qqfVar) {
        this.a = intent;
        this.b = qqfVar;
    }

    @Override // defpackage.qsd
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
