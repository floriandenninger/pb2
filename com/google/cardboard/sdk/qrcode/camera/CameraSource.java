package com.google.cardboard.sdk.qrcode.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import defpackage.qrm;
import defpackage.rql;
import defpackage.rqm;
import defpackage.rqn;
import defpackage.rqo;
import defpackage.rqp;
import defpackage.rqq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CameraSource {
    private static final float ASPECT_RATIO_TOLERANCE = 0.01f;
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private static final float FPS = 15.0f;
    private static final int HEIGHT = 1200;
    private static final String TAG = "CameraSource";
    private static final int WIDTH = 1600;
    private Camera camera;
    private final Context context;
    private final FrameProcessingRunnable frameProcessor;
    private qrm previewSize;
    private Thread processingThread;
    private int rotation;
    private final Object cameraLock = new Object();
    private final Map bytesToByteBuffer = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class CameraPreviewCallback implements Camera.PreviewCallback {
        private CameraPreviewCallback() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.frameProcessor.setNextFrame(bArr, camera);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class FrameProcessingRunnable implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private rqm detector;
        private ByteBuffer pendingFrameData;
        private long pendingTimeMillis;
        private final long startTimeMillis = SystemClock.elapsedRealtime();
        private final Object lock = new Object();
        private boolean active = true;
        private int pendingFrameId = 0;

        public FrameProcessingRunnable(rqm rqmVar) {
            this.detector = rqmVar;
        }

        public void release() {
            this.detector.b();
            this.detector = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (this.lock) {
                    while (this.active) {
                        if (this.pendingFrameData == null) {
                            try {
                                this.lock.wait();
                            } catch (InterruptedException unused) {
                                int i = CameraSource.CAMERA_FACING_BACK;
                                return;
                            }
                        } else {
                            rqo rqoVar = new rqo();
                            ByteBuffer byteBuffer = this.pendingFrameData;
                            int i2 = CameraSource.this.previewSize.a;
                            int i3 = CameraSource.this.previewSize.b;
                            if (byteBuffer != null) {
                                if (byteBuffer.capacity() >= i2 * i3) {
                                    rqoVar.b = byteBuffer;
                                    rqn rqnVar = rqoVar.a;
                                    rqnVar.a = i2;
                                    rqnVar.b = i3;
                                    rqnVar.f = 17;
                                    rqnVar.c = this.pendingFrameId;
                                    rqnVar.d = this.pendingTimeMillis;
                                    rqoVar.a.e = CameraSource.this.rotation;
                                    if (rqoVar.b != null) {
                                        ByteBuffer byteBuffer2 = this.pendingFrameData;
                                        this.pendingFrameData = null;
                                        try {
                                            rqm rqmVar = this.detector;
                                            rqn rqnVar2 = new rqn(rqoVar.a);
                                            if (rqnVar2.e % 2 != 0) {
                                                int i4 = rqnVar2.a;
                                                rqnVar2.a = rqnVar2.b;
                                                rqnVar2.b = i4;
                                            }
                                            rqnVar2.e = 0;
                                            SparseArray a = rqmVar.a(rqoVar);
                                            rqmVar.c();
                                            rql rqlVar = new rql(a);
                                            synchronized (rqmVar.a) {
                                                rqq rqqVar = rqmVar.b;
                                                if (rqqVar != null) {
                                                    SparseArray sparseArray = rqlVar.a;
                                                    for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                                                        int keyAt = sparseArray.keyAt(i5);
                                                        Object valueAt = sparseArray.valueAt(i5);
                                                        if (rqqVar.a.get(keyAt) == null) {
                                                            rqp rqpVar = new rqp();
                                                            rqpVar.a = rqqVar.b.create(valueAt);
                                                            rqpVar.a.onNewItem(keyAt, valueAt);
                                                            rqqVar.a.append(keyAt, rqpVar);
                                                        }
                                                    }
                                                    SparseArray sparseArray2 = rqlVar.a;
                                                    HashSet hashSet = new HashSet();
                                                    for (int i6 = 0; i6 < rqqVar.a.size(); i6++) {
                                                        int keyAt2 = rqqVar.a.keyAt(i6);
                                                        if (sparseArray2.get(keyAt2) == null) {
                                                            rqp rqpVar2 = (rqp) rqqVar.a.valueAt(i6);
                                                            int i7 = rqpVar2.b + 1;
                                                            rqpVar2.b = i7;
                                                            if (i7 < 3) {
                                                                rqpVar2.a.onMissing(rqlVar);
                                                            } else {
                                                                rqpVar2.a.onDone();
                                                                hashSet.add(Integer.valueOf(keyAt2));
                                                            }
                                                        }
                                                    }
                                                    Iterator it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        rqqVar.a.delete(((Integer) it.next()).intValue());
                                                    }
                                                    SparseArray sparseArray3 = rqlVar.a;
                                                    for (int i8 = 0; i8 < sparseArray3.size(); i8++) {
                                                        int keyAt3 = sparseArray3.keyAt(i8);
                                                        Object valueAt2 = sparseArray3.valueAt(i8);
                                                        rqp rqpVar3 = (rqp) rqqVar.a.get(keyAt3);
                                                        rqpVar3.b = 0;
                                                        rqpVar3.a.onUpdate(rqlVar, valueAt2);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                                                    break;
                                                }
                                            }
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                                    }
                                } else {
                                    throw new IllegalArgumentException("Invalid image data size.");
                                }
                            } else {
                                throw new IllegalArgumentException("Null image data supplied.");
                            }
                        }
                    }
                    return;
                }
            }
        }

        public void setActive(boolean z) {
            synchronized (this.lock) {
                this.active = z;
                this.lock.notifyAll();
            }
        }

        public void setNextFrame(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                ByteBuffer byteBuffer = this.pendingFrameData;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.pendingFrameData = null;
                }
                if (CameraSource.this.bytesToByteBuffer.containsKey(bArr)) {
                    this.pendingTimeMillis = SystemClock.elapsedRealtime() - this.startTimeMillis;
                    this.pendingFrameId++;
                    this.pendingFrameData = (ByteBuffer) CameraSource.this.bytesToByteBuffer.get(bArr);
                    this.lock.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SizePair {
        private qrm picture;
        private final qrm preview;

        public SizePair(Camera.Size size, Camera.Size size2) {
            this.preview = new qrm(size.width, size.height);
            if (size2 != null) {
                this.picture = new qrm(size2.width, size2.height);
            }
        }

        public qrm pictureSize() {
            return this.picture;
        }

        public qrm previewSize() {
            return this.preview;
        }
    }

    public CameraSource(Context context, rqm rqmVar) {
        if (context == null) {
            Log.e(TAG, "context is null.");
            throw new IllegalArgumentException("No context supplied.");
        }
        if (rqmVar == null) {
            Log.e(TAG, "detector is null.");
            throw new IllegalArgumentException("No detector supplied.");
        }
        this.context = context;
        this.frameProcessor = new FrameProcessingRunnable(rqmVar);
    }

    private Camera createCamera() {
        int idForRequestedCamera = getIdForRequestedCamera(0);
        if (idForRequestedCamera == -1) {
            Log.e(TAG, "Could not find requested camera.");
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera open = Camera.open(idForRequestedCamera);
        SizePair selectSizePair = selectSizePair(open, WIDTH, HEIGHT);
        if (selectSizePair == null) {
            Log.e(TAG, "Could not find suitable preview size.");
            throw new RuntimeException("Could not find suitable preview size.");
        }
        qrm pictureSize = selectSizePair.pictureSize();
        this.previewSize = selectSizePair.previewSize();
        int[] selectPreviewFpsRange = selectPreviewFpsRange(open, FPS);
        if (selectPreviewFpsRange == null) {
            Log.e(TAG, "Could not find suitable preview frames per second range.");
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters = open.getParameters();
        if (pictureSize != null) {
            parameters.setPictureSize(pictureSize.a, pictureSize.b);
        }
        qrm qrmVar = this.previewSize;
        parameters.setPreviewSize(qrmVar.a, qrmVar.b);
        parameters.setPreviewFpsRange(selectPreviewFpsRange[0], selectPreviewFpsRange[1]);
        parameters.setPreviewFormat(17);
        setRotation(open, parameters, idForRequestedCamera);
        if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        }
        open.setParameters(parameters);
        open.setPreviewCallbackWithBuffer(new CameraPreviewCallback());
        open.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        open.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        open.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        open.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        return open;
    }

    private byte[] createPreviewBuffer(qrm qrmVar) {
        double bitsPerPixel = qrmVar.b * qrmVar.a * ImageFormat.getBitsPerPixel(17);
        Double.isNaN(bitsPerPixel);
        byte[] bArr = new byte[((int) Math.ceil(bitsPerPixel / 8.0d)) + 1];
        this.bytesToByteBuffer.put(bArr, ByteBuffer.wrap(bArr));
        return bArr;
    }

    private static List generateValidPreviewSizeList(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (it.hasNext()) {
                    Camera.Size next = it.next();
                    if (Math.abs(f - (next.width / next.height)) < ASPECT_RATIO_TOLERANCE) {
                        arrayList.add(new SizePair(size, next));
                        break;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            Log.w(TAG, "No preview sizes have a corresponding same-aspect-ratio picture size");
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            while (it2.hasNext()) {
                arrayList.add(new SizePair(it2.next(), null));
            }
        }
        return arrayList;
    }

    private static int getIdForRequestedCamera(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    private static int[] selectPreviewFpsRange(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            int i3 = abs < i2 ? abs : i2;
            if (abs < i2) {
                iArr = iArr2;
            }
            i2 = i3;
        }
        return iArr;
    }

    private static SizePair selectSizePair(Camera camera, int i, int i2) {
        SizePair sizePair = null;
        int i3 = Integer.MAX_VALUE;
        for (SizePair sizePair2 : generateValidPreviewSizeList(camera)) {
            qrm previewSize = sizePair2.previewSize();
            int abs = Math.abs(previewSize.a - i) + Math.abs(previewSize.b - i2);
            int i4 = abs < i3 ? abs : i3;
            if (abs < i3) {
                sizePair = sizePair2;
            }
            i3 = i4;
        }
        return sizePair;
    }

    private void setRotation(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        int rotation = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i4 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i4 = 90;
            } else if (rotation == 2) {
                i4 = 180;
            } else if (rotation != 3) {
                String str = TAG;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Bad rotation value: ");
                sb.append(rotation);
                Log.e(str, sb.toString());
            } else {
                i4 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (cameraInfo.orientation + i4) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i4) + 360) % 360;
            i3 = i2;
        }
        this.rotation = i2 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i2);
    }

    public qrm getPreviewSize() {
        return this.previewSize;
    }

    public void release() {
        synchronized (this.cameraLock) {
            stop();
            this.frameProcessor.release();
        }
    }

    public CameraSource start(SurfaceHolder surfaceHolder) {
        synchronized (this.cameraLock) {
            if (this.camera != null) {
                return this;
            }
            Camera createCamera = createCamera();
            this.camera = createCamera;
            createCamera.setPreviewDisplay(surfaceHolder);
            this.camera.startPreview();
            this.processingThread = new Thread(this.frameProcessor);
            this.frameProcessor.setActive(true);
            this.processingThread.start();
            return this;
        }
    }

    public void stop() {
        synchronized (this.cameraLock) {
            this.frameProcessor.setActive(false);
            Thread thread = this.processingThread;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                }
                this.processingThread = null;
            }
            this.bytesToByteBuffer.clear();
            Camera camera = this.camera;
            if (camera != null) {
                camera.stopPreview();
                this.camera.setPreviewCallbackWithBuffer(null);
                try {
                    this.camera.setPreviewTexture(null);
                } catch (Exception e) {
                    String str = TAG;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                }
                this.camera.release();
                this.camera = null;
            }
        }
    }
}
