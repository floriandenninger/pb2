package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpm implements View.OnClickListener {
    final /* synthetic */ kpr a;
    private final /* synthetic */ int b;

    public kpm(kpr kprVar, int i) {
        this.b = i;
        this.a = kprVar;
    }

    public /* synthetic */ kpm(kpr kprVar, int i, byte[] bArr) {
        this.b = i;
        this.a = kprVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            kpr kprVar = this.a;
            xiz xizVar = kprVar.d;
            if (xizVar != null) {
                xizVar.c(kprVar.h, kprVar.i);
                return;
            }
            return;
        }
        if (i == 1) {
            kpr kprVar2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("menu_as_bottom_sheet", true);
            kprVar2.d.a(bundle);
            return;
        }
        this.a.f();
    }
}
