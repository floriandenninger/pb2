package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kdv extends kea implements flm {
    public final Rect a;
    public int b;
    public int c;
    private final ajjz i;
    private final fno j;
    private final kdf k;
    private final ayqw l;
    private final int m;
    private final aaea n;
    private ViewGroup o;
    private ProgressBar p;
    private ImageView q;
    private View r;
    private View s;
    private View t;
    private View u;
    private boolean v;
    private atzm w;
    private boolean x;

    public kdv(Context context, ajjz ajjzVar, aaea aaeaVar, fno fnoVar, fln flnVar, kdf kdfVar) {
        super(context);
        ajjzVar.getClass();
        this.i = ajjzVar;
        this.n = aaeaVar;
        fnoVar.getClass();
        this.j = fnoVar;
        kdfVar.getClass();
        this.k = kdfVar;
        this.a = new Rect();
        this.l = new ayqw();
        flnVar.a(this);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.autonav_top_bar_background_height);
    }

    private final void o() {
        atzm atzmVar;
        if (this.v || this.q.getVisibility() != 0 || (atzmVar = this.w) == null) {
            return;
        }
        ajjz ajjzVar = this.i;
        ImageView imageView = this.q;
        avgg avggVar = atzmVar.j;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        this.v = true;
    }

    private final void p() {
        yny.z(this.u, yny.n(this.k.a() + this.a.bottom), ViewGroup.LayoutParams.class);
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lite_autonav_overlay, (ViewGroup) null, false);
        this.o = (ViewGroup) viewGroup.findViewById(R.id.core_container);
        this.p = (ProgressBar) viewGroup.findViewById(R.id.pip_countdown);
        this.q = (ImageView) viewGroup.findViewById(R.id.mini_thumbnail);
        this.r = viewGroup.findViewById(R.id.pip_background);
        this.s = viewGroup.findViewById(R.id.background);
        this.t = viewGroup.findViewById(R.id.top_bar_background);
        this.u = viewGroup.findViewById(R.id.bottom_bar_background);
        this.k.b(this, this.o);
        this.k.f(this.x);
        whu.I(this.u, this.k.a() > 0);
        p();
        this.o.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kdt
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kdv kdvVar = kdv.this;
                int i9 = i4 - i2;
                int i10 = i3 - i;
                if (i9 == kdvVar.b && i10 == kdvVar.c) {
                    return;
                }
                kdvVar.b = i9;
                kdvVar.c = i10;
                kdvVar.Z(22);
            }
        });
        return viewGroup;
    }

    @Override // defpackage.kea, defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.kea, defpackage.ahuy
    public final void d(Context context, View view) {
        fhg fhgVar;
        if (ab(1)) {
            atzm atzmVar = this.e;
            boolean z = this.f;
            if (this.x != z) {
                this.x = z;
                this.k.f(z);
            }
            if (!amkq.b(this.w, atzmVar)) {
                this.w = atzmVar;
                this.k.g(atzmVar);
                this.v = false;
                o();
            }
        }
        if (ab(2)) {
            long j = this.g;
            long j2 = this.h;
            if (this.p.getVisibility() == 0) {
                this.p.setMax((int) j2);
                this.p.setProgress((int) j);
            }
            this.k.e(j, j2);
        }
        if (ab(4) && (fhgVar = this.d) != null) {
            this.k.d(fhgVar);
            p();
            boolean l = fhgVar.l();
            boolean e = fhgVar.e();
            boolean z2 = l || e;
            whu.I(this.r, e);
            whu.I(this.p, e);
            whu.I(this.q, z2);
            o();
            boolean z3 = !z2;
            whu.I(this.s, z3);
            whu.I(this.o, z3);
            whu.I(this.t, z3);
            whu.I(this.u, this.k.a() > 0 && !z2);
        }
        if (ab(8)) {
            this.o.setPadding(this.a.left, this.a.top, this.a.right, this.a.bottom);
            yny.z(this.t, yny.n(this.m + this.a.top), ViewGroup.LayoutParams.class);
            p();
        }
        if (ab(22)) {
            this.k.c(this.c, this.b);
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.l.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        this.l.d(this.j.a.X(new ayrs() { // from class: kdu
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kdv kdvVar = kdv.this;
                Rect rect = (Rect) obj;
                if (kdvVar.a.equals(rect)) {
                    return;
                }
                kdvVar.a.set(rect);
                kdvVar.Z(8);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kea, defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = true;
        kU.b = 0;
        return kU;
    }

    @Override // defpackage.kea, defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        if (!fhgVar.h() || fhgVar.e() || fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || fhgVar == fhg.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED) {
            return fhgVar.e() && evr.u(this.n) > 0;
        }
        return true;
    }
}
