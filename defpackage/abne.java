package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abne implements View.OnClickListener, zae {
    public final aahd a;
    private final avul b;
    private final Activity c;
    private final ajjs d;
    private final acra e;
    private AlertDialog f;
    private ImageView g;
    private ImageView h;
    private FrameLayout i;
    private Button j;
    private Button k;
    private apmg l;
    private apmg m;
    private final advq n;

    public abne(avul avulVar, Activity activity, advq advqVar, ajjs ajjsVar, aahd aahdVar, acra acraVar, byte[] bArr) {
        avulVar.getClass();
        this.b = avulVar;
        this.c = activity;
        this.n = advqVar;
        ajjsVar.getClass();
        this.d = ajjsVar;
        aahdVar.getClass();
        this.a = aahdVar;
        acraVar.getClass();
        this.e = acraVar;
    }

    private final void b(Button button, apmg apmgVar) {
        if (apmgVar == null) {
            button.setVisibility(8);
        } else {
            this.n.b(button).oB(new ajok(), apmgVar);
            button.setOnClickListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abne.a():void");
    }

    @Override // defpackage.zae
    public final void d(ImageView imageView) {
        ImageView imageView2 = this.g;
        if (imageView == imageView2) {
            imageView2.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    @Override // defpackage.zae
    public final void e(ImageView imageView) {
    }

    @Override // defpackage.zae
    public final void f(ImageView imageView) {
        Drawable drawable;
        ImageView imageView2 = this.g;
        if (imageView == imageView2 && (drawable = imageView2.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = (this.g.getWidth() - this.g.getPaddingLeft()) - this.g.getPaddingRight();
            int height = (this.g.getHeight() - this.g.getPaddingTop()) - this.g.getPaddingBottom();
            Matrix matrix = new Matrix(this.g.getMatrix());
            float f = intrinsicWidth * height > width * intrinsicHeight ? height / intrinsicHeight : width / intrinsicWidth;
            matrix.setScale(f, f);
            this.g.setScaleType(ImageView.ScaleType.MATRIX);
            this.g.setImageMatrix(matrix);
        }
    }

    @Override // defpackage.zae
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmg apmgVar;
        if (view == this.j) {
            apmgVar = this.l;
        } else {
            apmgVar = view == this.k ? this.m : null;
        }
        if (apmgVar != null) {
            amrz k = amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apmgVar);
            int i = apmgVar.b;
            if ((i & 16384) != 0) {
                apxf apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                this.a.c(apxfVar, k);
                if (!apxfVar.pY(atmb.b)) {
                    apxf h = this.e.h(apxfVar);
                    aong aongVar = (aong) apmgVar.toBuilder();
                    aongVar.copyOnWrite();
                    apmg apmgVar2 = (apmg) aongVar.instance;
                    h.getClass();
                    apmgVar2.o = h;
                    apmgVar2.b |= 16384;
                    apmgVar = (apmg) aongVar.build();
                }
            } else if ((i & 8192) != 0) {
                aahd aahdVar = this.a;
                apxf apxfVar2 = apmgVar.n;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.c(apxfVar2, k);
                apxf apxfVar3 = apmgVar.n;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                if ((apxfVar3.b & 1) != 0) {
                    acra acraVar = this.e;
                    apxf apxfVar4 = apmgVar.n;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    acraVar.I(3, new acqx(apxfVar4.c), null);
                }
            } else if ((i & 32768) != 0) {
                aahd aahdVar2 = this.a;
                apxf apxfVar5 = apmgVar.p;
                if (apxfVar5 == null) {
                    apxfVar5 = apxf.a;
                }
                aahdVar2.c(apxfVar5, k);
                apxf apxfVar6 = apmgVar.p;
                if (apxfVar6 == null) {
                    apxfVar6 = apxf.a;
                }
                if ((apxfVar6.b & 1) != 0) {
                    acra acraVar2 = this.e;
                    apxf apxfVar7 = apmgVar.p;
                    if (apxfVar7 == null) {
                        apxfVar7 = apxf.a;
                    }
                    acraVar2.I(3, new acqx(apxfVar7.c), null);
                }
            }
            if ((apmgVar.b & 1048576) != 0) {
                this.e.I(3, new acqx(apmgVar.t), null);
            }
            if (view == this.j) {
                this.l = apmgVar;
            } else if (view == this.k) {
                this.m = apmgVar;
            }
            Activity activity = this.c;
            if (activity == null || activity.isFinishing() || this.c.isDestroyed()) {
                return;
            }
            this.f.dismiss();
        }
    }
}
