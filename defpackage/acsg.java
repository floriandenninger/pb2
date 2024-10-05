package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsg extends acqq {
    public final acsh j;

    public acsg(ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, acsh acshVar, ajun ajunVar, Context context, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajknVar, ypaVar, acreVar, acrjVar, ajunVar, context, aaeaVar, axzgVar, null, null, null, null);
        this.j = acshVar;
    }

    public final Bundle J() {
        return this.j.a;
    }

    public final void K(Bundle bundle, apxf apxfVar) {
        if (bundle != null) {
            if (this.j.a == null) {
                L(bundle);
            }
        } else {
            Bundle b = acsh.b(apxfVar);
            if (b != null) {
                L(b);
            }
        }
    }

    public final void L(Bundle bundle) {
        this.j.a = bundle;
    }

    @Override // defpackage.acqq, defpackage.acra
    public final InteractionLoggingScreen d(acsc acscVar, apxf apxfVar, asht ashtVar) {
        if (apxfVar == null) {
            apxfVar = acsh.c(this.j.a);
        }
        InteractionLoggingScreen d = super.d(acscVar, apxfVar, ashtVar);
        this.j.a = acsh.a(this);
        return d;
    }
}
