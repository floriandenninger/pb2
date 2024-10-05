package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rse {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    /* JADX INFO: Access modifiers changed from: protected */
    public rse(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static rse c(String str) {
        return new rsc(str, false);
    }

    public abstract Object a();
}
