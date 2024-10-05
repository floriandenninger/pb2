package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.youtube.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.aahd;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.apxf;
import defpackage.azrw;
import defpackage.wle;
import defpackage.wlu;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneVerificationActivity extends wle {
    public aahd b;
    public azrw c;

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        ((wlu) this.c.get()).aH();
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        super.onCreate(bundle);
        setContentView(R.layout.phone_verification_activity);
        if (getIntent().hasExtra("PHONE_VERIFICATION_COMMAND")) {
            try {
                Intent intent = getIntent();
                apxf apxfVar = apxf.a;
                aomw b = aomw.b();
                Parcelable parcelableExtra = intent.getParcelableExtra("PHONE_VERIFICATION_COMMAND");
                if (parcelableExtra instanceof Bundle) {
                    Bundle bundle2 = (Bundle) parcelableExtra;
                    bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
                } else {
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
                }
                this.b.a((apxf) amkq.ci(protoParsers$InternalDontUse, apxfVar, b));
            } catch (aoob e) {
                zga.d("Failed to parse command from intent", e);
            }
        }
    }
}
