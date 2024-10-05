package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.format.DateUtils;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agbx {
    public static final /* synthetic */ int b = 0;
    private static final SparseIntArray c = new agbw((byte[]) null);
    static final SparseIntArray a = new agbw();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dy dyVar, AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, apek apekVar, final Context context, shf shfVar, Bitmap bitmap, int i, int i2, final int i3) {
        Bitmap bitmap2;
        aqyg aqygVar;
        ayrv ayrvVar = new ayrv() { // from class: agbv
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                Context context2 = context;
                return new RemoteViews(context2.getPackageName(), i3);
            }
        };
        if (i2 == 0 || i3 == 0) {
            return;
        }
        try {
            Object a2 = ayrvVar.a(Integer.valueOf(i3));
            if (bitmap != null) {
                ((RemoteViews) a2).setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap);
            }
            int K = yjk.K(context.getResources().getDisplayMetrics(), 16);
            Drawable userBadgedDrawableForDensity = context.getPackageManager().getUserBadgedDrawableForDensity(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(K, K, Bitmap.Config.ARGB_8888)), Process.myUserHandle(), new Rect(0, 0, K, K), -1);
            if (userBadgedDrawableForDensity instanceof BitmapDrawable) {
                bitmap2 = ((BitmapDrawable) userBadgedDrawableForDensity).getBitmap();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(userBadgedDrawableForDensity.getIntrinsicWidth(), userBadgedDrawableForDensity.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                userBadgedDrawableForDensity.setBounds(0, 0, userBadgedDrawableForDensity.getIntrinsicWidth(), userBadgedDrawableForDensity.getIntrinsicHeight());
                userBadgedDrawableForDensity.draw(new Canvas(createBitmap));
                bitmap2 = createBitmap;
            }
            RemoteViews remoteViews = (RemoteViews) a2;
            remoteViews.setImageViewBitmap(R.id.custom_notification_work_profile_badge, bitmap2);
            aqyg aqygVar2 = null;
            if ((apekVar.b & 8) != 0) {
                aqygVar = apekVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            remoteViews.setTextViewText(R.id.custom_notification_title, ajcq.b(aqygVar));
            if ((apekVar.b & 16) != 0 && (aqygVar2 = apekVar.g) == null) {
                aqygVar2 = aqyg.a;
            }
            remoteViews.setTextViewText(R.id.custom_notification_body, ajcq.b(aqygVar2));
            remoteViews.setImageViewResource(R.id.small_icon, i);
            atng b2 = atng.b(androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.f);
            if (b2 == null) {
                b2 = atng.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
            }
            if (b2 != atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START || androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.g) {
                long c2 = shfVar.c();
                remoteViews.setTextViewText(R.id.custom_notification_title_timestamp, DateUtils.formatSameDayTime(c2, c2, 3, 3));
            }
            Resources resources = context.getResources();
            int ordinal = b2.ordinal();
            if (ordinal == 1 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 10 || ordinal == 11) {
                int ordinal2 = b2.ordinal();
                if (ordinal2 == 1 || ordinal2 == 3 || ordinal2 == 10 || ordinal2 == 11) {
                    remoteViews.setInt(R.id.small_icon, "setColorFilter", resources.getColor(R.color.small_icon_background));
                }
                remoteViews.setTextViewText(R.id.custom_notification_title_text, resources.getString(i2));
            }
            int ce = anaf.ce(androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.h);
            if (ce != 0 && ce == 2) {
                remoteViews.setTextColor(R.id.custom_notification_title, resources.getColor(R.color.yt_white1));
                remoteViews.setTextColor(R.id.custom_notification_title_timestamp, resources.getColor(R.color.white_text_body));
                remoteViews.setTextColor(R.id.custom_notification_body, resources.getColor(R.color.white_text_body));
            }
            int intValue = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c == 3 ? ((Integer) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).intValue() : 0;
            if (intValue != 0) {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 0);
                remoteViews.setTextViewText(R.id.custom_notification_thumbnail_duration, DateUtils.formatElapsedTime(intValue));
            } else {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 8);
            }
            boolean booleanValue = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c == 6 ? ((Boolean) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).booleanValue() : false;
            if (!booleanValue && (androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c != 7 || !((Boolean) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).booleanValue())) {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 8);
            } else {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 0);
                if (booleanValue) {
                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_live));
                } else {
                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_premiere));
                }
            }
            dyVar.h(remoteViews);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Exception while creating RemoteViews: ");
            sb.append(valueOf);
            zga.b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(dy dyVar, AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer, apek apekVar, aovq aovqVar, final Context context, ajut ajutVar, agbs agbsVar, Intent intent, Intent intent2) {
        agbu agbuVar = new agbu(context, 0);
        ayro ayroVar = new ayro() { // from class: agbt
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                Context context2 = context;
                Intent intent3 = (Intent) obj2;
                int i = agbx.b;
                if (((Boolean) obj).booleanValue()) {
                    return aghv.h(context2, intent3);
                }
                return aghv.i(context2, intent3);
            }
        };
        try {
            Object a2 = agbuVar.a(Integer.valueOf(R.layout.notification_survey_five_options));
            aqyg aqygVar = apekVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            RemoteViews remoteViews = (RemoteViews) a2;
            remoteViews.setTextViewText(R.id.custom_notification_title, ajcq.b(aqygVar));
            aqyg aqygVar2 = apekVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            remoteViews.setTextViewText(R.id.custom_notification_text, ajcq.b(aqygVar2));
            for (int i = 0; i < androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.b.size(); i++) {
                aulq aulqVar = (aulq) androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.b.get(i);
                int i2 = c.get(i, 0);
                int i3 = a.get(i, 0);
                if (i2 != 0) {
                    AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) aulqVar.pX(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                    arfs arfsVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.c;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    remoteViews.setImageViewResource(i2, ajutVar.a(b2));
                    int i4 = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b;
                    if ((i4 & 4) != 0 || (i4 & 2) != 0) {
                        Intent intent3 = new Intent((i4 & 2) == 0 ? intent2 : intent);
                        aear.L(intent3, agbsVar);
                        if ((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 2) != 0) {
                            apxf apxfVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.d;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aghv.k(intent3, apxfVar, null, false);
                        }
                        if ((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 4) != 0) {
                            apxf apxfVar2 = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.e;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aghv.j(intent3, apxfVar2);
                        }
                        aear.T(intent3, aovqVar);
                        try {
                            remoteViews.setOnClickPendingIntent(i3, (PendingIntent) ayroVar.a(Boolean.valueOf((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 2) != 0), intent3));
                            remoteViews.setViewVisibility(i3, 0);
                        } catch (Exception e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                            sb.append("Exception while getting PendingIntent for survey option: ");
                            sb.append(valueOf);
                            zga.b(sb.toString());
                        }
                    }
                }
            }
            dyVar.h(remoteViews);
            dyVar.D = remoteViews;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
            sb2.append("Exception while providing RemoveViews: ");
            sb2.append(valueOf2);
            zga.b(sb2.toString());
        }
    }
}
