package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdf extends UserRecoverableAuthException {
    public final int a;

    public qdf(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }
}
