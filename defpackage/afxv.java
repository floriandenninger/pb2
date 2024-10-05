package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afxv implements amml {
    public final /* synthetic */ aooy a;
    private final /* synthetic */ int b;

    public /* synthetic */ afxv(aooy aooyVar, int i) {
        this.b = i;
        this.a = aooyVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b != 0) {
            return this.a;
        }
        aooy aooyVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("renderer_class_name", aooyVar.getClass().getName());
        bundle.putString("unique_payload_id", (String) obj);
        return bundle;
    }
}
