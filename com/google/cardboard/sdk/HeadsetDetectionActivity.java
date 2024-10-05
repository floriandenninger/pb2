package com.google.cardboard.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;
import defpackage.ml;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadsetDetectionActivity extends ml {
    private static final String URI_SCHEME_LEGACY_CARDBOARD = "cardboard";
    private static final String URI_HOST_LEGACY_CARDBOARD = "v1.0.0";
    private static final Uri URI_ORIGINAL_CARDBOARD_NFC = new Uri.Builder().scheme(URI_SCHEME_LEGACY_CARDBOARD).authority(URI_HOST_LEGACY_CARDBOARD).build();

    private void processStartupIntent(Intent intent) {
        if (!"android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction()) || intent.getData() == null) {
            return;
        }
        if (URI_ORIGINAL_CARDBOARD_NFC.equals(intent.getData())) {
            CardboardParamsUtils.saveCardboardV1DeviceParams(getApplicationContext());
        }
        Toast.makeText(this, R.string.viewer_detected, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            processStartupIntent(getIntent());
        }
        finish();
    }
}
