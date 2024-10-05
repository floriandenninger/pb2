package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbq implements agbr {
    private static final amrz i;
    private static final amrz j;
    public final Context a;
    public final int b;
    public final int c;
    public final Intent d;
    public final Intent e;
    public final shf f;
    public final ammv g;
    public volatile boolean h = false;
    private final int k;
    private final afzy l;
    private final ajjz m;

    static {
        amrw amrwVar = new amrw();
        atng atngVar = atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END;
        Integer valueOf = Integer.valueOf(R.layout.custom_notification_large_thumbnail_end);
        amrwVar.g(atngVar, valueOf);
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END, Integer.valueOf(R.layout.custom_notification_medium_thumbnail_end));
        atng atngVar2 = atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START;
        Integer valueOf2 = Integer.valueOf(R.layout.custom_notification_basic_thumbnail_start);
        amrwVar.g(atngVar2, valueOf2);
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_GRAY, Integer.valueOf(R.layout.custom_notification_large_thumbnail_end_gray));
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_GRAY, Integer.valueOf(R.layout.custom_notification_medium_thumbnail_end_gray));
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TITLE, Integer.valueOf(R.layout.custom_notification_large_thumbnail_end_multiline_title));
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TEXT, Integer.valueOf(R.layout.custom_notification_large_thumbnail_end_multiline_text));
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TITLE, Integer.valueOf(R.layout.custom_notification_basic_thumbnail_start_multiline_title));
        amrwVar.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TEXT, Integer.valueOf(R.layout.custom_notification_basic_thumbnail_start_multiline_text));
        i = amrwVar.c();
        amrw amrwVar2 = new amrw();
        amrwVar2.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END, valueOf);
        amrwVar2.g(atng.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START, valueOf2);
        j = amrwVar2.c();
    }

    public agbq(Context context, int i2, int i3, int i4, Intent intent, Intent intent2, shf shfVar, afzy afzyVar, ajjz ajjzVar, ammv ammvVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.b = i2;
        this.k = i3;
        this.c = i4;
        this.d = intent;
        this.e = intent2;
        this.f = shfVar;
        this.l = afzyVar;
        this.m = ajjzVar;
        this.g = ammvVar;
        axzeVar.a.a.Y(axyz.q).B().ax(new ayrs() { // from class: agbm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                agbq.this.h = ((Boolean) obj).booleanValue();
            }
        });
    }

    public static AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer c(apeo apeoVar) {
        if ((apeoVar.b & 4096) == 0) {
            return null;
        }
        aulq aulqVar = apeoVar.s;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer)) {
            return null;
        }
        aulq aulqVar2 = apeoVar.s;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer) aulqVar2.pX(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer);
    }

    @Override // defpackage.agbr
    public final void a(final apeo apeoVar, acra acraVar, final agbs agbsVar, final dy dyVar) {
        Object obj;
        amrz c;
        zfi zfiVar = new zfi() { // from class: agbj
            @Override // defpackage.zfi
            public final void a(Object obj2) {
                agbq agbqVar = agbq.this;
                dy dyVar2 = dyVar;
                apeo apeoVar2 = apeoVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i2 = agbqVar.b;
                int i3 = agbqVar.c;
                AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer c2 = agbq.c(apeoVar2);
                if (c2 == null) {
                    return;
                }
                apek apekVar = apeoVar2.e;
                if (apekVar == null) {
                    apekVar = apek.a;
                }
                apek apekVar2 = apekVar;
                Context context = agbqVar.a;
                shf shfVar = agbqVar.f;
                amrz b = agbqVar.b();
                atng b2 = atng.b(c2.f);
                if (b2 == null) {
                    b2 = atng.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
                }
                agbx.a(dyVar2, c2, apekVar2, context, shfVar, bitmap, i2, i3, ((Integer) b.get(b2)).intValue());
            }
        };
        zfi zfiVar2 = new zfi() { // from class: agbk
            @Override // defpackage.zfi
            public final void a(Object obj2) {
                agbq agbqVar = agbq.this;
                dy dyVar2 = dyVar;
                apeo apeoVar2 = apeoVar;
                agbs agbsVar2 = agbsVar;
                AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer = (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer) obj2;
                Context context = agbqVar.a;
                ammv ammvVar = agbqVar.g;
                Intent intent = agbqVar.e;
                Intent intent2 = agbqVar.d;
                if (androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer != null) {
                    apek apekVar = apeoVar2.e;
                    if (apekVar == null) {
                        apekVar = apek.a;
                    }
                    aovq aovqVar = apeoVar2.o;
                    if (aovqVar == null) {
                        aovqVar = aovq.a;
                    }
                    agbx.b(dyVar2, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer, apekVar, aovqVar, context, (ajut) ((amna) ammvVar).a, agbsVar2, intent, intent2);
                }
            }
        };
        ayro ayroVar = new ayro() { // from class: agbl
            @Override // defpackage.ayro
            public final Object a(Object obj2, Object obj3) {
                agbq agbqVar = agbq.this;
                apeo apeoVar2 = apeoVar;
                Bitmap bitmap = (Bitmap) obj2;
                int dimension = (int) agbqVar.a.getResources().getDimension(android.R.dimen.notification_large_icon_width);
                int dimension2 = (int) agbqVar.a.getResources().getDimension(android.R.dimen.notification_large_icon_height);
                apem b = apem.b(apeoVar2.p);
                if (b == null) {
                    b = apem.ICON_IMAGE_STYLE_DEFAULT;
                }
                agbp agbpVar = agbp.BIG_PICTURE_STYLE;
                if (b.ordinal() == 2) {
                    if (bitmap.getWidth() >= bitmap.getHeight()) {
                        return Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
                    }
                    return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
                }
                return Bitmap.createScaledBitmap(bitmap, dimension, dimension2, true);
            }
        };
        agbc agbcVar = agbc.d;
        if (apeoVar == null) {
            return;
        }
        int i2 = this.c;
        amrw amrwVar = new amrw();
        amsv amsvVar = new amsv();
        amsvVar.i(agbp.BIG_PICTURE_STYLE, agbp.LARGE_ICON);
        if (i2 != 0 && (apeoVar.b & 4096) != 0) {
            aulq aulqVar = apeoVar.s;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer)) {
                aulq aulqVar2 = apeoVar.s;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                if ((((AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer) aulqVar2.pX(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer)).b & 2) != 0) {
                    amrz b = b();
                    aulq aulqVar3 = apeoVar.s;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    atng b2 = atng.b(((AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer) aulqVar3.pX(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer)).f);
                    if (b2 == null) {
                        b2 = atng.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
                    }
                    if (b.containsKey(b2)) {
                        amsvVar.c(agbp.CUSTOM_STYLE_THUMBNAIL);
                    }
                }
            }
        }
        amxd listIterator = amsvVar.g().listIterator();
        while (true) {
            obj = null;
            if (!listIterator.hasNext()) {
                break;
            }
            agbp agbpVar = (agbp) listIterator.next();
            apem apemVar = apem.ICON_IMAGE_STYLE_DEFAULT;
            int ordinal = agbpVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer c2 = c(apeoVar);
                    if (c2 != null) {
                        avgg avggVar = c2.e;
                        if (avggVar == null) {
                            avggVar = avgg.a;
                        }
                        obj = ahbw.E(avggVar);
                    }
                } else if (ordinal == 2 && (apeoVar.b & 1) != 0) {
                    apek apekVar = apeoVar.e;
                    if (apekVar == null) {
                        apekVar = apek.a;
                    }
                    avgg avggVar2 = apekVar.j;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    obj = ahbw.E(avggVar2);
                }
            } else if (apeoVar.c == 17) {
                avgg avggVar3 = ((apel) apeoVar.d).b;
                if (avggVar3 == null) {
                    avggVar3 = avgg.a;
                }
                obj = ahbw.E(avggVar3);
            }
            if (obj != null) {
                amrwVar.g(agbpVar, obj);
            }
        }
        amrz c3 = amrwVar.c();
        this.l.a(atna.NOTAIRE_EVENT_TYPE_BITMAP_FETCH_STARTED, apeoVar);
        ajjz ajjzVar = this.m;
        amrw amrwVar2 = new amrw();
        if (c3.isEmpty()) {
            c = amrwVar2.c();
        } else {
            amsx entrySet = c3.entrySet();
            CountDownLatch countDownLatch = new CountDownLatch(entrySet.size());
            amxd listIterator2 = entrySet.listIterator();
            while (listIterator2.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator2.next();
                agbp agbpVar2 = (agbp) entry.getKey();
                Uri uri = (Uri) entry.getValue();
                if (!wbs.al(uri)) {
                    zga.b("Insecure URL used for notification image, ignoring");
                    countDownLatch.countDown();
                } else {
                    ajjzVar.l(uri, new agbo(amrwVar2, agbpVar2, countDownLatch, ajjzVar, uri, new agbn(amrwVar2, agbpVar2, countDownLatch)));
                }
            }
            try {
                countDownLatch.await(60L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            c = amrwVar2.c();
        }
        this.l.a(atna.NOTAIRE_EVENT_TYPE_BITMAP_FETCH_FINISHED, apeoVar);
        apek apekVar2 = apeoVar.e;
        if (apekVar2 == null) {
            apekVar2 = apek.a;
        }
        if (c(apeoVar) == null || !c.containsKey(agbp.CUSTOM_STYLE_THUMBNAIL)) {
            AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer e = aghv.e(apeoVar);
            if (e != null) {
                zfiVar2.a(e);
            }
        } else {
            zfiVar.a((Bitmap) c.get(agbp.CUSTOM_STYLE_THUMBNAIL));
        }
        Bitmap bitmap = (Bitmap) c.get(agbp.LARGE_ICON);
        Resources resources = this.a.getResources();
        if (bitmap != null) {
            try {
                apem b3 = apem.b(apeoVar.p);
                if (b3 == null) {
                    b3 = apem.ICON_IMAGE_STYLE_DEFAULT;
                }
                obj = ayroVar.a(bitmap, b3);
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Exception while scaling large icon Bitmap: ");
                sb.append(valueOf);
                zga.b(sb.toString());
            }
        } else {
            obj = bitmap;
        }
        if (obj == null) {
            obj = BitmapFactory.decodeResource(resources, this.k);
        }
        dyVar.n((Bitmap) obj);
        Bitmap bitmap2 = (Bitmap) c.get(agbp.BIG_PICTURE_STYLE);
        if (bitmap2 != null) {
            try {
                dyVar.s((ea) agbcVar.a(apekVar2, bitmap2));
            } catch (Exception e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append("Exception while creating BigPictureStyle: ");
                sb2.append(valueOf2);
                zga.b(sb2.toString());
            }
        }
    }

    public final amrz b() {
        return this.h ? j : i;
    }
}
