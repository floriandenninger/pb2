package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uve implements uvb {
    private static uve b;
    public final Context a;
    private final ContentObserver c;

    private uve() {
        this.a = null;
        this.c = null;
    }

    private uve(Context context) {
        this.a = context;
        uvd uvdVar = new uvd();
        this.c = uvdVar;
        context.getContentResolver().registerContentObserver(rsb.a, true, uvdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static uve a(Context context) {
        uve uveVar;
        synchronized (uve.class) {
            if (b == null) {
                b = ej.n(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new uve(context) : new uve();
            }
            uveVar = b;
        }
        return uveVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        Context context;
        synchronized (uve.class) {
            uve uveVar = b;
            if (uveVar != null && (context = uveVar.a) != null && uveVar.c != null) {
                context.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }

    @Override // defpackage.uvb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) uqw.d(new uva() { // from class: uvc
                @Override // defpackage.uva
                public final Object a() {
                    uve uveVar = uve.this;
                    return rsb.d(uveVar.a.getContentResolver(), str, null);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }
}
