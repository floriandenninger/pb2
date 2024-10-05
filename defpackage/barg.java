package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barg implements ThreadFactory {
    final /* synthetic */ AtomicInteger a;
    private final /* synthetic */ int b;

    public barg(AtomicInteger atomicInteger, int i) {
        this.b = i;
        this.a = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.b != 0) {
            Thread thread = new Thread(runnable, azul.a("CommonPool-worker-", Integer.valueOf(this.a.incrementAndGet())));
            thread.setDaemon(true);
            return thread;
        }
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.a.getAndIncrement()), Integer.valueOf(this.a.getAndIncrement())));
        return newThread;
    }
}
