package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jws {
    public final ci a;
    public final akbz b;
    public final aahd c;
    public final jvh d;
    public final acqz e;
    public final View.OnClickListener f;
    private final View.OnClickListener g;

    public jws(ci ciVar, akbz akbzVar, aahd aahdVar, jvh jvhVar, acqz acqzVar) {
        this.a = ciVar;
        this.b = akbzVar;
        this.c = aahdVar;
        this.d = jvhVar;
        this.e = acqzVar;
        final int i = 1;
        this.g = new View.OnClickListener(this) { // from class: jwn
            public final /* synthetic */ jws a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    aahd aahdVar2 = this.a.c;
                    aone createBuilder = apfu.a.createBuilder();
                    String num = Integer.toString(10013);
                    createBuilder.copyOnWrite();
                    apfu apfuVar = (apfu) createBuilder.instance;
                    num.getClass();
                    apfuVar.b |= 8;
                    apfuVar.e = num;
                    apfu apfuVar2 = (apfu) createBuilder.build();
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, apfuVar2);
                    aahdVar2.c((apxf) aongVar.build(), null);
                    return;
                }
                aahd aahdVar3 = this.a.c;
                aong aongVar2 = (aong) fia.a.toBuilder();
                aonk aonkVar = atmb.b;
                aone createBuilder2 = atmc.a.createBuilder();
                int i2 = acrb.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR_VIEW_BUTTON.Jk;
                createBuilder2.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder2.instance;
                atmcVar.b |= 2;
                atmcVar.d = i2;
                aongVar2.e(aonkVar, (atmc) createBuilder2.build());
                aahdVar3.a((apxf) aongVar2.build());
            }
        };
        final int i2 = 0;
        this.f = new View.OnClickListener(this) { // from class: jwn
            public final /* synthetic */ jws a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    aahd aahdVar2 = this.a.c;
                    aone createBuilder = apfu.a.createBuilder();
                    String num = Integer.toString(10013);
                    createBuilder.copyOnWrite();
                    apfu apfuVar = (apfu) createBuilder.instance;
                    num.getClass();
                    apfuVar.b |= 8;
                    apfuVar.e = num;
                    apfu apfuVar2 = (apfu) createBuilder.build();
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, apfuVar2);
                    aahdVar2.c((apxf) aongVar.build(), null);
                    return;
                }
                aahd aahdVar3 = this.a.c;
                aong aongVar2 = (aong) fia.a.toBuilder();
                aonk aonkVar = atmb.b;
                aone createBuilder2 = atmc.a.createBuilder();
                int i22 = acrb.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR_VIEW_BUTTON.Jk;
                createBuilder2.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder2.instance;
                atmcVar.b |= 2;
                atmcVar.d = i22;
                aongVar2.e(aonkVar, (atmc) createBuilder2.build());
                aahdVar3.a((apxf) aongVar2.build());
            }
        };
    }

    public final akca a(int i) {
        return b(this.a.getApplicationContext().getString(i));
    }

    public final akca b(String str) {
        akca m = this.b.m();
        m.k(str);
        m.j(false);
        return m;
    }

    public final void c(final String str) {
        akbz akbzVar = this.b;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: jwo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jws jwsVar = jws.this;
                String str2 = str;
                try {
                    jvh jvhVar = jwsVar.d;
                    anfq.i(jvhVar.a(), new jvg(jvhVar, str2, 0), angq.a).get();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                    zga.b("Failed to undo delete");
                }
            }
        };
        akca a = a(R.string.offline_actions_video_deleted_undo_snackbar_text);
        a.m(this.a.getApplicationContext().getString(R.string.offline_undo_snackbar_button_text), onClickListener);
        a.d(4000);
        a.j(false);
        a.l(new jwr(this, str));
        akbzVar.o(a.b());
    }

    public final void d(int i) {
        this.b.o(a(i).b());
    }

    public final void e(int i) {
        akbz akbzVar = this.b;
        View.OnClickListener onClickListener = this.g;
        akca a = a(i);
        a.m(this.a.getApplicationContext().getString(R.string.offline_actions_snackbar_button_text), onClickListener);
        a.j(false);
        a.l(new jwp(this));
        akbzVar.o(a.b());
    }
}
