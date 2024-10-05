package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vxv implements Comparable {
    public final int a;
    public boolean b;

    /* JADX INFO: Access modifiers changed from: protected */
    public vxv(int i) {
        this.a = i;
    }

    public abstract int a();

    public abstract void b();

    public abstract void c(Exception exc);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((vxv) obj).a - this.a;
    }

    public abstract int d();

    public abstract void e(int i, Bitmap bitmap);

    public abstract boolean f(int i);
}
