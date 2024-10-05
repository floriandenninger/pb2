package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.rendering.customtabs.CustomTabsReceiver;
import com.google.android.youtube.R;
import j$.util.OptionalLong;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdb implements ajcx {
    private static final int[] b = {R.attr.homeAsUpIndicator};
    public final String a;
    private final Context c;
    private final ajcw d;
    private final Executor e;
    private final apwy f;

    public ajdb(apwy apwyVar, Context context, ajcw ajcwVar, Executor executor) {
        apct apctVar;
        this.f = apwyVar;
        this.c = context;
        String str = null;
        if (apwyVar != null) {
            try {
                apctVar = apwyVar.B;
            } catch (RuntimeException unused) {
            }
            if ((apctVar == null ? apct.a : apctVar).d) {
                String str2 = "com.android.chrome";
                PackageManager packageManager = context.getPackageManager();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent = new Intent();
                    intent.setAction("android.support.customtabs.action.CustomTabsService");
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent, 0) != null) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (!arrayList.contains("com.android.chrome")) {
                    if (arrayList.contains("com.chrome.beta")) {
                        str2 = "com.chrome.beta";
                    } else if (arrayList.contains("com.chrome.dev")) {
                        str2 = "com.chrome.dev";
                    } else {
                        str2 = arrayList.contains("com.google.android.apps.chrome") ? "com.google.android.apps.chrome" : null;
                    }
                }
                str = str2 == null ? ayeq.u(this.c) : str2;
                this.a = str;
                this.d = ajcwVar;
                this.e = executor;
            }
        }
        str = ayeq.u(context);
        this.a = str;
        this.d = ajcwVar;
        this.e = executor;
    }

    @Override // defpackage.ajcx
    public final anhy a(final Activity activity, final Uri uri) {
        ajcw ajcwVar;
        if (TextUtils.isEmpty(this.a) || !ykp.b(this.c, uri).isEmpty() || (ajcwVar = this.d) == null || this.e == null) {
            return anaf.O(false);
        }
        return anfq.h(ajcwVar.a(), new amml() { // from class: ajcy
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                shc a;
                ajdb ajdbVar = ajdb.this;
                Activity activity2 = activity;
                Uri uri2 = uri;
                shd shdVar = (shd) obj;
                boolean z = false;
                if (ajdbVar.h() && shdVar != null && (a = shdVar.a()) != null && TextUtils.equals(a.b.a, ajdbVar.a)) {
                    a.b(Uri.parse("https://www.youtube.com"));
                    ajdbVar.i(a.a(), activity2, uri2, false, true).a(activity2, uri2);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.e);
    }

    @Override // defpackage.ajcx
    public final anhy b(final Activity activity, final Uri uri, final int i, final ajcv ajcvVar) {
        ajcw ajcwVar;
        if (TextUtils.isEmpty(this.a) || !ykp.b(this.c, uri).isEmpty() || (ajcwVar = this.d) == null || this.e == null) {
            afsi.b(1, 1, "[InlineCustomTab]Could not attempt to get cct client");
            return anaf.O(false);
        }
        return amkq.m(ajcwVar.a(), new amml() { // from class: ajcz
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                ajdb ajdbVar = ajdb.this;
                Activity activity2 = activity;
                Uri uri2 = uri;
                int i2 = i;
                ajcv ajcvVar2 = ajcvVar;
                shd shdVar = (shd) obj;
                boolean z = false;
                if (shdVar == null) {
                    afsi.b(1, 1, "[InlineCustomTab]Cct Client is Null");
                } else {
                    shc a = shdVar.a();
                    if (a == null || !TextUtils.equals(a.b.a, ajdbVar.a)) {
                        afsi.b(1, 1, "[InlineCustomTab]Session is Malformed");
                    } else {
                        a.a.a = new ajda(ajcvVar2);
                        a.b(Uri.parse("https://www.youtube.com"));
                        acv i3 = ajdbVar.i(a.a(), activity2, uri2, false, false);
                        i3.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_IN_PIXEL", i2);
                        i3.a(activity2, uri2);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, this.e);
    }

    @Override // defpackage.ajcx
    public final OptionalLong c() {
        if (Build.VERSION.SDK_INT < 28) {
            return OptionalLong.empty();
        }
        if (this.a == null) {
            return OptionalLong.empty();
        }
        try {
            return OptionalLong.of(this.c.getPackageManager().getPackageInfo(this.a, 0).getLongVersionCode());
        } catch (PackageManager.NameNotFoundException unused) {
            return OptionalLong.empty();
        }
    }

    @Override // defpackage.ajcx
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ajcx
    public final boolean e(Activity activity, Uri uri) {
        if (ykp.b(this.c, uri).isEmpty()) {
            return f(activity, uri);
        }
        return false;
    }

    @Override // defpackage.ajcx
    public final boolean f(Activity activity, Uri uri) {
        if (TextUtils.isEmpty(this.a)) {
            return false;
        }
        i(new acu(), activity, uri, false, false).a(activity, uri);
        return true;
    }

    @Override // defpackage.ajcx
    public final boolean g(Activity activity, Uri uri) {
        if (TextUtils.isEmpty(this.a) || !ykp.b(this.c, uri).isEmpty()) {
            return false;
        }
        i(new acu(), activity, uri, true, false).a(activity, uri);
        return true;
    }

    @Override // defpackage.ajcx
    public final boolean h() {
        String str;
        if (Build.VERSION.SDK_INT < 28 || (str = this.a) == null || !str.contains("chrome")) {
            return false;
        }
        OptionalLong c = c();
        return c.isPresent() && c.getAsLong() >= 432418100;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acv i(acu acuVar, Activity activity, Uri uri, boolean z, boolean z2) {
        int orElse;
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        int i = activity.getResources().getConfiguration().uiMode & 48;
        if (i == 32) {
            orElse = wbs.W(activity, R.attr.ytStaticBrandBlack).orElse(-16777216);
        } else {
            orElse = wbs.W(activity, R.attr.ytStaticBrandWhite).orElse(-1);
        }
        int i2 = i != 32 ? R.drawable.quantum_ic_share_black_24 : R.drawable.quantum_ic_share_white_24;
        acuVar.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        acuVar.c.a = Integer.valueOf((-16777216) | orElse);
        acuVar.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", BitmapFactory.decodeResource(activity.getResources(), resourceId));
        acuVar.b = ahe.u(this.c, R.anim.abc_slide_in_bottom, R.anim.abc_fade_out).t();
        acuVar.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ahe.u(this.c, R.anim.abc_fade_in, R.anim.abc_slide_out_bottom).t());
        Bitmap decodeResource = BitmapFactory.decodeResource(this.c.getResources(), i2);
        String string = this.c.getString(R.string.accessibility_share_page);
        Context context = this.c;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) CustomTabsReceiver.class), yny.M() | 134217728);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", string);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
        acuVar.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        acuVar.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", false);
        acv a = acuVar.a();
        a.a.setPackage(this.a);
        ykp.c(this.c, a.a, uri);
        a.a.putExtra("com.android.browser.application_id", this.c.getPackageName());
        a.a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", z);
        a.a.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", z2);
        a.a.putExtra("org.chromium.chrome.browser.customtabs.HIDE_INCOGNITO_ICON", z2);
        a.a.putExtra("org.chromium.chrome.browser.customtabs.USE_NORMAL_PROFILE_STYLE", z2);
        return a;
    }
}
