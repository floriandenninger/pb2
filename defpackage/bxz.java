package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bxz {
    private DataSetObserver a;
    public final DataSetObservable b = new DataSetObservable();

    public Parcelable a() {
        return null;
    }

    public Object c(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void d(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public void e(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void f(ViewGroup viewGroup) {
    }

    public abstract boolean g(View view, Object obj);

    public void h() {
    }

    public void i(ViewGroup viewGroup, Object obj) {
    }

    public abstract int j();

    public int k(Object obj) {
        return -1;
    }

    public CharSequence l(int i) {
        return null;
    }

    public final void m() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.a;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.b.notifyChanged();
    }

    public final void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.a = dataSetObserver;
        }
    }
}
