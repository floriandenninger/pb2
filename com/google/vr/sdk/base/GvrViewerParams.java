package com.google.vr.sdk.base;

import android.net.Uri;
import android.util.Log;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrViewerParams {
    private Distortion distortion;
    private boolean hasMagnet;
    private float interLensDistance;
    private FieldOfView leftEyeMaxFov;
    private String model;
    private CardboardDevice$DeviceParams originalDeviceProto;
    private float screenToLensDistance;
    private String vendor;
    private VerticalAlignmentType verticalAlignment;
    private float verticalDistanceToLensCenter;
    private static final Uri URI_ORIGINAL_CARDBOARD_NFC = new Uri.Builder().scheme("cardboard").authority("v1.0.0").build();
    private static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE = new Uri.Builder().scheme("http").authority("g.co").appendEncodedPath("cardboard").build();
    private static final VerticalAlignmentType CARDBOARD_V2_2_VERTICAL_ALIGNMENT = VerticalAlignmentType.BOTTOM;
    private static final VerticalAlignmentType CARDBOARD_V1_VERTICAL_ALIGNMENT = VerticalAlignmentType.BOTTOM;
    private static final GvrViewerParams DEFAULT_PARAMS = new GvrViewerParams();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum VerticalAlignmentType {
        BOTTOM(CardboardDevice$DeviceParams.VerticalAlignmentType.BOTTOM),
        CENTER(CardboardDevice$DeviceParams.VerticalAlignmentType.CENTER),
        TOP(CardboardDevice$DeviceParams.VerticalAlignmentType.TOP);

        private final CardboardDevice$DeviceParams.VerticalAlignmentType protoValue;

        VerticalAlignmentType(CardboardDevice$DeviceParams.VerticalAlignmentType verticalAlignmentType) {
            this.protoValue = verticalAlignmentType;
        }

        static VerticalAlignmentType fromProtoValue(CardboardDevice$DeviceParams.VerticalAlignmentType verticalAlignmentType) {
            for (VerticalAlignmentType verticalAlignmentType2 : values()) {
                if (verticalAlignmentType2.protoValue == verticalAlignmentType) {
                    return verticalAlignmentType2;
                }
            }
            Log.e("GvrViewerParams", String.format("Unknown alignment type from proto: %d", Integer.valueOf(verticalAlignmentType.getNumber())));
            return BOTTOM;
        }

        public CardboardDevice$DeviceParams.VerticalAlignmentType toProtoValue() {
            return this.protoValue;
        }
    }

    public GvrViewerParams() {
        setDefaultValues();
    }

    public static GvrViewerParams cardboardV2ViewerParams() {
        GvrViewerParams gvrViewerParams = new GvrViewerParams();
        gvrViewerParams.setToCardboardV2ViewerParams();
        return gvrViewerParams;
    }

    private void copyFrom(GvrViewerParams gvrViewerParams) {
        this.vendor = gvrViewerParams.vendor;
        this.model = gvrViewerParams.model;
        this.interLensDistance = gvrViewerParams.interLensDistance;
        this.verticalAlignment = gvrViewerParams.verticalAlignment;
        this.verticalDistanceToLensCenter = gvrViewerParams.verticalDistanceToLensCenter;
        this.screenToLensDistance = gvrViewerParams.screenToLensDistance;
        this.leftEyeMaxFov = new FieldOfView(gvrViewerParams.leftEyeMaxFov);
        this.hasMagnet = gvrViewerParams.hasMagnet;
        this.distortion = new Distortion(gvrViewerParams.distortion);
        this.originalDeviceProto = gvrViewerParams.originalDeviceProto;
    }

    private void setDefaultValues() {
        setToCardboardV2ViewerParams();
        this.vendor = CardboardV1DeviceParams.CARDBOARD_V1_VENDOR;
        this.model = "Default Cardboard";
    }

    private void setToCardboardV2ViewerParams() {
        this.vendor = "Google";
        this.model = "Cardboard";
        this.interLensDistance = 0.064f;
        this.verticalAlignment = CARDBOARD_V2_2_VERTICAL_ALIGNMENT;
        this.verticalDistanceToLensCenter = 0.035f;
        this.screenToLensDistance = 0.039f;
        this.leftEyeMaxFov = new FieldOfView();
        this.hasMagnet = false;
        this.distortion = new Distortion();
    }

    public boolean equals(Object obj) {
        VerticalAlignmentType verticalAlignmentType;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GvrViewerParams)) {
            return false;
        }
        GvrViewerParams gvrViewerParams = (GvrViewerParams) obj;
        if (!this.vendor.equals(gvrViewerParams.vendor) || !this.model.equals(gvrViewerParams.model) || this.interLensDistance != gvrViewerParams.interLensDistance || (verticalAlignmentType = this.verticalAlignment) != gvrViewerParams.verticalAlignment) {
            return false;
        }
        if ((verticalAlignmentType != VerticalAlignmentType.CENTER && this.verticalDistanceToLensCenter != gvrViewerParams.verticalDistanceToLensCenter) || this.screenToLensDistance != gvrViewerParams.screenToLensDistance || !this.leftEyeMaxFov.equals(gvrViewerParams.leftEyeMaxFov) || !this.distortion.equals(gvrViewerParams.distortion) || this.hasMagnet != gvrViewerParams.hasMagnet) {
            return false;
        }
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams = this.originalDeviceProto;
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams2 = gvrViewerParams.originalDeviceProto;
        return cardboardDevice$DeviceParams == cardboardDevice$DeviceParams2 || (cardboardDevice$DeviceParams != null && cardboardDevice$DeviceParams.equals(cardboardDevice$DeviceParams2));
    }

    public String getModel() {
        return this.model;
    }

    public byte[] toByteArray() {
        return toProtobuf().toByteArray();
    }

    public CardboardDevice$DeviceParams toProtobuf() {
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams = this.originalDeviceProto;
        CardboardDevice$DeviceParams.Builder newBuilder = cardboardDevice$DeviceParams != null ? (CardboardDevice$DeviceParams.Builder) cardboardDevice$DeviceParams.toBuilder() : CardboardDevice$DeviceParams.newBuilder();
        newBuilder.setVendor(this.vendor);
        newBuilder.setModel(this.model);
        newBuilder.setInterLensDistance(this.interLensDistance);
        newBuilder.setVerticalAlignment(this.verticalAlignment.toProtoValue());
        if (this.verticalAlignment == VerticalAlignmentType.CENTER) {
            newBuilder.setTrayToLensDistance(0.035f);
        } else {
            newBuilder.setTrayToLensDistance(this.verticalDistanceToLensCenter);
        }
        newBuilder.setScreenToLensDistance(this.screenToLensDistance);
        newBuilder.clearLeftEyeFieldOfViewAngles();
        newBuilder.addAllLeftEyeFieldOfViewAngles(this.leftEyeMaxFov.toProtobufAsList());
        newBuilder.clearDistortionCoefficients();
        newBuilder.addAllDistortionCoefficients(this.distortion.toProtobufAsList());
        if (this.hasMagnet) {
            newBuilder.setHasMagnet(true);
        }
        return (CardboardDevice$DeviceParams) newBuilder.build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        String str = this.vendor;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append("  vendor: ");
        sb2.append(str);
        sb2.append(",\n");
        sb.append(sb2.toString());
        String str2 = this.model;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 11);
        sb3.append("  model: ");
        sb3.append(str2);
        sb3.append(",\n");
        sb.append(sb3.toString());
        float f = this.interLensDistance;
        StringBuilder sb4 = new StringBuilder(40);
        sb4.append("  inter_lens_distance: ");
        sb4.append(f);
        sb4.append(",\n");
        sb.append(sb4.toString());
        String valueOf = String.valueOf(this.verticalAlignment);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb5.append("  vertical_alignment: ");
        sb5.append(valueOf);
        sb5.append(",\n");
        sb.append(sb5.toString());
        float f2 = this.verticalDistanceToLensCenter;
        StringBuilder sb6 = new StringBuilder(53);
        sb6.append("  vertical_distance_to_lens_center: ");
        sb6.append(f2);
        sb6.append(",\n");
        sb.append(sb6.toString());
        float f3 = this.screenToLensDistance;
        StringBuilder sb7 = new StringBuilder(44);
        sb7.append("  screen_to_lens_distance: ");
        sb7.append(f3);
        sb7.append(",\n");
        sb.append(sb7.toString());
        String replace = this.leftEyeMaxFov.toString().replace("\n", "\n  ");
        StringBuilder sb8 = new StringBuilder(String.valueOf(replace).length() + 22);
        sb8.append("  left_eye_max_fov: ");
        sb8.append(replace);
        sb8.append(",\n");
        sb.append(sb8.toString());
        String replace2 = this.distortion.toString().replace("\n", "\n  ");
        StringBuilder sb9 = new StringBuilder(String.valueOf(replace2).length() + 16);
        sb9.append("  distortion: ");
        sb9.append(replace2);
        sb9.append(",\n");
        sb.append(sb9.toString());
        boolean z = this.hasMagnet;
        StringBuilder sb10 = new StringBuilder(17);
        sb10.append("  magnet: ");
        sb10.append(z);
        sb10.append(",\n");
        sb.append(sb10.toString());
        sb.append("}\n");
        return sb.toString();
    }

    public GvrViewerParams(GvrViewerParams gvrViewerParams) {
        copyFrom(gvrViewerParams);
    }

    public GvrViewerParams(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        setDefaultValues();
        if (cardboardDevice$DeviceParams == null) {
            return;
        }
        this.originalDeviceProto = cardboardDevice$DeviceParams;
        this.vendor = cardboardDevice$DeviceParams.getVendor();
        this.model = cardboardDevice$DeviceParams.getModel();
        this.interLensDistance = cardboardDevice$DeviceParams.getInterLensDistance();
        this.verticalAlignment = VerticalAlignmentType.fromProtoValue(cardboardDevice$DeviceParams.getVerticalAlignment());
        this.verticalDistanceToLensCenter = cardboardDevice$DeviceParams.getTrayToLensDistance();
        this.screenToLensDistance = cardboardDevice$DeviceParams.getScreenToLensDistance();
        FieldOfView parseFromProtobuf = FieldOfView.parseFromProtobuf(cardboardDevice$DeviceParams.getLeftEyeFieldOfViewAnglesList());
        this.leftEyeMaxFov = parseFromProtobuf;
        if (parseFromProtobuf == null) {
            this.leftEyeMaxFov = new FieldOfView();
        }
        Distortion parseFromProtobuf2 = Distortion.parseFromProtobuf(cardboardDevice$DeviceParams.getDistortionCoefficientsList());
        this.distortion = parseFromProtobuf2;
        if (parseFromProtobuf2 == null) {
            this.distortion = new Distortion();
        }
        this.hasMagnet = cardboardDevice$DeviceParams.getHasMagnet();
    }
}
