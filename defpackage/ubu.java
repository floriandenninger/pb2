package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubu implements ubo {
    public Context a;
    public twn b;

    @Override // defpackage.ubo
    public final String a(txb txbVar) {
        Set emptySet;
        if (aij.c()) {
            if (aij.c()) {
                emptySet = new aeb();
                Iterator<NotificationChannel> it = ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels().iterator();
                while (it.hasNext()) {
                    emptySet.add(it.next().getId());
                }
            } else {
                emptySet = Collections.emptySet();
            }
            aojz aojzVar = txbVar.d.o;
            if (aojzVar == null) {
                aojzVar = aojz.a;
            }
            String str = aojzVar.b;
            if (!TextUtils.isEmpty(str) && emptySet.contains(str)) {
                return str;
            }
            String str2 = this.b.d.j;
            if (!TextUtils.isEmpty(str2) && emptySet.contains(str2)) {
                return str2;
            }
            tzk.b("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s'", str, str2);
        }
        return null;
    }

    @Override // defpackage.ubo
    public final List c() {
        String str;
        int i;
        if (aij.c()) {
            NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                ubk ubkVar = new ubk();
                ubkVar.a("");
                String id = notificationChannel.getId();
                if (id != null) {
                    ubkVar.a = id;
                    int importance = notificationChannel.getImportance();
                    int i2 = 4;
                    if (importance == 0) {
                        i2 = 5;
                    } else if (importance != 2) {
                        i2 = importance != 3 ? importance != 4 ? 1 : 3 : 2;
                    }
                    ubkVar.c = i2;
                    if (!TextUtils.isEmpty(notificationChannel.getGroup())) {
                        ubkVar.a(notificationChannel.getGroup());
                    }
                    String str2 = ubkVar.a;
                    if (str2 != null && (str = ubkVar.b) != null && (i = ubkVar.c) != 0) {
                        arrayList.add(new ubl(str2, str, i));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (ubkVar.a == null) {
                            sb.append(" id");
                        }
                        if (ubkVar.b == null) {
                            sb.append(" group");
                        }
                        if (ubkVar.c == 0) {
                            sb.append(" importance");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    throw new NullPointerException("Null id");
                }
            }
            return arrayList;
        }
        return Arrays.asList(new ubl[0]);
    }

    @Override // defpackage.ubo
    public final void d(dy dyVar, txb txbVar) {
        String a = a(txbVar);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        tzk.d("NotificationChannelHelperImpl", "Setting channel Id: '%s'", a);
        dyVar.E = a;
    }

    @Override // defpackage.ubo
    public final boolean e(String str) {
        NotificationChannel notificationChannel;
        if (tyo.m(this.a)) {
            return (TextUtils.isEmpty(str) || (notificationChannel = ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(str)) == null || notificationChannel.getImportance() <= 0) ? false : true;
        }
        return true;
    }

    @Override // defpackage.ubo
    public final List b() {
        Boolean bool;
        if (Build.VERSION.SDK_INT < 28) {
            return Arrays.asList(new ubn[0]);
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        ArrayList arrayList = new ArrayList();
        for (NotificationChannelGroup notificationChannelGroup : notificationManager.getNotificationChannelGroups()) {
            ubm ubmVar = new ubm();
            ubmVar.a(false);
            String id = notificationChannelGroup.getId();
            if (id != null) {
                ubmVar.a = id;
                ubmVar.a(notificationChannelGroup.isBlocked());
                String str = ubmVar.a;
                if (str != null && (bool = ubmVar.b) != null) {
                    arrayList.add(new ubn(str, bool.booleanValue()));
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (ubmVar.a == null) {
                        sb.append(" id");
                    }
                    if (ubmVar.b == null) {
                        sb.append(" blocked");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Null id");
            }
        }
        return arrayList;
    }
}
