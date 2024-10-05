package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhw implements rkl {
    final /* synthetic */ rid a;

    public rhw(rid ridVar) {
        this.a = ridVar;
    }

    @Override // defpackage.rkl
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.X("_err", bundle, str);
        } else {
            this.a.t("auto", "_err", bundle);
        }
    }
}
