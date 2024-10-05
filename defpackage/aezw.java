package defpackage;

import android.accounts.Account;
import j$.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aezw implements IntFunction {
    private final /* synthetic */ int e;
    public static final /* synthetic */ aezw d = new aezw(3);
    public static final /* synthetic */ aezw c = new aezw(2);
    public static final /* synthetic */ aezw b = new aezw(1);
    public static final /* synthetic */ aezw a = new aezw(0);

    private /* synthetic */ aezw(int i) {
        this.e = i;
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return new pms[i];
        }
        if (i2 != 1) {
            return i2 != 2 ? new pms[i] : new pms[i];
        }
        return new Account[i];
    }
}
