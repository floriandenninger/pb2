package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.rastermill.FrameSequence;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable {
    private static final long DEFAULT_DELAY_MS = 100;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;

    @Deprecated
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static final String TAG = "FrameSequence";
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    private final BitmapProvider mBitmapProvider;
    private boolean mCircleMaskEnabled;
    private int mCornerRadiusPx;
    private int mCurrentLoop;
    private final Runnable mDecodeRunnable;
    private boolean mDestroyed;
    private final Runnable mFinishedCallbackRunnable;
    private final FrameSequence mFrameSequence;
    private final FrameSequence.State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    private long mLastSwap;
    private final Object mLock;
    private int mLoopBehavior;
    private int mLoopCount;
    private int mNextFrameToDecode;
    private long mNextSwap;
    private OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    private int mState;
    private final RectF mTempRectF;
    private final Runnable mUiScheduleRunnable;
    private static final Object sLock = new Object();
    private static BitmapProvider sAllocatingBitmapProvider = new BitmapProvider() { // from class: android.support.rastermill.FrameSequenceDrawable.1
        @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
        public Bitmap acquireBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }

        @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
        public void releaseBitmap(Bitmap bitmap) {
        }
    };
    private static final Handler sMainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface BitmapProvider {
        Bitmap acquireBitmap(int i, int i2);

        void releaseBitmap(Bitmap bitmap);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface OnFinishedListener {
        void onFinished(FrameSequenceDrawable frameSequenceDrawable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence) {
        this(frameSequence, sAllocatingBitmapProvider);
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapProvider, int i, int i2) {
        Bitmap acquireBitmap = bitmapProvider.acquireBitmap(i, i2);
        if (acquireBitmap.getWidth() < i || acquireBitmap.getHeight() < i2 || acquireBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Invalid bitmap provided");
        }
        return acquireBitmap;
    }

    private void checkDestroyedLocked() {
        if (this.mDestroyed) {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        }
    }

    private static void initializeDecodingThread() {
        synchronized (sLock) {
            if (sDecodingThread != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("FrameSequence decoding thread", 10);
            sDecodingThread = handlerThread;
            handlerThread.start();
            sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
        }
    }

    private void scheduleDecodeLocked() {
        this.mState = 1;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + 1) % this.mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(this.mDecodeRunnable);
    }

    public void destroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.mBitmapProvider == null) {
            throw new IllegalStateException("BitmapProvider must be non-null");
        }
        synchronized (this.mLock) {
            checkDestroyedLocked();
            bitmap = this.mFrontBitmap;
            bitmap2 = null;
            this.mFrontBitmap = null;
            if (this.mState != 2) {
                Bitmap bitmap3 = this.mBackBitmap;
                this.mBackBitmap = null;
                bitmap2 = bitmap3;
            }
            this.mDestroyed = true;
        }
        this.mBitmapProvider.releaseBitmap(bitmap);
        if (bitmap2 != null) {
            this.mBitmapProvider.releaseBitmap(bitmap2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r1 == r10.mFrameSequence.getDefaultLoopCount()) goto L23;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.rastermill.FrameSequenceDrawable.draw(android.graphics.Canvas):void");
    }

    protected void finalize() {
        try {
            this.mFrameSequenceState.destroy();
        } finally {
            super.finalize();
        }
    }

    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mFrameSequence.isOpaque() ? -1 : -2;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mDestroyed;
        }
        return z;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && !this.mDestroyed) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && this.mState == 3) {
                this.mState = 4;
                z = true;
            }
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public final void setCircleMaskEnabled(boolean z) {
        if (this.mCircleMaskEnabled != z) {
            this.mCircleMaskEnabled = z;
            this.mPaint.setAntiAlias(z);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public final void setCornerRadius(int i) {
        if (this.mCornerRadiusPx != i) {
            this.mCornerRadiusPx = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
    }

    public void setLoopBehavior(int i) {
        this.mLoopBehavior = i;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    public void setOnFinishedListener(OnFinishedListener onFinishedListener) {
        this.mOnFinishedListener = onFinishedListener;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (z2 || visible) {
            stop();
            start();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        synchronized (this.mLock) {
            checkDestroyedLocked();
            if (this.mState == 1) {
                return;
            }
            this.mCurrentLoop = 0;
            scheduleDecodeLocked();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            unscheduleSelf(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
        }
        super.unscheduleSelf(runnable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.mLoopBehavior = 3;
        this.mLoopCount = 1;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new Runnable() { // from class: android.support.rastermill.FrameSequenceDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                long j;
                boolean z;
                Bitmap bitmap;
                synchronized (FrameSequenceDrawable.this.mLock) {
                    if (FrameSequenceDrawable.this.mDestroyed) {
                        return;
                    }
                    int i = FrameSequenceDrawable.this.mNextFrameToDecode;
                    if (i < 0) {
                        return;
                    }
                    Bitmap bitmap2 = FrameSequenceDrawable.this.mBackBitmap;
                    FrameSequenceDrawable.this.mState = 2;
                    boolean z2 = true;
                    try {
                        j = FrameSequenceDrawable.this.mFrameSequenceState.getFrame(i, bitmap2, i - 2);
                        z = false;
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb.append("exception during decode: ");
                        sb.append(valueOf);
                        Log.e(FrameSequenceDrawable.TAG, sb.toString());
                        j = 0;
                        z = true;
                    }
                    if (j < FrameSequenceDrawable.MIN_DELAY_MS) {
                        j = FrameSequenceDrawable.DEFAULT_DELAY_MS;
                    }
                    synchronized (FrameSequenceDrawable.this.mLock) {
                        bitmap = null;
                        if (FrameSequenceDrawable.this.mDestroyed) {
                            Bitmap bitmap3 = FrameSequenceDrawable.this.mBackBitmap;
                            FrameSequenceDrawable.this.mBackBitmap = null;
                            bitmap = bitmap3;
                        } else if (FrameSequenceDrawable.this.mNextFrameToDecode >= 0 && FrameSequenceDrawable.this.mState == 2) {
                            FrameSequenceDrawable frameSequenceDrawable = FrameSequenceDrawable.this;
                            frameSequenceDrawable.mNextSwap = z ? Long.MAX_VALUE : j + frameSequenceDrawable.mLastSwap;
                            FrameSequenceDrawable.this.mState = 3;
                        }
                        z2 = false;
                    }
                    if (z2) {
                        FrameSequenceDrawable.sMainHandler.post(FrameSequenceDrawable.this.mUiScheduleRunnable);
                    }
                    if (bitmap != null) {
                        FrameSequenceDrawable.this.mBitmapProvider.releaseBitmap(bitmap);
                    }
                }
            }
        };
        this.mUiScheduleRunnable = new Runnable() { // from class: android.support.rastermill.FrameSequenceDrawable.3
            @Override // java.lang.Runnable
            public void run() {
                FrameSequenceDrawable frameSequenceDrawable = FrameSequenceDrawable.this;
                FrameSequenceDrawable.super.unscheduleSelf(frameSequenceDrawable);
                FrameSequenceDrawable frameSequenceDrawable2 = FrameSequenceDrawable.this;
                frameSequenceDrawable2.scheduleSelf(frameSequenceDrawable2, frameSequenceDrawable2.mNextSwap);
            }
        };
        this.mFinishedCallbackRunnable = new Runnable() { // from class: android.support.rastermill.FrameSequenceDrawable.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (FrameSequenceDrawable.this.mLock) {
                    FrameSequenceDrawable.this.mNextFrameToDecode = -1;
                    FrameSequenceDrawable.this.mState = 0;
                }
                if (FrameSequenceDrawable.this.mOnFinishedListener != null) {
                    FrameSequenceDrawable.this.mOnFinishedListener.onFinished(FrameSequenceDrawable.this);
                }
            }
        };
        if (frameSequence == null || bitmapProvider == null) {
            throw new IllegalArgumentException();
        }
        this.mFrameSequence = frameSequence;
        FrameSequence.State createState = frameSequence.createState();
        this.mFrameSequenceState = createState;
        int width = frameSequence.getWidth();
        int height = frameSequence.getHeight();
        this.mBitmapProvider = bitmapProvider;
        this.mFrontBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mBackBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mSrcRect = new Rect(0, 0, width, height);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setFilterBitmap(true);
        this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mLastSwap = 0L;
        this.mNextFrameToDecode = -1;
        createState.getFrame(0, this.mFrontBitmap, -1);
        initializeDecodingThread();
    }
}
