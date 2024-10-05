package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afhp {
    public static final Pattern a = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern b = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern c = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static void a(File file) {
        if (new File(file, "cached_content_index.exi").exists()) {
            return;
        }
        if (file.exists()) {
            File[] e = e(file.listFiles(new afho(0)));
            HashMap hashMap = new HashMap();
            for (File file2 : e) {
                String c2 = c(b(file2.getName()));
                if (c2 != null) {
                    hashMap.put(c2, Long.valueOf(hashMap.containsKey(c2) ? ((Long) hashMap.get(c2)).longValue() + file2.length() : file2.length()));
                }
            }
            long max = Math.max(65536L, ((hashMap.size() * 48) + 32) * 4);
            long freeSpace = file.getFreeSpace();
            if (freeSpace >= max) {
                return;
            }
            long j = max - freeSpace;
            File[] e2 = e(file.listFiles(new afho(2)));
            int i = 0;
            while (true) {
                long j2 = 0;
                if (i >= e2.length || j <= 0) {
                    break;
                }
                long length = e2[i].length();
                if (true == e2[i].delete()) {
                    j2 = length;
                }
                j -= j2;
                i++;
            }
            for (String d = d(hashMap); d != null && j > 0; d = d(hashMap)) {
                long j3 = 0;
                for (File file3 : e) {
                    if (d.equals(c(b(file3.getName())))) {
                        long length2 = file3.length();
                        if (true != file3.delete()) {
                            length2 = 0;
                        }
                        j3 += length2;
                    }
                }
                j -= j3;
                hashMap.remove(d);
            }
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.getFreeSpace();
        }
    }

    private static String b(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        Matcher matcher2 = b.matcher(str);
        if (matcher2.matches()) {
            return pts.L(matcher2.group(1));
        }
        return null;
    }

    private static String c(String str) {
        if (str != null) {
            return str.split("\\.")[0];
        }
        return null;
    }

    private static String d(Map map) {
        String str = null;
        long j = Long.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() < j) {
                str = (String) entry.getKey();
                j = ((Long) entry.getValue()).longValue();
            }
        }
        return str;
    }

    private static File[] e(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }
}
