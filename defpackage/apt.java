package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apt {
    public final HashMap a = new HashMap();

    public apt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final apm a(String str) {
        return (apm) this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        for (apm apmVar : this.a.values()) {
            apmVar.x = true;
            synchronized (apmVar.w) {
                Iterator it = apmVar.w.values().iterator();
                while (it.hasNext()) {
                    apm.s(it.next());
                }
            }
            apmVar.d();
        }
        this.a.clear();
    }

    public final void d(btt... bttVarArr) {
        for (int i = 0; i <= 0; i++) {
            btt bttVar = bttVarArr[i];
            int i2 = bttVar.a;
            int i3 = bttVar.b;
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(i2);
            TreeMap treeMap = (TreeMap) hashMap.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.a.put(valueOf, treeMap);
            }
            Integer valueOf2 = Integer.valueOf(i3);
            btt bttVar2 = (btt) treeMap.get(valueOf2);
            if (bttVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bttVar2 + " with " + bttVar);
            }
            treeMap.put(valueOf2, bttVar);
        }
    }

    public final boolean e(String str, String str2) {
        if ((str != null && str.length() > 100) || (str2 != null && str2.length() > 200)) {
            return false;
        }
        if (str2 == null || str2.length() == 0 || str2.equals(".*")) {
            return true;
        }
        if (str == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        Pattern pattern = (Pattern) this.a.get(str2);
        if (pattern == null) {
            try {
                pattern = Pattern.compile(str2);
                this.a.put(str2, pattern);
            } catch (PatternSyntaxException unused) {
                return false;
            }
        }
        return pattern.matcher(str).matches();
    }

    public apt(byte[] bArr) {
    }

    public apt(char[] cArr) {
    }
}
