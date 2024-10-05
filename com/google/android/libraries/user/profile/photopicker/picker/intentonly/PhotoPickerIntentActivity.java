package com.google.android.libraries.user.profile.photopicker.picker.intentonly;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.youtube.R;
import defpackage.ammv;
import defpackage.amsj;
import defpackage.amxh;
import defpackage.amxj;
import defpackage.aoff;
import defpackage.aofh;
import defpackage.aofj;
import defpackage.aone;
import defpackage.awzd;
import defpackage.awze;
import defpackage.axpj;
import defpackage.azrw;
import defpackage.sgf;
import defpackage.tfy;
import defpackage.tga;
import defpackage.tgn;
import defpackage.vls;
import defpackage.vlt;
import defpackage.vlx;
import defpackage.vrn;
import defpackage.vrp;
import defpackage.vrq;
import defpackage.vrs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhotoPickerIntentActivity extends vrs implements axpj {
    private static final amxj h = amxj.l("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity");
    public vrn b;
    public azrw c;
    public tgn d;
    public vrq e;
    public tga f;
    public amsj g;

    @Override // defpackage.axpj
    public final amsj g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        amxj amxjVar = h;
        ((amxh) ((amxh) amxjVar.c()).i("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 86, "PhotoPickerIntentActivity.java")).r("onActivityResult with requestCode: %d", i);
        if (i2 == -1 && i == 10000) {
            ((amxh) ((amxh) amxjVar.c()).i("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 93, "PhotoPickerIntentActivity.java")).q("onActivityResult for REQUEST_IMAGE_EDIT");
            if (intent.getData() != null) {
                setResult(-1, intent);
                ((amxh) ((amxh) amxjVar.c()).i("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 97, "PhotoPickerIntentActivity.java")).q("onActivityResult - finish the activity for the Photo Picker Intent variant here.");
                vrq vrqVar = this.e;
                if (!vrqVar.c.h()) {
                    vrqVar.c = ammv.j(vrqVar.d.B());
                }
                aoff b = ((vlt) vrqVar.c.c()).c(awzd.OBAKE_PHOTO_PICKING_SESSION_FINISHED, awze.OBAKE_CONFIRMATION_PREVIEW_SCREEN, vrqVar.b.a).b();
                vlx vlxVar = vrqVar.a;
                aone createBuilder = aofh.a.createBuilder();
                createBuilder.N(b);
                aone createBuilder2 = aofj.a.createBuilder();
                createBuilder2.copyOnWrite();
                aofj aofjVar = (aofj) createBuilder2.instance;
                aofjVar.c = 13;
                aofjVar.b |= 1;
                long a = b.a();
                createBuilder2.copyOnWrite();
                aofj aofjVar2 = (aofj) createBuilder2.instance;
                aofjVar2.b |= 2;
                aofjVar2.d = a;
                createBuilder.copyOnWrite();
                aofh aofhVar = (aofh) createBuilder.instance;
                aofj aofjVar3 = (aofj) createBuilder2.build();
                aofjVar3.getClass();
                aofhVar.d = aofjVar3;
                aofhVar.b |= 1;
                vlxVar.c((aofh) createBuilder.build());
                finish();
            }
        }
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vls.d(this);
        super.onCreate(bundle);
        if (!this.b.b()) {
            finish();
            return;
        }
        tfy a = this.d.a.a(89757);
        a.d(sgf.Q(this.b.a()));
        a.d(sgf.G());
        a.e(this.f);
        a.c(this);
        ((vrp) this.c.get()).f();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_common_menu, menu);
        return true;
    }
}
