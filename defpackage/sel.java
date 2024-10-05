package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Size;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sel implements sem {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider");
    public String b;
    public anhy c;
    public anhy d;
    private final CameraManager e;
    private final Executor f;

    public sel(Context context, Executor executor) {
        this.f = executor;
        this.e = (CameraManager) context.getSystemService("camera");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object a(SettableFuture settableFuture, SettableFuture settableFuture2, Size size, aes aesVar) {
        try {
            CameraManager cameraManager = this.e;
            String str = this.b;
            Executor executor = this.f;
            cameraManager.openCamera(str, executor, new sei(aesVar, settableFuture, settableFuture2, size, executor));
            return "Camera2CameraProvider.startCamera";
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider", "lambda$startCamera$0", 'Y', "Camera2CameraProvider.java")).q("Opening camera failed.");
            aesVar.d(e);
            settableFuture.e(e);
            settableFuture2.e(e);
            return "Camera2CameraProvider.startCamera";
        }
    }

    @Override // defpackage.sem
    public final void b() {
        anhy anhyVar = this.d;
        if (anhyVar != null) {
            sfj.a(anhyVar, this.f);
            this.d = null;
        }
        anhy anhyVar2 = this.c;
        if (anhyVar2 != null) {
            sfj.a(anhyVar2, this.f);
            this.c = null;
        }
    }

    @Override // defpackage.sem
    public final void c() {
        try {
            for (String str : Arrays.asList(this.e.getCameraIdList())) {
                Integer num = (Integer) this.e.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.equals(0)) {
                    this.b = str;
                    return;
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider", "initialize", '<', "Camera2CameraProvider.java")).q("Accessing camera characteristics info failed.");
        }
    }
}
