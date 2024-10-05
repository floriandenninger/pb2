package defpackage;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akva {
    public static final String[] a = {"_id", "mime_type", "duration", "latitude", "longitude", "_size"};
    private static final Pattern c = Pattern.compile("^(\\p{Digit}+@)?media");
    public final ContentResolver b;

    public akva(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    public static Uri a(Intent intent) {
        Uri uri;
        if (intent == null) {
            return Uri.EMPTY;
        }
        String action = intent.getAction();
        return (action == null || !action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD") || (uri = (Uri) intent.getParcelableExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri")) == null) ? Uri.EMPTY : uri;
    }

    public static ammv b(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation")) {
            return amlr.a;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation");
        if (byteArrayExtra == null) {
            return amlr.a;
        }
        try {
            return ammv.i((awaf) aonm.parseFrom(awaf.a, byteArrayExtra, aomw.b()));
        } catch (aoob unused) {
            return amlr.a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static avtn c(Intent intent) {
        char c2;
        String action = intent.getAction();
        if (action == null) {
            return avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        }
        switch (action.hashCode()) {
            case -1173264947:
                if (action.equals("android.intent.action.SEND")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -58484670:
                if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 895964971:
                if (action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1004674969:
                if (action.equals("com.google.android.youtube.intent.action.UPLOAD")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            avtn b = avtn.b(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 4));
            return b != null ? b : avtn.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
        }
        if (c2 != 1 && c2 != 2 && c2 != 3) {
            return avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        }
        int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 5);
        avtn b2 = avtn.b(intExtra);
        if (b2 == null) {
            b2 = avtn.UPLOAD_FLOW_SOURCE_EXTERNAL;
        }
        return (intExtra < 64 || intExtra > 127) ? avtn.UPLOAD_FLOW_SOURCE_EXTERNAL : b2;
    }

    public static Long d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    public static Long e(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms")) {
            return null;
        }
        Long valueOf = Long.valueOf(intent.getLongExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", 0L));
        if (valueOf.longValue() <= 0) {
            return null;
        }
        return valueOf;
    }

    public static boolean f(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if ("file".equals(scheme)) {
            return true;
        }
        if ("content".equals(scheme)) {
            String authority = uri.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                return c.matcher(authority).matches();
            }
        }
        return false;
    }

    public static boolean g(Intent intent) {
        return intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", false);
    }

    public static boolean h(avtn avtnVar) {
        avtn avtnVar2 = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        akzq akzqVar = akzq.UNKNOWN_UPLOAD;
        switch (avtnVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return false;
            case 5:
            default:
                return true;
        }
    }

    public static boolean i(avtn avtnVar) {
        avtn avtnVar2 = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        akzq akzqVar = akzq.UNKNOWN_UPLOAD;
        int ordinal = avtnVar.ordinal();
        return ordinal == 7 || ordinal == 8;
    }

    public static boolean j(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", false);
    }

    public static akzq k(int i) {
        avtn avtnVar = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        akzq akzqVar = akzq.UNKNOWN_UPLOAD;
        int i2 = i - 1;
        if (i2 == 1) {
            return akzq.NORMAL_UPLOAD;
        }
        if (i2 == 2) {
            return akzq.REELS_UPLOAD;
        }
        if (i2 == 4) {
            return akzq.FEEDBACK_ONLY_UPLOAD;
        }
        if (i2 == 5) {
            return akzq.LIVE_HIGHLIGHT_UPLOAD;
        }
        if (i2 == 6) {
            return akzq.SHORTS_UPLOAD;
        }
        zga.b("Unsupported upload flow flavor.");
        return akzq.UNKNOWN_UPLOAD;
    }

    public static int l(Intent intent) {
        int ag;
        if (intent == null || (ag = awxr.ag(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", 1))) == 0) {
            return 2;
        }
        return ag;
    }

    public static int m(akzq akzqVar) {
        if (akzqVar == null) {
            return 1;
        }
        avtn avtnVar = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
        int ordinal = akzqVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 6;
        }
        if (ordinal == 5) {
            return 7;
        }
        zga.b("Unsupported upload type.");
        return 1;
    }

    public static aone n(ayro ayroVar, aone aoneVar, Object obj, String str) {
        if (obj != null) {
            try {
                return (aone) ayroVar.a(aoneVar, obj);
            } catch (Exception unused) {
                zga.l("Cannot apply media store video metadata.");
            }
        }
        zga.l(str);
        return aoneVar;
    }
}
