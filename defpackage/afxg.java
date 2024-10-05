package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxg {
    public final List a;
    public final int b;

    public afxg(int i, List list) {
        this.b = i;
        this.a = list;
    }

    public afxg(int i, List list, List list2, List list3, List list4) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
        Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        Collections.unmodifiableList(list4);
    }

    public static afxg a(Uri uri) {
        if (wbs.al(uri)) {
            uri = uri.buildUpon().scheme("http").build();
        }
        if ("vnd.youtube".equals(uri.getScheme())) {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            if (schemeSpecificPart.startsWith("//")) {
                schemeSpecificPart = schemeSpecificPart.substring(2);
            }
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("No video id in the Uri: ");
                sb.append(valueOf);
                throw new ParseException(sb.toString(), 0);
            }
            int indexOf = schemeSpecificPart.indexOf(63);
            if (indexOf > 0) {
                schemeSpecificPart = schemeSpecificPart.substring(0, indexOf);
            }
            Map e = e(uri);
            return new afxg(schemeSpecificPart, e, b((String) e.get("t")));
        }
        if ("youtu.be".equalsIgnoreCase(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || TextUtils.isEmpty(pathSegments.get(0))) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb2.append("No video id in the Uri path: ");
                sb2.append(valueOf2);
                throw new ParseException(sb2.toString(), 0);
            }
            Map e2 = e(uri);
            return new afxg(pathSegments.subList(0, 1), f(e2), c(uri, e2));
        }
        String path = uri.getPath();
        String fragment = uri.getFragment();
        if (path.startsWith("/watch") || path.startsWith("/movie")) {
            return d(uri);
        }
        if (path.startsWith("/get_video")) {
            Map e3 = e(uri);
            String str = (String) e3.get("video_id");
            if (!TextUtils.isEmpty(str)) {
                return new afxg(str, f(e3), c(uri, e3));
            }
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb3.append("No id found in the uri: ");
            sb3.append(valueOf3);
            throw new ParseException(sb3.toString(), 0);
        }
        if (path.startsWith("/v/")) {
            String[] split = uri.getLastPathSegment().split("&");
            String str2 = split[0];
            HashMap hashMap = new HashMap();
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
            return new afxg(str2, hashMap, b((String) hashMap.get("start")));
        }
        if (path.startsWith("/e/") || path.startsWith("/embed/")) {
            return new afxg(uri.getLastPathSegment(), e(uri), b(uri.getQueryParameter("start")));
        }
        if (fragment == null || (!fragment.startsWith("/watch") && !fragment.startsWith("watch"))) {
            throw new ParseException("Unrecognised URI", 0);
        }
        return d(Uri.parse(uri.buildUpon().encodedPath(uri.getFragment()).fragment("").build().toString()));
    }

    private static int b(String str) {
        int i;
        if (str == null) {
            return 0;
        }
        int indexOf = str.indexOf("h");
        if (indexOf >= 0) {
            i = zhq.b(str.substring(0, indexOf), 0) * 3600000;
            str = str.substring(indexOf + 1);
        } else {
            i = 0;
        }
        int indexOf2 = str.indexOf("m");
        if (indexOf2 >= 0) {
            i += zhq.b(str.substring(0, indexOf2), 0) * 60000;
            str = str.substring(indexOf2 + 1);
        }
        if (str.endsWith("s")) {
            str = str.substring(0, str.length() - 1);
        }
        return i + ((int) (zhq.a(str, 0.0f) * 1000.0f));
    }

    private static int c(Uri uri, Map map) {
        String str = (String) map.get("t");
        if (str == null) {
            String decode = Uri.decode(uri.getEncodedFragment());
            if (!TextUtils.isEmpty(decode)) {
                for (String str2 : decode.split("&")) {
                    String[] split = str2.split("=");
                    if (split.length == 2 && "t".equals(split[0])) {
                        str = split[1];
                    }
                }
            }
        }
        return b(str);
    }

    private static afxg d(Uri uri) {
        Map e = e(uri);
        String str = (String) e.get("v");
        String str2 = (String) e.get("video_ids");
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            List<String> pathSegments = uri.getPathSegments();
            int indexOf = pathSegments.indexOf("watch");
            if (indexOf < 0) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("No /watch/ part in the Uri: ");
                sb.append(valueOf);
                throw new ParseException(sb.toString(), 0);
            }
            int i = indexOf + 1;
            if (i >= pathSegments.size()) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("No id found in the Uri: ");
                sb2.append(valueOf2);
                throw new ParseException(sb2.toString(), 0);
            }
            str = pathSegments.get(i);
            if (TextUtils.isEmpty(str)) {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                sb3.append("No video id in the Uri: ");
                sb3.append(valueOf3);
                throw new ParseException(sb3.toString(), 0);
            }
        }
        if (str2 == null) {
            return new afxg(str, f(e), c(uri, e));
        }
        return new afxg(Arrays.asList(str2.split(",")), f(e), c(uri, e));
    }

    private static Map e(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static Map f(Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("v");
        hashMap.remove("video_id");
        hashMap.remove("video_ids");
        hashMap.remove("feature");
        return hashMap;
    }

    public afxg() {
        this.b = 1;
        this.a = new ArrayList();
    }

    private afxg(String str, Map map, int i) {
        this(Collections.singletonList(str), map, i);
    }

    private afxg(List list, Map map, int i) {
        list.getClass();
        this.a = Collections.unmodifiableList(list);
        amkq.F(!r2.isEmpty(), "videoIds cannot be empty");
        map.getClass();
        Collections.unmodifiableMap(map);
        this.b = i;
    }
}
