package com.google.android.libraries.youtube.account.image;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahbw;
import defpackage.lu;
import defpackage.ml;
import defpackage.whu;
import defpackage.yny;
import defpackage.zga;
import defpackage.zhh;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CropActivity extends ml implements View.OnTouchListener, View.OnLayoutChangeListener {
    private LinearLayout A;
    private View B;
    private TextView C;
    private FrameLayout D;
    private FrameLayout E;
    private TextView F;
    private View G;
    private Matrix H;
    private final PointF I = new PointF();

    /* renamed from: J, reason: collision with root package name */
    private final PointF f172J = new PointF();
    private double K = 1.0d;
    private final float[] L = new float[9];
    private boolean M = true;
    private boolean N = true;
    private int O;
    private Uri a;
    private Uri b;
    private CharSequence c;
    private int d;
    private int e;
    private int f;
    private int g;
    private CharSequence h;
    private int i;
    private int j;
    private int k;
    private int l;
    private CharSequence m;
    private int n;
    private CharSequence o;
    private Pair p;
    private int q;
    private int r;
    private Matrix s;
    private Rect t;
    private Handler u;
    private ImageView v;
    private LinearLayout w;
    private LinearLayout x;
    private TextView y;
    private FrameLayout z;

    private static double a(MotionEvent motionEvent) {
        return Math.hypot(motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1));
    }

    private final Rect b() {
        this.s.getValues(this.L);
        int ceil = (int) Math.ceil(this.L[2]);
        int ceil2 = (int) Math.ceil(this.L[5]);
        float[] fArr = this.L;
        double floor = Math.floor((fArr[0] * this.q) + (fArr[3] * this.r));
        float[] fArr2 = this.L;
        Rect rect = new Rect(ceil, ceil2, ((int) floor) + ceil, ((int) Math.floor((fArr2[4] * this.r) + (fArr2[1] * this.q))) + ceil2);
        rect.sort();
        return rect;
    }

    private final Rect c() {
        Rect rect = new Rect(this.t);
        Rect b = b();
        rect.offset(-b.left, -b.top);
        double intValue = ((Integer) this.p.first).intValue();
        double width = b.width();
        Double.isNaN(intValue);
        Double.isNaN(width);
        double d = intValue / width;
        double d2 = rect.left;
        Double.isNaN(d2);
        int i = (int) (d2 * d);
        double d3 = rect.top;
        Double.isNaN(d3);
        int i2 = (int) (d3 * d);
        double width2 = rect.width();
        Double.isNaN(width2);
        int max = Math.max(1, (int) (width2 * d)) + i;
        double height = rect.height();
        Double.isNaN(height);
        rect.set(i, i2, max, Math.max(1, (int) (height * d)) + i2);
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.account.image.CropActivity.d():void");
    }

    private final void e(final View view, final zhh zhhVar, final Class cls) {
        this.u.post(new Runnable() { // from class: wdn
            @Override // java.lang.Runnable
            public final void run() {
                yny.z(view, zhhVar, cls);
            }
        });
    }

    private static void f(Object obj) {
        obj.getClass();
    }

    private static final Rect g(double d, Rect rect) {
        double width = rect.width();
        Double.isNaN(width);
        double d2 = (width / d) * 0.5d;
        Rect rect2 = new Rect(rect.left, rect.centerY() - ((int) Math.round(d2)), rect.right, rect.centerY() + ((int) Math.round(d2)));
        rect2.sort();
        return rect2;
    }

    private static final Rect h(double d, Rect rect) {
        double height = rect.height();
        Double.isNaN(height);
        double d2 = height * d * 0.5d;
        Rect rect2 = new Rect(rect.centerX() - ((int) Math.round(d2)), rect.top, rect.centerX() + ((int) Math.round(d2)), rect.bottom);
        rect2.sort();
        return rect2;
    }

    private static final void i(Matrix matrix, double d) {
        float f = (float) d;
        matrix.postScale(f, f);
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lu supportActionBar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_crop);
        this.u = new Handler(Looper.getMainLooper());
        this.s = new Matrix();
        this.H = new Matrix();
        this.O = 0;
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            zga.b("Input for CropActivity is missing");
            setResult(1);
            finish();
        } else {
            this.b = intent.getData();
            Bundle extras = intent.getExtras();
            this.a = (Uri) extras.getParcelable("output");
            this.c = extras.getCharSequence("cropLabel");
            this.d = extras.getInt("widthRatio", 0);
            this.e = extras.getInt("heightRatio", 0);
            this.f = extras.getInt("minWidth", 0);
            this.g = extras.getInt("minHeight", 0);
            this.h = extras.getCharSequence("visualCropLabel");
            this.k = extras.getInt("visualWidthRatio", this.d);
            this.l = extras.getInt("visualHeightRatio", this.e);
            this.m = extras.getCharSequence("visualDoubleCropLabel");
            this.n = extras.getInt("visualDoubleWidthRatio", this.k);
            this.i = extras.getInt("minOutputWidth", 0);
            this.j = extras.getInt("minOutputHeight", 0);
            this.o = extras.getCharSequence("cropInfo");
            if (this.d <= 0 || this.e <= 0) {
                zga.b("Width and height ratio must be positive");
                setResult(1);
                finish();
            } else if (this.k < this.n) {
                zga.b("A double mask width ratio must be smaller or equal to a single mask width ratio");
                setResult(1);
                finish();
            } else {
                try {
                    Pair P = ahbw.P(getContentResolver(), this.b);
                    this.p = P;
                    if (this.f > ((Integer) P.first).intValue() || this.g > ((Integer) this.p.second).intValue()) {
                        int i = this.f;
                        int i2 = this.g;
                        StringBuilder sb = new StringBuilder(69);
                        sb.append("Selected image is too small. Must be at least ");
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        zga.b(sb.toString());
                        setResult(2);
                        finish();
                    }
                } catch (FileNotFoundException e) {
                    zga.d("Image file not found", e);
                    setResult(1);
                    finish();
                }
            }
        }
        if (isFinishing()) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.image);
        f(imageView);
        this.v = imageView;
        TextView textView = (TextView) findViewById(R.id.tv_crop_text);
        f(textView);
        this.y = textView;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.area_for_crop);
        f(linearLayout);
        this.w = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.tv_crop);
        f(linearLayout2);
        this.x = linearLayout2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.top_desktop_crop);
        f(frameLayout);
        this.z = frameLayout;
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.desktop_crop);
        f(linearLayout3);
        this.A = linearLayout3;
        View findViewById = findViewById(R.id.bottom_desktop_crop);
        f(findViewById);
        this.B = findViewById;
        TextView textView2 = (TextView) findViewById(R.id.desktop_crop_text);
        f(textView2);
        this.C = textView2;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.left_mobile_crop);
        f(frameLayout2);
        this.D = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.mobile_crop);
        f(frameLayout3);
        this.E = frameLayout3;
        TextView textView3 = (TextView) findViewById(R.id.mobile_crop_text);
        f(textView3);
        this.F = textView3;
        this.G = findViewById(R.id.right_mobile_crop);
        try {
            Bitmap Q = ahbw.Q(getContentResolver(), this.b);
            this.q = Q.getWidth();
            this.r = Q.getHeight();
            this.v.setImageBitmap(Q);
            this.v.setOnTouchListener(this);
            this.v.addOnLayoutChangeListener(this);
            CharSequence charSequence = this.o;
            if (charSequence != null && charSequence.length() > 0) {
                TextView textView4 = (TextView) findViewById(R.id.crop_info);
                f(textView4);
                textView4.setText(this.o);
                FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.crop_info_layout);
                f(frameLayout4);
                whu.I(frameLayout4, true);
            }
        } catch (FileNotFoundException e2) {
            zga.d("Image file not found", e2);
            setResult(1);
            finish();
        }
        if (isFinishing() || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.C();
        supportActionBar.j(true);
        supportActionBar.l(false);
        supportActionBar.z();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_menu, menu);
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float dimension;
        float dimension2;
        int i9;
        int i10;
        int dimension3 = ((int) getResources().getDimension(R.dimen.crop_rectangle_margin)) / 2;
        Rect rect = new Rect(i + dimension3, i2 + dimension3, i3 - dimension3, i4 - dimension3);
        rect.sort();
        int i11 = this.d;
        if (i11 > 0 && (i9 = this.e) > 0) {
            double d = i11;
            double d2 = i9;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            Rect g = g(d3, rect);
            if (g.height() > rect.height()) {
                g = h(d3, rect);
            }
            this.t = g;
            e(this.w, yny.n(g.height()), ViewGroup.LayoutParams.class);
            e(this.x, yny.x(this.t.width()), ViewGroup.LayoutParams.class);
            CharSequence charSequence = this.c;
            if (charSequence != null && charSequence.length() > 0) {
                this.y.setText(this.c);
            }
            int i12 = this.k;
            if (i12 > 0 && (i10 = this.l) > 0) {
                double d4 = i12;
                double d5 = i10;
                Double.isNaN(d4);
                Double.isNaN(d5);
                Rect g2 = g(d4 / d5, this.t);
                int height = (this.t.height() - g2.height()) / 2;
                e(this.z, yny.n(height), ViewGroup.LayoutParams.class);
                e(this.A, yny.n(g2.height()), ViewGroup.LayoutParams.class);
                e(this.B, yny.n(height), ViewGroup.LayoutParams.class);
                whu.I(this.z, true);
                whu.I(this.B, true);
                CharSequence charSequence2 = this.h;
                if (charSequence2 != null && charSequence2.length() > 0) {
                    this.C.setText(this.h);
                    whu.I(this.C, true);
                }
                int i13 = this.n;
                if (i13 > 0.0f) {
                    double d6 = i13;
                    double d7 = this.l;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    Rect h = h(d6 / d7, g2);
                    int width = (g2.width() - h.width()) / 2;
                    e(this.D, yny.x(width), ViewGroup.LayoutParams.class);
                    e(this.E, yny.x(h.width()), ViewGroup.LayoutParams.class);
                    e(this.G, yny.x(width), ViewGroup.LayoutParams.class);
                    whu.I(this.D, true);
                    whu.I(this.G, true);
                    whu.I(this.E, true);
                    CharSequence charSequence3 = this.m;
                    if (charSequence3 != null && charSequence3.length() > 0) {
                        this.F.setText(this.m);
                        whu.I(this.F, true);
                    }
                }
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.crop_info_layout);
        f(frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        int i14 = getResources().getConfiguration().orientation;
        if (i14 == 2) {
            dimension = getResources().getDimension(R.dimen.crop_info_horizontal_margin_landscape);
        } else {
            dimension = getResources().getDimension(R.dimen.crop_info_horizontal_margin_portrait);
        }
        int i15 = (int) dimension;
        if (i14 == 2) {
            dimension2 = getResources().getDimension(R.dimen.crop_info_bottom_margin_landscape);
        } else {
            dimension2 = getResources().getDimension(R.dimen.crop_info_bottom_margin_portrait);
        }
        marginLayoutParams.setMargins(i15, 0, i15, (int) dimension2);
        d();
        this.v.setImageMatrix(this.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014a, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0147, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        if (r0 == null) goto L56;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r10) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.account.image.CropActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r1 != 6) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            r0 = r10
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = r11.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == 0) goto Lb6
            r3 = 0
            if (r1 == r2) goto Lb0
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            r6 = 2
            if (r1 == r6) goto L4c
            r7 = 5
            if (r1 == r7) goto L1c
            r11 = 6
            if (r1 == r11) goto Lb0
            goto Lcc
        L1c:
            double r7 = a(r11)
            r9.K = r7
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 <= 0) goto Lcc
            android.graphics.Matrix r10 = r9.H
            android.graphics.Matrix r1 = r9.s
            r10.set(r1)
            android.graphics.PointF r10 = r9.f172J
            float r1 = r11.getX(r3)
            float r4 = r11.getX(r2)
            float r1 = r1 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r4
            float r3 = r11.getY(r3)
            float r11 = r11.getY(r2)
            float r3 = r3 + r11
            float r3 = r3 / r4
            r10.set(r1, r3)
            r9.O = r6
            goto Lcc
        L4c:
            int r10 = r9.O
            if (r10 != r2) goto L6f
            android.graphics.Matrix r10 = r9.s
            android.graphics.Matrix r1 = r9.H
            r10.set(r1)
            android.graphics.Matrix r10 = r9.s
            float r1 = r11.getX()
            android.graphics.PointF r3 = r9.I
            float r3 = r3.x
            float r1 = r1 - r3
            float r11 = r11.getY()
            android.graphics.PointF r3 = r9.I
            float r3 = r3.y
            float r11 = r11 - r3
            r10.postTranslate(r1, r11)
            goto Lac
        L6f:
            if (r10 != r6) goto Lac
            double r10 = a(r11)
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lac
            double r3 = r9.K
            double r10 = r10 / r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 >= 0) goto L86
            boolean r1 = r9.M
            if (r1 != 0) goto L8e
        L86:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 <= 0) goto Lac
            boolean r1 = r9.N
            if (r1 == 0) goto Lac
        L8e:
            android.graphics.Matrix r1 = r9.s
            android.graphics.Matrix r5 = r9.H
            r1.set(r5)
            float r1 = (float) r10
            android.graphics.Matrix r5 = r9.s
            android.graphics.PointF r6 = r9.f172J
            float r6 = r6.x
            android.graphics.PointF r7 = r9.f172J
            float r7 = r7.y
            r5.postScale(r1, r1, r6, r7)
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 >= 0) goto Laa
            r9.N = r2
            goto Lac
        Laa:
            r9.M = r2
        Lac:
            r9.d()
            goto Lcc
        Lb0:
            r9.O = r3
            r10.performClick()
            goto Lcc
        Lb6:
            android.graphics.Matrix r10 = r9.H
            android.graphics.Matrix r1 = r9.s
            r10.set(r1)
            android.graphics.PointF r10 = r9.I
            float r1 = r11.getX()
            float r11 = r11.getY()
            r10.set(r1, r11)
            r9.O = r2
        Lcc:
            android.graphics.Matrix r10 = r9.s
            r0.setImageMatrix(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.account.image.CropActivity.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
