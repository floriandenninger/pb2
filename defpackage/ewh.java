package defpackage;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.apps.youtube.app.common.command.androidshareintent.ShareLoggingBroadcastReceiver;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import com.google.protos.youtube.api.innertube.SendSmsEndpointOuterClass$SendSmsEndpoint;
import com.google.protos.youtube.api.innertube.ShowSystemToastActionOuterClass$ShowSystemToastAction;
import com.google.protos.youtube.api.innertube.StatusUpdateNotificationRendererOuterClass;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewh implements aaha {
    private final Context a;
    private final /* synthetic */ int b;

    public ewh(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public ewh(Context context, int i, byte[] bArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    private final void b(Intent intent, AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) {
        this.a.startActivity(Intent.createChooser(intent, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.e));
    }

    private final Intent c() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
        } else {
            intent.setClassName("com.android.settings", "com.android.settings.Settings$AppNotificationSettingsActivity");
            intent.putExtra("app_package", this.a.getPackageName());
            intent.putExtra("app_uid", this.a.getApplicationInfo().uid);
        }
        return intent;
    }

    private final void d(int i) {
        Toast.makeText(this.a, this.a.getString(i), 1).show();
    }

    public ewh(Context context, yjk yjkVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = context;
        yjkVar.getClass();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Intent intent;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3 = null;
        aqyg aqygVar4 = null;
        r14 = null;
        agap agapVar = null;
        switch (this.b) {
            case 0:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) apxfVar.pX(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                for (askp askpVar : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c) {
                    intent2.putExtra(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
                }
                intent2.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.d);
                if ((androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b & 4) == 0 || Build.VERSION.SDK_INT < 22) {
                    b(intent2, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
                    return;
                }
                Context context = this.a;
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, uzj.a(new Intent(context, (Class<?>) ShareLoggingBroadcastReceiver.class), 134217728), 134217728);
                if (broadcast == null) {
                    b(intent2, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
                    return;
                } else {
                    intent2.putExtra("YTShare_Logging_Share_Entity", androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.f);
                    this.a.startActivity(Intent.createChooser(intent2, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.e, broadcast.getIntentSender()));
                    return;
                }
            case 1:
                int bI = amkq.bI(((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) apxfVar.pX(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint)).b);
                int i = bI != 0 ? bI : 1;
                if (i == 2) {
                    intent = c();
                } else if (i != 3) {
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    String valueOf = String.valueOf(this.a.getPackageName());
                    intent.setData(Uri.parse(valueOf.length() != 0 ? "package:".concat(valueOf) : new String("package:")));
                } else {
                    String str = ((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) apxfVar.pX(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint)).c;
                    if (Build.VERSION.SDK_INT < 26 || TextUtils.isEmpty(str)) {
                        intent = c();
                    } else {
                        Intent intent3 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent3.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
                        intent3.putExtra("android.provider.extra.CHANNEL_ID", str);
                        intent = intent3;
                    }
                }
                this.a.startActivity(intent);
                return;
            case 2:
                if (((TextMessageEndpointOuterClass$TextMessageEndpoint) apxfVar.pX(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint)).b.isEmpty()) {
                    zga.b("Cannot send SMS without body.");
                    return;
                }
                TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = (TextMessageEndpointOuterClass$TextMessageEndpoint) apxfVar.pX(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
                String valueOf2 = String.valueOf(TextUtils.join(";", textMessageEndpointOuterClass$TextMessageEndpoint.c));
                Intent intent4 = new Intent("android.intent.action.SENDTO", Uri.parse(valueOf2.length() != 0 ? "smsto:".concat(valueOf2) : new String("smsto:")));
                intent4.putExtra("sms_body", textMessageEndpointOuterClass$TextMessageEndpoint.b);
                this.a.startActivity(intent4);
                return;
            case 3:
                String str2 = ((apgt) apxfVar.pX(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b;
                if (TextUtils.isEmpty(str2)) {
                    d(R.string.error_link_cannot_be_opened);
                    return;
                }
                Uri aj = wbs.aj(str2);
                Context context2 = this.a;
                Intent intent5 = new Intent("android.intent.action.VIEW", aj);
                ajcq.q(context2, intent5);
                try {
                    this.a.startActivity(intent5.setFlags(268435456));
                    return;
                } catch (ActivityNotFoundException unused) {
                    d(R.string.authorized_url_error_browser_not_found);
                    return;
                }
            case 4:
                Intent intent6 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", ((PhoneDialerEndpointOuterClass$PhoneDialerEndpoint) apxfVar.pX(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint)).b, null));
                ajcq.q(this.a, intent6);
                if (ykp.g(this.a, intent6)) {
                    afsi.b(1, 1, "PhoneDialerCommand succeeds to open phone apps.");
                    this.a.startActivity(intent6.setFlags(268435456));
                    return;
                } else {
                    afsi.b(1, 1, "PhoneDialerCommand fails to open phone apps.");
                    whu.K(this.a, R.string.error_no_phone_apps_installed, 1);
                    return;
                }
            case 5:
                SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = (SendSmsEndpointOuterClass$SendSmsEndpoint) apxfVar.pX(SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint);
                String join = TextUtils.join(", ", sendSmsEndpointOuterClass$SendSmsEndpoint.b);
                Context context3 = this.a;
                Intent intent7 = new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", join, null));
                ajcq.q(context3, intent7);
                intent7.putExtra("android.intent.extra.SUBJECT", sendSmsEndpointOuterClass$SendSmsEndpoint.d);
                intent7.putExtra("android.intent.extra.TEXT", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                intent7.putExtra("sms_body", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                if (ykp.g(this.a, intent7)) {
                    this.a.startActivity(intent7.setFlags(268435456));
                    return;
                } else {
                    whu.K(this.a, R.string.error_no_messaging_apps_installed, 1);
                    return;
                }
            case 6:
                Intent intent8 = new Intent();
                intent8.setClassName(this.a, "com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity");
                intent8.putExtra("navigation_endpoint", apxfVar.toByteArray());
                this.a.startActivity(intent8);
                return;
            case 7:
                Context context4 = this.a;
                apde apdeVar = (apde) apxfVar.pX(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
                Intent intent9 = new Intent(apdeVar.d);
                List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent9, 0);
                String str3 = apdeVar.c;
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ResolveInfo next = it.next();
                        if (str3.equals(next.activityInfo.packageName)) {
                            intent9.setComponent(new ComponentName(str3, next.activityInfo.name));
                        }
                    }
                }
                if ((apdeVar.b & 4) != 0) {
                    intent9.setData(Uri.parse(apdeVar.e));
                }
                for (askp askpVar2 : apdeVar.f) {
                    int i2 = askpVar2.c;
                    int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i4 == 0) {
                        intent9.putExtra(askpVar2.e, i2 == 2 ? (String) askpVar2.d : "");
                    } else if (i4 == 1) {
                        String str4 = askpVar2.e;
                        if (i2 == 3) {
                            aqygVar = (aqyg) askpVar2.d;
                        } else {
                            aqygVar = aqyg.a;
                        }
                        intent9.putExtra(str4, ajcq.b(aqygVar));
                    } else if (i4 == 2) {
                        intent9.putExtra(askpVar2.e, i2 == 4 ? ((Integer) askpVar2.d).intValue() : 0);
                    } else if (i4 == 3) {
                        intent9.putExtra(askpVar2.e, i2 == 5 ? ((Boolean) askpVar2.d).booleanValue() : false);
                    } else if (i4 == 4) {
                        intent9.putExtra(askpVar2.e, i2 == 6 ? ((Double) askpVar2.d).doubleValue() : 0.0d);
                    }
                }
                if (!yjj.n(this.a).h()) {
                    intent9.setFlags(268435456);
                }
                context4.startActivity(intent9);
                return;
            case 8:
                Uri aj2 = wbs.aj(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c);
                Intent intent10 = new Intent("android.intent.action.VIEW", aj2);
                if (this.a.getPackageManager().queryIntentActivities(intent10, 128).size() <= 0) {
                    whu.K(this.a, R.string.error_link_cannot_be_opened, 0);
                    return;
                } else {
                    ykp.c(this.a, intent10, aj2);
                    this.a.startActivity(intent10.setFlags(268435456));
                    return;
                }
            case 9:
                if (apxfVar.pY(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction)) {
                    ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = (ShowSystemToastActionOuterClass$ShowSystemToastAction) apxfVar.pX(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction);
                    if ((showSystemToastActionOuterClass$ShowSystemToastAction.b & 1) != 0 && (aqygVar3 = showSystemToastActionOuterClass$ShowSystemToastAction.c) == null) {
                        aqygVar3 = aqyg.a;
                    }
                    Spanned b = ajcq.b(aqygVar3);
                    if (TextUtils.isEmpty(b)) {
                        return;
                    }
                    Toast.makeText(this.a, b, 1).show();
                    this.a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    return;
                }
                return;
            case 10:
                agak agakVar = (agak) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", agak.class);
                if (agakVar == null) {
                    String valueOf3 = String.valueOf(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                    sb.append("incorrect parameter: ");
                    sb.append(valueOf3);
                    Log.e("UpdateNotificationActionCommand", sb.toString());
                    return;
                }
                aulq aulqVar = ((avsn) apxfVar.pX(avsn.b)).c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                auxy auxyVar = (auxy) aulqVar.pX(StatusUpdateNotificationRendererOuterClass.statusUpdateNotificationRenderer);
                Context context5 = this.a;
                String str5 = agakVar.b;
                int i5 = agakVar.a;
                if (auxyVar != null && (auxyVar.b & 1) != 0) {
                    dy dyVar = new dy(context5);
                    if ((auxyVar.b & 2) != 0) {
                        aqygVar2 = auxyVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    dyVar.k(ajcq.b(aqygVar2));
                    dyVar.r(R.drawable.ic_stat_yt_notification_logo);
                    if ((auxyVar.b & 1) != 0 && (aqygVar4 = auxyVar.c) == null) {
                        aqygVar4 = aqyg.a;
                    }
                    dyVar.j(ajcq.b(aqygVar4));
                    agbs b2 = agbs.b(str5, i5, yjk.q());
                    aear.K(dyVar, b2);
                    agapVar = new agap(dyVar.b(), b2);
                }
                if (agapVar != null) {
                    agapVar.a(this.a, true);
                    return;
                }
                String valueOf4 = String.valueOf(apxfVar.pX(avsn.b));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 33);
                sb2.append("build systemNotification failed :");
                sb2.append(valueOf4);
                Log.e("UpdateNotificationActionCommand", sb2.toString());
                return;
            default:
                aear.U(this.a);
                return;
        }
    }
}
