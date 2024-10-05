package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpt implements Runnable {
    final /* synthetic */ cnq a;
    final /* synthetic */ acpv b;

    public acpt(acpv acpvVar, cnq cnqVar) {
        this.b = acpvVar;
        this.a = cnqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acpv acpvVar = this.b;
        acpw acpwVar = acpvVar.b;
        acpwVar.c.g(acpwVar.e, new ArrayList(Arrays.asList(acpvVar.c)), this.a);
    }
}
