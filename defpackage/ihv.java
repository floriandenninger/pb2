package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.youtube.R;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihv implements wh {
    public boolean b;
    final in g;
    public ihc h;
    private final int i;
    private final int j;
    private float k;
    private float l;
    private boolean m;
    private final int n;
    private final Handler p;
    private final ili q;
    private final ilm r;
    private final ijz s;
    private final aaea t;
    public long a = -1;
    public boolean c = false;
    public boolean d = false;
    public int e = 0;
    public int f = 6;
    private int o = 0;

    public ihv(Context context, Handler handler, ili iliVar, ijz ijzVar, ilm ilmVar, aaea aaeaVar, final axze axzeVar, yqw yqwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.p = handler;
        this.q = iliVar;
        this.r = ilmVar;
        this.s = ijzVar;
        this.t = aaeaVar;
        this.g = new in(context, new ihu(this, ilmVar, ijzVar), handler);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        Math.max(199, ViewConfiguration.getTapTimeout());
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int i = point.y;
        this.j = i;
        this.n = (int) (i * 0.1f);
        final byte[] bArr4 = null;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        yqwVar.f(new Callable(axzeVar, bArr4, bArr5, bArr6) { // from class: iht
            public final /* synthetic */ axze b;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ihv ihvVar = ihv.this;
                return this.b.c().ax(new ayrs() { // from class: ihr
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ihv.this.d = ((Boolean) obj).booleanValue();
                    }
                });
            }
        });
    }

    private final void e(boolean z) {
        if (this.b) {
            if (z && !this.m) {
                this.q.c(this.o);
                this.o = 0;
                this.b = false;
            }
            this.a = -1L;
            this.s.e();
        }
        ikq a = a();
        if (a != null) {
            ((ily) a).i(this.b);
        }
        ilr b = b();
        if (b != null) {
            b.a(true);
        }
        this.a = -1L;
        this.s.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r11.r.aG().s != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(final android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihv.g(android.view.MotionEvent):void");
    }

    public final ikq a() {
        ilm ilmVar = this.r;
        ily aG = ilmVar == null ? null : ilmVar.aG();
        if (aG == null) {
            return null;
        }
        return aG;
    }

    public final ilr b() {
        ilm ilmVar = this.r;
        ily aG = ilmVar == null ? null : ilmVar.aG();
        if (aG == null) {
            return null;
        }
        return aG.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r7 >= 0.75f) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.MotionEvent r10, long r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihv.c(android.view.MotionEvent, long):void");
    }

    public final boolean d(int i) {
        return (i & this.f) != 0;
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        final ily aG;
        ily aG2 = this.r.aG();
        if (aG2 != null && this.d && aG2.r && (aG = this.r.aG()) != null) {
            if (aG.z == null) {
                aG.z = (List) Stream.CC.of((Object[]) new View[]{aG.findViewById(R.id.reel_right_dyn_bar), aG.h, aG.l}).filter(ghv.j).map(new Function() { // from class: ilt
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        ily ilyVar = ily.this;
                        View view = (View) obj;
                        Rect rect = new Rect();
                        view.getDrawingRect(rect);
                        ilyVar.offsetDescendantRectToMyCoords(view, rect);
                        return rect;
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList());
            }
            Iterator it = aG.z.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Rect) it.next()).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        break;
                    }
                } else {
                    this.g.a(motionEvent);
                    break;
                }
            }
        }
        g(motionEvent);
        int i = this.e;
        return !(i == 0 || i == 1) || this.c;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
        ihc ihcVar;
        ihl ihlVar;
        int i;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1 && (ihcVar = this.h) != null && (i = (ihlVar = ihcVar.a).y) != -1) {
                ihlVar.o.ak(i);
            }
            g(motionEvent);
        }
    }

    private final boolean f(float f) {
        ilm ilmVar = this.r;
        ily aG = ilmVar == null ? null : ilmVar.aG();
        if (aG == null) {
            return true;
        }
        return f >= ((float) aG.h()) && f <= ((float) (this.j - aG.g()));
    }
}
