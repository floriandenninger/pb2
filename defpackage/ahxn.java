package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahxn extends aive implements ahxi {
    private final SparseArray a;
    private final SparseArray b;
    private float c;
    private float d;
    private int e;
    private int f;
    private SubtitlesStyle g;

    public ahxn(Context context) {
        super(context);
        this.e = 0;
        this.f = 0;
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = 1.0f;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.medium_font_size);
        int i = ahbj.G()[2];
        int i2 = i - 16777217;
        if (i == 0) {
            throw null;
        }
        int i3 = ahbj.G()[0];
        int i4 = i3 - 16777217;
        if (i3 == 0) {
            throw null;
        }
        int i5 = ahbj.G()[2];
        int i6 = i5 - 16777217;
        if (i5 == 0) {
            throw null;
        }
        int i7 = new int[]{1, 2, 3, 4, 5}[0];
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        int i9 = ahbj.G()[1];
        int i10 = i9 - 16777217;
        if (i9 == 0) {
            throw null;
        }
        this.g = new SubtitlesStyle(i2, i4, i6, i8, i10, aiuw.values()[3].i);
        f();
    }

    private final void d(SubtitleWindowView subtitleWindowView) {
        float f = this.d;
        if (Math.abs(subtitleWindowView.d - f) >= 0.01f) {
            subtitleWindowView.d = f;
            subtitleWindowView.b.f(f);
            Iterator it = subtitleWindowView.a.iterator();
            while (it.hasNext()) {
                ((aiuq) it.next()).f(f);
            }
        }
        int i = this.g.a;
        if (subtitleWindowView.h != i) {
            subtitleWindowView.h = i;
            Iterator it2 = subtitleWindowView.a.iterator();
            while (it2.hasNext()) {
                ((aiuq) it2.next()).setBackgroundColor(i);
            }
            subtitleWindowView.invalidate();
        }
        subtitleWindowView.setBackgroundColor(this.g.b);
        int i2 = this.g.e;
        if (subtitleWindowView.c != i2) {
            subtitleWindowView.c = i2;
            Iterator it3 = subtitleWindowView.a.iterator();
            while (it3.hasNext()) {
                ((aiuq) it3.next()).e(i2);
            }
            subtitleWindowView.invalidate();
        }
        Typeface a = aiuw.a(getContext(), this.g);
        if (!amkq.b(subtitleWindowView.e, a)) {
            subtitleWindowView.e = a;
            subtitleWindowView.b.g(a);
            Iterator it4 = subtitleWindowView.a.iterator();
            while (it4.hasNext()) {
                ((aiuq) it4.next()).g(a);
            }
            subtitleWindowView.invalidate();
            subtitleWindowView.requestLayout();
        }
        int i3 = this.g.c;
        if (subtitleWindowView.f != i3) {
            subtitleWindowView.f = i3;
            Iterator it5 = subtitleWindowView.a.iterator();
            while (it5.hasNext()) {
                ((aiuq) it5.next()).b(i3);
            }
            subtitleWindowView.invalidate();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.subtitles_overlay_padding);
        subtitleWindowView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int i4 = this.g.d;
        if (subtitleWindowView.g == i4) {
            return;
        }
        subtitleWindowView.g = i4;
        subtitleWindowView.b.c(i4);
        Iterator it6 = subtitleWindowView.a.iterator();
        while (it6.hasNext()) {
            ((aiuq) it6.next()).c(i4);
        }
        subtitleWindowView.invalidate();
        subtitleWindowView.requestLayout();
    }

    private final void e(int i, int i2) {
        Context context = getContext();
        float f = this.c;
        float min = (Math.min(i, i2) / context.getResources().getDisplayMetrics().scaledDensity) * 0.0625f;
        if (min < 13.0f) {
            min = 13.0f;
        }
        this.d = min * f;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            d((SubtitleWindowView) this.b.valueAt(i3));
        }
    }

    @Override // defpackage.ahxi
    public final void a() {
        removeAllViews();
        this.a.clear();
        this.b.clear();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahxi
    public final void f() {
        setVisibility(4);
    }

    @Override // defpackage.ahxi
    public final void g(float f) {
        this.c = f;
        e(getWidth(), getHeight());
    }

    @Override // defpackage.ahxi
    public final void h(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ahxi
    public final void i(SubtitlesStyle subtitlesStyle) {
        this.g = subtitlesStyle;
        e(getWidth(), getHeight());
    }

    @Override // defpackage.ahxi
    public final void j(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.a.size(); i++) {
            hashSet.add(Integer.valueOf(this.a.keyAt(i)));
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            SubtitleWindowSnapshot subtitleWindowSnapshot = (SubtitleWindowSnapshot) list.get(i2);
            hashSet.remove(Integer.valueOf(subtitleWindowSnapshot.a));
            SubtitleWindowView subtitleWindowView = (SubtitleWindowView) this.b.get(subtitleWindowSnapshot.a);
            if (!TextUtils.isEmpty(subtitleWindowSnapshot.d) && subtitleWindowSnapshot.c.e) {
                this.a.put(subtitleWindowSnapshot.a, subtitleWindowSnapshot);
                if (subtitleWindowView == null) {
                    CharSequence charSequence = subtitleWindowSnapshot.d;
                    SubtitleWindowView subtitleWindowView2 = new SubtitleWindowView(getContext());
                    d(subtitleWindowView2);
                    subtitleWindowView2.setTag(charSequence);
                    subtitleWindowView2.a(subtitleWindowSnapshot);
                    addView(subtitleWindowView2);
                    this.b.put(subtitleWindowSnapshot.a, subtitleWindowView2);
                } else {
                    if (!subtitleWindowSnapshot.d.equals(subtitleWindowView.getTag())) {
                        subtitleWindowView.setTag(subtitleWindowSnapshot.d);
                        subtitleWindowView.a(subtitleWindowSnapshot);
                    }
                    subtitleWindowView.setVisibility(0);
                }
            } else if (subtitleWindowView != null) {
                subtitleWindowView.setVisibility(8);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            removeView((View) this.b.get(intValue));
            this.a.remove(intValue);
            this.b.remove(intValue);
        }
        setVisibility(0);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r12 = r12 - r10
            int r13 = r13 - r11
            int r9 = r12 * 15
            int r9 = r9 / 100
            int r9 = r9 / 2
            int r10 = r13 * 15
            int r10 = r10 / 100
            int r10 = r10 / 2
            int r12 = r12 * 85
            int r12 = r12 / 100
            int r13 = r13 * 85
            int r13 = r13 / 100
            r11 = 0
            r0 = 0
        L18:
            android.util.SparseArray r1 = r8.a
            int r1 = r1.size()
            if (r0 >= r1) goto L8a
            android.util.SparseArray r1 = r8.b
            android.util.SparseArray r2 = r8.a
            int r2 = r2.keyAt(r0)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView r1 = (com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView) r1
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L87
            android.util.SparseArray r2 = r8.a
            java.lang.Object r2 = r2.valueAt(r0)
            com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot r2 = (com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot) r2
            int r3 = r1.getMeasuredWidth()
            int r4 = r1.getMeasuredHeight()
            com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings r2 = r2.c
            int r5 = r2.b
            int r6 = r2.c
            int r6 = r6 * r12
            int r6 = r6 / 100
            int r7 = r2.d
            int r7 = r7 * r13
            int r7 = r7 / 100
            boolean r2 = r2.f
            if (r2 == 0) goto L5a
        L58:
            r6 = 0
            goto L6c
        L5a:
            r2 = r5 & 1
            if (r2 == 0) goto L5f
            goto L6c
        L5f:
            r2 = r5 & 2
            if (r2 == 0) goto L67
            int r2 = r3 / 2
            int r6 = r6 - r2
            goto L6c
        L67:
            r2 = r5 & 4
            if (r2 == 0) goto L58
            int r6 = r6 - r3
        L6c:
            r2 = r5 & 8
            if (r2 == 0) goto L71
            goto L80
        L71:
            r2 = r5 & 16
            if (r2 == 0) goto L79
            int r2 = r4 / 2
            int r7 = r7 - r2
            goto L80
        L79:
            r2 = r5 & 32
            if (r2 == 0) goto L7f
            int r7 = r7 - r4
            goto L80
        L7f:
            r7 = 0
        L80:
            int r6 = r6 + r9
            int r7 = r7 + r10
            int r3 = r3 + r6
            int r4 = r4 + r7
            r1.layout(r6, r7, r3, r4)
        L87:
            int r0 = r0 + 1
            goto L18
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxn.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            r7.setMeasuredDimension(r8, r9)
            r7.e(r8, r9)
            r0 = 0
            r1 = 0
        L10:
            android.util.SparseArray r2 = r7.a
            int r2 = r2.size()
            if (r1 >= r2) goto L8e
            android.util.SparseArray r2 = r7.b
            android.util.SparseArray r3 = r7.a
            int r3 = r3.keyAt(r1)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView r2 = (com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView) r2
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L8b
            android.util.SparseArray r3 = r7.a
            java.lang.Object r3 = r3.valueAt(r1)
            com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot r3 = (com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot) r3
            com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings r3 = r3.c
            int r4 = r3.b
            int r5 = r3.c
            int r5 = r5 * r8
            int r5 = r5 / 100
            int r3 = r3.d
            int r3 = r3 * r9
            int r3 = r3 / 100
            r6 = r4 & 1
            if (r6 == 0) goto L4e
            int r5 = r8 - r5
            int r6 = r7.f
        L4c:
            int r5 = r5 - r6
            goto L67
        L4e:
            r6 = r4 & 2
            if (r6 == 0) goto L5f
            int r6 = r8 - r5
            int r5 = java.lang.Math.min(r5, r6)
            int r5 = r5 + r5
            int r6 = r7.e
            int r5 = r5 - r6
            int r6 = r7.f
            goto L4c
        L5f:
            r6 = r4 & 4
            if (r6 == 0) goto L66
            int r6 = r7.e
            goto L4c
        L66:
            r5 = 0
        L67:
            r6 = r4 & 8
            if (r6 == 0) goto L6e
            int r3 = r9 - r3
            goto L80
        L6e:
            r6 = r4 & 16
            if (r6 == 0) goto L7a
            int r4 = r9 - r3
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 + r3
            goto L80
        L7a:
            r4 = r4 & 32
            if (r4 == 0) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r2.measure(r4, r3)
        L8b:
            int r1 = r1 + 1
            goto L10
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxn.onMeasure(int, int):void");
    }
}
