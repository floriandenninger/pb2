package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pm {
    public final Object[] a;
    public int b;
    public int c;
    pm d;

    public pm(Class cls, int i) {
        this.a = (Object[]) Array.newInstance((Class<?>) cls, i);
    }
}
