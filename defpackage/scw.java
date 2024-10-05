package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scw {
    private static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/rendering/CameraSizesGetter");

    public static Optional a(Context context, Integer num) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            Iterator it = Arrays.asList(cameraManager.getCameraIdList()).iterator();
            while (it.hasNext()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics((String) it.next());
                if (num.equals(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING))) {
                    return Optional.of(cameraCharacteristics);
                }
            }
        } catch (CameraAccessException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/rendering/CameraSizesGetter", "getCameraCharacteristics", '/', "CameraSizesGetter.java")).q("Accessing camera ID info got error.");
        }
        return Optional.empty();
    }
}
