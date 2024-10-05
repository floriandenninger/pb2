package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxv implements Comparable {
    final afsx a;
    final String b;
    final String c;
    final long d;
    final String e;
    final int f;

    public akxv(afsx afsxVar, String str, String str2, long j, String str3) {
        this(afsxVar, str, str2, j, str3, 0);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.d > ((akxv) obj).d ? 1 : (this.d == ((akxv) obj).d ? 0 : -1));
    }

    public akxv(afsx afsxVar, String str, String str2, long j, String str3, int i) {
        boolean z = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            z = false;
        }
        amkq.E(z);
        this.a = afsxVar;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = i;
    }
}
