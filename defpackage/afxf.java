package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxf {
    public static final Pattern a = Pattern.compile("(?:\\[|%5B)([a-zA-Z_:]+)(?:\\]|%5D)");
    private Map b;
    private Map c;

    public afxf() {
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public static Map c(Map map) {
        map.getClass();
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(Pattern.compile((String) it.next(), 0));
            }
            if (arrayList.size() > 0) {
                hashMap.put(str, arrayList);
            }
        }
        return hashMap;
    }

    public static Set d(List list, Map map) {
        String group;
        if (list == null || list.size() == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                Matcher matcher = a.matcher(uri.toString());
                while (matcher.find()) {
                    if (matcher.groupCount() == 1 && (group = matcher.group(1)) != null && h(map, group, uri)) {
                        hashSet.add(group);
                    }
                }
            }
        }
        return hashSet;
    }

    public static boolean h(Map map, String str, Uri uri) {
        if (map == null || !map.containsKey(str)) {
            return true;
        }
        Iterator it = ((List) map.get(str)).iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(uri.toString()).find()) {
                return true;
            }
        }
        return false;
    }

    public final Uri a(Uri uri, afxe... afxeVarArr) {
        String b;
        uri.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = a.matcher(uri.toString());
        while (matcher.find()) {
            if (matcher.groupCount() == 1 && (b = b(uri, matcher.group(1), afxeVarArr)) != null) {
                matcher.appendReplacement(stringBuffer, Uri.encode(b));
            }
        }
        matcher.appendTail(stringBuffer);
        try {
            return wbs.ai(stringBuffer.toString());
        } catch (MalformedURLException e) {
            throw new zjg(e, null);
        }
    }

    public final String b(Uri uri, String str, afxe... afxeVarArr) {
        String str2 = null;
        if (afxeVarArr != null) {
            for (afxe afxeVar : afxeVarArr) {
                if (afxeVar != null && (str2 = afxeVar.a(uri, str)) != null) {
                    return str2;
                }
            }
        }
        Iterator it = this.b.values().iterator();
        while (it.hasNext() && (str2 = ((afxe) it.next()).a(uri, str)) == null) {
        }
        return str2 == null ? (String) this.c.get(str) : str2;
    }

    public final void e(afxe afxeVar) {
        afxeVar.getClass();
        this.b.put(afxeVar.b(), afxeVar);
    }

    public final void f(Map map) {
        this.c.putAll(map);
    }

    public final void g(afxe afxeVar) {
        afxeVar.getClass();
        if (this.b.get(afxeVar.b()) == afxeVar) {
            this.b.remove(afxeVar.b());
        }
    }

    public afxf(afxe afxeVar) {
        this();
        e(afxeVar);
    }
}
