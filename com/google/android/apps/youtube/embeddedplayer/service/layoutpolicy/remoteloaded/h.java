package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import android.R;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.alta;
import defpackage.amkq;
import defpackage.amsx;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.azre;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements k {
    public static final amsx a = amsx.w("com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstand_internal", "com.google.android.apps.newsstand_staging", "com.google.android.apps.newsstanddev", "com.google.android.play.games");
    public static final amsx b = amsx.w("com.android.vending", "com.google.android.apps.magazines", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstand_internal", "com.google.android.apps.newsstand_staging", "com.google.android.apps.newsstanddev", "com.google.android.googlequicksearchbox", "com.google.android.music", "com.google.android.play.games");
    private String A;
    public final View c;
    public final j d;
    public final Random e;
    public final Handler f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public String l;
    public int m;
    public g n;
    public final c o;
    public final ayqw p;
    private final com.google.android.apps.youtube.embeddedplayer.service.jar.a r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private int y;
    private String z;

    private h(View view, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, j jVar, c cVar) {
        Looper mainLooper = view.getContext().getMainLooper();
        Random random = new Random();
        this.m = 4;
        this.n = g.STRICT;
        this.p = new ayqw();
        view.getClass();
        this.c = view;
        this.r = aVar;
        cVar.getClass();
        this.o = cVar;
        jVar.getClass();
        this.d = jVar;
        this.e = random;
        amkq.F(true, "normalMinimumPeriod must be >= 0");
        amkq.F(true, "normalMaximumPeriod must be >= 0");
        amkq.F(true, "recheckMinimumPeriod must be >= 0");
        amkq.F(true, "recheckMaximumPeriod must be >= 0");
        this.f = new Handler(mainLooper, new f(this));
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
    }

    public static h a(View view, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, j jVar) {
        return b(view, aVar, jVar, c.a);
    }

    public static h b(View view, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, j jVar, c cVar) {
        h hVar = new h(view, aVar, jVar, cVar);
        hVar.p.d(com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new e(hVar, 0)));
        return hVar;
    }

    private final int m(float f, int i) {
        if (this.o.f()) {
            return 0;
        }
        return (int) Math.floor(f * i);
    }

    private static String n(Rect rect, Rect rect2) {
        return String.format("left: %d, top: %d, right: %d, bottom: %d", Integer.valueOf(rect2.left - rect.left), Integer.valueOf(rect2.top - rect.top), Integer.valueOf(rect.right - rect2.right), Integer.valueOf(rect.bottom - rect2.bottom));
    }

    private static final void o(View view, Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
        rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
    }

    private static final void p(View view, ViewGroup viewGroup, Rect rect) {
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-viewGroup.getScrollX(), -viewGroup.getScrollY());
        rect.offset((int) viewGroup.getTranslationX(), (int) viewGroup.getTranslationY());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final void c() {
        if (!j()) {
            String valueOf = String.valueOf(this.z);
            alta.C(valueOf.length() != 0 ? "Video playback stopped because of an unauthorized overlay on top of player. ".concat(valueOf) : new String("Video playback stopped because of an unauthorized overlay on top of player. "), new Object[0]);
        } else if (!i()) {
            String valueOf2 = String.valueOf(this.A);
            alta.C(valueOf2.length() != 0 ? "Video playback stopped because the player view is too small. ".concat(valueOf2) : new String("Video playback stopped because the player view is too small. "), new Object[0]);
        } else {
            if (l()) {
                return;
            }
            String valueOf3 = String.valueOf(this.l);
            alta.C(valueOf3.length() != 0 ? "Video playback stopped because the player view is not visible. ".concat(valueOf3) : new String("Video playback stopped because the player view is not visible. "), new Object[0]);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final synchronized void d() {
        this.y--;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final synchronized void e() {
        this.y++;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final void f() {
        h();
        this.p.qc();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final void g() {
        this.f.removeMessages(0);
        this.f.sendEmptyMessage(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final void h() {
        this.o.e();
        this.f.removeMessages(0);
    }

    public final boolean i() {
        float f = this.c.getResources().getDisplayMetrics().density;
        int width = (int) ((this.c.getWidth() / f) + 0.5f);
        int height = (int) ((this.c.getHeight() / f) + 0.5f);
        if (width >= 195 && height >= 105) {
            return true;
        }
        this.A = String.format("The player view is %ddp wide (minimum is %ddp) and %ddp high (minimum is %ddp).", Integer.valueOf(width), 200, Integer.valueOf(height), 110);
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k
    public final boolean j() {
        Window d = this.r.d();
        this.x = this.o.f();
        if (d == null || !d.hasFeature(9)) {
            return k(null);
        }
        View findViewById = d.getDecorView().findViewById(R.id.content);
        if (findViewById != null) {
            return k(findViewById);
        }
        if (!this.o.f()) {
            return true;
        }
        k(null);
        return true;
    }

    final boolean k(View view) {
        if (((!this.g || this.y > 0) && !this.o.f()) || this.c.hasWindowFocus()) {
            this.o.b();
            o(this.c, this.s);
            View view2 = this.c;
            while (view2 != view && (view2.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                p(view2, viewGroup, this.s);
                if (!this.o.f()) {
                    Rect rect = this.t;
                    rect.set(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                    if (viewGroup.getClipToPadding()) {
                        rect.left += viewGroup.getPaddingLeft();
                        rect.top += viewGroup.getPaddingTop();
                        rect.right -= viewGroup.getPaddingRight();
                        rect.bottom -= viewGroup.getPaddingBottom();
                    }
                    rect.offset((int) viewGroup.getTranslationX(), (int) viewGroup.getTranslationY());
                    if (!this.t.contains(this.s)) {
                        String valueOf = String.valueOf(viewGroup);
                        String n = n(this.t, this.s);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 161 + String.valueOf(n).length());
                        sb.append("The player view is not contained inside its ancestor ");
                        sb.append(valueOf);
                        sb.append(". The distances between the ancestor's edges and that of theplayer view is: ");
                        sb.append(n);
                        sb.append(" (these should all be positive).");
                        this.z = sb.toString();
                        if (!this.x) {
                            return false;
                        }
                    }
                }
                g gVar = this.n;
                g gVar2 = g.STRICT;
                int m = m(gVar.c, this.s.width());
                int m2 = m(this.n.c, this.s.height());
                this.w.set(this.s.left + m, this.s.top + m2, this.s.right - m, this.s.bottom - m2);
                int childCount = viewGroup.getChildCount();
                for (int indexOfChild = viewGroup.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                    View childAt = viewGroup.getChildAt(indexOfChild);
                    int id = childAt.getId();
                    if ((!this.h || id != 16908336) && childAt.getVisibility() == 0) {
                        int i = this.w.left;
                        int i2 = this.w.top;
                        int i3 = this.w.right;
                        int i4 = this.w.bottom;
                        this.u.setEmpty();
                        p(childAt, viewGroup, this.u);
                        o(childAt, this.v);
                        this.v.offset(this.u.left, this.u.top);
                        if (this.v.intersects(i, i2, i3, i4)) {
                            this.o.c(this.v, new Rect(i, i2, i3, i4));
                            this.u.set(i, i2, i3, i4);
                            String valueOf2 = String.valueOf(childAt);
                            Rect rect2 = this.u;
                            Rect rect3 = this.v;
                            StringBuilder sb2 = new StringBuilder(260);
                            if (rect3.contains(rect2)) {
                                sb2.append("The player view's interior zone is completely covered by the obscuring view. The distance (px) between each edge of the obscuring view and each corresponding interior zone edge is: ");
                                sb2.append(n(rect3, rect2));
                                sb2.append(". ");
                            } else if (rect2.contains(rect3)) {
                                sb2.append("The obscuring view is inside the player view's interior zone. The distance (px) between each edge of the obscuring view and each corresponding interior zone edge is: ");
                                sb2.append(n(rect2, rect3));
                                sb2.append(". ");
                            } else {
                                if (rect2.left >= rect3.left || rect3.left >= rect2.right) {
                                    if (rect2.left < rect3.right && rect3.right < rect2.right) {
                                        sb2.append("Right edge ");
                                        sb2.append(rect3.right - rect2.left);
                                        sb2.append(" px right the of player view's interior zone's left edge. ");
                                    }
                                } else {
                                    sb2.append("Left edge ");
                                    sb2.append(rect2.right - rect3.left);
                                    sb2.append(" px left of the player view's interior zone's right edge. ");
                                }
                                if (rect2.top >= rect3.top || rect3.top >= rect2.bottom) {
                                    if (rect2.top < rect3.bottom && rect3.bottom < rect2.bottom) {
                                        sb2.append("Bottom edge ");
                                        sb2.append(rect3.bottom - rect2.top);
                                        sb2.append(" px below the player view's interior zone's top edge. ");
                                    }
                                } else {
                                    sb2.append("Top edge ");
                                    sb2.append(rect2.bottom - rect3.top);
                                    sb2.append(" px above the player view's interior zone's bottom edge. ");
                                }
                            }
                            if (this.n == g.RELAXED) {
                                String format = String.format("%.3f", Float.valueOf(this.n.c));
                                sb2.append("The PolicyMode inset factor is ");
                                sb2.append(format);
                                sb2.append(".");
                            }
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 34 + String.valueOf(sb3).length());
                            sb4.append("The player view is obscured by ");
                            sb4.append(valueOf2);
                            sb4.append(". ");
                            sb4.append(sb3);
                            sb4.append(".");
                            this.z = sb4.toString();
                            if (!this.x) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                view2 = viewGroup;
            }
            this.o.d(false);
            return this.o.a() <= 0;
        }
        this.o.d(true);
        this.z = "The player view is obstructed by another window.";
        return false;
    }

    public final boolean l() {
        View view = this.c;
        do {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            } else {
                String valueOf = String.valueOf(view);
                String str = visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE";
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + str.length());
                sb.append("The view ");
                sb.append(valueOf);
                sb.append(" has visibility \"");
                sb.append(str);
                sb.append("\".");
                this.l = sb.toString();
                return false;
            }
        } while (view != null);
        return true;
    }
}
