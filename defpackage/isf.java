package defpackage;

import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class isf {
    public final ajyg a;
    public UploadActivity d;
    public String e;
    public boolean f = false;
    private boolean h = false;
    int g = 1;
    public final ise b = new ise(this);
    public final isa c = new isa(this);

    public isf(ajyg ajygVar) {
        this.a = ajygVar;
    }

    public final void a() {
        if (d()) {
            UploadActivity uploadActivity = this.d;
            whu.B(uploadActivity);
            asdy asdyVar = uploadActivity.W;
            if (asdyVar == null || (asdyVar.b & 512) == 0) {
                uploadActivity.v();
                return;
            }
            apxf apxfVar = asdyVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apxfVar.pX(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
            irz irzVar = uploadActivity.s;
            for (alca alcaVar : irzVar.C) {
                irzVar.F.i(alcaVar.e(), avto.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_INITIATED, alcaVar.h(), alcaVar.f());
            }
            uploadActivity.Z.b(false);
            uploadActivity.F();
            wbk wbkVar = uploadActivity.v;
            irc ircVar = new irc(uploadActivity, 2);
            irc ircVar2 = new irc(uploadActivity, 1);
            aaum b = wbkVar.c.b();
            b.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
            awjw awjwVar = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
            if (awjwVar == null) {
                awjwVar = awjw.a;
            }
            b.v = awjwVar;
            wbkVar.c.d(b, new wbj(wbkVar, ircVar2, ircVar));
        }
    }

    public final void b(boolean z) {
        this.h = z;
        c();
    }

    final boolean d() {
        return this.h && this.f;
    }

    public final void e(int i) {
        this.g = i;
        this.d.getWindow().setSoftInputMode((i == 2 ? 16 : 32) | (this.d.getWindow().getAttributes().softInputMode & 15));
        c();
    }

    public final void c() {
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            this.b.a(false);
            this.c.a(true);
            isa isaVar = this.c;
            isaVar.b(d());
            String str = isaVar.b.e;
            if (str != null) {
                isaVar.c.setText(str);
                return;
            } else {
                isaVar.c.setText(R.string.start_upload_button);
                return;
            }
        }
        this.b.a(true);
        this.c.a(false);
        ise iseVar = this.b;
        boolean d = d();
        MenuItem menuItem = iseVar.a;
        if (menuItem == null || iseVar.c == null) {
            return;
        }
        menuItem.setEnabled(d);
        iseVar.b(d);
        String str2 = iseVar.b.e;
        if (str2 != null) {
            iseVar.a.setTitle(str2);
            iseVar.c.setText(iseVar.b.e);
        } else {
            iseVar.c.setText(R.string.start_upload_button);
        }
    }
}
