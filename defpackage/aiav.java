package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiav implements aiad {
    private final String a;
    private final aaqd b;

    public aiav(String str, aaqd aaqdVar) {
        this.a = str;
        this.b = aaqdVar;
    }

    @Override // defpackage.aiad
    public final void a(Throwable th) {
        aaqd aaqdVar = this.b;
        String str = this.a;
        aaqg aaqgVar = aaqdVar.a;
        if (aaqgVar != null) {
            aaqgVar.e(str, th);
        }
    }

    @Override // defpackage.aiad
    public final void b(PlayerResponseModel playerResponseModel) {
    }

    @Override // defpackage.aiad
    public final void c(int i) {
        String.valueOf(this.a).length();
        if (i == 3) {
            aaqd aaqdVar = this.b;
            String str = this.a;
            aaqg aaqgVar = aaqdVar.a;
            if (aaqgVar != null) {
                aaqe aaqeVar = (aaqe) aaqgVar.e.remove(str);
                if (aaqeVar != null) {
                    aaqeVar.b.o(null);
                    aaqeVar.c.c("pce");
                }
                aaqgVar.b(str);
                aaqgVar.c();
            }
        }
    }
}
