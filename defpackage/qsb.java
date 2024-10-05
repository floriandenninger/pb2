package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsb extends qsd {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    public qsb(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.qsd
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
