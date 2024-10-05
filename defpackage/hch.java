package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hch {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private static final DashPathEffect j = new DashPathEffect(new float[]{10.0f, 20.0f}, 0.0f);
    public final ImageView b;
    public final Paint c;
    public final Paint d;
    public final float[] e;
    public final acra f;
    public final acqx g;
    public Canvas h;
    public int i;

    public hch(ImageView imageView, int i, int i2, acra acraVar) {
        int dimensionPixelOffset = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.shorts_edit_guideline_stroke_width);
        this.i = 0;
        this.e = new float[4];
        this.b = imageView;
        this.f = acraVar;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(i);
        paint.setAntiAlias(true);
        float f = dimensionPixelOffset;
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f);
        paint2.setPathEffect(j);
        this.g = new acqx(acsb.c(131528));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(defpackage.axci r3) {
        /*
            int r0 = r3.d
            int r0 = defpackage.awxs.c(r0)
            r1 = 0
            if (r0 != 0) goto La
            goto L60
        La:
            r2 = 1
            if (r0 == r2) goto L60
            axcj r0 = r3.b
            if (r0 != 0) goto L13
            axcj r0 = defpackage.axcj.a
        L13:
            boolean r0 = b(r0)
            if (r0 == 0) goto L27
            axcj r0 = r3.c
            if (r0 != 0) goto L1f
            axcj r0 = defpackage.axcj.a
        L1f:
            boolean r0 = b(r0)
            if (r0 != 0) goto L26
            goto L27
        L26:
            return r2
        L27:
            int r3 = r3.d
            int r3 = defpackage.awxs.c(r3)
            if (r3 != 0) goto L30
            goto L48
        L30:
            switch(r3) {
                case 1: goto L48;
                case 2: goto L45;
                case 3: goto L42;
                case 4: goto L3f;
                case 5: goto L3c;
                case 6: goto L39;
                case 7: goto L36;
                default: goto L33;
            }
        L33:
            java.lang.String r3 = "LINE_TYPE_ROTATIONAL"
            goto L4a
        L36:
            java.lang.String r3 = "LINE_TYPE_BORDER_RIGHT"
            goto L4a
        L39:
            java.lang.String r3 = "LINE_TYPE_BORDER_LEFT"
            goto L4a
        L3c:
            java.lang.String r3 = "LINE_TYPE_BORDER_BOTTOM"
            goto L4a
        L3f:
            java.lang.String r3 = "LINE_TYPE_BORDER_TOP"
            goto L4a
        L42:
            java.lang.String r3 = "LINE_TYPE_CENTER_VERTICAL"
            goto L4a
        L45:
            java.lang.String r3 = "LINE_TYPE_CENTER_HORIZONTAL"
            goto L4a
        L48:
            java.lang.String r3 = "LINE_TYPE_UNSPECIFIED"
        L4a:
            java.lang.String r0 = "[ShortsCreation][Android][Guidelines]Invalid % in line of type: "
            int r2 = r3.length()
            if (r2 == 0) goto L57
            java.lang.String r3 = r0.concat(r3)
            goto L5c
        L57:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L5c:
            defpackage.zga.b(r3)
            return r1
        L60:
            java.lang.String r3 = "[ShortsCreation][Android][Guidelines]Unspecified line type."
            defpackage.zga.b(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hch.a(axci):boolean");
    }

    private static final boolean b(axcj axcjVar) {
        int i = axcjVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            zga.b("[ShortsCreation][Android][Guidelines]X or Y coordinate not set.");
            return false;
        }
        float f = axcjVar.c;
        if (f >= 0.0f && f <= 1.0f) {
            float f2 = axcjVar.d;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                return true;
            }
        }
        float f3 = axcjVar.d;
        StringBuilder sb = new StringBuilder(116);
        sb.append("[ShortsCreation][Android][Guidelines]X or Y coordinates not valid percentage. X: ");
        sb.append(f);
        sb.append(". Y: ");
        sb.append(f3);
        zga.b(sb.toString());
        return false;
    }
}
