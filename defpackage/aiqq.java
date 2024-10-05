package defpackage;

import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqq implements afxe {
    public aigf a;
    public long b;
    public boolean c;
    private final ysy d;
    private final shf e;
    private final long g;
    private final String h;
    private final aigm i;

    public aiqq(ysy ysyVar, aigf aigfVar, aigm aigmVar, shf shfVar, long j, String str) {
        this.d = ysyVar;
        this.i = aigmVar;
        this.a = aigfVar;
        this.e = shfVar;
        this.g = j;
        this.h = str;
    }

    private static String c(long j) {
        Locale locale = Locale.US;
        double d = j;
        Double.isNaN(d);
        return String.format(locale, "%.1f", Double.valueOf(d / 1000.0d));
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) aiqp.a.get(str);
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 1:
                return c(this.b);
            case 2:
                return this.h;
            case 3:
                return true != this.c ? "pause" : "playing";
            case 4:
                return String.valueOf(this.d.a());
            case 5:
                return c(this.e.d() - this.g);
            case 6:
                aigf aigfVar = this.a;
                return aigfVar != null ? aigfVar.a() : "0";
            case 7:
                return this.i.a();
            default:
                return null;
        }
    }

    @Override // defpackage.afxe
    public final String b() {
        return "VideoStats2MacroConverter";
    }
}
