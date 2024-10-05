package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksx extends aidv implements ahto {
    public final azrs a;
    public final ajut b;
    public final Context c;
    public Optional d;
    public float e;
    private final View i;
    private final fna j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final Rect o;
    private final Point p;
    private final ahtp q;
    private final int r;
    private final boolean s;
    private final boolean t;
    private Optional u;
    private boolean v;
    private View w;
    private View x;
    private View y;
    private boolean z;

    public ksx(ViewStub viewStub, View view, fna fnaVar, aiee aieeVar, ahtp ahtpVar, aidb aidbVar, kiz kizVar, aadw aadwVar, ajut ajutVar) {
        super(viewStub, aieeVar);
        this.i = view;
        this.j = fnaVar;
        this.q = ahtpVar;
        this.b = ajutVar;
        this.p = new Point();
        this.o = new Rect();
        this.a = azrh.e();
        this.c = view.getContext();
        this.u = Optional.empty();
        this.d = Optional.empty();
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).bD;
        this.s = z;
        asvu asvuVar2 = aadwVar.b().e;
        boolean z2 = (asvuVar2 == null ? asvu.a : asvuVar2).cG;
        this.t = z2;
        this.k = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_horizontal_margin);
        this.l = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_vertical_margin);
        this.m = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_vertical_margin_extended);
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        asvu asvuVar3 = aadwVar.b().e;
        this.n = yjk.K(displayMetrics, (asvuVar3 == null ? asvu.a : asvuVar3).ax);
        this.r = view.getResources().getDimensionPixelSize(R.dimen.inline_scrubbed_preview_vertical_dismiss_offset);
        aidbVar.a(new ksw(this));
        if (z) {
            kizVar.f.add(new ksu(this));
        }
        if (z2) {
            ahtpVar.g.b.y().n().X(new ksv(this));
        }
    }

    private static float j(float f, float f2) {
        return (f * Math.abs(f2 + 0.0f)) + 0.0f;
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void b(ahyo ahyoVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aidv
    public final aidx d() {
        Optional empty;
        ViewStub viewStub;
        if (this.g == null && (viewStub = this.f) != null) {
            this.g = (aidx) viewStub.inflate();
            this.f = null;
        }
        final aidx aidxVar = this.g;
        if (!this.v) {
            TextView textView = (TextView) aidxVar.findViewById(R.id.chapter_title);
            if (textView != null) {
                this.u = Optional.of(new yzr(textView, null));
                this.q.i(ahyo.CHAPTER, this);
            }
            if (this.t) {
                empty = Optional.ofNullable((TextView) aidxVar.findViewById(R.id.timed_decoration));
            } else {
                empty = Optional.empty();
            }
            empty.ifPresent(new Consumer() { // from class: kst
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    ksx.this.d = Optional.of(new yzr((TextView) obj, null));
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
            if (this.n > 0) {
                this.w = aidxVar.findViewById(R.id.thumbnail_container);
                this.y = aidxVar.findViewById(R.id.close_icon);
                this.x = aidxVar.findViewById(R.id.timestamp);
                View findViewById = aidxVar.findViewById(R.id.thumbnail);
                textView.setMaxWidth(findViewById.getLayoutParams().width + this.n);
                yny.z(textView, yny.x(-2), ViewGroup.LayoutParams.class);
                yny.z(aidxVar.findViewById(R.id.text_container), yny.x(-2), ViewGroup.LayoutParams.class);
                textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ksr
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ksx.this.f(aidxVar);
                    }
                });
                empty.ifPresent(new kon(findViewById, 2));
            }
            this.v = true;
        }
        return aidxVar;
    }

    public final void e() {
        if (this.u.isPresent()) {
            ((yzr) this.u.get()).a(this.z && !(this.d.isPresent() && ((yzr) this.d.get()).f()), false);
        }
    }

    @Override // defpackage.aidv
    public final void f(aidx aidxVar) {
        View view;
        TimelineMarker[] m;
        this.j.j(this.p);
        int width = aidxVar.getWidth() / 2;
        int i = this.k;
        int width2 = this.i.getWidth() - this.k;
        int i2 = this.p.y;
        int i3 = (this.t && (m = this.q.m(ahyo.HEATMAP_MARKER)) != null && m.length > 0) ? this.m : this.l;
        int max = Math.max(i + width, Math.min(this.p.x, width2 - width)) - width;
        aidxVar.setX(max);
        aidxVar.setY((i2 - i3) - aidxVar.getHeight());
        if (this.u.isPresent() && this.n > 0 && (view = this.w) != null && this.x != null) {
            int width3 = view.getWidth() / 2;
            int max2 = Math.max(i + width3, Math.min(this.p.x, width2 - width3));
            float x = this.w.getX();
            float f = (max2 - width3) - max;
            this.w.setX(f);
            View view2 = this.x;
            view2.setX(view2.getX() - (x - f));
        }
        if (this.s) {
            float j = 1.0f - j(this.e, 0.3f);
            aidxVar.setScaleY(j);
            aidxVar.setScaleX(j);
            aidxVar.setY(aidxVar.getY() + ((int) j(this.e, this.r)));
            View view3 = this.y;
            if (view3 != null) {
                view3.setAlpha(this.e);
            }
            float j2 = 1.0f - j(this.e, 1.0f);
            View view4 = this.x;
            if (view4 != null) {
                view4.setAlpha(j2);
            }
            this.u.ifPresent(new kss(j2, 0));
        }
        aidxVar.getGlobalVisibleRect(this.o);
        this.a.c(this.o);
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void nr(ahyo ahyoVar, boolean z) {
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        if (ahyoVar == ahyo.CHAPTER && this.u.isPresent()) {
            ((TextView) ((yzr) this.u.get()).b).setText(timelineMarker2 == null ? null : timelineMarker2.e);
            this.z = !TextUtils.isEmpty(r1);
            e();
        }
    }
}
