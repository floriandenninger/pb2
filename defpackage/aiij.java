package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiij extends aasw {
    public final aijp a;
    public final shf b;
    public final aelm c;
    public final akpq g;

    public aiij(ajoy ajoyVar, aijp aijpVar, akpq akpqVar, ysl yslVar, shf shfVar, aelm aelmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = aijpVar;
        this.g = akpqVar;
        shfVar.getClass();
        this.b = shfVar;
        this.c = aelmVar;
    }

    public final PlayerResponseModel a(aijr aijrVar) {
        yjk.e();
        afww f = afww.f();
        b(aijrVar, f, null, null, false, null);
        try {
            return (PlayerResponseModel) f.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aasx(e);
        }
    }

    public final void b(aijr aijrVar, afwx afwxVar, String str, aaox aaoxVar, boolean z, acsx acsxVar) {
        aelm aelmVar;
        aarn a = this.a.a(aijrVar, this.g.d(afwxVar, str, this.b.d()));
        if (z) {
            yjk.e();
            a.qm();
            try {
                a.f();
            } catch (cnb unused) {
            }
            a.t();
            a.l();
        }
        if (aaoxVar == null || (aelmVar = this.c) == null) {
            this.e.a(a);
        } else {
            aelmVar.b(a, aaoxVar, this.e, acsxVar, z);
        }
    }
}
