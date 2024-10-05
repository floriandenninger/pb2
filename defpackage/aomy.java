package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomy implements Comparable {
    public final Field a;
    public final aonb b;
    public final Class c;
    public final int d;
    public final Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final aope i;
    public final Class j;
    public final Object k;
    public final aons l;

    public aomy(Field field, int i, aonb aonbVar, Class cls, Field field2, int i2, boolean z, boolean z2, aope aopeVar, Class cls2, Object obj, aons aonsVar) {
        this.a = field;
        this.b = aonbVar;
        this.c = cls;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = aopeVar;
        this.j = cls2;
        this.k = obj;
        this.l = aonsVar;
    }

    public static aomy a(int i, aonb aonbVar, aope aopeVar, Class cls, boolean z, aons aonsVar) {
        b(i);
        aonz.i(aonbVar, "fieldType");
        aonz.i(aopeVar, "oneof");
        aonz.i(cls, "oneofStoredType");
        if (aonbVar.aa != aona.SCALAR) {
            String valueOf = String.valueOf(aonbVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
            sb.append("Oneof is only supported for scalar fields. Field ");
            sb.append(i);
            sb.append(" is of type ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return new aomy(null, i, aonbVar, null, null, 0, false, z, aopeVar, cls, null, aonsVar);
    }

    public static void b(int i) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("fieldNumber must be positive: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean c(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.d - ((aomy) obj).d;
    }
}
