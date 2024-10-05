package defpackage;

import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emq {
    public static final sgw a;

    static {
        Class[] clsArr = YouTubeBackupAgent.a;
        sgw[] sgwVarArr = new sgw[2];
        sgwVarArr[0] = new sgx(sgf.c(Backup.class, YouTubeBackupAgent.a));
        Set c = sgf.c(SubstringBackup.class, YouTubeBackupAgent.a);
        HashSet hashSet = new HashSet();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            hashSet.add(new sgy(Pattern.compile((String) it.next())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add((sgw) it2.next());
        }
        sgwVarArr[1] = sgf.b(new ArrayList(arrayList));
        a = sgf.b(Arrays.asList(sgwVarArr));
    }
}
