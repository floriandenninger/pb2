package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qww implements Callable {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ Integer c;

    public qww(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
