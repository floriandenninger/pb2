package defpackage;

import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adha implements ynk {
    private final /* synthetic */ int v;
    public static final /* synthetic */ adha u = new adha(20);
    public static final /* synthetic */ adha t = new adha(19);
    public static final /* synthetic */ adha s = new adha(18);
    public static final /* synthetic */ adha r = new adha(17);
    public static final /* synthetic */ adha q = new adha(16);
    public static final /* synthetic */ adha p = new adha(15);
    public static final /* synthetic */ adha o = new adha(14);
    public static final /* synthetic */ adha n = new adha(13);
    public static final /* synthetic */ adha m = new adha(12);
    public static final /* synthetic */ adha l = new adha(11);
    public static final /* synthetic */ adha k = new adha(10);
    public static final /* synthetic */ adha j = new adha(9);
    public static final /* synthetic */ adha i = new adha(8);
    public static final /* synthetic */ adha h = new adha(7);
    public static final /* synthetic */ adha g = new adha(6);
    public static final /* synthetic */ adha f = new adha(5);
    public static final /* synthetic */ adha e = new adha(4);
    public static final /* synthetic */ adha d = new adha(3);
    public static final /* synthetic */ adha c = new adha(2);
    public static final /* synthetic */ adha b = new adha(1);
    public static final /* synthetic */ adha a = new adha(0);

    private /* synthetic */ adha(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.v) {
            case 0:
                zga.d("Failed to store disable by user flag", th);
                return;
            case 1:
                LivingRoomNotificationRequestManager.j(th);
                return;
            case 2:
                zga.d("Failed to store notification hidden.", th);
                return;
            case 3:
                adhq.k(th);
                return;
            case 4:
                adhm.a();
                return;
            case 5:
                adhy.b(th);
                return;
            case 6:
                zga.f(adka.a, "Error while retrieving the promotion counter ref id", th);
                return;
            case 7:
                zga.f(adka.a, "Error saving values in promotion storage.", th);
                return;
            case 8:
                zga.f(adka.a, "Error saving values in promotion storage during a reset.", th);
                return;
            case 9:
                int i2 = adok.i;
                return;
            case 10:
                int i3 = adok.i;
                return;
            case 11:
                adov.b(th);
                return;
            case 12:
                adov.c(th);
                return;
            case 13:
                adst.b();
                return;
            case 14:
                TvSignInControllerImpl.m(th);
                return;
            case 15:
                zga.d("Failed to store profile creation timestamp.", th);
                return;
            case 16:
                zga.d("There was an error saving mdx user stats", th);
                return;
            case 17:
                aenv.d();
                return;
            case 18:
                aevr.aC(th);
                return;
            case 19:
                afid.c(afic.CACHE, th, "Fails to save the supported profile to disk.", new Object[0]);
                return;
            default:
                afsi.c(2, 6, "Failed to clear supported profiles or save incremental version on OS mismatch.", th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("Failed to store disable by user flag", (Throwable) obj);
                return;
            case 1:
                LivingRoomNotificationRequestManager.j((Throwable) obj);
                return;
            case 2:
                zga.d("Failed to store notification hidden.", (Throwable) obj);
                return;
            case 3:
                adhq.k((Throwable) obj);
                return;
            case 4:
                adhm.a();
                return;
            case 5:
                adhy.b((Throwable) obj);
                return;
            case 6:
                zga.f(adka.a, "Error while retrieving the promotion counter ref id", (Throwable) obj);
                return;
            case 7:
                zga.f(adka.a, "Error saving values in promotion storage.", (Throwable) obj);
                return;
            case 8:
                zga.f(adka.a, "Error saving values in promotion storage during a reset.", (Throwable) obj);
                return;
            case 9:
                int i2 = adok.i;
                return;
            case 10:
                int i3 = adok.i;
                return;
            case 11:
                adov.b((Throwable) obj);
                return;
            case 12:
                adov.c((Throwable) obj);
                return;
            case 13:
                adst.b();
                return;
            case 14:
                TvSignInControllerImpl.m((Throwable) obj);
                return;
            case 15:
                zga.d("Failed to store profile creation timestamp.", (Throwable) obj);
                return;
            case 16:
                zga.d("There was an error saving mdx user stats", (Throwable) obj);
                return;
            case 17:
                aenv.d();
                return;
            case 18:
                aevr.aC((Throwable) obj);
                return;
            case 19:
                afid.c(afic.CACHE, (Throwable) obj, "Fails to save the supported profile to disk.", new Object[0]);
                return;
            default:
                afsi.c(2, 6, "Failed to clear supported profiles or save incremental version on OS mismatch.", (Throwable) obj);
                return;
        }
    }
}
