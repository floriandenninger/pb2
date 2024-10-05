package com.google.android.libraries.youtube.livecreation.screencast.controls;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.acej;
import defpackage.aih;
import defpackage.amkq;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VolumeIndicatorView extends View implements AudioRecord.OnRecordPositionUpdateListener {
    public final Handler a;
    public final Handler b;
    public AudioRecord c;
    public boolean d;
    public volatile double e;
    public short[] f;
    public AutomaticGainControl g;
    public final Runnable h;
    public final Runnable i;
    private final Rect j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private final int o;
    private final int p;
    private final HandlerThread q;
    private final Runnable r;
    private final Runnable s;
    private final Runnable t;

    public VolumeIndicatorView(Context context) {
        super(context);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = new acej(this, 1);
        this.r = new acej(this, 0);
        this.s = new acej(this, 2);
        this.i = new acej(this, 3);
        this.t = new acej(this, 4);
        setWillNotDraw(false);
        Context context2 = getContext();
        Resources resources = context2.getResources();
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(aih.d(context2, R.color.screencast_volume_inactive_color));
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(aih.d(context2, R.color.screencast_volume_active_color));
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(aih.d(context2, R.color.screencast_volume_loud_color));
        Paint paint4 = new Paint();
        this.n = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(aih.d(context2, R.color.screencast_volume_too_loud_color));
        this.o = resources.getDimensionPixelSize(R.dimen.screencast_volume_bar_width);
        this.p = resources.getDimensionPixelSize(R.dimen.screencast_volume_gap_width);
        HandlerThread handlerThread = new HandlerThread("MicThread", 0);
        this.q = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        d();
        this.a.post(this.t);
    }

    public final void b() {
        yjk.e();
        amkq.E(!this.d);
        AutomaticGainControl automaticGainControl = this.g;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.g = null;
        }
        AudioRecord audioRecord = this.c;
        if (audioRecord != null) {
            audioRecord.setRecordPositionUpdateListener(null);
            this.c.release();
            this.c = null;
        }
        this.f = null;
    }

    public final void c() {
        this.a.post(this.r);
        this.a.post(this.i);
    }

    public final void d() {
        this.a.removeCallbacks(this.i);
        this.a.post(this.s);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - this.o;
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth > 0 ? 1 + (measuredWidth / (this.o + this.p)) : 1;
        double d = this.e;
        double d2 = i;
        Double.isNaN(d2);
        int round = (int) Math.round(d * d2);
        double d3 = i * 50;
        Double.isNaN(d3);
        int round2 = (int) Math.round(d3 / 100.0d);
        double d4 = i * 70;
        Double.isNaN(d4);
        int round3 = (int) Math.round(d4 / 100.0d);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            Paint paint = this.l;
            if (i2 < round) {
                if (i2 < round2) {
                    paint = this.k;
                } else {
                    paint = i2 < round3 ? this.m : this.n;
                }
            }
            this.j.set(i3, 0, this.o + i3, measuredHeight);
            canvas.drawRect(this.j, paint);
            i3 += this.o + this.p;
            i2++;
        }
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onMarkerReached(AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onPeriodicNotification(AudioRecord audioRecord) {
        yjk.f();
        invalidate();
    }

    public VolumeIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = new acej(this, 1);
        this.r = new acej(this, 0);
        this.s = new acej(this, 2);
        this.i = new acej(this, 3);
        this.t = new acej(this, 4);
        setWillNotDraw(false);
        Context context2 = getContext();
        Resources resources = context2.getResources();
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(aih.d(context2, R.color.screencast_volume_inactive_color));
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(aih.d(context2, R.color.screencast_volume_active_color));
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(aih.d(context2, R.color.screencast_volume_loud_color));
        Paint paint4 = new Paint();
        this.n = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(aih.d(context2, R.color.screencast_volume_too_loud_color));
        this.o = resources.getDimensionPixelSize(R.dimen.screencast_volume_bar_width);
        this.p = resources.getDimensionPixelSize(R.dimen.screencast_volume_gap_width);
        HandlerThread handlerThread = new HandlerThread("MicThread", 0);
        this.q = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public VolumeIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = new acej(this, 1);
        this.r = new acej(this, 0);
        this.s = new acej(this, 2);
        this.i = new acej(this, 3);
        this.t = new acej(this, 4);
        setWillNotDraw(false);
        Context context2 = getContext();
        Resources resources = context2.getResources();
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(aih.d(context2, R.color.screencast_volume_inactive_color));
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(aih.d(context2, R.color.screencast_volume_active_color));
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(aih.d(context2, R.color.screencast_volume_loud_color));
        Paint paint4 = new Paint();
        this.n = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(aih.d(context2, R.color.screencast_volume_too_loud_color));
        this.o = resources.getDimensionPixelSize(R.dimen.screencast_volume_bar_width);
        this.p = resources.getDimensionPixelSize(R.dimen.screencast_volume_gap_width);
        HandlerThread handlerThread = new HandlerThread("MicThread", 0);
        this.q = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }
}
