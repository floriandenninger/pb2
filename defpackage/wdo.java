package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdo implements wdt {
    public final ci a;
    public wdy b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final aahd f;
    private final Set g;

    public wdo(ci ciVar, aahd aahdVar) {
        ciVar.getClass();
        this.a = ciVar;
        aahdVar.getClass();
        this.f = aahdVar;
        this.c = true;
        this.g = new HashSet();
    }

    private final void l(int i) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((wds) it.next()).q(i);
        }
    }

    @Override // defpackage.wdt
    public final int a() {
        if (b() == null) {
            return 0;
        }
        wdy b = b();
        b.getClass();
        return b.am ? 0 : 1;
    }

    public final wdy b() {
        wdy wdyVar = this.b;
        if (wdyVar != null) {
            return wdyVar;
        }
        wdy wdyVar2 = (wdy) this.a.getSupportFragmentManager().f("update_image_fragment");
        this.b = wdyVar2;
        if (wdyVar2 == null) {
            this.e = false;
        }
        return wdyVar2;
    }

    @Override // defpackage.wdt
    public final aahd c() {
        return this.f;
    }

    @Override // defpackage.wdt
    public final void d() {
        if (this.c || b() == null) {
            return;
        }
        if (this.d) {
            this.e = true;
            return;
        }
        dn k = this.a.getSupportFragmentManager().k();
        k.m(this.b);
        k.d();
        this.b = null;
    }

    @Override // defpackage.wdt
    public final void e(apxf apxfVar) {
        apxfVar.getClass();
        if (apxfVar.pY(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint)) {
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) apxfVar.pX(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
            wdy b = b();
            if (b != null) {
                b.r(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
                return;
            }
            return;
        }
        if (apxfVar.pY(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint)) {
            wdy b2 = b();
            if (b2 != null) {
                b2.s(3);
                return;
            }
            return;
        }
        if (apxfVar.pY(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint)) {
            wdy b3 = b();
            if (b3 != null) {
                b3.s(2);
                return;
            }
            return;
        }
        if (!apxfVar.pY(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint)) {
            h(new wdu("Unknown command."));
            return;
        }
        if (this.c) {
            return;
        }
        dn k = this.a.getSupportFragmentManager().k();
        if (b() != null) {
            k.m(this.b);
            this.e = false;
        }
        l(1);
        wdy o = wdy.o((GetPhotoEndpointOuterClass$GetPhotoEndpoint) apxfVar.pX(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint));
        this.b = o;
        k.r(o, "update_image_fragment");
        k.d();
    }

    public final void f() {
        this.c = false;
    }

    @Override // defpackage.wdt
    public final void g() {
        d();
        l(4);
    }

    @Override // defpackage.wdt
    public final void h(Throwable th) {
        afsi.c(2, 25, "Editing channel image failed.", th);
        zga.d("Failed image upload.", th);
        d();
        l(3);
    }

    @Override // defpackage.wdt
    public final void i(String str, Uri uri) {
        d();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((wds) it.next()).r(2, str, uri);
        }
    }

    @Override // defpackage.wdt
    public final void j(wds wdsVar) {
        this.g.add(wdsVar);
    }

    @Override // defpackage.wdt
    public final void k(wds wdsVar) {
        this.g.remove(wdsVar);
    }
}
