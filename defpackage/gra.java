package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gra implements aaha {
    public final mwt a;
    public final acqz b;
    private final Executor c;
    private final aaue d;

    public gra(mwt mwtVar, aaue aaueVar, acqz acqzVar, Executor executor) {
        this.a = mwtVar;
        this.d = aaueVar;
        this.b = acqzVar;
        this.c = executor;
    }

    public final void b(aauc aaucVar) {
        anhy h = this.d.h(aaucVar, this.c);
        angq angqVar = angq.a;
        final mwt mwtVar = this.a;
        mwtVar.getClass();
        ynm.k(h, angqVar, new ynk() { // from class: gqx
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                mwt mwtVar2 = mwt.this;
                mwtVar2.f.b(mwtVar2.b.b(th), true);
            }
        }, new ynl() { // from class: gqy
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                avii aviiVar;
                gra graVar = gra.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                arjv arjvVar = browseResponseModel.a;
                if (arjvVar == null) {
                    graVar.a.f();
                    return;
                }
                acra mM = graVar.b.mM();
                if (mM != null && (arjvVar.b & 4096) != 0) {
                    mM.D(new acqx(arjvVar.j));
                }
                arjw arjwVar = browseResponseModel.a.f;
                if (arjwVar == null) {
                    arjwVar = arjw.a;
                }
                if (arjwVar.b == 118637602) {
                    mwt mwtVar2 = graVar.a;
                    arjw arjwVar2 = browseResponseModel.a.f;
                    if (arjwVar2 == null) {
                        arjwVar2 = arjw.a;
                    }
                    if (arjwVar2.b == 118637602) {
                        aviiVar = (avii) arjwVar2.c;
                    } else {
                        aviiVar = avii.a;
                    }
                    acra mM2 = graVar.b.mM();
                    if (mwt.k(aviiVar)) {
                        mwtVar2.f();
                    } else {
                        mwtVar2.g(aviiVar, mM2);
                    }
                }
            }
        });
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint)) {
            FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint = (FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint) apxfVar.pX(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint);
            if ((fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.b & 1) != 0) {
                final aauc f = this.d.f();
                f.d(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.c);
                f.l(apxfVar.c);
                aone createBuilder = arjp.a.createBuilder();
                createBuilder.ah(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.e);
                f.t = (arjp) createBuilder.build();
                if (!fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.d.isEmpty()) {
                    f.v(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.d);
                }
                mwt mwtVar = this.a;
                akdd akddVar = new akdd() { // from class: gqz
                    @Override // defpackage.akdd
                    public final void qJ() {
                        gra.this.b(f);
                    }
                };
                if (mwtVar.g == null) {
                    mwtVar.b();
                }
                mwtVar.f.f(akddVar);
                mwtVar.h();
                mwtVar.f.e();
                mwtVar.f.c();
                mwtVar.e = true;
                b(f);
            }
        }
    }
}
