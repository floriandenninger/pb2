package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aysg implements ayrv {
    final ayru a;

    public aysg(ayru ayruVar) {
        this.a = ayruVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 4) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 4 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
    }
}
