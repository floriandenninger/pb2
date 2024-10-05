package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamt implements Comparable {
    final bajh a;
    final int b;
    final String c;
    final Locale d;

    public bamt(bajh bajhVar, int i) {
        this.a = bajhVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }

    public bamt(bajh bajhVar, String str, Locale locale) {
        this.a = bajhVar;
        this.b = 0;
        this.c = str;
        this.d = locale;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bamt bamtVar) {
        bajh bajhVar = bamtVar.a;
        int a = bamv.a(this.a.r(), bajhVar.r());
        return a != 0 ? a : bamv.a(this.a.p(), bajhVar.p());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b(long j, boolean z) {
        String str = this.c;
        long h = str == null ? this.a.h(j, this.b) : this.a.i(j, str, this.d);
        return z ? this.a.g(h) : h;
    }
}
