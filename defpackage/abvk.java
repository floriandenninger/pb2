package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import com.google.protos.youtube.api.innertube.TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abvk implements aaha {
    public static final /* synthetic */ int b = 0;
    public final abya a;
    private final Context c;
    private final abvl d;
    private final afot e;
    private final zto f;
    private final Executor g;
    private final anib h;
    private mi i;

    public abvk(Context context, abya abyaVar, abvl abvlVar, afot afotVar, zto ztoVar, Executor executor, anib anibVar) {
        this.c = context;
        this.a = abyaVar;
        this.d = abvlVar;
        this.e = afotVar;
        this.f = ztoVar;
        this.g = executor;
        this.h = anibVar;
    }

    public final void b(String str, astx astxVar, abxv abxvVar) {
        this.a.j(astxVar, str, 0, abxvVar);
    }

    public final void c(abxw abxwVar, apxf apxfVar, avwv avwvVar) {
        this.a.d(((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) apxfVar.pX(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint)).c, avwvVar, abxwVar);
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        final Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        String str = null;
        if (!apxfVar.pY(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.createBroadcastEndpoint) || !(s instanceof abve)) {
            if (!apxfVar.pY(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint) || !(s instanceof abxw)) {
                if (!apxfVar.pY(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint) || !(s instanceof abxu)) {
                    if (!apxfVar.pY(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint) || !(s instanceof abuq)) {
                        if (!apxfVar.pY(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint) || !(s instanceof abuq)) {
                            if (!apxfVar.pY(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint) || !(s instanceof abxv)) {
                                if (!apxfVar.pY(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint) || !(s instanceof atey)) {
                                    if (!apxfVar.pY(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint) || !(s instanceof abxs)) {
                                        String valueOf = String.valueOf(apxfVar.toString());
                                        throw new aahm(valueOf.length() != 0 ? "Unhandled command: ".concat(valueOf) : new String("Unhandled command: "));
                                    }
                                    final abxs abxsVar = (abxs) s;
                                    if (this.i == null) {
                                        mh mhVar = new mh(this.c);
                                        mhVar.f(R.string.lc_confirm_delete_scheduled_stream);
                                        mhVar.h(android.R.string.cancel, null);
                                        this.i = mhVar.b();
                                    }
                                    this.i.a.g(-1, this.c.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: abvf
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            abvk abvkVar = abvk.this;
                                            apxf apxfVar2 = apxfVar;
                                            abvkVar.a.a(((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apxfVar2.pX(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c, abxsVar);
                                        }
                                    });
                                    this.i.show();
                                    return;
                                }
                                this.d.m(((StartStreamEndpointOuterClass$StartStreamEndpoint) apxfVar.pX(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint)).b, (atey) s, (Boolean) map.get("ARG_IS_PORTRAIT"));
                                return;
                            }
                            final String str2 = ((GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint) apxfVar.pX(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint)).b;
                            final abxv abxvVar = (abxv) s;
                            if (akai.g(this.c)) {
                                this.e.b(new afos() { // from class: abvi
                                    @Override // defpackage.afos
                                    public final void a(astx astxVar) {
                                        abvk.this.b(str2, astxVar, abxvVar);
                                    }
                                });
                                return;
                            } else {
                                b(str2, null, abxvVar);
                                return;
                            }
                        }
                        ((abuq) s).a(((EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint) apxfVar.pX(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint)).b);
                        return;
                    }
                    ((abuq) s).b(((TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint) apxfVar.pX(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint)).b);
                    return;
                }
                this.a.c((abxu) s);
                return;
            }
            anib anibVar = this.h;
            final zto ztoVar = this.f;
            ynm.k(anibVar.submit(new Callable() { // from class: abvj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zto.this.b();
                }
            }), this.g, new ynk() { // from class: abvg
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    abvk.this.c((abxw) s, apxfVar, null);
                }
            }, new ynl() { // from class: abvh
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    abvk.this.c((abxw) s, apxfVar, (avwv) obj);
                }
            });
            return;
        }
        abve abveVar = (abve) s;
        StreamMetadata l = abveVar.l();
        aqzu aqzuVar = l.k;
        if (aqzuVar != null && (aqzuVar.b & 4) != 0) {
            str = aqzuVar.e;
        }
        this.a.i(l.a, l.b, l.c, l.d, l.e, l.f, l.g, l.m, l.l, l.i, l.j, str, abveVar);
    }
}
