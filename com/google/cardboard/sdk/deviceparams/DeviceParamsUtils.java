package com.google.cardboard.sdk.deviceparams;

import android.util.Log;
import com.google.cardboard.proto.CardboardDevice;
import defpackage.aomw;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceParamsUtils {
    private static final String TAG = "DeviceParamsUtils";

    private DeviceParamsUtils() {
    }

    public static CardboardDevice.DeviceParams parseCardboardDeviceParams(byte[] bArr) {
        try {
            return CardboardDevice.DeviceParams.parseFrom(bArr, aomw.a());
        } catch (aoob e) {
            String str = TAG;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Parsing cardboard parameters from buffer failed: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            return null;
        }
    }
}
