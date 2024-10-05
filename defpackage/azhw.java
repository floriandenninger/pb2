package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhw extends aypy {
    final Object[] a;

    public azhw(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        azhv azhvVar = new azhv(ayqdVar, this.a);
        ayqdVar.se(azhvVar);
        if (azhvVar.d) {
            return;
        }
        Object[] objArr = azhvVar.b;
        int length = objArr.length;
        for (int i = 0; i < length && !azhvVar.e; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                azhvVar.a.c(obj);
            } else {
                ayqd ayqdVar2 = azhvVar.a;
                StringBuilder sb = new StringBuilder(40);
                sb.append("The element at index ");
                sb.append(i);
                sb.append(" is null");
                ayqdVar2.b(new NullPointerException(sb.toString()));
                return;
            }
        }
        if (azhvVar.e) {
            return;
        }
        azhvVar.a.sh();
    }
}
