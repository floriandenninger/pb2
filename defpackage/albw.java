package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albw extends aldq {
    public final Context a;
    public final akyb b;

    public albw(Context context, akyb akybVar, alep alepVar) {
        super(avtr.UPLOAD_PROCESSOR_TYPE_GARBAGE_COLLECTION, akybVar, alepVar);
        this.a = context;
        this.b = akybVar;
    }

    public static boolean c(akzs akzsVar) {
        if (akzsVar.af) {
            return true;
        }
        if (akzsVar.ae) {
            return false;
        }
        amru amruVar = akwh.a;
        akzr a = akzr.a(akzsVar.Z);
        if (a == null) {
            a = akzr.UNKNOWN;
        }
        return amruVar.contains(a);
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final anhy d(String str, akwm akwmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return null;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "GarbageCollectionTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aldq
    public final boolean j() {
        return false;
    }

    @Override // defpackage.aldq
    public final akwp m(Throwable th, String str, akwm akwmVar, boolean z) {
        return new albv(this.b);
    }

    @Override // defpackage.aldq
    public final anhy p(final String str, final akwm akwmVar) {
        return anaf.T(new anfy() { // from class: albt
            @Override // defpackage.anfy
            public final anhy a() {
                albw albwVar = albw.this;
                akzs b = akwmVar.b(str);
                if (b != null && (b.b & 2) != 0) {
                    try {
                        albwVar.a.getContentResolver().releasePersistableUriPermission(Uri.parse(b.f), 1);
                    } catch (SecurityException unused) {
                    }
                }
                if (b == null || !albw.c(b)) {
                    return anaf.O(new albu(albwVar.b));
                }
                return anaf.O(new akwo(0));
            }
        }, angq.a);
    }
}
