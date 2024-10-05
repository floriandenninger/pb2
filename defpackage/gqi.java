package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gqi implements aftl {
    final /* synthetic */ List a;
    final /* synthetic */ CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    final /* synthetic */ ammv c;
    final /* synthetic */ gqj d;

    public gqi(gqj gqjVar, List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ammv ammvVar) {
        this.d = gqjVar;
        this.a = list;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = ammvVar;
    }

    @Override // defpackage.aftl
    public final void a() {
    }

    @Override // defpackage.aftl
    public final void b() {
        this.d.b(this.a, this.b, this.c);
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.d.a.e(exc);
    }
}
