package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sos extends ComponentObserver {
    final /* synthetic */ sxc a;
    final /* synthetic */ szh b;
    final /* synthetic */ ByteBuffer c;
    final /* synthetic */ Component d;
    final /* synthetic */ svt e;
    final /* synthetic */ aypz f;
    final /* synthetic */ sot g;

    public sos(sot sotVar, sxc sxcVar, szh szhVar, ByteBuffer byteBuffer, Component component, svt svtVar, aypz aypzVar) {
        this.g = sotVar;
        this.a = sxcVar;
        this.b = szhVar;
        this.c = byteBuffer;
        this.d = component;
        this.e = svtVar;
        this.f = aypzVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final void componentDidUpdate(Component component) {
        aoam aoamVar;
        awrt j;
        awsn e = ((sxe) this.g.m.get()).b() ? svv.e(this.a) : null;
        try {
            sot sotVar = this.g;
            szh szhVar = this.b;
            ByteBuffer byteBuffer = this.c;
            szhVar.j();
            if (e != null) {
                awst a = awsu.a();
                a.copyOnWrite();
                ((awsu) a.instance).e(e);
                String c = sot.c(byteBuffer);
                a.copyOnWrite();
                ((awsu) a.instance).f(c);
                awsu awsuVar = (awsu) a.build();
                DebuggerClient debuggerClient = (DebuggerClient) sotVar.l.get();
                awsv a2 = awsw.a();
                aoqa d = svv.d();
                a2.copyOnWrite();
                ((awsw) a2.instance).p(d);
                a2.copyOnWrite();
                ((awsw) a2.instance).o(awsuVar);
                debuggerClient.sendTimelineEvent(((awsw) a2.build()).toByteArray());
            }
            StatusOr materialize = this.d.materialize(true);
            byte[] bArr = (byte[]) materialize.value;
            if (bArr == null) {
                String valueOf = String.valueOf(materialize.status);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Error materializing SharedComponentType: ");
                sb.append(valueOf);
                throw new syf(sb.toString(), materialize.status.asException());
            }
            aoamVar = aoam.au(ByteBuffer.wrap(bArr));
            try {
                sot sotVar2 = this.g;
                Component component2 = this.d;
                svt svtVar = this.e;
                if (((sxe) sotVar2.m.get()).a() && svtVar != null && (j = svv.j(aoamVar, syv.b(component2.latestModel()), component2.latestEntitiesConfig(), svtVar.c)) != null) {
                    svtVar.a(j);
                }
                this.f.d(sqr.a(aoamVar, this.e));
                this.g.d(this.b, e, this.d, aoamVar, this.a);
            } catch (Throwable th) {
                th = th;
                this.g.d(this.b, e, this.d, aoamVar, this.a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            aoamVar = null;
        }
    }
}
