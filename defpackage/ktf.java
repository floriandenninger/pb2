package defpackage;

import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ktf implements ayrs {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ktf u = new ktf(20);
    public static final /* synthetic */ ktf t = new ktf(19);
    public static final /* synthetic */ ktf s = new ktf(18);
    public static final /* synthetic */ ktf r = new ktf(17);
    public static final /* synthetic */ ktf q = new ktf(16);
    public static final /* synthetic */ ktf p = new ktf(15);
    public static final /* synthetic */ ktf o = new ktf(14);
    public static final /* synthetic */ ktf n = new ktf(13);
    public static final /* synthetic */ ktf m = new ktf(12);
    public static final /* synthetic */ ktf l = new ktf(11);
    public static final /* synthetic */ ktf k = new ktf(10);
    public static final /* synthetic */ ktf j = new ktf(9);
    public static final /* synthetic */ ktf i = new ktf(8);
    public static final /* synthetic */ ktf h = new ktf(7);
    public static final /* synthetic */ ktf g = new ktf(6);
    public static final /* synthetic */ ktf f = new ktf(5);
    public static final /* synthetic */ ktf e = new ktf(4);
    public static final /* synthetic */ ktf d = new ktf(3);
    public static final /* synthetic */ ktf c = new ktf(2);
    public static final /* synthetic */ ktf b = new ktf(1);
    public static final /* synthetic */ ktf a = new ktf(0);

    private /* synthetic */ ktf(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                wbs.H((Throwable) obj);
                return;
            case 1:
                zga.d("Error when subscribing to video stage event", (Throwable) obj);
                return;
            case 2:
                wbs.H((Throwable) obj);
                return;
            case 3:
                wbs.H((Throwable) obj);
                return;
            case 4:
                wbs.H((Throwable) obj);
                return;
            case 5:
                zga.d("SearchHotConfig observer error %s", (Throwable) obj);
                return;
            case 6:
                wbs.H((Throwable) obj);
                return;
            case 7:
                wbs.H((Throwable) obj);
                return;
            case 8:
                wbs.H((Throwable) obj);
                return;
            case 9:
                Drawable drawable = (Drawable) obj;
                if (drawable instanceof FrameSequenceDrawable) {
                    ((FrameSequenceDrawable) drawable).setLoopBehavior(3);
                    return;
                }
                return;
            case 10:
                zga.d("Error downloading or decoding asset.", (Throwable) obj);
                return;
            case 11:
                zga.d("Error downloading or decoding asset.", (Throwable) obj);
                return;
            case 12:
                wbs.H((Throwable) obj);
                return;
            case 13:
                wbs.H((Throwable) obj);
                return;
            case 14:
                wbs.H((Throwable) obj);
                return;
            case 15:
                wbs.H((Throwable) obj);
                return;
            case 16:
                wbs.H((Throwable) obj);
                return;
            case 17:
                throw new IllegalStateException("Unable to update account link state");
            case 18:
                wbs.H((Throwable) obj);
                return;
            case 19:
                wbs.H((Throwable) obj);
                return;
            default:
                wbs.H((Throwable) obj);
                return;
        }
    }
}
