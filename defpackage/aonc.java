package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aonc extends aolr implements RandomAccess, aont, aopg {
    public static final aonc b;
    private float[] c;
    private int d;

    static {
        aonc aoncVar = new aonc(new float[0], 0);
        b = aoncVar;
        aoncVar.b();
    }

    public aonc() {
        this(new float[10], 0);
    }

    private final String i(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void j(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        sb();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        float[] fArr = this.c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = floatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aolr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        sb();
        aonz.h(collection);
        if (!(collection instanceof aonc)) {
            return super.addAll(collection);
        }
        aonc aoncVar = (aonc) collection;
        int i = aoncVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.c;
            if (i3 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(aoncVar.c, 0, this.c, this.d, aoncVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aont
    public final float d(int i) {
        j(i);
        return this.c[i];
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aonc)) {
            return super.equals(obj);
        }
        aonc aoncVar = (aonc) obj;
        if (this.d != aoncVar.d) {
            return false;
        }
        float[] fArr = aoncVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aont
    public final float f(int i, float f) {
        sb();
        j(i);
        float[] fArr = this.c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // defpackage.aony
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aont e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new aonc(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.aont
    public final void h(float f) {
        sb();
        int i = this.d;
        float[] fArr = this.c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.c = fArr2;
        }
        float[] fArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        sb();
        j(i);
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        sb();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Float.valueOf(f(i, ((Float) obj).floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aonc(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
