package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class prh {
    public static int D(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int E(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int F(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static qdk G(Context context) {
        return new qdw(context);
    }

    private static String H(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace2).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append('\n');
        return sb.toString();
    }

    public static prn g(prn prnVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (prnVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (prn) map.get(strArr[0]);
            }
            if (length2 > 1) {
                prn prnVar2 = new prn();
                while (i < length2) {
                    prnVar2.d((prn) map.get(strArr[i]));
                    i++;
                }
                return prnVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                prnVar.d((prn) map.get(strArr[0]));
                return prnVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    prnVar.d((prn) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return prnVar;
    }

    public static void h(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void j(String str, String str2, Throwable th) {
        Log.e(str, H(str2, th));
    }

    public static void k(String str, String str2, Throwable th) {
        Log.w(str, H(str2, th));
    }

    public static void l(String str) {
        try {
            try {
                rbd rbdVar = rak.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        Log.w("HttpUrlPinger", sb.toString());
                    }
                    rbd rbdVar2 = rak.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                Log.w("HttpUrlPinger", sb2.toString(), e);
                rbd rbdVar3 = rak.a;
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), e2);
                rbd rbdVar4 = rak.a;
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                Log.w("HttpUrlPinger", sb22.toString(), e);
                rbd rbdVar32 = rak.a;
            }
        } catch (Throwable th) {
            rbd rbdVar5 = rak.a;
            throw th;
        }
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static MediaQueueData p(MediaQueueData mediaQueueData) {
        return new MediaQueueData(mediaQueueData);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void q(JSONObject jSONObject, MediaQueueData mediaQueueData) {
        char c;
        mediaQueueData.a();
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.a = qko.e(jSONObject, "id");
        mediaQueueData.b = qko.e(jSONObject, "entity");
        String optString = jSONObject.optString("queueType");
        char c2 = 65535;
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1632865838:
                if (optString.equals("PLAYLIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (optString.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 73549584:
                if (optString.equals("MOVIE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mediaQueueData.c = 1;
                break;
            case 1:
                mediaQueueData.c = 2;
                break;
            case 2:
                mediaQueueData.c = 3;
                break;
            case 3:
                mediaQueueData.c = 4;
                break;
            case 4:
                mediaQueueData.c = 5;
                break;
            case 5:
                mediaQueueData.c = 6;
                break;
            case 6:
                mediaQueueData.c = 7;
                break;
            case 7:
                mediaQueueData.c = 8;
                break;
            case '\b':
                mediaQueueData.c = 9;
                break;
        }
        mediaQueueData.d = qko.e(jSONObject, "name");
        JSONObject optJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
        if (optJSONObject != null) {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
            mediaQueueContainerMetadata.a();
            String optString2 = optJSONObject.optString("containerType", "");
            int hashCode = optString2.hashCode();
            if (hashCode != 6924225) {
                if (hashCode == 828666841 && optString2.equals("GENERIC_CONTAINER")) {
                    c2 = 0;
                }
            } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                c2 = 1;
            }
            if (c2 == 0) {
                mediaQueueContainerMetadata.a = 0;
            } else if (c2 == 1) {
                mediaQueueContainerMetadata.a = 1;
            }
            mediaQueueContainerMetadata.b = qko.e(optJSONObject, "title");
            JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                mediaQueueContainerMetadata.c = new ArrayList();
                List list = mediaQueueContainerMetadata.c;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        MediaMetadata mediaMetadata = new MediaMetadata(0);
                        mediaMetadata.b(optJSONObject2);
                        list.add(mediaMetadata);
                    }
                }
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                mediaQueueContainerMetadata.d = new ArrayList();
                qle.b(mediaQueueContainerMetadata.d, optJSONArray2);
            }
            mediaQueueContainerMetadata.e = optJSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.e);
            mediaQueueData.e = new MediaQueueContainerMetadata(mediaQueueContainerMetadata);
        }
        Integer r = pse.r(jSONObject.optString("repeatMode"));
        if (r != null) {
            mediaQueueData.f = r.intValue();
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
        if (optJSONArray3 != null) {
            mediaQueueData.g = new ArrayList();
            List list2 = mediaQueueData.g;
            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    try {
                        list2.add(new MediaQueueItem(optJSONObject3));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        mediaQueueData.h = jSONObject.optInt("startIndex", mediaQueueData.h);
        if (jSONObject.has("startTime")) {
            mediaQueueData.i = qko.b(jSONObject.optDouble("startTime", mediaQueueData.i));
        }
    }

    public static String s(String str, Collection collection) {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String upperCase = str.toUpperCase();
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid application ID: ".concat(str) : new String("Invalid application ID: "));
        }
        sb.append("/");
        sb.append(upperCase);
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            sb.append("/");
            Iterator it = collection.iterator();
            boolean z = true;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                qko.i(str2);
                if (!z) {
                    sb.append(",");
                }
                if (!qko.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z = false;
            }
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    public void A() {
    }

    public void B(int i) {
    }

    public void C() {
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c(pum pumVar) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public void e() {
        throw null;
    }

    public void f() {
    }

    public void t() {
        throw null;
    }

    public void u(int i) {
        throw null;
    }

    public void v(int i) {
        throw null;
    }

    public void w(int i) {
        throw null;
    }

    public void x(int i) {
    }

    public void y(int i) {
    }

    public void z(ApplicationMetadata applicationMetadata) {
    }

    public static String r(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return s(str, null);
    }
}
