package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ aiy c;
    final /* synthetic */ int d;

    public ajb(String str, Context context, aiy aiyVar, int i) {
        this.a = str;
        this.b = context;
        this.c = aiyVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ajd call() {
        try {
            return aje.a(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new ajd(-3);
        }
    }
}
