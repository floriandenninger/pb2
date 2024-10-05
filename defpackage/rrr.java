package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrr extends qsg {
    public final Context a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public rrr(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar, int i) {
        super(context, looper, 4, qrzVar, qodVar, qoeVar);
        this.a = context;
        this.b = i;
        Account account = qrzVar.a;
        this.c = account != null ? account.name : null;
        this.d = 1;
        this.e = true;
    }

    public static Bundle k(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString(qde.b, str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // defpackage.qrx
    public final boolean L() {
        return true;
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof rro) {
            return (rro) queryLocalInterface;
        }
        return new rro(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rqy.h;
    }
}
