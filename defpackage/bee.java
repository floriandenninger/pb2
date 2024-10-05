package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bee extends asn implements plg {
    public static final bee x = new bef().b();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseArray f148J;
    public final SparseBooleanArray K;
    public final int y;
    public final boolean z;

    public bee(bef befVar) {
        super(befVar);
        this.z = befVar.q;
        this.A = false;
        this.B = befVar.r;
        this.C = befVar.s;
        this.D = false;
        this.E = false;
        this.F = false;
        this.y = 0;
        this.G = befVar.t;
        this.H = false;
        this.I = befVar.u;
        this.f148J = befVar.v;
        this.K = befVar.w;
    }

    public static bee a(Context context) {
        return new bef(context).b();
    }

    public final boolean b(int i) {
        return this.K.get(i);
    }

    @Override // defpackage.asn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bee beeVar = (bee) obj;
            if (super.equals(beeVar) && this.z == beeVar.z && this.B == beeVar.B && this.C == beeVar.C && this.G == beeVar.G && this.I == beeVar.I) {
                SparseBooleanArray sparseBooleanArray = this.K;
                SparseBooleanArray sparseBooleanArray2 = beeVar.K;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.f148J;
                            SparseArray sparseArray2 = beeVar.f148J;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                asj asjVar = (asj) entry.getKey();
                                                if (map2.containsKey(asjVar) && pts.R(entry.getValue(), map2.get(asjVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.asn
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.z ? 1 : 0)) * 961) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 28629151) + (this.G ? 1 : 0)) * 961) + (this.I ? 1 : 0);
    }
}
