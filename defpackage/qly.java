package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qly extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        return "com.google.android.gms.iid.MessengerCompat".equals(str) ? CloudMessagingMessengerCompat.class : super.loadClass(str, z);
    }
}
