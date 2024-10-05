package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahow {
    private static final ComponentName a = new ComponentName("com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");
    private static final ComponentName b = new ComponentName("com.google.android.apps.youtube.vr.oculus", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return (context == null || g(context, "com.oculus.horizon") == null) ? false : true;
    }

    public static boolean e(Context context, int i) {
        PackageInfo g;
        int i2 = i - 1;
        String str = i2 != 1 ? i2 != 2 ? null : "com.google.android.apps.youtube.vr.oculus" : "com.google.android.apps.youtube.vr";
        return (TextUtils.isEmpty(str) || (g = g(context, str)) == null || ((long) g.versionCode) <= 10199000) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Context context, int i) {
        if (context == null) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            return DaydreamApi.isDaydreamReadyPlatform(context);
        }
        if (i2 != 2) {
            return false;
        }
        return b(context);
    }

    private static PackageInfo g(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static void h(ainy ainyVar, Intent intent) {
        if (ainyVar == null || intent == null || TextUtils.isEmpty(ainyVar.q())) {
            return;
        }
        aone createBuilder = owi.a.createBuilder();
        int g = ainyVar.g();
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        owiVar.b |= 4;
        owiVar.f = g;
        boolean d = ainyVar.d();
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        owiVar2.b |= 1024;
        owiVar2.n = !d;
        long i = ainyVar.i();
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 256;
        owiVar3.l = i;
        if (!TextUtils.isEmpty(ainyVar.q())) {
            String q = ainyVar.q();
            createBuilder.copyOnWrite();
            owi owiVar4 = (owi) createBuilder.instance;
            q.getClass();
            owiVar4.b |= 1;
            owiVar4.c = q;
        }
        if (!TextUtils.isEmpty(ainyVar.p())) {
            String p = ainyVar.p();
            createBuilder.copyOnWrite();
            owi owiVar5 = (owi) createBuilder.instance;
            p.getClass();
            owiVar5.b |= 2;
            owiVar5.e = p;
        }
        intent.putExtra("playback_start_descriptor_proto", ((owi) createBuilder.build()).toByteArray());
        intent.setData(TextUtils.isEmpty(ainyVar.q()) ? null : wbs.ao(ainyVar.q(), ainyVar.p(), ainyVar.g(), ainyVar.i() / 1000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.youtube.vr")).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
        }
        if (i2 != 2) {
            return null;
        }
        return new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.oculus.com/experiences/gear-vr/1458129140982015/"));
    }

    public static void d(Context context, int i, DaydreamApi daydreamApi, ainy ainyVar) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2 && context != null) {
                Intent addFlags = new Intent().setComponent(b).addFlags(335609856);
                h(ainyVar, addFlags);
                context.startActivity(addFlags);
            }
        } else if (daydreamApi != null) {
            Intent action = DaydreamApi.createVrIntent(a).setAction("android.intent.action.VIEW");
            h(ainyVar, action);
            daydreamApi.launchInVr(action);
        }
        if (ainyVar != null) {
            ainyVar.a();
        }
    }
}
