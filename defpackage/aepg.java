package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aepg {
    public final byte[] a;
    public final List b;
    public final String c;
    public final int d;

    public aepg(int i, String str, List list, byte[] bArr) {
        this.d = i;
        this.c = str;
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.a = bArr;
    }

    public aepg(String str, byte[] bArr, List list, String str2, int i) {
        zhq.m(str);
        this.a = (byte[]) afki.a(bArr);
        this.b = list;
        zhq.m(str2);
        this.c = str2;
        this.d = i;
    }
}
