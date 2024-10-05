package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.qcw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends qcw {
    public final Intent b;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.b = intent;
    }
}
