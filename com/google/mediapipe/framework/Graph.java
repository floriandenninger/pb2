package com.google.mediapipe.framework;

import defpackage.amkq;
import defpackage.amxh;
import defpackage.amxj;
import defpackage.aogl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Graph {
    private static final amxj a = amxj.l("com/google/mediapipe/framework/Graph");
    private final List c = new ArrayList();
    private Map d = new HashMap();
    private Map e = new HashMap();
    private boolean f = false;
    private boolean g = false;
    private Map h = new HashMap();
    private final Object i = new Object();
    private long b = nativeCreateGraph();

    private static void l(Map map, String[] strArr, long[] jArr) {
        if (map.size() != strArr.length || map.size() != jArr.length) {
            throw new RuntimeException("Input array length doesn't match the map size!");
        }
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            jArr[i] = ((Packet) entry.getValue()).getNativeHandle();
            i++;
        }
    }

    private native void nativeAddMultiStreamCallback(long j, List list, PacketListCallback packetListCallback, boolean z);

    private native void nativeAddPacketCallback(long j, String str, PacketCallback packetCallback);

    private native void nativeAddPacketToInputStream(long j, String str, long j2, long j3);

    private native long nativeAddSurfaceOutput(long j, String str);

    private native void nativeCancelGraph(long j);

    private native void nativeCloseAllInputStreams(long j);

    private native void nativeCloseAllPacketSources(long j);

    private native void nativeCloseInputStream(long j, String str);

    private native long nativeCreateGraph();

    private native byte[] nativeGetCalculatorGraphConfig(long j);

    private native long nativeGetProfiler(long j);

    private native void nativeLoadBinaryGraph(long j, String str);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeLoadBinaryGraphTemplate(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeReleaseGraph(long j);

    private native void nativeRunGraphUntilClose(long j, String[] strArr, long[] jArr);

    private native void nativeSetGraphInputStreamBlockingMode(long j, boolean z);

    private native void nativeSetGraphOptions(long j, byte[] bArr);

    private native void nativeSetGraphType(long j, String str);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    private native void nativeUpdatePacketReference(long j, long j2);

    private native void nativeWaitUntilGraphDone(long j);

    private native void nativeWaitUntilGraphIdle(long j);

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized void b(String str, PacketCallback packetCallback) {
        boolean z = true;
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called already.");
        str.getClass();
        packetCallback.getClass();
        if (this.g || this.f) {
            z = false;
        }
        amkq.N(z);
        this.c.add(packetCallback);
        nativeAddPacketCallback(this.b, str, packetCallback);
    }

    public final synchronized void c(String str, Packet packet, long j) {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called.");
        if (!this.g) {
            Packet a2 = packet.a();
            if (!this.h.containsKey(str)) {
                this.h.put(str, new ArrayList());
            }
            List list = (List) this.h.get(str);
            if (list.size() > 20) {
                for (Map.Entry entry : this.e.entrySet()) {
                    if (entry.getValue() == null) {
                        ((amxh) ((amxh) a.f()).i("com/google/mediapipe/framework/Graph", "addPacketToBuffer", 559, "Graph.java")).s("Stream: %s might be missing.", entry.getKey());
                    }
                }
                throw new RuntimeException("Graph is not started because of missing streams");
            }
            list.add(new aogl(a2, Long.valueOf(j)));
            return;
        }
        nativeAddPacketToInputStream(this.b, str, packet.getNativeHandle(), j);
    }

    public final synchronized void d() {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called.");
        nativeCloseAllInputStreams(this.b);
    }

    public final synchronized void e(byte[] bArr) {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraphBytes(this.b, bArr);
    }

    public final synchronized void f(Map map) {
        boolean z = true;
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called.");
        if (this.g || this.f) {
            z = false;
        }
        amkq.N(z);
        for (Map.Entry entry : map.entrySet()) {
            this.d.put((String) entry.getKey(), ((Packet) entry.getValue()).a());
        }
    }

    public final synchronized void g(long j) {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called already.");
        amkq.N(!this.g);
        nativeSetParentGlContext(this.b, j);
    }

    public final synchronized void h() {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called.");
        this.f = true;
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == null) {
                ((amxh) ((amxh) a.e()).i("com/google/mediapipe/framework/Graph", "startRunningGraph", 314, "Graph.java")).q("MediaPipe graph won't start until all stream headers are available.");
                return;
            }
        }
        String[] strArr = new String[this.d.size()];
        long[] jArr = new long[this.d.size()];
        l(this.d, strArr, jArr);
        String[] strArr2 = new String[this.e.size()];
        long[] jArr2 = new long[this.e.size()];
        l(this.e, strArr2, jArr2);
        nativeStartRunningGraph(this.b, strArr, jArr, strArr2, jArr2);
        this.g = true;
        if (this.h.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.h.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aogl aoglVar = (aogl) arrayList.get(i);
                try {
                    nativeMovePacketToInputStream(this.b, (String) entry.getKey(), aoglVar.a.getNativeHandle(), aoglVar.b.longValue());
                    aoglVar.a.release();
                } catch (MediaPipeException e) {
                    ((amxh) ((amxh) a.f()).i("com/google/mediapipe/framework/Graph", "moveBufferedPacketsToInputStream", 578, "Graph.java")).u("AddPacket for stream: %s failed: %s.", entry.getKey(), e.getMessage());
                    throw e;
                }
            }
        }
        this.h.clear();
    }

    public final synchronized void i() {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called already.");
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            ((Packet) ((Map.Entry) it.next()).getValue()).release();
        }
        this.d.clear();
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() != null) {
                ((Packet) entry.getValue()).release();
            }
        }
        this.e.clear();
        Iterator it2 = this.h.entrySet().iterator();
        while (it2.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it2.next()).getValue();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((aogl) arrayList.get(i)).a.release();
            }
        }
        this.h.clear();
        synchronized (this.i) {
            long j = this.b;
            if (j != 0) {
                nativeReleaseGraph(j);
                this.b = 0L;
            }
        }
        this.c.clear();
    }

    public final synchronized void j() {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called.");
        nativeWaitUntilGraphDone(this.b);
    }

    @Deprecated
    public final synchronized void k(long j) {
        amkq.O(this.b != 0, "Invalid context, tearDown() might have been called already.");
        amkq.E(true);
        g(j);
    }
}
