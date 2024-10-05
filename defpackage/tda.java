package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tda {
    public static final String a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final String b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final List c = Collections.unmodifiableList(Arrays.asList("Google"));
    private static final tdm i;
    public final Context d;
    public final PackageManager e;
    public final List f;
    public tdm g;
    public boolean h;

    static {
        aone createBuilder = tdm.a.createBuilder();
        createBuilder.copyOnWrite();
        tdm tdmVar = (tdm) createBuilder.instance;
        tdmVar.b = 1 | tdmVar.b;
        tdmVar.c = "1.2.1";
        createBuilder.copyOnWrite();
        tdm tdmVar2 = (tdm) createBuilder.instance;
        tdmVar2.b |= 2;
        tdmVar2.d = "";
        createBuilder.copyOnWrite();
        tdm tdmVar3 = (tdm) createBuilder.instance;
        tdmVar3.e = -1;
        tdmVar3.b |= 4;
        createBuilder.copyOnWrite();
        tdm tdmVar4 = (tdm) createBuilder.instance;
        tdmVar4.f = -1;
        tdmVar4.b |= 8;
        i = (tdm) createBuilder.build();
    }

    public tda(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f = new ArrayList();
        this.d = context;
        this.e = packageManager;
        this.h = false;
        tdm tdmVar = i;
        this.g = tdmVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                aone builder = tdmVar.toBuilder();
                String str = packageInfo.versionName;
                builder.copyOnWrite();
                tdm tdmVar2 = (tdm) builder.instance;
                str.getClass();
                tdmVar2.b |= 2;
                tdmVar2.d = str;
                this.g = (tdm) builder.build();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new tcz(this).execute(new Void[0]);
    }

    public final void a(tcx tcxVar) {
        if (this.h) {
            tcxVar.a(this.g);
        } else {
            this.f.add(tcxVar);
        }
    }
}
