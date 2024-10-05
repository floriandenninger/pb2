package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awyu implements ProcessorBase.FrameCallback {
    final /* synthetic */ ProcessorBase a;

    public awyu(ProcessorBase processorBase) {
        this.a = processorBase;
    }

    @Override // com.google.research.xeno.effect.ProcessorBase.FrameCallback
    public final void process(Packet packet) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((aogg) it.next()).a(PacketGetter.a(packet));
        }
    }
}
