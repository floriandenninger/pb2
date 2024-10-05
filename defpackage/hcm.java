package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hcm extends hcn implements hmb, alxs {
    public hmc a;
    public boolean b = false;
    public final ShortsCreationActivity c;
    public final hrq d;
    public final shf e;
    public final hrv f;
    public final alwk g;
    private apxf i;

    public hcm(ShortsCreationActivity shortsCreationActivity, hrq hrqVar, shf shfVar, hrv hrvVar, alwk alwkVar) {
        this.c = shortsCreationActivity;
        this.d = hrqVar;
        this.e = shfVar;
        this.f = hrvVar;
        this.g = alwkVar;
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }

    public final void e(long j) {
        Intent intent;
        byte[] byteArrayExtra;
        ce e = this.c.getSupportFragmentManager().e(R.id.reel_creation_container);
        if (!(e instanceof hmc)) {
            if (this.i == null && (intent = this.c.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
                try {
                    this.i = (apxf) aonm.parseFrom(apxf.a, byteArrayExtra, aomw.b());
                } catch (aoob unused) {
                }
            }
            apxf apxfVar = this.i;
            hmc hmcVar = new hmc();
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
            hmcVar.af(bundle);
            hmcVar.at = j;
            this.a = hmcVar;
            hmcVar.an = this;
            dn k = this.c.getSupportFragmentManager().k();
            k.y(R.id.reel_creation_container, this.a);
            k.a();
            return;
        }
        hmc hmcVar2 = (hmc) e;
        this.a = hmcVar2;
        hmcVar2.an = this;
    }

    @Override // defpackage.hcn
    public final boolean g(int i, KeyEvent keyEvent) {
        hmc hmcVar = ((hlz) this.a.am).a;
        ce e = hmcVar.mN().e(R.id.reel_container);
        if (hmcVar.aO(e)) {
            hfa hfaVar = ((hel) e).aI;
            if (!hfaVar.d && hfaVar.a.f(i, keyEvent)) {
                return true;
            }
        }
        return super.g(i, keyEvent);
    }

    public final boolean h(int i, KeyEvent keyEvent) {
        hmc hmcVar = ((hlz) this.a.am).a;
        ce e = hmcVar.mN().e(R.id.reel_container);
        if (hmcVar.aO(e)) {
            hfa hfaVar = ((hel) e).aI;
            if (!hfaVar.d && hfaVar.a.g(i)) {
                return true;
            }
        }
        return super.g(i, keyEvent);
    }

    @Override // defpackage.hmb
    public final void f(boolean z) {
        this.b = true;
        hrq hrqVar = this.d;
        if (!hrqVar.f) {
            String str = hrqVar.e;
            if (str == null) {
                zga.b("Frontend id should not be null.");
            } else {
                hrqVar.c.e(str, null, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
                if (hrqVar.f) {
                    hrqVar.d.B(hrq.a);
                }
            }
        } else {
            hrqVar.c("Failure while canceling upload.", hrqVar.d.e(hrqVar.e, z ? avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_DRAFT_SAVED : avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_NOTHING_TO_SAVE));
            hrqVar.d.B(hrq.a);
        }
        this.c.finish();
    }
}
