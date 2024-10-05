package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiz implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ aiy c;
    final /* synthetic */ int d;

    public aiz(String str, Context context, aiy aiyVar, int i) {
        this.a = str;
        this.b = context;
        this.c = aiyVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return aje.a(this.a, this.b, this.c, this.d);
    }
}
