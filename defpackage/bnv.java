package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ bof b;

    public bnv(bof bofVar, boolean z) {
        this.b = bofVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        this.b.i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bof bofVar = this.b;
        if (bofVar.P) {
            bofVar.Q = true;
            return;
        }
        boolean z = this.a;
        int g = bof.g(bofVar.l);
        bof.n(bofVar.l, -1);
        bofVar.s(bofVar.t());
        View decorView = bofVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(bofVar.getWindow().getAttributes().width, 1073741824), 0);
        bof.n(bofVar.l, g);
        if (bofVar.f == null && (bofVar.j.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) bofVar.j.getDrawable()).getBitmap()) != null) {
            i = bofVar.f(bitmap.getWidth(), bitmap.getHeight());
            bofVar.j.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            i = 0;
        }
        int h = bofVar.h(bofVar.t());
        int size = bofVar.q.size();
        int size2 = bofVar.v() ? bofVar.y * bofVar.d.d().size() : 0;
        if (size > 0) {
            size2 += bofVar.A;
        }
        int min = Math.min(size2, bofVar.z);
        if (true != bofVar.O) {
            min = 0;
        }
        int max = Math.max(i, min) + h;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (bofVar.h.getMeasuredHeight() - bofVar.i.getMeasuredHeight());
        if (bofVar.f != null || i <= 0 || max > height) {
            if (bof.g(bofVar.o) + bofVar.l.getMeasuredHeight() >= bofVar.i.getMeasuredHeight()) {
                bofVar.j.setVisibility(8);
            }
            max = min + h;
            i = 0;
        } else {
            bofVar.j.setVisibility(0);
            bof.n(bofVar.j, i);
        }
        if (!bofVar.t() || max > height) {
            bofVar.m.setVisibility(8);
        } else {
            bofVar.m.setVisibility(0);
        }
        bofVar.s(bofVar.m.getVisibility() == 0);
        int h2 = bofVar.h(bofVar.m.getVisibility() == 0);
        int max2 = Math.max(i, min) + h2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        bofVar.l.clearAnimation();
        bofVar.o.clearAnimation();
        bofVar.i.clearAnimation();
        if (z) {
            bofVar.i(bofVar.l, h2);
            bofVar.i(bofVar.o, min);
            bofVar.i(bofVar.i, height);
        } else {
            bof.n(bofVar.l, h2);
            bof.n(bofVar.o, min);
            bof.n(bofVar.i, height);
        }
        bof.n(bofVar.g, rect.height());
        List d = bofVar.d.d();
        if (d.isEmpty()) {
            bofVar.q.clear();
            bofVar.p.notifyDataSetChanged();
            return;
        }
        if (new HashSet(bofVar.q).equals(new HashSet(d))) {
            bofVar.p.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = bofVar.o;
            boe boeVar = bofVar.p;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = boeVar.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = bofVar.e;
            OverlayListView overlayListView2 = bofVar.o;
            boe boeVar2 = bofVar.p;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = boeVar2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        List list = bofVar.q;
        HashSet hashSet = new HashSet(d);
        hashSet.removeAll(list);
        bofVar.r = hashSet;
        HashSet hashSet2 = new HashSet(bofVar.q);
        hashSet2.removeAll(d);
        bofVar.s = hashSet2;
        bofVar.q.addAll(0, bofVar.r);
        bofVar.q.removeAll(bofVar.s);
        bofVar.p.notifyDataSetChanged();
        if (z && bofVar.O && bofVar.r.size() + bofVar.s.size() > 0) {
            bofVar.o.setEnabled(false);
            bofVar.o.requestLayout();
            bofVar.P = true;
            bofVar.o.getViewTreeObserver().addOnGlobalLayoutListener(new bnx(bofVar, hashMap, hashMap2));
        } else {
            bofVar.r = null;
            bofVar.s = null;
        }
    }
}
