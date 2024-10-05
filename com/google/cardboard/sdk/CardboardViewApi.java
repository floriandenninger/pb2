package com.google.cardboard.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.google.cardboard.proto.CardboardDevice;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import com.google.cardboard.sdk.deviceparams.DeviceParamsUtils;
import com.google.cardboard.sdk.nativetypes.EyeTextureDescription;
import com.google.cardboard.sdk.nativetypes.Mesh;
import com.google.cardboard.sdk.nativetypes.UvPoint;
import defpackage.aih;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CardboardViewApi {
    private static final String CARDBOARD_CONFIGURE_ACTION = "com.google.vrtoolkit.cardboard.CONFIGURE";
    private static final long NATIVE_TARGET_DISPLAY = 0;
    private static final long PREDICTION_TIME_WITHOUT_VSYNC_NANOS = 50000000;
    private static final String TAG = "CardboardViewApi";
    private final Context context;
    private long deltaTimeInNs;
    private DistortionRenderer distortionRenderer;
    private FieldOfView fieldOfView;
    private HeadTracker headTracker;
    public final boolean isDaydreamReadyPhone;
    private LensDistortion lensDistortion;
    private ScreenSize screenSize;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class FieldOfView {
        final float bottom;
        final float left;
        final float right;
        final float top;

        public FieldOfView(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f4;
            this.right = f2;
            this.bottom = f3;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ScreenSize {
        final int height;
        final int width;

        public ScreenSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public CardboardViewApi(Context context) {
        Initialize.initialize(context);
        this.context = context;
        this.distortionRenderer = null;
        this.lensDistortion = null;
        this.headTracker = new HeadTracker();
        this.screenSize = new ScreenSize(0, 0);
        this.fieldOfView = new FieldOfView(0.0f, 0.0f, 0.0f, 0.0f);
        this.deltaTimeInNs = PREDICTION_TIME_WITHOUT_VSYNC_NANOS;
        this.isDaydreamReadyPhone = isDaydreamReadyPlatform(context);
    }

    private void initializeFieldOfView(byte[] bArr) {
        CardboardDevice.DeviceParams parseCardboardDeviceParams = DeviceParamsUtils.parseCardboardDeviceParams(bArr);
        if (parseCardboardDeviceParams.getLeftEyeFieldOfViewAnglesCount() == 4) {
            this.fieldOfView = new FieldOfView(parseCardboardDeviceParams.getLeftEyeFieldOfViewAngles(0), parseCardboardDeviceParams.getLeftEyeFieldOfViewAngles(1), parseCardboardDeviceParams.getLeftEyeFieldOfViewAngles(2), parseCardboardDeviceParams.getLeftEyeFieldOfViewAngles(3));
        } else {
            this.fieldOfView = new FieldOfView(CardboardV1DeviceParams.CARDBOARD_V1_FOV_ANGLES[0], CardboardV1DeviceParams.CARDBOARD_V1_FOV_ANGLES[1], CardboardV1DeviceParams.CARDBOARD_V1_FOV_ANGLES[2], CardboardV1DeviceParams.CARDBOARD_V1_FOV_ANGLES[3]);
        }
    }

    private static boolean isDaydreamReadyPlatform(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }

    private boolean isReadExternalStoragePermissionEnabled() {
        return aih.c(this.context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private static boolean isValidEyeType(int i) {
        return i == 0 || i == 1;
    }

    public void close() {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer != null) {
            distortionRenderer.close();
            this.distortionRenderer = null;
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion != null) {
            lensDistortion.close();
            this.lensDistortion = null;
        }
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.close();
            this.headTracker = null;
        }
    }

    UvPoint distortedUvForUndistortedUv(UvPoint uvPoint, int i) {
        if (this.lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        return this.lensDistortion.distortedUvForUndistortedUv(uvPoint, i);
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    public long getDeltaTimeInNs() {
        return this.deltaTimeInNs;
    }

    public Mesh getDistortionMesh(int i) {
        if (this.lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        return this.lensDistortion.getDistortionMesh(i);
    }

    public void getEyeFromHeadMatrix(int i, float[] fArr) {
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            Log.w(TAG, "Tried to getEyeFromHeadMatrix but LensDistortion is not initialized.");
        } else {
            lensDistortion.getEyeFromHeadMatrix(i, fArr);
        }
    }

    public void getEyeProjectionMatrix(int i, float f, float f2, float[] fArr) {
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            Log.w(TAG, "Tried to getEyeProjectionMatrix but LensDistortion is not initialized.");
        } else {
            lensDistortion.getEyeProjectionMatrix(i, f, f2, fArr);
        }
    }

    public float getFieldOfViewParamsBottom() {
        return this.fieldOfView.bottom;
    }

    public float getFieldOfViewParamsLeft() {
        return this.fieldOfView.left;
    }

    public float getFieldOfViewParamsRight() {
        return this.fieldOfView.right;
    }

    public float getFieldOfViewParamsTop() {
        return this.fieldOfView.top;
    }

    public byte[] getGvrDeviceParams() {
        return GvrDeviceParamsProvider.readDeviceParams(this.context);
    }

    public void getPose(float[] fArr, float[] fArr2) {
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.getPose(this.deltaTimeInNs, fArr, fArr2);
        } else {
            Log.w(TAG, "Tried to get the pose from HeadTracker but it is not initialized.");
        }
    }

    public int getScreenParamsHeight() {
        return this.screenSize.height;
    }

    public int getScreenParamsWidth() {
        return this.screenSize.width;
    }

    public void initializeRenderThread() {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer != null) {
            distortionRenderer.close();
        }
        this.distortionRenderer = new DistortionRenderer();
    }

    public void launchVrCoreSettingsActivity() {
        PackageManager packageManager = this.context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction(CARDBOARD_CONFIGURE_ACTION).addFlags(268435456);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (PackageUtils.isGooglePackage(str)) {
                int i = resolveInfo.priority;
                if (PackageUtils.isSystemPackage(this.context, str)) {
                    i++;
                }
                if (num == null) {
                    num = Integer.valueOf(i);
                } else if (i > num.intValue()) {
                    num = Integer.valueOf(i);
                    arrayList.clear();
                } else if (i >= num.intValue()) {
                }
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        this.context.startActivity(intent);
    }

    public void loadDeviceParams() {
        byte[] gvrDeviceParams = this.isDaydreamReadyPhone ? getGvrDeviceParams() : null;
        if (gvrDeviceParams == null && ((Build.VERSION.SDK_INT <= 28 && isReadExternalStoragePermissionEnabled()) || Build.VERSION.SDK_INT > 28)) {
            gvrDeviceParams = QrCode.getSavedDeviceParams();
        }
        if (gvrDeviceParams == null) {
            gvrDeviceParams = QrCode.getCardboardV1DeviceParams();
        }
        initializeFieldOfView(gvrDeviceParams);
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion != null) {
            lensDistortion.close();
        }
        ScreenSize screenSize = this.screenSize;
        this.lensDistortion = new LensDistortion(gvrDeviceParams, screenSize.width, screenSize.height);
    }

    public void pauseHeadTracker() {
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.pause();
        } else {
            Log.w(TAG, "Tried to pause the HeadTracker but it is not initialized.");
        }
    }

    public void renderEyeToDisplay(EyeTextureDescription eyeTextureDescription, EyeTextureDescription eyeTextureDescription2) {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer == null) {
            Log.w(TAG, "Tried to renderEyeToDisplay but DistortionRenderer is not initialized.");
        } else {
            ScreenSize screenSize = this.screenSize;
            distortionRenderer.renderEyeToDisplay(0L, 0, 0, screenSize.width, screenSize.height, eyeTextureDescription, eyeTextureDescription2);
        }
    }

    public void resumeHeadTracker() {
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.resume();
        } else {
            Log.w(TAG, "Tried to resume the HeadTracker but it is not initialized.");
        }
    }

    public void scanViewerQrCode() {
        QrCode.scanQrCodeAndSaveDeviceParams();
    }

    public void setDeltaTimeInNs(long j) {
        this.deltaTimeInNs = j;
    }

    public void setMesh(Mesh mesh, int i) {
        if (this.distortionRenderer == null) {
            Log.w(TAG, "Tried to setMesh but DistortionRenderer is not initialized.");
        } else {
            if (!isValidEyeType(i)) {
                throw new IllegalArgumentException("eye is invalid.");
            }
            this.distortionRenderer.setMesh(mesh, i);
        }
    }

    public void setScreenParams(int i, int i2) {
        this.screenSize = new ScreenSize(i, i2);
    }

    UvPoint undistortedUvForDistortedUv(UvPoint uvPoint, int i) {
        if (this.lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        return this.lensDistortion.undistortedUvForDistortedUv(uvPoint, i);
    }
}
