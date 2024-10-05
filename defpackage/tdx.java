package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class tdx {
    public boolean a;
    public long b;
    protected long c = -1;
    protected final long d = System.currentTimeMillis();
    protected final teh e;
    protected tdy f;
    public Rect g;
    private WeakReference h;

    public tdx(teh tehVar) {
        this.e = tehVar;
    }

    public final View a() {
        return (View) this.h.get();
    }

    public final Boolean b() {
        return Boolean.valueOf(this.a);
    }

    public final Map c() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(tdu.SDK, "a");
        linkedHashMap.put(tdu.SCREEN_SHARE_BUCKETS, this.e.f.i(1, false));
        linkedHashMap.put(tdu.TIMESTAMP, Long.valueOf(this.d));
        tdu tduVar = tdu.COVERAGE;
        tdy tdyVar = this.f;
        linkedHashMap.put(tduVar, Double.valueOf(tdyVar != null ? tdyVar.a : 0.0d));
        tdu tduVar2 = tdu.SCREEN_SHARE;
        tdy tdyVar2 = this.f;
        linkedHashMap.put(tduVar2, Double.valueOf(tdyVar2 != null ? tdyVar2.b : 0.0d));
        tdu tduVar3 = tdu.POSITION;
        tdy tdyVar3 = this.f;
        linkedHashMap.put(tduVar3, (tdyVar3 == null || (rect4 = tdyVar3.c) == null) ? new Integer[]{0, 0, 0, 0} : new Integer[]{Integer.valueOf(rect4.top), Integer.valueOf(this.f.c.left), Integer.valueOf(this.f.c.bottom), Integer.valueOf(this.f.c.right)});
        tdy tdyVar4 = this.f;
        if (tdyVar4 != null && (rect3 = tdyVar4.d) != null && !rect3.equals(tdyVar4.c)) {
            linkedHashMap.put(tdu.CONTAINER_POSITION, new Integer[]{Integer.valueOf(this.f.d.top), Integer.valueOf(this.f.d.left), Integer.valueOf(this.f.d.bottom), Integer.valueOf(this.f.d.right)});
        }
        tdu tduVar4 = tdu.VIEWPORT_SIZE;
        tdy tdyVar5 = this.f;
        linkedHashMap.put(tduVar4, (tdyVar5 == null || (rect2 = tdyVar5.e) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect2.width()), Integer.valueOf(this.f.e.height())});
        tdu tduVar5 = tdu.SCREEN_SIZE;
        tdy tdyVar6 = this.f;
        linkedHashMap.put(tduVar5, (tdyVar6 == null || (rect = tdyVar6.f) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect.width()), Integer.valueOf(this.f.f.height())});
        linkedHashMap.put(tdu.MIN_COVERAGE, Double.valueOf(this.e.a));
        linkedHashMap.put(tdu.MAX_COVERAGE, Double.valueOf(this.e.b));
        linkedHashMap.put(tdu.TOS, this.e.e.i(1, false));
        linkedHashMap.put(tdu.MAX_CONSECUTIVE_TOS, this.e.d());
        return linkedHashMap;
    }

    public void d(View view) {
        this.h = new WeakReference(view);
    }

    public final void e(int i, int i2, int i3, int i4) {
        this.g = new Rect(i, i2, i3 + i, i4 + i2);
    }

    public boolean f() {
        return false;
    }

    public final boolean g() {
        return this.e.c();
    }

    public boolean h() {
        return this.a;
    }
}
