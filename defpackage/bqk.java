package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqk extends jj {
    @Override // defpackage.jj
    public final void i(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error: ");
        sb.append(str);
        sb.append(", data: ");
        sb.append(bundle);
    }

    @Override // defpackage.jj
    public final void j(Bundle bundle) {
        bundle.getString("groupableTitle");
        bundle.getString("transferableTitle");
    }
}
