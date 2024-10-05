package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayse implements ayrv {
    final ayro a;

    public ayse(ayro ayroVar) {
        this.a = ayroVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 2) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 2 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return this.a.a(objArr[0], objArr[1]);
    }
}
