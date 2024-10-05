package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uem implements Runnable {
    public final /* synthetic */ ueq a;
    private final /* synthetic */ int b;

    public /* synthetic */ uem(ueq ueqVar, int i) {
        this.b = i;
        this.a = ueqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width;
        String str;
        String sb;
        int i;
        if (this.b == 0) {
            this.a.b();
            return;
        }
        final ueq ueqVar = this.a;
        Map map = uer.a;
        final ImageView imageView = (ImageView) ueqVar.a.get();
        if (ueqVar.d || imageView == null) {
            return;
        }
        if (ueqVar.b != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null || layoutParams.width <= 0) {
                width = imageView.getWidth();
            } else {
                width = layoutParams.width;
            }
            int paddingLeft = width - (imageView.getPaddingLeft() + imageView.getPaddingRight());
            int i2 = 0;
            int i3 = paddingLeft < 0 ? 0 : paddingLeft;
            Object obj = ueqVar.b;
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[2];
            if (obj == null) {
                sb = "null";
            } else {
                StringBuilder sb2 = new StringBuilder(tyo.X(obj));
                str = ((ugh) obj).g;
                if (str != null) {
                    sb2.append(" ");
                    sb2.append(str);
                }
                sb = sb2.toString();
            }
            objArr[0] = sb;
            objArr[1] = Integer.valueOf(i3);
            final String format = String.format(locale, "%s %s", objArr);
            Drawable drawable = (Drawable) uer.a.get(format);
            if (drawable != null) {
                ueqVar.d(drawable, true);
                return;
            }
            uix uixVar = ueqVar.c;
            uiz uizVar = uixVar.a;
            final uiz uizVar2 = uixVar.b;
            final Drawable drawable2 = (Drawable) uer.b.get(format);
            if (drawable2 != null) {
                ueqVar.d(drawable2, false);
            }
            Object obj2 = ueqVar.b;
            final int i4 = i3;
            uiy uiyVar = new uiy() { // from class: uek
                @Override // defpackage.uiy
                public final void a(final Bitmap bitmap) {
                    final ueq ueqVar2 = ueq.this;
                    final String str2 = format;
                    Drawable drawable3 = drawable2;
                    final uiz uizVar3 = uizVar2;
                    final int i5 = i4;
                    if (ueqVar2.d) {
                        return;
                    }
                    if (bitmap != null) {
                        ueqVar2.c(new Runnable() { // from class: uen
                            @Override // java.lang.Runnable
                            public final void run() {
                                ueq ueqVar3 = ueq.this;
                                Bitmap bitmap2 = bitmap;
                                String str3 = str2;
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(ueqVar3.a(bitmap2));
                                uer.a.put(str3, bitmapDrawable);
                                uer.b.remove(str3);
                                ueqVar3.d(bitmapDrawable, true);
                            }
                        });
                        return;
                    }
                    if (drawable3 != null) {
                        ueqVar2.d(drawable3, true);
                    } else if (aloh.i(ujb.a(ueqVar2.b))) {
                        ueqVar2.c(new Runnable() { // from class: ueo
                            @Override // java.lang.Runnable
                            public final void run() {
                                ueq ueqVar3 = ueq.this;
                                uiz uizVar4 = uizVar3;
                                int i6 = i5;
                                String str3 = str2;
                                Object obj3 = ueqVar3.b;
                                uej uejVar = new uej(ueqVar3, str3);
                                uee ueeVar = (uee) uizVar4;
                                aloh alohVar = ueeVar.a;
                                tyo tyoVar = ueeVar.b;
                                ujb a = ujb.a(obj3);
                                amkq.F(true, "Size must be bigger or equal to 0");
                                amkq.F(aloh.i(a), "handles(key) must be true");
                                if (i6 == 0) {
                                    i6 = 120;
                                }
                                ArrayList arrayList = new ArrayList();
                                String str4 = a.b;
                                if (str4 != null) {
                                    arrayList.add(str4);
                                }
                                arrayList.add(a.a);
                                String[] strArr = new String[arrayList.size()];
                                arrayList.toArray(strArr);
                                vjm vjmVar = new vjm(new vjs(alohVar.a.getApplicationContext(), new anie()));
                                int[] iArr = vjn.a;
                                vjl vjlVar = new vjl(new vjo(vjmVar));
                                Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
                                vjlVar.d = vjo.b(a.a);
                                vjlVar.c = vjlVar.e.a(new uja(strArr));
                                Canvas canvas = new Canvas(createBitmap);
                                int height = createBitmap.getHeight();
                                int width2 = createBitmap.getWidth();
                                float min = Math.min(height, width2);
                                Paint paint = (Paint) vjl.a.a();
                                synchronized (vjl.a) {
                                    paint.setColor(vjlVar.d);
                                    float f = width2 / 2;
                                    float f2 = height / 2;
                                    canvas.drawCircle(f, f2, min / 2.0f, paint);
                                    if (vjlVar.c != null) {
                                        paint.setColor(-1);
                                        paint.setTextSize(min * 0.47f);
                                        paint.getTextBounds(vjlVar.c.toString(), 0, vjlVar.c.length(), vjl.b);
                                        CharSequence charSequence = vjlVar.c;
                                        canvas.drawText(charSequence, 0, charSequence.length(), f, f2 - vjl.b.exactCenterY(), paint);
                                    }
                                }
                                ueq ueqVar4 = uejVar.a;
                                String str5 = uejVar.b;
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(ueqVar4.a(createBitmap));
                                uer.b.put(str5, bitmapDrawable);
                                ueqVar4.d(bitmapDrawable, true);
                            }
                        });
                    } else {
                        tyo.M(new uem(ueqVar2, 0));
                    }
                }
            };
            ugh ughVar = (ugh) obj2;
            ugk ugkVar = (ugk) uizVar;
            Context context = ugkVar.a;
            if (i3 <= 0) {
                i = 64;
            } else {
                float f = i3 / context.getResources().getDisplayMetrics().density;
                int[] iArr = {32, 48, 64, 120};
                while (true) {
                    if (i2 >= 4) {
                        i = 120;
                        break;
                    }
                    int i5 = iArr[i2];
                    if (i5 == 0) {
                        throw null;
                    }
                    if (f <= i5) {
                        i = i5;
                        break;
                    }
                    i2++;
                }
            }
            anaf.Y(ugkVar.b.f(ughVar.c, i), new ugj(uiyVar), angq.a);
            return;
        }
        ueqVar.e(new ueg() { // from class: uei
            @Override // defpackage.ueg
            public final Drawable a() {
                Context context2 = imageView.getContext();
                if (tyo.a == null) {
                    tyo.a = nz.b(context2, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
                }
                Drawable drawable3 = tyo.a;
                if (!tyo.Q(context2)) {
                    context2 = new ContextThemeWrapper(context2, R.style.Theme_GoogleMaterial_DayNight_Bridge);
                }
                return tyo.R(drawable3, sgf.e(context2, R.attr.colorPrimaryGoogle));
            }
        }, true);
    }
}
