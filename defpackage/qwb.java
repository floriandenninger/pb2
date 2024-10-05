package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwb implements qwa {
    public static final String a = qvz.c("FamilyApiMessage");
    public final Bundle b;

    static {
        qvz.c("isDirectAddInvitations");
    }

    public qwb(String str, String str2) {
        Bundle bundle = new Bundle(13);
        this.b = bundle;
        qip.ax(str);
        qip.ax(str2);
        bundle.putString(a, "ManageFamilyV2");
        bundle.putString("accountName", str);
        bundle.putString("appId", str2);
    }
}
