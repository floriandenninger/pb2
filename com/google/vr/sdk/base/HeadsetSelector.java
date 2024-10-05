package com.google.vr.sdk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;
import com.google.vr.ndk.base.DaydreamUtils;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import defpackage.awxr;
import defpackage.axhe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadsetSelector {
    private static final HeadsetInfo DEFAULT_HEADSET_INFO = new HeadsetInfo(GvrViewerParams.cardboardV2ViewerParams().toProtobuf());

    public static HeadsetInfo getCurrentHeadsetInfo(Context context) {
        axhe h = awxr.h(context);
        HeadsetInfo headsetInfo = DEFAULT_HEADSET_INFO;
        try {
            try {
                CardboardDevice$DeviceParams b = h.b();
                if (b != null) {
                    headsetInfo = new HeadsetInfo(b);
                }
            } catch (Exception e) {
                Log.e("HeadsetSelector", "Error when retrieving current headset", e);
            }
            return headsetInfo;
        } finally {
            h.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getHeadsetParamsKey(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        String vendor = cardboardDevice$DeviceParams.getVendor();
        String model = cardboardDevice$DeviceParams.getModel();
        StringBuilder sb = new StringBuilder(String.valueOf(vendor).length() + 1 + String.valueOf(model).length());
        sb.append(vendor);
        sb.append("_");
        sb.append(model);
        return sb.toString();
    }

    public static List getRecentHeadsetInfos(Context context) {
        ArrayList arrayList = new ArrayList();
        CardboardDevice$DeviceParamsList recentHeadsets = DaydreamApi.getRecentHeadsets(context);
        if (recentHeadsets != null) {
            Iterator it = recentHeadsets.getParamsList().iterator();
            while (it.hasNext()) {
                arrayList.add(new HeadsetInfo((CardboardDevice$DeviceParams) it.next()));
            }
        }
        if (arrayList.isEmpty() || (arrayList.size() == 1 && !((HeadsetInfo) arrayList.get(0)).isCardboardViewer())) {
            arrayList.add(DEFAULT_HEADSET_INFO);
        }
        return arrayList;
    }

    public static boolean selectHeadset(Context context, HeadsetInfo headsetInfo) {
        boolean z = false;
        if (headsetInfo == null) {
            return false;
        }
        axhe h = awxr.h(context);
        try {
            CardboardDevice$DeviceParamsList c = h.c();
            if (c != null) {
                for (CardboardDevice$DeviceParams cardboardDevice$DeviceParams : c.getParamsList()) {
                    if (headsetInfo.equalsDeviceParam(cardboardDevice$DeviceParams)) {
                        return h.g(cardboardDevice$DeviceParams);
                    }
                }
            }
            HeadsetInfo headsetInfo2 = DEFAULT_HEADSET_INFO;
            if (headsetInfo.equals(headsetInfo2) && h.g(headsetInfo2.deviceParam)) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Log.e("HeadsetSelector", "Error when updating the selected headset", e);
            return false;
        } finally {
            h.f();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class HeadsetInfo {
        private final boolean cardboardViewer;
        private final CardboardDevice$DeviceParams deviceParam;
        private final String displayName;
        private final String uniqueKey;

        private HeadsetInfo(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            this(cardboardDevice$DeviceParams, DaydreamUtils.getDeviceParamsDisplayedName(cardboardDevice$DeviceParams), !DaydreamUtils.isDaydreamViewer(cardboardDevice$DeviceParams));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean equalsDeviceParam(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            return this.uniqueKey.equalsIgnoreCase(HeadsetSelector.getHeadsetParamsKey(cardboardDevice$DeviceParams));
        }

        public static HeadsetInfo newInstance(String str, String str2, String str3, boolean z) {
            CardboardDevice$DeviceParams.Builder newBuilder = CardboardDevice$DeviceParams.newBuilder();
            newBuilder.setVendor("Samsung");
            newBuilder.setModel("Gear VR");
            return new HeadsetInfo((CardboardDevice$DeviceParams) newBuilder.build(), "Samsung Gear VR", false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HeadsetInfo) {
                return this.uniqueKey.equalsIgnoreCase(((HeadsetInfo) obj).uniqueKey);
            }
            return false;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public int hashCode() {
            return this.uniqueKey.hashCode();
        }

        public boolean isCardboardViewer() {
            return this.cardboardViewer;
        }

        private HeadsetInfo(CardboardDevice$DeviceParams cardboardDevice$DeviceParams, String str, boolean z) {
            this.deviceParam = cardboardDevice$DeviceParams;
            this.uniqueKey = HeadsetSelector.getHeadsetParamsKey(cardboardDevice$DeviceParams);
            this.displayName = str;
            this.cardboardViewer = z;
        }
    }
}
