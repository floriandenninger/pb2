package com.google.research.xeno.effect;

import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import defpackage.aogg;
import defpackage.aogh;
import defpackage.awye;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ProcessorBase implements aogh {
    public final awye c;
    public volatile long d;
    public AtomicBoolean e;
    protected final Graph f;
    public final AndroidPacketCreator g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public volatile Effect i;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Callback {
        void onCompletion(boolean z, String str);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void process(Packet packet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ProcessorBase(awye awyeVar) {
        this.c = awyeVar;
        Graph graph = new Graph();
        this.f = graph;
        long j = awyeVar.a;
        if (j != 0) {
            try {
                graph.g(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.g = new AndroidPacketCreator(this.f);
    }

    protected static native void nativeImageProcessorTick(long j, long j2);

    protected static native long nativeNewImageProcessor(long j, long j2, long j3, long j4, long j5, long j6, long j7, FrameCallback frameCallback);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native long nativeNewVideoProcessor(long j, long j2, long j3, FrameCallback frameCallback);

    private static native void nativePrepareCurrentEffectToStartRecording(long j);

    private static native void nativeRelease(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3, Callback callback);

    public static native void nativeSetEffect(long j, long j2, Callback callback);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeStartVideoProcessing(long j, int i, long j2, long j3, Callback callback);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeStopVideoProcessing(long j, Callback callback);

    @Override // defpackage.aogh
    public final void c(aogg aoggVar) {
        this.h.clear();
        this.h.add(aoggVar);
    }

    public final void d() {
        if (this.e.compareAndSet(true, false)) {
            nativeRelease(this.d);
            this.f.i();
        }
    }
}
