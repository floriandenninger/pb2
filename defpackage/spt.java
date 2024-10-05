package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class spt {
    public WeakReference a = new WeakReference(null);
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;
    public List g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View view) {
        this.a = new WeakReference(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return e() || b() || d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.g != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return (this.b == null && this.c == null && this.f == null) ? false : true;
    }
}
