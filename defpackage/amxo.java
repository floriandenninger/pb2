package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxo extends amyt {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(amyc amycVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(amycVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.amyt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.amyt
    public final amyc c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (amyc) this.a[i + i];
    }

    @Override // defpackage.amyt
    public final Object d(amyc amycVar) {
        int a = a(amycVar);
        if (a != -1) {
            return amycVar.d(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.amyt
    public final Object e(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[i + i + 1];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
