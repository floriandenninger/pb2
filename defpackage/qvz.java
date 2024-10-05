package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qvz {
    private static final ComponentName a;
    private static final ComponentName b;

    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        a = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
        b = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");
    }

    public static Intent a(qvx qvxVar) {
        return new Intent().setComponent(a).putExtras(new Bundle(((qvy) qvxVar).b));
    }

    public static Intent b(qwa qwaVar) {
        return new Intent().setComponent(b).putExtras(new Bundle(((qwb) qwaVar).b));
    }

    public static String c(String str) {
        return str.length() != 0 ? "com.google.android.gms.family.".concat(str) : new String("com.google.android.gms.family.");
    }
}
