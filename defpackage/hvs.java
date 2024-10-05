package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvs implements View.OnClickListener, vwv {
    public hvr a;
    public View b;
    public View c;
    public VideoWithPreviewView d;
    private final Context e;

    public hvs(Context context) {
        this.e = context;
    }

    @Override // defpackage.vwv
    public final void a(Point point) {
        if (point.x <= 0 || point.y <= 0) {
            return;
        }
        amkq.E(point.x > 0);
        amkq.E(point.y > 0);
        float f = point.x / point.y;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f2 = i;
        float f3 = i2;
        if (f >= f2 / f3) {
            i = (int) (f3 * f);
        } else {
            i2 = (int) (f2 / f);
        }
        point.x = i;
        point.y = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hvc hvcVar = (hvc) this.a;
        hvcVar.bf();
        hvcVar.am.d();
        hvcVar.ak.d();
        hvcVar.al.d();
        hvcVar.an.d();
        hwg hwgVar = hvcVar.aj;
        if (hwgVar.i) {
            hwgVar.d();
        }
    }
}
