package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import defpackage.oba;
import defpackage.qve;
import defpackage.qvf;
import defpackage.qwt;
import defpackage.qwv;
import defpackage.qww;
import defpackage.qwx;
import defpackage.qwy;
import defpackage.qwz;
import defpackage.qxa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlagProviderImpl extends qwt {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.qwu
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) oba.I(new qwv(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.qwu
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) oba.I(new qww(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // defpackage.qwu
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) oba.I(new qwx(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // defpackage.qwu
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) oba.I(new qwy(this.b, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // defpackage.qwu
    public void init(qvf qvfVar) {
        SharedPreferences sharedPreferences;
        Context context = (Context) qve.b(qvfVar);
        if (this.a) {
            return;
        }
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
            synchronized (SharedPreferences.class) {
                if (qxa.a == null) {
                    qxa.a = (SharedPreferences) oba.I(new qwz(createPackageContext));
                }
                sharedPreferences = qxa.a;
            }
            this.b = sharedPreferences;
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
