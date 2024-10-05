package defpackage;

import com.google.android.libraries.elements.interfaces.JsPerformanceEventInfo;
import com.google.android.libraries.elements.interfaces.PerformanceEventInfo;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbf {
    public final PerformanceLogger a;
    public final tbt b;
    public final String c;
    private volatile ScheduledExecutorService d;

    public tbf(boolean z, tbt tbtVar) {
        this.b = tbtVar;
        String b = tbtVar.b();
        this.c = b;
        tbtVar.c(b);
        tbe tbeVar = new tbe(z);
        sgf.D();
        this.a = PerformanceLogger.create(tbeVar);
        if (z) {
            this.d = Executors.newSingleThreadScheduledExecutor();
            this.d.scheduleAtFixedRate(new Runnable() { // from class: tbd
                @Override // java.lang.Runnable
                public final void run() {
                    tbf tbfVar = tbf.this;
                    ArrayList flushPerformanceSpans = tbfVar.a.flushPerformanceSpans();
                    int size = flushPerformanceSpans.size();
                    for (int i = 0; i < size; i++) {
                        PerformanceSpan performanceSpan = (PerformanceSpan) flushPerformanceSpans.get(i);
                        tbn a = tbo.a();
                        a.h = new aksx(performanceSpan.getIsMainThread(), performanceSpan.getBeginThreadIdentifier());
                        if (performanceSpan.getInfo() != null) {
                            PerformanceEventInfo info = performanceSpan.getInfo();
                            if (info.getNodeIdentifier() != null) {
                                a.a = info.getNodeIdentifier();
                            }
                            if (info.getMaterializationCount() != null) {
                                a.b(info.getMaterializationCount().intValue());
                            }
                            if (info.getCommandExtensionId() != null) {
                                a.b = Integer.valueOf(info.getCommandExtensionId().intValue());
                            }
                            if (info.getTemplateUri() == null) {
                                a.c(amvs.a);
                            } else {
                                a.c(amsx.r(info.getTemplateUri()));
                            }
                            JsPerformanceEventInfo jsPerformanceEventInfo = info.getJsPerformanceEventInfo();
                            if (jsPerformanceEventInfo != null) {
                                a.c = Status.fromCodeValue(jsPerformanceEventInfo.getStatusCode()).withDescription(jsPerformanceEventInfo.getStatusMessage());
                                a.d = jsPerformanceEventInfo.getModuleIdentifier();
                                a.e = jsPerformanceEventInfo.getFunctionName();
                                a.g = Boolean.valueOf(jsPerformanceEventInfo.getIsSynchronous());
                                Integer bindingExtensionId = jsPerformanceEventInfo.getBindingExtensionId();
                                if (bindingExtensionId != null) {
                                    a.f = bindingExtensionId;
                                }
                            }
                        }
                        Long l = null;
                        if (performanceSpan.getBegin() != null && performanceSpan.getEnd() != null) {
                            l = Long.valueOf(performanceSpan.getEnd().longValue() - performanceSpan.getBegin().longValue());
                        }
                        tbm a2 = tbq.a();
                        a2.b(PerformanceLogger.nameForPerformanceSpanType(performanceSpan.getType()));
                        a2.d = performanceSpan.getParentNonce();
                        a2.a = performanceSpan.getBegin();
                        a2.b = performanceSpan.getEnd();
                        a2.c = l;
                        a2.e = a.a();
                        tbfVar.b.g(tbfVar.c, a2.a());
                    }
                }
            }, 30L, 30L, TimeUnit.SECONDS);
        }
    }
}
