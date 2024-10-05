package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class diy {
    public dji a;
    public final int b;
    public final Object[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public diy(dji djiVar) {
        this(djiVar, -1, null);
    }

    public diy(dji djiVar, int i, Object[] objArr) {
        this.a = djiVar;
        this.b = i;
        this.c = objArr;
    }

    public void a(Object obj) {
        this.a.l().K(this, obj);
    }

    public boolean b(diy diyVar) {
        if (this == diyVar) {
            return true;
        }
        if (diyVar == null || diyVar.getClass() != getClass() || this.b != diyVar.b) {
            return false;
        }
        Object[] objArr = this.c;
        Object[] objArr2 = diyVar.c;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int i = 1;
        while (true) {
            Object[] objArr3 = this.c;
            if (i >= objArr3.length) {
                return true;
            }
            Object obj = objArr3[i];
            Object obj2 = diyVar.c[i];
            if (obj == null) {
                if (obj2 != null) {
                    break;
                }
                i++;
            } else {
                if (!obj.equals(obj2)) {
                    break;
                }
                i++;
            }
        }
        return false;
    }
}
