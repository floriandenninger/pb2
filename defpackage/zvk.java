package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObservable;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvk extends DataSetObservable {
    private String A;
    private View B;
    private String C;
    private ValueAnimator D;
    private ValueAnimator E;
    private final int F;
    public final float a;
    public final int b;
    public String c;
    public zva d;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public String g;
    public HorizontalScrollView h;
    public zoo i;
    public ztf j;
    public boolean k;
    boolean l;
    public int m;
    public zvj n;
    public zxn o;
    private final Context p;
    private final float q;
    private final float r;
    private final int s;
    private final int t;
    private final int u;
    private final float v;
    private final int w;
    private final Map x;
    private final Map y;
    private final Map z;

    public zvk(Context context, int i) {
        context.getClass();
        this.p = context;
        this.F = i;
        this.x = new TreeMap();
        this.y = new TreeMap();
        this.z = new TreeMap();
        this.c = "NORMAL";
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.b = displayMetrics.widthPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_selected_alpha_value, typedValue, true);
        this.q = typedValue.getFloat();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_unselected_alpha_value, typedValue2, true);
        this.r = typedValue2.getFloat();
        if (i == R.layout.choose_filter_list_item_camera || i == R.layout.choose_filter_list_item_camera_preset || i == R.layout.choose_filter_list_item_shorts_camera_preset) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_selected_thumbnail_size);
            this.s = dimensionPixelSize;
            this.t = dimensionPixelSize;
            this.a = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_unselected_thumbnail_size) / dimensionPixelSize;
            this.u = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_first_last_item_margin);
            this.v = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_item_outline_width);
            if (i == R.layout.choose_filter_list_item_shorts_camera_preset) {
                this.w = wbs.W(context, R.attr.ytTextPrimary).orElse(0);
                return;
            } else {
                this.w = wbs.W(context, R.attr.ytOverlayTextPrimary).orElse(0);
                return;
            }
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_selected_thumbnail_size);
        this.s = dimensionPixelSize2;
        this.t = dimensionPixelSize2;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_unselected_thumbnail_size) / dimensionPixelSize2;
        this.u = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_first_last_item_margin);
        this.v = 0.0f;
        this.w = 0;
    }

    private final void A(View view, TextureView textureView, View view2, String str, boolean z) {
        x(view, str);
        if (!amkq.b(str, this.C) || !z) {
            o(textureView, view2, this.a, 0.0f);
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.setDuration(225L);
        this.E.addUpdateListener(v(textureView, view2, true));
        this.E.start();
    }

    private final boolean B(String str) {
        return C() && t(str);
    }

    private final boolean C() {
        ztf ztfVar = this.j;
        if (ztfVar != null) {
            return ((ztk) ztfVar).f;
        }
        return true;
    }

    private final ValueAnimator.AnimatorUpdateListener v(final TextureView textureView, final View view, final boolean z) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: zvc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zvk zvkVar = zvk.this;
                boolean z2 = z;
                TextureView textureView2 = textureView;
                View view2 = view;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z2) {
                    floatValue = 1.0f - floatValue;
                }
                float f = zvkVar.a;
                zvkVar.o(textureView2, view2, f + ((1.0f - f) * floatValue), floatValue);
            }
        };
    }

    private final void w() {
        if (r() && this.B != null && C()) {
            this.B.setVisibility(true != u() ? 8 : 0);
        }
    }

    private final void x(View view, String str) {
        if (!str.equals(((FilterMapTable$FilterDescriptor) this.e.get(0)).a)) {
            if (!str.equals(((FilterMapTable$FilterDescriptor) this.e.get(r0.size() - 1)).a)) {
                return;
            }
        }
        zhh[] zhhVarArr = new zhh[2];
        zhhVarArr[0] = yny.o(str.equals(((FilterMapTable$FilterDescriptor) this.e.get(0)).a) ? this.u : 0);
        List list = this.e;
        zhhVarArr[1] = yny.u(str.equals(((FilterMapTable$FilterDescriptor) list.get(list.size() + (-1))).a) ? this.u : 0);
        yny.z(view, yny.h(zhhVarArr), ViewGroup.MarginLayoutParams.class);
    }

    private final void y(String str) {
        if (!r()) {
            this.A = str;
            return;
        }
        this.A = null;
        str.getClass();
        View c = c(str);
        if (c != null && zev.e(c.getContext())) {
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, str);
            String c2 = a != null ? a.c(c.getContext()) : null;
            if (c2 == null) {
                c2 = "";
            }
            zev.c(c.getContext(), c, c.getContext().getString(true != str.equals(this.c) ? R.string.accessibility_filter_view_unselected : R.string.accessibility_filter_view_selected, c2));
        }
        m();
        notifyChanged();
    }

    private final void z(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setAlpha(this.q);
            } else {
                view.setAlpha(this.r);
            }
        }
    }

    final int a() {
        for (int i = 0; i < this.e.size(); i++) {
            if (((FilterMapTable$FilterDescriptor) this.e.get(i)).a.equals(this.c)) {
                return i;
            }
        }
        return 0;
    }

    public final TextureView b(String str) {
        return (TextureView) this.x.get(str);
    }

    public final View c(String str) {
        return (View) this.z.get(str);
    }

    public final anhy d() {
        zoo zooVar = this.i;
        if (zooVar != null) {
            final zoy zoyVar = (zoy) zooVar;
            return anfq.h(zoyVar.d(), new amml() { // from class: zov
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    zoy zoyVar2 = zoy.this;
                    Map map = (Map) obj;
                    int i = 0;
                    if (map == null) {
                        zga.b("Unexpected null map");
                        return 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : zoyVar2.a) {
                        if (!map.containsKey(zoy.e(filterMapTable$FilterDescriptor.a))) {
                            arrayList.add(filterMapTable$FilterDescriptor.a);
                            i++;
                            filterMapTable$FilterDescriptor.f = new dsm(1);
                        }
                    }
                    zoyVar2.b.b(new tni(arrayList, 7), angq.a);
                    return Integer.valueOf(i);
                }
            }, angq.a);
        }
        if (this.j != null) {
            HashMap hashMap = new HashMap();
            for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : this.e) {
                if (!filterMapTable$FilterDescriptor.g()) {
                    hashMap.put(filterMapTable$FilterDescriptor.a, 1);
                }
            }
            this.j.d(hashMap);
            return anaf.O(Integer.valueOf(hashMap.size()));
        }
        zga.b("FilterList.setUnvisitedEffectsBrowsed failed");
        return anaf.O(0);
    }

    public final String e(int i) {
        return ((FilterMapTable$FilterDescriptor) this.e.get(i)).a;
    }

    public final String f() {
        return ((FilterMapTable$FilterDescriptor) this.e.get(a())).c(this.p);
    }

    public final void g(List list, ViewGroup viewGroup, final HorizontalScrollView horizontalScrollView, boolean z, boolean z2) {
        this.p.getClass();
        amkq.N(this.e.isEmpty());
        List list2 = this.e;
        list.getClass();
        list2.addAll(list);
        viewGroup.getClass();
        this.h = horizontalScrollView;
        LayoutInflater layoutInflater = (LayoutInflater) this.p.getSystemService("layout_inflater");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) it.next();
            View inflate = layoutInflater.inflate(this.F, viewGroup, false);
            String c = filterMapTable$FilterDescriptor.c(layoutInflater.getContext());
            if (c != null) {
                inflate.setContentDescription(c);
                TextView textView = (TextView) inflate.findViewById(R.id.filter_text);
                if (textView != null) {
                    textView.setText(c);
                }
            }
            inflate.setOnClickListener(new View.OnClickListener() { // from class: zvd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hkz hkzVar;
                    jqr jqrVar;
                    acsc acscVar;
                    zvk zvkVar = zvk.this;
                    String str = filterMapTable$FilterDescriptor.a;
                    zvkVar.i(str);
                    if (str != null) {
                        zvj zvjVar = zvkVar.n;
                        if (zvjVar != null && (jqrVar = (hkzVar = (hkz) zvjVar).l) != null && (acscVar = hkzVar.i) != null) {
                            hfq a = jqrVar.a(acscVar);
                            aone createBuilder = asht.a.createBuilder();
                            aone createBuilder2 = asir.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asir asirVar = (asir) createBuilder2.instance;
                            asirVar.b |= 1;
                            asirVar.c = str;
                            createBuilder.copyOnWrite();
                            asht ashtVar = (asht) createBuilder.instance;
                            asir asirVar2 = (asir) createBuilder2.build();
                            asirVar2.getClass();
                            ashtVar.g = asirVar2;
                            ashtVar.b |= 8;
                            a.a = (asht) createBuilder.build();
                            a.b();
                        }
                        zxn zxnVar = zvkVar.o;
                        if (zxnVar != null) {
                            zxnVar.a(str);
                        }
                    }
                    zva zvaVar = zvkVar.d;
                    if (zvaVar != null) {
                        zvaVar.g();
                    }
                }
            });
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            i = Math.max(i, inflate.getMeasuredHeight());
            TextureView textureView = (TextureView) inflate.findViewById(R.id.filter_thumbnail);
            this.x.put(filterMapTable$FilterDescriptor.a, textureView);
            if (this.j != null) {
                hashMap.put(filterMapTable$FilterDescriptor.a, new ztq(textureView, inflate.findViewById(R.id.filter_thumbnail_background)));
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.new_content_dot);
            if (z && !filterMapTable$FilterDescriptor.i()) {
                imageView.setVisibility(0);
            }
            if (z2) {
                inflate.findViewById(R.id.filter_thumbnail_spinner).setVisibility(0);
            }
            this.y.put(filterMapTable$FilterDescriptor.a, imageView);
            this.z.put(filterMapTable$FilterDescriptor.a, inflate);
            viewGroup.addView(inflate);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            ((ViewGroup) inflate).setLayoutTransition(layoutTransition);
        }
        ztf ztfVar = this.j;
        if (ztfVar != null) {
            synchronized (((ztk) ztfVar).d) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    ztq ztqVar = (ztq) entry.getValue();
                    if (str != null && ztqVar != null) {
                        ztq ztqVar2 = (ztq) ((ztk) ztfVar).d.get(str);
                        if (!amkq.b(ztqVar2, ztqVar)) {
                            if (ztqVar2 != null) {
                                ztqVar2.a.setSurfaceTextureListener(null);
                            }
                            ((ztk) ztfVar).d.put(str, ztqVar);
                            final ztk ztkVar = (ztk) ztfVar;
                            ztqVar.a.setSurfaceTextureListener(new zts(str, ((ztk) ztfVar).d, ((ztk) ztfVar).e, new zfi() { // from class: ztg
                                @Override // defpackage.zfi
                                public final void a(Object obj) {
                                    ztk.this.i(amru.r((String) obj));
                                }
                            }));
                        }
                        arrayList.add(str);
                    }
                    String valueOf = String.valueOf(ztqVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                    sb.append("Unexpected requestThumbnail(");
                    sb.append(str);
                    sb.append(",  ");
                    sb.append(valueOf);
                    sb.append(")");
                    zga.d(sb.toString(), new Exception());
                }
                ((ztk) ztfVar).i(arrayList);
            }
        }
        this.m = i;
        yny.z(horizontalScrollView, yny.n(i), ViewGroup.LayoutParams.class);
        p();
        ztf ztfVar2 = this.j;
        if (ztfVar2 != null) {
            this.f.add(ztfVar2.b(new zte() { // from class: zvf
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    horizontalScrollView.post(new zvg(zvk.this, 0));
                }
            }));
            this.f.add(this.j.a(new zsn() { // from class: zve
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    zvk.this.n(((FilterMapTable$FilterDescriptor) obj).a);
                }
            }));
        }
        registerObserver(new zvh(this, horizontalScrollView));
        horizontalScrollView.post(new zvg(this, 1));
        horizontalScrollView.postDelayed(new zvg(this, 0), 1000L);
    }

    public final void h(String str) {
        View c = c(str);
        if (c != null) {
            c.getViewTreeObserver().addOnGlobalLayoutListener(new zvi(this, c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str) {
        String str2 = this.g;
        if (str2 == null) {
            str2 = "NORMAL";
        }
        if (true != B(str)) {
            str2 = str;
        }
        this.c = str2;
        y(str);
        ztf ztfVar = this.j;
        if (ztfVar != null) {
            ztfVar.c(this.c);
        }
        h(str);
        this.k = false;
    }

    public final void j() {
        int i;
        boolean s = s();
        int size = this.e.size();
        int a = a();
        if (s) {
            i = (a + 1) % size;
        } else {
            i = ((a + size) - 1) % size;
        }
        i(e(i));
        this.k = true;
    }

    public final void k() {
        int i;
        boolean s = s();
        int size = this.e.size();
        int a = a();
        if (s) {
            i = ((a + size) - 1) % size;
        } else {
            i = (a + 1) % size;
        }
        i(e(i));
        this.k = true;
    }

    public final void l(View view) {
        this.B = view;
        w();
    }

    public final void m() {
        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, this.c);
        if (a == null) {
            String valueOf = String.valueOf(this.c);
            zga.c("FilterList", valueOf.length() != 0 ? "setSelectedEffectPreviewed Filter not found: ".concat(valueOf) : new String("setSelectedEffectPreviewed Filter not found: "));
            return;
        }
        if (a.b || a.i()) {
            return;
        }
        zoo zooVar = this.i;
        if (zooVar != null) {
            zooVar.a(this.c);
        } else {
            ztf ztfVar = this.j;
            if (ztfVar != null) {
                ((ztk) ztfVar).d(amrz.k(this.c, 2));
            } else {
                String valueOf2 = String.valueOf(this.c);
                zga.b(valueOf2.length() != 0 ? "FilterList.setSelectedEffectPreviewed failed to set effect previewed: ".concat(valueOf2) : new String("FilterList.setSelectedEffectPreviewed failed to set effect previewed: "));
                return;
            }
        }
        ((ImageView) this.y.get(a.a)).setVisibility(8);
        View c = c(a.a);
        Context context = c.getContext();
        if (zev.e(context)) {
            zev.c(context, c, context.getString(R.string.a11y_new_effect_indicator));
        }
    }

    public final void n(String str) {
        if (!t(str)) {
            i(str);
        } else {
            notifyChanged();
        }
    }

    public final void o(TextureView textureView, View view, float f, float f2) {
        yny.B((FrameLayout) textureView.getParent(), Math.round(this.t * f), Math.round(this.s * f));
        if (view != null) {
            int round = Math.round(this.v * f2);
            if (round > 0) {
                view.setVisibility(0);
                ((GradientDrawable) view.getBackground()).setStroke(round, this.w);
            } else {
                view.setVisibility(8);
            }
        }
        RectF rectF = new RectF(0.0f, 0.0f, this.t, this.s);
        float f3 = (1.0f - f) / 2.0f;
        float f4 = this.t;
        float f5 = this.s;
        float f6 = 1.0f - f3;
        RectF rectF2 = new RectF(f4 * f3, f3 * f5, f4 * f6, f5 * f6);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        textureView.setTransform(matrix);
        textureView.invalidate();
    }

    public final void p() {
        boolean h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            String str = ((FilterMapTable$FilterDescriptor) it.next()).a;
            TextureView b = b(str);
            View c = c(str);
            View findViewById = c.findViewById(R.id.filter_thumbnail_border);
            View findViewById2 = c.findViewById(R.id.filter_text);
            String str2 = this.g;
            if (str2 != null) {
                h = str.equalsIgnoreCase(str2);
            } else {
                h = FilterMapTable$FilterDescriptor.h(str);
            }
            if (h) {
                A(c, b, findViewById, str, false);
                z(findViewById2, B(str));
            } else if (B(str)) {
                x(c, str);
                z(findViewById2, true);
                if (!amkq.b(this.C, str)) {
                    ValueAnimator valueAnimator = this.D;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.D = ofFloat;
                    ofFloat.setDuration(225L);
                    this.D.addUpdateListener(v(b, findViewById, false));
                    this.D.start();
                }
            } else {
                z(findViewById2, false);
                A(c, b, findViewById, str, true);
            }
        }
        this.C = C() ? this.c : null;
        String str3 = this.A;
        if (str3 != null) {
            y(str3);
        }
        w();
        m();
    }

    public final boolean q() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (!((FilterMapTable$FilterDescriptor) it.next()).g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return !this.e.isEmpty();
    }

    final boolean s() {
        return this.p.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final boolean t(String str) {
        return FilterMapTable$FilterDescriptor.e(this.c, str);
    }

    public final boolean u() {
        if (!this.l) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                if (((FilterMapTable$FilterDescriptor) it.next()).b) {
                    FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, this.c);
                    if (a != null) {
                        return a.b;
                    }
                    amkq.N(false);
                    return false;
                }
            }
            this.l = true;
        }
        return false;
    }
}
