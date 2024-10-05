package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afps extends ykv {
    public final azrw a;
    public final azrw c;
    public final azrw d;
    private final Executor e;
    private final azrw f;

    public afps(Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.e = executor;
        this.a = azrwVar;
        this.f = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    @Override // defpackage.ykv
    public final void a() {
        final int i = 0;
        this.e.execute(new Runnable(this) { // from class: afpr
            public final /* synthetic */ afps a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    ((afry) this.a.a.get()).a();
                    return;
                }
                afps afpsVar = this.a;
                if (((SharedPreferences) afpsVar.c.get()).contains("ap_dev_reg")) {
                    ((SharedPreferences) afpsVar.c.get()).edit().remove("ap_dev_reg").remove(String.format("%s_%s", "apiary_device_id", afpsVar.d.get())).remove(String.format("%s_%s", "apiary_device_key", afpsVar.d.get())).commit();
                }
            }
        });
        ynm.j(((ywr) ((afxc) this.f.get()).a.get()).b(afyf.b), angq.a, afka.c);
        final int i2 = 1;
        this.e.execute(new Runnable(this) { // from class: afpr
            public final /* synthetic */ afps a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    ((afry) this.a.a.get()).a();
                    return;
                }
                afps afpsVar = this.a;
                if (((SharedPreferences) afpsVar.c.get()).contains("ap_dev_reg")) {
                    ((SharedPreferences) afpsVar.c.get()).edit().remove("ap_dev_reg").remove(String.format("%s_%s", "apiary_device_id", afpsVar.d.get())).remove(String.format("%s_%s", "apiary_device_key", afpsVar.d.get())).commit();
                }
            }
        });
    }
}
